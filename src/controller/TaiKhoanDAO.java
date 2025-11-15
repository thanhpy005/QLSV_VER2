
package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.SinhVien;
import model.TaiKhoan;
import util.DBConnection;
import view.GD_Menu_Admin;
import view.GD_Menu_SV;

public class TaiKhoanDAO {
     public boolean AddTaiKhoan(String id, String pass)
    {
        String sql = "INSERT INTO NhanVien(Id,Pass_Word) VALUES(?,?)";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pass);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tài khoản có thể đã tồn tại hoặc bạn đang để trống thông tin !");
        }
        return false;
    }
     
     
     public boolean DangNhap(String s, String q, boolean x)
    {
        if(x)
        {
            String sql = "SELECT * FROM TaiKhoan WHERE Id=? and Pass_Word=? and Role=?";
            try (Connection conn = DBConnection.getConnection()){
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, s.toUpperCase());
                ps.setString(2, q);
                ps.setString(3,"NV");
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    GD_Menu_Admin winAdmin = new GD_Menu_Admin();
                    winAdmin.setLocationRelativeTo(null);
                    winAdmin.setVisible(true);
                    return true;
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không chính xác !");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không chính xác !");
            }
        }
        else 
        {
            String sql = "SELECT * FROM TaiKhoan WHERE Id=? and Pass_Word=? and Role='SV'";
            try (Connection conn = DBConnection.getConnection()){
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, s.toUpperCase());
                ps.setString(2, q);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    SinhVienDAO sinhVienDAO = new SinhVienDAO();
                    SinhVien sinhVien = sinhVienDAO.getSinhVien(s);
                    GD_Menu_SV winD_Menu_SV = new GD_Menu_SV(sinhVien);
                    winD_Menu_SV.setLocationRelativeTo(null);
                    winD_Menu_SV.setVisible(true);
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không chính xác !");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không chính xác !");
            }
        }
        return false;
    }
     
    
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
     
     public boolean DoiMatKhau(SinhVien t,String NewPass)
    {
        String sql = "UPDATE TaiKhoan SET Pass_Word=? WHERE Id=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NewPass);
            ps.setString(2, t.getId());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Lỗi truy cập csdl !");
        }
        return false;
    }
     public boolean DoiMatKhau1(String t,String NewPass)
    {
        String sql = "UPDATE NhanVien SET Pass_Word=? WHERE Id=?";
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
     
     //cập nhật mk cho sinh viên
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
     public TaiKhoan getTaiKhoan1(String taikhoan)
    {
        String sql = "SELECT * FROM NhanVien WHERE Id=?";
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