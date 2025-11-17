package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.GiangVien;
import model.NhanVien;
import model.SinhVien;
import model.TaiKhoan;
import util.DBConnection;
import view.*;

public class TaiKhoanDAO {

    public boolean AddNhanVien(String id, String pass, String name, String dob, String address) {
        Connection conn = null;
        PreparedStatement psTaiKhoan = null;
        PreparedStatement psNhanVien = null;
        
        // Giả sử vai trò Nhân viên được lưu là 'NV' trong CSDL
        String sqlTaiKhoan = "INSERT INTO TaiKhoan(Id, Pass_Word, Role) VALUES(?,?, 'NV')";
        // Bảng NhanVien dùng 'username' làm khóa ngoại trỏ đến 'Id' của TaiKhoan
        String sqlNhanVien = "INSERT INTO NhanVien(username, Name, DOB, Address) VALUES(?,?,?,?)";

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            // 1. Thêm vào bảng TaiKhoan
            psTaiKhoan = conn.prepareStatement(sqlTaiKhoan);
            psTaiKhoan.setString(1, id);
            psTaiKhoan.setString(2, pass);
            psTaiKhoan.executeUpdate();

            // 2. Thêm vào bảng NhanVien
            psNhanVien = conn.prepareStatement(sqlNhanVien);
            psNhanVien.setString(1, id); 
            psNhanVien.setString(2, name);
            psNhanVien.setString(3, dob); 
            psNhanVien.setString(4, address);
            psNhanVien.executeUpdate();

            conn.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            // Nếu có lỗi, rollback tất cả thay đổi
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception e_roll) {
                e_roll.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm tài khoản! ID có thể đã tồn tại hoặc thông tin không hợp lệ.");
            return false;
        } finally {
            try {
                if (psTaiKhoan != null) psTaiKhoan.close();
                if (psNhanVien != null) psNhanVien.close();
                if (conn != null) {
                    conn.setAutoCommit(true); // Trả lại trạng thái auto-commit
                    conn.close();
                }
            } catch (Exception e_close) {
                e_close.printStackTrace();
            }
        }
    }
     
     
    public boolean DangNhap(String id, String pass, String expectedRole) {
        
        // 1. Kiểm tra xem người dùng có chọn vai trò không
        if (expectedRole.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn vui lòng chọn vai trò (Sinh viên, Giảng viên hoặc Nhân viên).");
            return false;
        }

        // 2. Truy vấn tài khoản và mật khẩu
        String sql = "SELECT * FROM TaiKhoan WHERE Id=? AND Pass_Word=?";
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            // Dùng toUpperCase() cho ID (thường là Mã SV, Mã NV...)
            ps.setString(1, id.toUpperCase()); 
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // 3. Nếu đúng user/pass, lấy vai trò THỰC TẾ từ CSDL
                String actualRole = rs.getString("Role"); 

                // 4. So sánh vai trò thực tế với vai trò người dùng CHỌN
                if (actualRole.equalsIgnoreCase(expectedRole)) {
                    
                    // Nếu khớp, mở giao diện tương ứng
                    switch (actualRole.toUpperCase()) { // Dùng toUpperCase để an toàn
                        case "SV":
                            SinhVienDAO sinhVienDAO = new SinhVienDAO();
                            // Lấy thông tin SV bằng ID đã nhập
                            SinhVien sinhVien = sinhVienDAO.getSinhVien(id.toUpperCase());
                            GD_Menu_SV winD_Menu_SV = new GD_Menu_SV(sinhVien);
                            winD_Menu_SV.setLocationRelativeTo(null);
                            winD_Menu_SV.setVisible(true);
                            return true;
                            
                        case "GV": 
                            GiangVien giangVien = new GiangVienDAO().getGiangVien(id);
                            GD_Menu_GV winD_Menu_GV = new GD_Menu_GV(giangVien);
                            winD_Menu_GV.setLocationRelativeTo(null);
                            winD_Menu_GV.setVisible(true);
                            return true;
                            
                        case "NV": // Thêm trường hợp "ADMIN" nếu có
                            NhanVien nhanVien = new NhanVienDAO().getNhanVien(id);
                            GD_Menu_Admin1 winAdmin = new GD_Menu_Admin1(nhanVien);
                            winAdmin.setLocationRelativeTo(null);
                            winAdmin.setVisible(true);
                            return true;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Vai trò người dùng " + actualRole + " không được hỗ trợ!");
                            return false;
                    }
                } else {
                    // Nếu không khớp (ví dụ: đăng nhập tài khoản SV nhưng chọn là NV)
                    JOptionPane.showMessageDialog(null, "Thông tin đăng nhập đúng, nhưng bạn đã chọn sai vai trò!");
                    return false;
                }
            } else {
                // Sai ID hoặc mật khẩu
                JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không chính xác!");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi truy cập cơ sở dữ liệu!");
        }
        return false;
    }

     
     //cập nhật mật khẩu (chung)
     public TaiKhoan getTaiKhoan(TaiKhoan t)
    {
        String sql = "SELECT * FROM TaiKhoan WHERE Id=?";
        TaiKhoan tk = new TaiKhoan();
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdString());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                tk.setIdString(rs.getString("Id"));
                tk.setPassWord(rs.getString("Pass_Word"));
            }
            else{
                JOptionPane.showConfirmDialog(null, "Không có thông tin !");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi truy cập csld !");
        }
        return tk;
    }
     
     // Đổi mật khẩu cho SinhVien (truyền đối tượng SinhVien)
     public boolean DoiMatKhau(String t,String NewPass)
    {
        String sql = "UPDATE TaiKhoan SET Pass_Word=? WHERE Id=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NewPass);
            ps.setString(2, t);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lỗi truy cập csdl !");
        }
        return false;
    }
     
     
     // Lấy tài khoản cho SinhVien
     public TaiKhoan getTaiKhoan(SinhVien s)
    {
        String sql = "SELECT * FROM TaiKhoan WHERE Id=?";
        TaiKhoan tk = new TaiKhoan();
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                tk.setIdString(rs.getString("Id"));
                tk.setPassWord(rs.getString("Pass_Word"));
            }
            else{
                JOptionPane.showConfirmDialog(null, "Không có thông tin !");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi truy cập csld !");
        }
        return tk;
    }
     
    // Lấy tài khoản cho Nhân viên/GV
     public TaiKhoan getTaiKhoan1(String taikhoan)
    {
        String sql = "SELECT * FROM TaiKhoan WHERE Id=?";
        TaiKhoan tk = new TaiKhoan();
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                tk.setIdString(rs.getString("Id"));
                tk.setPassWord(rs.getString("Pass_Word"));
            }
            else{
                JOptionPane.showConfirmDialog(null, "Không có thông tin !");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi truy cập csld !");
        }
        return tk;
    }
}