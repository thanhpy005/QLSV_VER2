/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author ThanhNguyen
 */
public class LocLopHocPhan {
    public String Thu,Phong;
    public int  Tiet_bat_dau,Ki_hoc;
   

    public void setTiet_bat_dau(int Tiet_bat_dau) {
        this.Tiet_bat_dau = Tiet_bat_dau;
    }

    public void setKi_hoc(int Ki_hoc) {
        this.Ki_hoc = Ki_hoc;
    }

    public int getTiet_bat_dau() {
        return Tiet_bat_dau;
    }

    public int getKi_hoc() {
        return Ki_hoc;
    }

    public String getThu() {
        return Thu;
    }

   

    public String getPhong() {
        return Phong;
    }

    

    

    public void setThu(String Thu) {
        this.Thu = Thu;
    }

    
    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        
     
        if (o == null || getClass() != o.getClass()) return false;
        
        
        LocLopHocPhan that = (LocLopHocPhan) o;
        return Tiet_bat_dau == that.Tiet_bat_dau &&
               Ki_hoc == that.Ki_hoc &&
               Objects.equals(Thu, that.Thu) &&  
               Objects.equals(Phong, that.Phong);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(Thu, Phong, Tiet_bat_dau, Ki_hoc);
    }
}
