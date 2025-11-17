/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.naming.ldap.Rdn;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;
import model.MonHoc;
import model.SinhVien;
import util.DBConnection;
import model.*;
/**
 *
 * @author ThanhNguyen
 */
public class NhanVienDAO {
    public NhanVien getNhanVien(String s)
    {
        String sql = "SELECT * FROM NhanVien WHERE username=?";
        NhanVien res = new NhanVien();
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                res.setId(rs.getString("username"));
                res.setName(rs.getString("Name"));
                res.setAddress(rs.getString("Address"));
                res.setDob(rs.getString("DOB"));
                System.out.println("da tim thay");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public void updateAvatar(String maSV, File fileAnh) {
        maSV = maSV.toUpperCase();
        String sql = "UPDATE NhanVien SET avatar = ? WHERE username = ?";
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
    public ArrayList<NhanVien> getListNV()
    {
        ArrayList<NhanVien> list  = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();){
           
            while(rs.next())
            {
                NhanVien s  = new NhanVien();
                s.setId(rs.getString("username"));
                s.setName(rs.getString("Name"));
                s.setDob(rs.getString("DOB"));
                s.setAddress(rs.getString("Address"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean AddNhanVien(NhanVien s)
    {
        String sql = "INSERT INTO NhanVien(Name,DOB,Address,username) VALUES(?,?,?,?)";
        String sql1 = "INSERT INTO TaiKhoan(Id,Pass_Word,Role) VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getName());
            ps.setString(2,s.getDob());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getId());
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, s.getId());
            ps1.setString(2, "123");
            ps1.setString(3, "NV");
            return ps.executeUpdate() > 0 && ps1.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ImageIcon getAvatar(String maSV) {
        maSV = maSV.toUpperCase();
        String sql = "SELECT avatar FROM NhanVien WHERE username= ?";
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