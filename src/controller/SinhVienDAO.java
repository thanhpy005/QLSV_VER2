
package controller;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.CacMonHoc;
import model.SinhVien;
import util.DBConnection;

public class SinhVienDAO {
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
        String sql1 = "INSERT INTO TaiKhoan(Id,Pass_Word) VALUES(?,?)";
        String sql2 = "INSERT INTO TienTrinh(Id,TenMon,KetQua,HocKi,ChuyenNganh) VALUES(?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
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

            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1,s.getId());
            ps1.setString(2, "123");
            int ex1 = ps.executeUpdate();
            int ex2 = ps1.executeUpdate();
            if(ex1 > 0 && ex2>0)
            {
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                String[] TenMonHoc;
                if(s.getMajor().equals("IT"))
                {
                    TenMonHoc = new CacMonHoc().IT_TienTrinh;
                    for(int i = 0;i<45;i++)
                    {

                        ps2.setString(1, s.getId());
                        ps2.setString(2, TenMonHoc[i]);
                        ps2.setFloat(3, 0);
                        if(i<4) ps2.setInt(4, 1);
                        else if(i<11) ps2.setInt(4, 2);
                        else if(i < 18) ps2.setInt(4, 3);
                        else if(i < 25) ps2.setInt(4, 4);
                        else if(i< 32) ps2.setInt(4, 5);
                        else if(i<38) ps2.setInt(4, 6);
                        else if(i < 44) ps2.setInt(4, 7);
                        else ps2.setInt(4, 8);
                        ps2.setString(5,s.getMajor());
                        ps2.executeUpdate();
                    }
                }
                else if(s.getMajor().equals("BC"))
                {
                    TenMonHoc = new CacMonHoc().BC_TienTrinh;
                    for(int i = 0;i<=45;i++)
                    {
                        ps2.setString(1, s.getId());
                        ps2.setString(2, TenMonHoc[i]);
                        ps2.setFloat(3, 0);
                        if(i<5) ps2.setInt(4, 1);
                        else if(i<13) ps2.setInt(4, 2);
                        else if(i < 20) ps2.setInt(4, 3);
                        else if(i < 26) ps2.setInt(4, 4);
                        else if(i< 34) ps2.setInt(4, 5);
                        else if(i<39) ps2.setInt(4, 6);
                        else if(i < 45) ps2.setInt(4, 7);
                        else ps2.setInt(4, 8);
                        ps2.setString(5,s.getMajor());
                        ps2.executeUpdate();
                    }
                }
                else if(s.getMajor().equals("KHMT"))
                {
                    TenMonHoc = new CacMonHoc().KHMT_TienTrinh;
                    for(int i = 0;i<48;i++)
                    {
                        ps2.setString(1, s.getId());
                        ps2.setString(2, TenMonHoc[i]);
                        ps2.setFloat(3, 0);
                        if(i<4) ps2.setInt(4, 1);
                        else if(i<11) ps2.setInt(4, 2);
                        else if(i < 17) ps2.setInt(4, 3);
                        else if(i < 23) ps2.setInt(4, 4);
                        else if(i< 30) ps2.setInt(4, 5);
                        else if(i<36) ps2.setInt(4, 6);
                        else if(i < 42) ps2.setInt(4, 7);
                        else ps2.setInt(4, 8);
                        ps2.setString(5,s.getMajor());
                        ps2.executeUpdate();
                    }
                }
                else if(s.getMajor().equals("QT"))
                {
                    TenMonHoc = new CacMonHoc().IT_TienTrinh;
                    for(int i = 0;i<46;i++)
                    {
                        ps2.setString(1, s.getId());
                        ps2.setString(2, TenMonHoc[i]);
                        ps2.setFloat(3, 0);
                        if(i<5) ps2.setInt(4, 1);
                        else if(i<11) ps2.setInt(4, 2);
                        else if(i < 17) ps2.setInt(4, 3);
                        else if(i < 24) ps2.setInt(4, 4);
                        else if(i< 31) ps2.setInt(4, 5);
                        else if(i<38) ps2.setInt(4, 6);
                        else if(i < 45) ps2.setInt(4, 7);
                        else ps2.setInt(4, 8);
                        ps2.setString(5,s.getMajor());
                        ps2.executeUpdate();
                    }
                }
                else if(s.getMajor().equals("MK"))
                {
                    TenMonHoc = new CacMonHoc().MK_TienTrinh;
                    for(int i = 0;i<45;i++)
                    {
                        ps2.setString(1, s.getId());
                        ps2.setString(2, TenMonHoc[i]);
                        ps2.setFloat(3, 0);
                        if(i<5) ps2.setInt(4, 1);
                        else if(i<11) ps2.setInt(4, 2);
                        else if(i < 16) ps2.setInt(4, 3);
                        else if(i < 23) ps2.setInt(4, 4);
                        else if(i< 31) ps2.setInt(4, 5);
                        else if(i<38) ps2.setInt(4, 6);
                        else if(i < 44) ps2.setInt(4, 7);
                        else ps2.setInt(4, 8);
                        ps2.setString(5,s.getMajor());
                        ps2.executeUpdate();
                    }
                }
            }
            
            return ex1 > 0 && ex2>0;
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
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, s);
            PreparedStatement ps2= conn.prepareStatement(sql2);
            ps2.setString(1, s);
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
