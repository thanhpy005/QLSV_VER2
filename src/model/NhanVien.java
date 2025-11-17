/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ThanhNguyen
 */
public class NhanVien {
    private String Id, Name, Address;
    private String Dob;
    public NhanVien()
    {
        
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getDob() {
        return Dob;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }
    
}
