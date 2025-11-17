
package model;


public class MonHoc {
    private String MaMon, TenMon,ChuyenNganh;
    private int SoTinChi, KiHoc;
    public void setMaMon(String maMon) {
        MaMon = maMon;
    }
    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }
    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }
    public void setSoTinChi(int soTinChi) {
        SoTinChi = soTinChi;
    }
    public void setKiHoc(int kiHoc) {
        KiHoc = kiHoc;
    }
    public String getMaMon() {
        return MaMon;
    }
    public String getTenMon() {
        return TenMon;
    }
    public String getChuyenNganh() {
        return ChuyenNganh;
    }
    public int getSoTinChi() {
        return SoTinChi;
    }
    public int getKiHoc() {
        return KiHoc;
    }
    public MonHoc()
    {
        
    }
    
}
