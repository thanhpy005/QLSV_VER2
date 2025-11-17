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
import java.sql.*;
import java.util.ArrayList;
import javax.naming.ldap.Rdn;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;
import model.MonHoc;
import model.SinhVien;
import util.DBConnection;
import model.*;
import org.w3c.dom.ls.LSInput;
/**
 *
 * @author ThanhNguyen
 */
public class GiangVienDAO {
    public GiangVien getGiangVien(String MaGV)
    {
        String sql = "SELECT * FROM GiangVien WHERE ID=?";
        GiangVien g = new GiangVien();
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, MaGV);
            
            try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                g.setID(MaGV);
                g.setName(rs.getString("Name"));
                g.setGender(rs.getString("Gender"));
                g.setEmail(rs.getString("Email"));
                g.setPhone(rs.getString("Phone"));
                g.setKhoa(rs.getString("Khoa"));
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }
    public ArrayList<GiangVien> getListGV2Major()
    {
        ArrayList<GiangVien> list = new ArrayList<>();
        String sql = "SELECT * FROM GiangVien";
        try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        
        while(rs.next())
        {
            GiangVien g = new GiangVien();
            g.setID(rs.getString("ID"));
            g.setName(rs.getString("Name"));
            g.setGender(rs.getString("Gender"));
            g.setEmail(rs.getString("Email"));
            g.setPhone(rs.getString("Phone"));
            g.setKhoa(rs.getString("Khoa"));
            list.add(g);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean addGiangVien(GiangVien g)
    {
        String sql = "INSERT INTO GiangVien(ID,Name,Gender,Email,Phone,Khoa,DOB) VALUES(?,?,?,?,?,?,?) ";
        String sql2 = "INSERT INTO TaiKhoan(Id,Pass_Word,Role) VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, g.getID());
            ps.setString(2, g.getName());
            ps.setString(3, g.getGender());
            ps.setString(4, g.getEmail());
            ps.setString(5, g.getPhone());
            ps.setString(6, g.getKhoa());
            ps.setString(7, g.getDOB());
            
            PreparedStatement ps1 = conn.prepareStatement(sql2);
            ps1.setString(1, g.getID());
            ps1.setString(2, "123");
            ps1.setString(3, "GV");
            return ps.executeUpdate() > 0 && ps1.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean xoaGV(GiangVien s)
    {
        String sql = "DELETE FROM TaiKhoan WHERE Id=?";
        String sql0 = "DELETE FROM GiangVien WHERE ID=?";
        String sql1 ="DELETE FROM LopHocPhan WHERE MaGV=?";
        String sql2 = "SELECT * FROM LopHocPhan WHERE MaGV=?";
        String sql3 = "DELETE FROM DangKiMon WHERE MaLHP=?";
        ArrayList<LopHocPhan> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()){
            
            try(PreparedStatement ps3 = conn.prepareStatement(sql2))
            {
                ps3.setString(1, s.getID());
                try(ResultSet rs = ps3.executeQuery())
                {
                    while(rs.next())
                    {
                        LopHocPhan l = new LopHocPhan();
                        l.setMaLHP(rs.getInt("MaLHP"));
                        list.add(l);
                    }
                    
                }
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getID());
            int ex1 = ps.executeUpdate();
            PreparedStatement ps0 = conn.prepareStatement(sql0);
            ps0.setString(1, s.getID());
            int ex0 = ps0.executeUpdate();
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, s.getID());
            int ex2 = ps1.executeUpdate();
            try (PreparedStatement ps4 = conn.prepareStatement(sql3)){
                for(LopHocPhan i : list)
                {
                    ps4.setInt(1, i.getMaLHP());
                    ps4.executeUpdate();
                }
                
            } 
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public void updateAvatar(String maSV, File fileAnh) {
        maSV = maSV.toUpperCase();
        String sql = "UPDATE GiangVien SET avatar = ? WHERE ID = ?";
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
        String sql = "SELECT avatar FROM GiangVien WHERE Id= ?";
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSV);
            try (ResultSet rs = ps.executeQuery()) { // Quản lý ResultSet
            if (rs.next()) {
                byte[] imgBytes = rs.getBytes("avatar");
                if (imgBytes != null) {
                    Image img = Toolkit.getDefaultToolkit().createImage(imgBytes);
                    return new ImageIcon(img.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                }
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Không có ảnh
    }

}