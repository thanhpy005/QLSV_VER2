
package model;

import javax.print.DocFlavor;



public class TienTrinh {
    private String Id,MaMon,ChuyenNganh;
    
    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }
    private float KetQua;
    private int HocKi;
    public TienTrinh()
    {
        
    }

    public String getId() {
        return Id;
    }

    public String getMaMon() {
        return MaMon;
    }

    public float getKetQua() {
        return KetQua;
    }

    public int getHocKi() {
        return HocKi;
    }

    public void setId(String Id) {
        this.Id = Id.toUpperCase();
    }

    public void setMaMon(String TenMon) {
        this.MaMon = TenMon;
    }

    public void setKetQua(float KetQua) {
        this.KetQua = KetQua;
    }

    public void setHocKi(int HocKi) {
        this.HocKi = HocKi;
    }
    
   
    
}
