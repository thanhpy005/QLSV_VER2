
package controller;

import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;
import model.MonHoc;
import model.SinhVien;
import util.DBConnection;

public class SinhVienDAO {
    public ArrayList<SinhVien> getListSinhVien2Major(String s)
    {
        ArrayList<SinhVien> list  = new ArrayList<>();
        String sql = "SELECT * FROM SinhVien WHERE Major=?";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
              ){
            ps.setString(1, s);
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next())
                {
                    SinhVien sv = new SinhVien();
                    sv.setId(rs.getString("Id"));
                    sv.setName(rs.getString("Name"));
                    sv.setSex(rs.getString("Sex"));
                    sv.setDob(rs.getDate("Day_of_birth"));
                    sv.setMainClass(rs.getString("MainClass"));
                    sv.setAddress(rs.getString("Address"));
                    sv.setPhone(rs.getString("Phone"));
                    sv.setEmail(rs.getString("Email"));
                    sv.setStatus(rs.getString("Status"));
                    sv.setMajor(rs.getString("Major"));
                    sv.setSchoolYear(rs.getInt("School_Year"));
                    list.add(sv);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }
     public SinhVien getSinhVien(String s)
    {
        s = s.toUpperCase();
        SinhVien sv = new SinhVien();
        String sql = "SELECT * FROM SinhVien WHERE Id=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
   
                sv.setId(rs.getString("Id"));
                sv.setName(rs.getString("Name"));
                sv.setSex(rs.getString("Sex"));
                sv.setDob(rs.getDate("Day_of_birth"));
                sv.setMainClass(rs.getString("MainClass"));
                sv.setAddress(rs.getString("Address"));
                sv.setPhone(rs.getString("Phone"));
                sv.setEmail(rs.getString("Email"));
                sv.setStatus(rs.getString("Status"));
                sv.setMajor(rs.getString("Major"));
                sv.setSchoolYear(rs.getInt("School_Year"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Không có thông tin sinh viên !");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không có thông tin sinh viên !");
        }
        return sv;
    }
     
     public boolean addSinhVien(SinhVien s)
    {
        

        String sql = "INSERT INTO SinhVien(Id,Name,Sex,Day_of_birth,MainClass,Address,Phone,Email,Status,Major,School_Year) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        String sql1 = "INSERT INTO TaiKhoan(Id,Pass_Word,Role) VALUES(?,?,?)";
        String sql2 = "INSERT INTO TienTrinh(Id,MaMon,KetQua,HocKi,ChuyenNganh) VALUES(?,?,?,?,?)";
        String sql3 = "SELECT * FROM MonHoc WHERE ChuyenNganh=?";
        try (Connection conn = DBConnection.getConnection()){
            conn.setAutoCommit(false);
            try(PreparedStatement ps = conn.prepareStatement(sql)){
            
                ps.setString(1, s.getId());
                ps.setString(2, s.getName());
                ps.setString(3, s.getSex());
                ps.setDate(4,new java.sql.Date(s.getDob().getTime()));
                ps.setString(5, s.getMainClass());
                ps.setString(6, s.getAddress());
                ps.setString(7, s.getPhone());
                ps.setString(8, s.getEmail());
                ps.setString(9, s.getStatus());
                ps.setString(10, s.getMajor());
                ps.setInt(11, s.getSchoolYear());
                ps.executeUpdate();
            }

            try(PreparedStatement ps1 = conn.prepareStatement(sql1)){
                ps1.setString(1,s.getId());
                ps1.setString(2, "123");
                ps1.setString(3,"SV");
                ps1.executeUpdate();
            }
       
            
                
                ArrayList<MonHoc> list = new ArrayList<>();
                
                try(PreparedStatement ps3 = conn.prepareStatement(sql3)){
                    ps3.setString(1, s.getMajor());
                    try(ResultSet rs = ps3.executeQuery()){
                        while (rs.next()) {
                              MonHoc m = new MonHoc();
                              m.setMaMon(rs.getString("MaMon"));
                              m.setTenMon(rs.getString("TenMon"));
                              m.setSoTinChi(rs.getInt("SoTinChi"));
                              m.setChuyenNganh(rs.getString("ChuyenNganh"));
                              m.setKiHoc(rs.getInt("KiHoc"));
                              list.add(m);
                          }
                    
                    }
                }
                try(PreparedStatement ps2 = conn.prepareStatement(sql2);){
                
                    for(MonHoc i : list)
                        {
                            ps2.setString(1, s.getId());
                            ps2.setString(2, i.getMaMon());
                            ps2.setFloat(3, 0);
                            ps2.setInt(4, i.getKiHoc());
                            ps2.setString(5, i.getChuyenNganh());
                            ps2.addBatch();

                        }
                    ps2.executeBatch();
                }
                
            conn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ID đã tồn tại hoặc bạn đang để thông tin trống");
        }
        return false;
    }
     
     
     public boolean XoaSinhVien(String s)
    {
        s = s.toUpperCase();
        String sql = "DELETE FROM SinhVien WHERE Id=?";
        String sql1 = "DELETE FROM TienTrinh WHERE Id=?";
        String sql2 = "DELETE FROM TaiKhoan WHERE Id=?";
        String sql3 = "DELETE FROM LichHoc WHERE ID=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, s);
            PreparedStatement ps2= conn.prepareStatement(sql2);
            ps2.setString(1, s);
            PreparedStatement ps3 = conn.prepareStatement(sql3);
            ps3.setString(1, s);
            ps3.executeUpdate();
            return ps.executeUpdate()>0 && ps1.executeUpdate()>0 && ps2.executeUpdate()>0;   
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không có thông tin sinh viên hoặc bạn chưa điền đủ thông tin !");
            return false;
        }
        
    }
     
     
     public ArrayList getlistSinhVien()
    {
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql = "SELECT Id, Name, Sex, Day_of_birth, MainClass, Address, Phone, Email, Status, Major, School_Year FROM SinhVien";

        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                SinhVien s = new SinhVien();
                s.setId(rs.getString("Id"));
                s.setName(rs.getString("Name"));
                s.setSex(rs.getString("Sex"));
                s.setDob(rs.getDate("Day_of_birth"));
                s.setMainClass(rs.getString("MainClass"));
                s.setAddress(rs.getString("Address"));
                s.setPhone(rs.getString("Phone"));
                s.setEmail(rs.getString("Email"));
                s.setStatus(rs.getString("Status"));
                s.setMajor(rs.getString("Major"));
                s.setSchoolYear(rs.getInt("School_Year"));
                list.add(s);
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không có thông tin sinh viên !");
        }
        return list;
    } 
     
     public boolean CapNhap(SinhVien s)
    {
        if(XoaSinhVien(s.getId()))
            if(addSinhVien(s)) return true;
        return false;
    }
     public boolean CapNhap2(SinhVien s)
     {
        String sql = "UPDATE SinhVien SET Name=?,Sex=?,Day_of_birth=?,MainClass=?,Address=?,Phone=?,Email=?,Status=?,Major=?,School_Year=? WHERE Id=?";
         try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getSex());
            ps.setDate(3,new java.sql.Date(s.getDob().getTime()));
            ps.setString(4,s.getMainClass() );
            ps.setString(5,s.getAddress() );
            ps.setString(6,s.getPhone() );
            ps.setString(7, s.getEmail());
            ps.setString(8, s.getStatus());
            ps.setString(9, s.getMajor());
            ps.setInt(10, s.getSchoolYear());
            ps.setString(11, s.getId());
            return ps.executeUpdate() > 0;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return false;
     }
     
     
     public void updateAvatar(String maSV, File fileAnh) {
        maSV = maSV.toUpperCase();
        String sql = "UPDATE SinhVien SET Avatar = ? WHERE Id = ?";
        try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             FileInputStream fis = new FileInputStream(fileAnh);

            ps.setBinaryStream(1, fis, (int) fileAnh.length());
            ps.setString(2, maSV);

            int rows = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ImageIcon getAvatar(String maSV) {
        maSV = maSV.toUpperCase();
        String sql = "SELECT avatar FROM SinhVien WHERE Id= ?";
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                byte[] imgBytes = rs.getBytes("avatar");
                if (imgBytes != null) {
                    Image img = Toolkit.getDefaultToolkit().createImage(imgBytes);
                    return new ImageIcon(img.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Không có ảnh
}

}
