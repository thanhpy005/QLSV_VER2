
package controller;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DangKiMon;
import model.LopHocPhan;
import model.MonHoc;
import model.SinhVien;

public class TkbDAO {
     public boolean CapNhapTkb(LopHocPhan l, SinhVien s)
    {
        String sql = "INSERT INTO DangKiMon(MaLHP,MaSV,MaMon) VALUES(?,?,?)";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, l.getMaLHP());
            ps.setString(2,s.getId());
            ps.setString(3, l.getMaMon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     public boolean CapNhapLHP(LopHocPhan l)
     {
         String sql = "INSERT INTO LopHocPhan(MaGV,Ma_mon,Thu,Tiet_bat_dau,So_tiet,Phong,Thoi_gian,Ki_hoc) VALUES(?,?,?,?,?,?,?,?)";
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, l.getMaGV());
             ps.setString(2, l.getMaMon());
             ps.setString(3, l.getThu());
             ps.setInt(4, l.getTietBatDau());
             ps.setInt(5, l.getSoTiet());
             ps.setString(6, l.getPhong());
             ps.setString(7, l.getThoiGian());
             ps.setInt(8, l.getKiHoc());
             return ps.executeUpdate() > 0;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return false;
     }
    public LopHocPhan getLHP(int s)
    {
        LopHocPhan res = new LopHocPhan();
        String sql = "SELECT * FROM LopHocPhan WHERE MaLHP=? ORDER BY Thu ASC";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                res.setMaLHP(rs.getInt("MaLHP"));
                res.setMaGV(rs.getString("MaGV"));
                res.setMaMon(rs.getString("Ma_mon"));
                res.setThu(rs.getString("Thu"));
                res.setTietBatDau(rs.getInt("Tiet_bat_dau"));
                res.setSoTiet(rs.getInt("So_tiet"));
                res.setPhong(rs.getString("Phong"));
                res.setKiHoc(rs.getInt("Ki_hoc"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList XemTKbSV(String s,int k)
    {
        s = s.toUpperCase();
       
        ArrayList<LopHocPhan> list = new ArrayList<>();
        String sql = "SELECT * FROM DangKiMon WHERE MaSV=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                LopHocPhan l = getLHP(rs.getInt("MaLHP"));
                if(l.getKiHoc() == k)
                {
                    list.add(l);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Errol");
        }
        return list;
    }
     public int getSoLuongHs(int s)
     {
        
         String sql = "SELECT * FROM DangKiMon WHERE MaLHP=?";
         int res = 0;
         try(Connection conn = DBConnection.getConnection())
         {
             PreparedStatement ps= conn.prepareStatement(sql);
             ps.setInt(1,s );
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()) res++;
             
         } catch(Exception e){
             
         }
         return res;
     }
     public ArrayList<MonHoc> getListMonHoc(String s, int t)
     {
         String sql = "SELECT * FROM MonHoc WHERE ChuyenNganh=? and KiHoc=?";
         ArrayList<MonHoc> list = new ArrayList<>();
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1,s);
             ps.setInt(2, t);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 MonHoc m = new MonHoc();
                 m.setMaMon(rs.getString("MaMon"));
                 m.setTenMon(rs.getString("TenMon"));
                 m.setSoTinChi(rs.getInt("SoTinChi"));
                 m.setChuyenNganh(s);
                 m.setKiHoc(t);
                 list.add(m);
             }
                     
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
     public ArrayList<LopHocPhan> getDsLopHocPhan(String mamon , int kihoc)
     {
         String sql = "SELECT * FROM LopHocPhan WHERE Ma_mon=? AND Ki_hoc=?";
         ArrayList<LopHocPhan> list = new ArrayList<>();
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, mamon);
             ps.setInt(2, kihoc);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 LopHocPhan l = new LopHocPhan();
                 l.setMaLHP(rs.getInt("MaLHP"));
                 l.setMaGV(rs.getString("MaGV"));
                 l.setMaMon(rs.getString("Ma_mon"));
                 l.setThu(rs.getString("Thu"));
                 l.setTietBatDau(rs.getInt("Tiet_bat_dau"));
                 l.setSoTiet(rs.getInt("So_tiet"));
                 l.setPhong(rs.getString("Phong"));
                 l.setThoiGian(rs.getString("Thoi_gian"));
                 l.setKiHoc(rs.getInt("Ki_hoc"));
                 list.add(l);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
     public ArrayList<LopHocPhan> getLHP2GV(String s)
     {
         ArrayList<LopHocPhan> list = new ArrayList<>();
         String sql = "SELECT * FROM LopHocPhan WHERE MaGV=?";
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, s);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 LopHocPhan l = new LopHocPhan();
                 l.setMaLHP(rs.getInt("MaLHP"));
                 l.setMaGV(s);
                 l.setMaMon(rs.getString("Ma_mon"));
                 l.setThu(rs.getString("Thu"));
                 l.setTietBatDau(rs.getInt("Tiet_bat_dau"));
                 l.setSoTiet(rs.getInt("So_tiet"));
                 l.setPhong(rs.getString("Phong"));
                 l.setThoiGian(rs.getString("Thoi_gian"));
                 l.setKiHoc(rs.getInt("Ki_hoc"));
                 list.add(l);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
     public ArrayList<DangKiMon> getListDKM(int s)
     {
         String sql = "SELECT * from DangKiMon WHERE MaLHP=?";
         ArrayList<DangKiMon> list = new ArrayList<>();
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setInt(1, s);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 DangKiMon d = new DangKiMon();
                 d.setMaLHP(rs.getInt("MaLHP"));
                 d.setMaSV(rs.getString("MaSV"));
                 d.setMaMon(rs.getString("Mamon"));
                 list.add(d);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
     public MonHoc getMonHoc(String s, String t)
     {
         MonHoc res = new MonHoc();
         String sql = "SELECT * FROM MonHoc WHERE MaMon=? AND ChuyenNganh=? ";
         try (Connection conn = DBConnection.getConnection()){
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, s);
             ps.setString(2, t);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 res.setMaMon(rs.getString("MaMon"));
                 res.setTenMon(rs.getString("TenMon"));
                 res.setSoTinChi(rs.getInt("SoTinChi"));
                 res.setChuyenNganh(rs.getString("ChuyenNganh"));
                 res.setKiHoc(rs.getInt("KiHoc"));
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return res;
     }
}
