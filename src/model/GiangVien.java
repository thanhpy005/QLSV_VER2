/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ThanhNguyen
 */
public class GiangVien {
    private String ID, Name ,Gender ,Email ,Phone ,Khoa ;
    private String DOB;

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public String getDOB() {
        return DOB;
    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
    
}
