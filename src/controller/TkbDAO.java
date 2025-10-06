
package controller;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.LichHoc;
import model.SinhVien;

public class TkbDAO {
     public boolean CapNhapTkb(LichHoc l)
    {
        String sql = "INSERT INTO LichHoc(Id,Ma_mon,Ten_mon,Thu,Tiet_bat_dau,So_tiet,Phong,Giang_vien,Thoi_gian,Ki_hoc) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, l.getId());
            ps.setString(2, l.getMamon());
            ps.setString(3, l.getTenmon());
            ps.setString(4, l.getDayString());
            ps.setInt(5, l.getTietBatDau());
            ps.setInt(6, l.getSoTiet());
            ps.setString(7, l.getPhonghoc());
            ps.setString(8, l.getGiangvien());
            ps.setString(9, l.getThoiGian());
            ps.setInt(10,l.getKiHoc());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     
     public ArrayList XemTKbSV(String s,int k)
    {
        s = s.toUpperCase();
        ArrayList<LichHoc> list = new ArrayList<>();
        String sql = "SELECT Ma_mon,Ten_mon,Giang_vien,Thu,Tiet_bat_dau,So_tiet,Phong,Thoi_gian,Ki_hoc FROM LichHoc WHERE Id=? AND Ki_hoc=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ps.setInt(2, k);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                LichHoc l = new LichHoc();
                l.setId(s);
                l.setMamon(rs.getString("Ma_mon"));
                l.setTenmon(rs.getString("Ten_mon"));
                l.setPhonghoc(rs.getString("Phong"));
                l.setGiangvien(rs.getString("Giang_vien"));
                l.setDayString(rs.getString("Thu"));
                l.setThoiGian(rs.getString("Thoi_gian"));
                l.setTietBatDau(rs.getInt("Tiet_bat_dau"));
                l.setSoTiet(rs.getInt("So_tiet"));
                l.setKiHoc(rs.getInt("Ki_hoc"));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Errol");
        }
        return list;
    }
     
}
