
package controller;

//gồm tiến trình, các thao tác sửa đổi điểm cũng như cập nhật và tính điểm

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.SinhVien;
import model.TienTrinh;
import util.DBConnection;

public class TienTrinhDAO {
     public ArrayList<TienTrinh> getTienTrinh(SinhVien s)
    {
        ArrayList<TienTrinh> list = new ArrayList<>();
        String sql = "SELECT * FROM TienTrinh WHERE Id=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                TienTrinh tr = new TienTrinh();
                tr.setId(rs.getString("Id"));
                tr.setTenMon(rs.getString("TenMon"));
                tr.setKetQua(rs.getFloat("KetQua"));
                tr.setHocKi(rs.getInt("HocKi"));
                tr.setChuyenNganh(rs.getString("ChuyenNganh"));
                list.add(tr);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Không tìm thấy thông tin sinh viên !");
        }
        return list;
    }
     
     public float getCpa(SinhVien s)
     {
        float res = 0;
        String sql = "SELECT AVG(CAST(KetQua AS Float)) AS DIEMTRUNGBINH FROM TienTrinh WHERE Id=? AND KetQua>0";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                res = rs.getFloat("DIEMTRUNGBINH");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
     
     public boolean SetDiem(TienTrinh s)
    {
        String sql = "UPDATE TienTrinh SET KetQua=? WHERE Id=? AND TenMon=?";
        try (Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, s.getKetQua());
            ps.setString(2, s.getId());
            ps.setString(3, s.getTenMon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
