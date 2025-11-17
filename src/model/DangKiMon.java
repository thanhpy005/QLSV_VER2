/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ThanhNguyen
 */
public class DangKiMon {
    private String MaSV, MaMon ;
    private int MaLHP;
    public DangKiMon()
    {
        
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getMaMon() {
        return MaMon;
    }

    public int getMaLHP() {
        return MaLHP;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaLHP(int MaLHP) {
        this.MaLHP = MaLHP;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }
    
    
}
