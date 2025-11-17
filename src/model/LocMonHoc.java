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
public class LocMonHoc {
    public String Thu;
    public int Tiet_bat_dau;

    public String getThu() {
        return Thu;
    }

    public int getTiet_bat_dau() {
        return Tiet_bat_dau;
    }

    public void setThu(String Thu) {
        this.Thu = Thu;
    }

    public void setTiet_bat_dau(int Tiet_bat_dau) {
        this.Tiet_bat_dau = Tiet_bat_dau;
    }
    @Override
    public boolean equals(Object o) {
       
        if (this == o) return true;
        
        
        if (o == null || getClass() != o.getClass()) return false;
        
        
        LocMonHoc that = (LocMonHoc) o;
        return Tiet_bat_dau == that.Tiet_bat_dau &&
               Objects.equals(Thu, that.Thu); 
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(Thu, Tiet_bat_dau);
    }
    
}
