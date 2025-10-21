/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TkbDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.LichHoc;
import model.SinhVien;

/**
 *
 * @author ThanhNguyen
 */
public class GD_TkbTuan extends javax.swing.JFrame implements ActionListener{
    private ArrayList<LichHoc> list;
    private SinhVien sinhVien;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GD_TkbTuan.class.getName());

    /**
     * Creates new form GD_TkbTuan
     */
    public GD_TkbTuan(SinhVien s) {
        initComponents();
        BackButton.addActionListener(this);
        sinhVien = s;
        list = new TkbDAO().XemTKbSV(sinhVien.getId(), sinhVien.getSchoolYear());
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(2)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST2_2T.setText(i.getMamon());
                    Name_ST2_2T.setText(i.getTenmon());
                    Name_ST2_2T.setToolTipText(i.getTenmon());
                    PHONG_ST2_2T.setText(i.getPhonghoc());
                    Thu2HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST2_3T.setText(i.getMamon());
                    NAME_ST2_3T.setText(i.getTenmon());
                    NAME_ST2_3T.setToolTipText(i.getTenmon());
                    PHONG_ST2_3T.setText(i.getPhonghoc());
                    Thu2BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT2_2T.setText(i.getMamon());
                    NAME_CT2_2T.setText(i.getTenmon());
                    NAME_CT2_2T.setToolTipText(i.getTenmon());
                    PHONG_CT2_2T.setText(i.getPhonghoc());
                    Thu2HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT2_3T.setText(i.getMamon());
                    NAME_CT2_3T.setText(i.getTenmon());
                    NAME_CT2_3T.setToolTipText(i.getTenmon());
                    PHONG_CT2_3T.setText(i.getPhonghoc());
                    Thu2BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
        }
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(3)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST3_2T.setText(i.getMamon());
                    NAME_ST3_2T.setText(i.getTenmon());
                    NAME_ST3_2T.setToolTipText(i.getTenmon());
                    PHONG_ST3_2T.setText(i.getPhonghoc());
                    Thu3HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST3_3T.setText(i.getMamon());
                    NAME_ST3_3T.setText(i.getTenmon());
                    NAME_ST3_3T.setToolTipText(i.getTenmon());
                    PHONG_ST3_3T.setText(i.getPhonghoc());
                    Thu3BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT3_2T.setText(i.getMamon());
                    NAME_CT3_2T.setText(i.getTenmon());
                    NAME_CT3_2T.setToolTipText(i.getTenmon());
                    PHONG_CT3_2T.setText(i.getPhonghoc());
                    Thu3HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT3_3T.setText(i.getMamon());
                    NAME_CT3_3T.setText(i.getTenmon());
                    NAME_CT3_3T.setToolTipText(i.getTenmon());
                    PHONG_CT3_3T.setText(i.getPhonghoc());
                    Thu3BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
        }
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(4)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST4_2T.setText(i.getMamon());
                    NAME_ST4_2T.setText(i.getTenmon());
                    NAME_ST4_2T.setToolTipText(i.getTenmon());
                    PHONG_ST4_2T.setText(i.getPhonghoc());
                    Thu4HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST4_3T.setText(i.getMamon());
                    NAME_ST4_3T.setText(i.getTenmon());
                    NAME_ST4_3T.setToolTipText(i.getTenmon());
                    PHONG_ST4_3T.setText(i.getPhonghoc());
                    Thu4BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT4_2T.setText(i.getMamon());
                    NAME_CT4_2T.setText(i.getTenmon());
                    NAME_CT4_2T.setToolTipText(i.getTenmon());
                    PHONG_CT4_2T.setText(i.getPhonghoc());
                    Thu4HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT4_3T.setText(i.getMamon());
                    NAME_CT4_3T.setText(i.getTenmon());
                    NAME_CT4_3T.setToolTipText(i.getTenmon());
                    PHONG_CT4_3T.setText(i.getPhonghoc());
                    Thu4BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
        }
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(5)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST5_2T.setText(i.getMamon());
                    NAME_ST5_2T.setText(i.getTenmon());
                    NAME_ST5_2T.setToolTipText(i.getTenmon());
                    PHONG_ST5_2T.setText(i.getPhonghoc());
                    Thu5HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST5_3T.setText(i.getMamon());
                    NAME_ST5_3T.setText(i.getTenmon());
                    NAME_ST5_3T.setToolTipText(i.getTenmon());
                    PHONG_ST5_3T.setText(i.getPhonghoc());
                    Thu5BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT5_2T.setText(i.getMamon());
                    NAME_CT5_2T.setText(i.getTenmon());
                    NAME_CT5_2T.setToolTipText(i.getTenmon());
                    PHONG_CT5_2T.setText(i.getPhonghoc());
                    Thu5HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT5_3T.setText(i.getMamon());
                    NAME_CT5_3T.setText(i.getTenmon());
                    NAME_CT5_3T.setToolTipText(i.getTenmon());
                    PHONG_CT5_3T.setText(i.getPhonghoc());
                    Thu5BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
        }
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(6)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST6_2T.setText(i.getMamon());
                    NAME_ST6_2T.setText(i.getTenmon());
                    NAME_ST6_2T.setToolTipText(i.getTenmon());
                    PHONG_ST6_2T.setText(i.getPhonghoc());
                    Thu6HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST6_3T.setText(i.getMamon());
                    NAME_ST6_3T.setText(i.getTenmon());
                    NAME_ST6_3T.setToolTipText(i.getTenmon());
                    PHONG_ST6_3T.setText(i.getPhonghoc());
                    Thu6BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT6_2T.setText(i.getMamon());
                    NAME_CT6_2T.setText(i.getTenmon());
                    NAME_CT6_2T.setToolTipText(i.getTenmon());
                    PHONG_CT6_2T.setText(i.getPhonghoc());
                    Thu6HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT6_3T.setText(i.getMamon());
                    NAME_CT6_3T.setText(i.getTenmon());
                    NAME_CT6_3T.setToolTipText(i.getTenmon());
                    PHONG_CT6_3T.setText(i.getPhonghoc());
                    Thu6BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
        }
        for(LichHoc i : list)
        {
            if(i.getDayString().equals(String.valueOf(7)))
            {
                if(i.getTietBatDau() == 1)
                {
                    ID_ST7_2T.setText(i.getMamon());
                    NAME_ST7_2T.setText(i.getTenmon());
                    NAME_ST7_2T.setToolTipText(i.getTenmon());
                    PHONG_ST7_2T.setText(i.getPhonghoc());
                    Thu7HaiTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 3)
                {
                    ID_ST7_3T.setText(i.getMamon());
                    NAME_ST7_3T.setText(i.getTenmon());
                    NAME_ST7_3T.setToolTipText(i.getTenmon());
                    PHONG_ST7_3T.setText(i.getPhonghoc());
                    Thu7BaTiet.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 7)
                {
                    ID_CT7_2T.setText(i.getMamon());
                    NAME_CT7_2T.setText(i.getTenmon());
                    NAME_CT7_2T.setToolTipText(i.getTenmon());
                    PHONG_CT7_2T.setText(i.getPhonghoc());
                    Thu7HaiTietChieu.setBackground(new Color(173, 216, 230));
                }
                else if(i.getTietBatDau() == 9)
                {
                    ID_CT7_3T.setText(i.getMamon());
                    NAME_CT7_3T.setText(i.getTenmon());
                    NAME_CT7_3T.setToolTipText(i.getTenmon());
                    PHONG_CT7_3T.setText(i.getPhonghoc());
                    Thu7BaTietChieu.setBackground(new Color(173, 216, 230));
                }
            }
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Thu2HaiTiet = new javax.swing.JPanel();
        ID_ST2_2T = new javax.swing.JLabel();
        Name_ST2_2T = new javax.swing.JLabel();
        PHONG_ST2_2T = new javax.swing.JLabel();
        Thu3HaiTiet = new javax.swing.JPanel();
        ID_ST3_2T = new javax.swing.JLabel();
        NAME_ST3_2T = new javax.swing.JLabel();
        PHONG_ST3_2T = new javax.swing.JLabel();
        Thu4HaiTiet = new javax.swing.JPanel();
        ID_ST4_2T = new javax.swing.JLabel();
        NAME_ST4_2T = new javax.swing.JLabel();
        PHONG_ST4_2T = new javax.swing.JLabel();
        Thu5HaiTiet = new javax.swing.JPanel();
        ID_ST5_2T = new javax.swing.JLabel();
        NAME_ST5_2T = new javax.swing.JLabel();
        PHONG_ST5_2T = new javax.swing.JLabel();
        Thu6HaiTiet = new javax.swing.JPanel();
        ID_ST6_2T = new javax.swing.JLabel();
        NAME_ST6_2T = new javax.swing.JLabel();
        PHONG_ST6_2T = new javax.swing.JLabel();
        Thu7HaiTiet = new javax.swing.JPanel();
        ID_ST7_2T = new javax.swing.JLabel();
        NAME_ST7_2T = new javax.swing.JLabel();
        PHONG_ST7_2T = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Thu2BaTiet = new javax.swing.JPanel();
        ID_ST2_3T = new javax.swing.JLabel();
        NAME_ST2_3T = new javax.swing.JLabel();
        PHONG_ST2_3T = new javax.swing.JLabel();
        Thu3BaTiet = new javax.swing.JPanel();
        ID_ST3_3T = new javax.swing.JLabel();
        NAME_ST3_3T = new javax.swing.JLabel();
        PHONG_ST3_3T = new javax.swing.JLabel();
        Thu4BaTiet = new javax.swing.JPanel();
        ID_ST4_3T = new javax.swing.JLabel();
        NAME_ST4_3T = new javax.swing.JLabel();
        PHONG_ST4_3T = new javax.swing.JLabel();
        Thu5BaTiet = new javax.swing.JPanel();
        ID_ST5_3T = new javax.swing.JLabel();
        NAME_ST5_3T = new javax.swing.JLabel();
        PHONG_ST5_3T = new javax.swing.JLabel();
        Thu6BaTiet = new javax.swing.JPanel();
        ID_ST6_3T = new javax.swing.JLabel();
        NAME_ST6_3T = new javax.swing.JLabel();
        PHONG_ST6_3T = new javax.swing.JLabel();
        Thu7BaTiet = new javax.swing.JPanel();
        ID_ST7_3T = new javax.swing.JLabel();
        NAME_ST7_3T = new javax.swing.JLabel();
        PHONG_ST7_3T = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        Thu2HaiTietChieu = new javax.swing.JPanel();
        ID_CT2_2T = new javax.swing.JLabel();
        NAME_CT2_2T = new javax.swing.JLabel();
        PHONG_CT2_2T = new javax.swing.JLabel();
        Thu3HaiTietChieu = new javax.swing.JPanel();
        ID_CT3_2T = new javax.swing.JLabel();
        NAME_CT3_2T = new javax.swing.JLabel();
        PHONG_CT3_2T = new javax.swing.JLabel();
        Thu4HaiTietChieu = new javax.swing.JPanel();
        ID_CT4_2T = new javax.swing.JLabel();
        NAME_CT4_2T = new javax.swing.JLabel();
        PHONG_CT4_2T = new javax.swing.JLabel();
        Thu5HaiTietChieu = new javax.swing.JPanel();
        ID_CT5_2T = new javax.swing.JLabel();
        NAME_CT5_2T = new javax.swing.JLabel();
        PHONG_CT5_2T = new javax.swing.JLabel();
        Thu6HaiTietChieu = new javax.swing.JPanel();
        ID_CT6_2T = new javax.swing.JLabel();
        NAME_CT6_2T = new javax.swing.JLabel();
        PHONG_CT6_2T = new javax.swing.JLabel();
        Thu7HaiTietChieu = new javax.swing.JPanel();
        ID_CT7_2T = new javax.swing.JLabel();
        NAME_CT7_2T = new javax.swing.JLabel();
        PHONG_CT7_2T = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        Thu2BaTietChieu = new javax.swing.JPanel();
        ID_CT2_3T = new javax.swing.JLabel();
        NAME_CT2_3T = new javax.swing.JLabel();
        PHONG_CT2_3T = new javax.swing.JLabel();
        Thu3BaTietChieu = new javax.swing.JPanel();
        ID_CT3_3T = new javax.swing.JLabel();
        NAME_CT3_3T = new javax.swing.JLabel();
        PHONG_CT3_3T = new javax.swing.JLabel();
        Thu4BaTietChieu = new javax.swing.JPanel();
        ID_CT4_3T = new javax.swing.JLabel();
        NAME_CT4_3T = new javax.swing.JLabel();
        PHONG_CT4_3T = new javax.swing.JLabel();
        Thu5BaTietChieu = new javax.swing.JPanel();
        ID_CT5_3T = new javax.swing.JLabel();
        NAME_CT5_3T = new javax.swing.JLabel();
        PHONG_CT5_3T = new javax.swing.JLabel();
        Thu6BaTietChieu = new javax.swing.JPanel();
        ID_CT6_3T = new javax.swing.JLabel();
        NAME_CT6_3T = new javax.swing.JLabel();
        PHONG_CT6_3T = new javax.swing.JLabel();
        Thu7BaTietChieu = new javax.swing.JPanel();
        ID_CT7_3T = new javax.swing.JLabel();
        NAME_CT7_3T = new javax.swing.JLabel();
        PHONG_CT7_3T = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỜI KHÓA BIỂU TUẦN");

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiết 2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tiết 1");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tiết 3");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tiết 4");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tiết 5");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tiết 6");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tiết 7");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tiết 8");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tiết 9");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tiết 10");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tiết 11");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tiết 12");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Thứ 2");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(255, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Thứ 3");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Thứ 4");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Thứ 5");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(255, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Thứ 6");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(255, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Thứ 7");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(255, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Chủ nhật");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(255, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("7:00");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(255, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("8:00");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(255, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("9:00");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(255, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("10:00");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(255, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("11:00");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(255, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("12:00");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.setOpaque(true);

        jLabel27.setBackground(new java.awt.Color(255, 0, 0));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("13:00");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(255, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("14:00");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);

        jLabel29.setBackground(new java.awt.Color(255, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("15:00");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);

        jLabel30.setBackground(new java.awt.Color(255, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("16:00");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setOpaque(true);

        jLabel31.setBackground(new java.awt.Color(255, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("17:00");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.setOpaque(true);

        jLabel32.setBackground(new java.awt.Color(255, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("18:00");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(255, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Thứ 2");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(255, 0, 0));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Thứ 3");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(255, 0, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Thứ 4");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.setOpaque(true);

        jLabel36.setBackground(new java.awt.Color(255, 0, 0));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Thứ 5");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setOpaque(true);

        jLabel37.setBackground(new java.awt.Color(255, 0, 0));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Thứ 6");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.setOpaque(true);

        jLabel38.setBackground(new java.awt.Color(255, 0, 0));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Thứ 7");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.setOpaque(true);

        jLabel39.setBackground(new java.awt.Color(255, 0, 0));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Chủ nhật");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.setOpaque(true);

        Thu2HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu2HaiTiet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ID_ST2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Name_ST2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu2HaiTietLayout = new javax.swing.GroupLayout(Thu2HaiTiet);
        Thu2HaiTiet.setLayout(Thu2HaiTietLayout);
        Thu2HaiTietLayout.setHorizontalGroup(
            Thu2HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu2HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST2_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_ST2_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST2_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Thu2HaiTietLayout.setVerticalGroup(
            Thu2HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST2_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name_ST2_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST2_2T)
                .addGap(0, 0, 0))
        );

        Thu3HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu3HaiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu3HaiTietLayout = new javax.swing.GroupLayout(Thu3HaiTiet);
        Thu3HaiTiet.setLayout(Thu3HaiTietLayout);
        Thu3HaiTietLayout.setHorizontalGroup(
            Thu3HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu3HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST3_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST3_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST3_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu3HaiTietLayout.setVerticalGroup(
            Thu3HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST3_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST3_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST3_2T)
                .addGap(0, 0, 0))
        );

        Thu4HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu4HaiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu4HaiTietLayout = new javax.swing.GroupLayout(Thu4HaiTiet);
        Thu4HaiTiet.setLayout(Thu4HaiTietLayout);
        Thu4HaiTietLayout.setHorizontalGroup(
            Thu4HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu4HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST4_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST4_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST4_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu4HaiTietLayout.setVerticalGroup(
            Thu4HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST4_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST4_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST4_2T)
                .addContainerGap())
        );

        Thu5HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu5HaiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu5HaiTietLayout = new javax.swing.GroupLayout(Thu5HaiTiet);
        Thu5HaiTiet.setLayout(Thu5HaiTietLayout);
        Thu5HaiTietLayout.setHorizontalGroup(
            Thu5HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu5HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST5_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST5_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST5_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu5HaiTietLayout.setVerticalGroup(
            Thu5HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST5_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST5_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST5_2T)
                .addGap(0, 0, 0))
        );

        Thu6HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu6HaiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu6HaiTietLayout = new javax.swing.GroupLayout(Thu6HaiTiet);
        Thu6HaiTiet.setLayout(Thu6HaiTietLayout);
        Thu6HaiTietLayout.setHorizontalGroup(
            Thu6HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu6HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST6_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST6_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST6_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu6HaiTietLayout.setVerticalGroup(
            Thu6HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST6_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST6_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST6_2T)
                .addGap(0, 0, 0))
        );

        Thu7HaiTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu7HaiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu7HaiTietLayout = new javax.swing.GroupLayout(Thu7HaiTiet);
        Thu7HaiTiet.setLayout(Thu7HaiTietLayout);
        Thu7HaiTietLayout.setHorizontalGroup(
            Thu7HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu7HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST7_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST7_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST7_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu7HaiTietLayout.setVerticalGroup(
            Thu7HaiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7HaiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST7_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST7_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST7_2T)
                .addGap(0, 0, 0))
        );

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Thu2BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu2BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu2BaTietLayout = new javax.swing.GroupLayout(Thu2BaTiet);
        Thu2BaTiet.setLayout(Thu2BaTietLayout);
        Thu2BaTietLayout.setHorizontalGroup(
            Thu2BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu2BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST2_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST2_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST2_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu2BaTietLayout.setVerticalGroup(
            Thu2BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST2_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST2_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST2_3T)
                .addContainerGap())
        );

        Thu3BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu3BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu3BaTietLayout = new javax.swing.GroupLayout(Thu3BaTiet);
        Thu3BaTiet.setLayout(Thu3BaTietLayout);
        Thu3BaTietLayout.setHorizontalGroup(
            Thu3BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu3BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST3_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST3_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST3_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu3BaTietLayout.setVerticalGroup(
            Thu3BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST3_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST3_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST3_3T)
                .addGap(0, 0, 0))
        );

        Thu4BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu4BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu4BaTietLayout = new javax.swing.GroupLayout(Thu4BaTiet);
        Thu4BaTiet.setLayout(Thu4BaTietLayout);
        Thu4BaTietLayout.setHorizontalGroup(
            Thu4BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu4BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST4_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST4_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST4_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu4BaTietLayout.setVerticalGroup(
            Thu4BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST4_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST4_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST4_3T)
                .addGap(0, 0, 0))
        );

        Thu5BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu5BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu5BaTietLayout = new javax.swing.GroupLayout(Thu5BaTiet);
        Thu5BaTiet.setLayout(Thu5BaTietLayout);
        Thu5BaTietLayout.setHorizontalGroup(
            Thu5BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu5BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST5_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST5_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST5_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu5BaTietLayout.setVerticalGroup(
            Thu5BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST5_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST5_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST5_3T)
                .addContainerGap())
        );

        Thu6BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu6BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu6BaTietLayout = new javax.swing.GroupLayout(Thu6BaTiet);
        Thu6BaTiet.setLayout(Thu6BaTietLayout);
        Thu6BaTietLayout.setHorizontalGroup(
            Thu6BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu6BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST6_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST6_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST6_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu6BaTietLayout.setVerticalGroup(
            Thu6BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST6_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST6_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST6_3T)
                .addContainerGap())
        );

        Thu7BaTiet.setBackground(new java.awt.Color(255, 255, 255));
        Thu7BaTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_ST7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_ST7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_ST7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu7BaTietLayout = new javax.swing.GroupLayout(Thu7BaTiet);
        Thu7BaTiet.setLayout(Thu7BaTietLayout);
        Thu7BaTietLayout.setHorizontalGroup(
            Thu7BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu7BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_ST7_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_ST7_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_ST7_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu7BaTietLayout.setVerticalGroup(
            Thu7BaTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7BaTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_ST7_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_ST7_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_ST7_3T)
                .addGap(0, 0, 0))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        Thu2HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu2HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT2_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu2HaiTietChieuLayout = new javax.swing.GroupLayout(Thu2HaiTietChieu);
        Thu2HaiTietChieu.setLayout(Thu2HaiTietChieuLayout);
        Thu2HaiTietChieuLayout.setHorizontalGroup(
            Thu2HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu2HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT2_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT2_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT2_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu2HaiTietChieuLayout.setVerticalGroup(
            Thu2HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT2_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT2_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT2_2T)
                .addGap(0, 0, 0))
        );

        Thu3HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu3HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT3_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu3HaiTietChieuLayout = new javax.swing.GroupLayout(Thu3HaiTietChieu);
        Thu3HaiTietChieu.setLayout(Thu3HaiTietChieuLayout);
        Thu3HaiTietChieuLayout.setHorizontalGroup(
            Thu3HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu3HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT3_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT3_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT3_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu3HaiTietChieuLayout.setVerticalGroup(
            Thu3HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT3_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT3_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT3_2T)
                .addGap(0, 0, 0))
        );

        Thu4HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu4HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT4_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu4HaiTietChieuLayout = new javax.swing.GroupLayout(Thu4HaiTietChieu);
        Thu4HaiTietChieu.setLayout(Thu4HaiTietChieuLayout);
        Thu4HaiTietChieuLayout.setHorizontalGroup(
            Thu4HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu4HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT4_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT4_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT4_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu4HaiTietChieuLayout.setVerticalGroup(
            Thu4HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT4_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT4_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT4_2T)
                .addGap(0, 0, 0))
        );

        Thu5HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu5HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT5_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu5HaiTietChieuLayout = new javax.swing.GroupLayout(Thu5HaiTietChieu);
        Thu5HaiTietChieu.setLayout(Thu5HaiTietChieuLayout);
        Thu5HaiTietChieuLayout.setHorizontalGroup(
            Thu5HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu5HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT5_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT5_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT5_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu5HaiTietChieuLayout.setVerticalGroup(
            Thu5HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT5_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT5_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT5_2T)
                .addGap(0, 0, 0))
        );

        Thu6HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu6HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT6_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu6HaiTietChieuLayout = new javax.swing.GroupLayout(Thu6HaiTietChieu);
        Thu6HaiTietChieu.setLayout(Thu6HaiTietChieuLayout);
        Thu6HaiTietChieuLayout.setHorizontalGroup(
            Thu6HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu6HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT6_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT6_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT6_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu6HaiTietChieuLayout.setVerticalGroup(
            Thu6HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT6_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT6_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT6_2T)
                .addGap(0, 0, 0))
        );

        Thu7HaiTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu7HaiTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT7_2T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu7HaiTietChieuLayout = new javax.swing.GroupLayout(Thu7HaiTietChieu);
        Thu7HaiTietChieu.setLayout(Thu7HaiTietChieuLayout);
        Thu7HaiTietChieuLayout.setHorizontalGroup(
            Thu7HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu7HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT7_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT7_2T, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT7_2T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu7HaiTietChieuLayout.setVerticalGroup(
            Thu7HaiTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7HaiTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT7_2T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT7_2T)
                .addGap(0, 0, 0)
                .addComponent(PHONG_CT7_2T)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Thu2BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu2BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT2_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu2BaTietChieuLayout = new javax.swing.GroupLayout(Thu2BaTietChieu);
        Thu2BaTietChieu.setLayout(Thu2BaTietChieuLayout);
        Thu2BaTietChieuLayout.setHorizontalGroup(
            Thu2BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu2BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT2_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT2_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT2_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu2BaTietChieuLayout.setVerticalGroup(
            Thu2BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu2BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT2_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT2_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT2_3T)
                .addGap(0, 0, 0))
        );

        Thu3BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu3BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT3_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu3BaTietChieuLayout = new javax.swing.GroupLayout(Thu3BaTietChieu);
        Thu3BaTietChieu.setLayout(Thu3BaTietChieuLayout);
        Thu3BaTietChieuLayout.setHorizontalGroup(
            Thu3BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu3BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT3_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT3_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT3_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu3BaTietChieuLayout.setVerticalGroup(
            Thu3BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu3BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT3_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT3_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT3_3T)
                .addGap(0, 0, 0))
        );

        Thu4BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu4BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT4_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu4BaTietChieuLayout = new javax.swing.GroupLayout(Thu4BaTietChieu);
        Thu4BaTietChieu.setLayout(Thu4BaTietChieuLayout);
        Thu4BaTietChieuLayout.setHorizontalGroup(
            Thu4BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu4BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT4_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT4_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT4_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu4BaTietChieuLayout.setVerticalGroup(
            Thu4BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu4BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT4_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT4_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT4_3T)
                .addGap(0, 0, 0))
        );

        Thu5BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu5BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT5_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu5BaTietChieuLayout = new javax.swing.GroupLayout(Thu5BaTietChieu);
        Thu5BaTietChieu.setLayout(Thu5BaTietChieuLayout);
        Thu5BaTietChieuLayout.setHorizontalGroup(
            Thu5BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu5BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT5_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT5_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT5_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu5BaTietChieuLayout.setVerticalGroup(
            Thu5BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu5BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT5_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT5_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT5_3T)
                .addGap(0, 0, 0))
        );

        Thu6BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu6BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT6_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu6BaTietChieuLayout = new javax.swing.GroupLayout(Thu6BaTietChieu);
        Thu6BaTietChieu.setLayout(Thu6BaTietChieuLayout);
        Thu6BaTietChieuLayout.setHorizontalGroup(
            Thu6BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu6BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT6_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT6_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT6_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu6BaTietChieuLayout.setVerticalGroup(
            Thu6BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu6BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT6_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT6_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT6_3T)
                .addGap(0, 0, 0))
        );

        Thu7BaTietChieu.setBackground(new java.awt.Color(255, 255, 255));
        Thu7BaTietChieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ID_CT7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        NAME_CT7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        PHONG_CT7_3T.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout Thu7BaTietChieuLayout = new javax.swing.GroupLayout(Thu7BaTietChieu);
        Thu7BaTietChieu.setLayout(Thu7BaTietChieuLayout);
        Thu7BaTietChieuLayout.setHorizontalGroup(
            Thu7BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Thu7BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_CT7_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NAME_CT7_3T, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONG_CT7_3T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Thu7BaTietChieuLayout.setVerticalGroup(
            Thu7BaTietChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Thu7BaTietChieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ID_CT7_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NAME_CT7_3T)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONG_CT7_3T)
                .addGap(0, 0, 0))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        BackButton.setText("Quay lại");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(255, 0, 0));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel40.setOpaque(true);

        jLabel42.setBackground(new java.awt.Color(255, 0, 0));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.setOpaque(true);

        jLabel43.setBackground(new java.awt.Color(255, 0, 0));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.setOpaque(true);

        jLabel41.setBackground(new java.awt.Color(255, 0, 0));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Thu2BaTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Thu2HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thu2HaiTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thu2BaTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Thu3HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu3BaTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu3HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu3BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Thu4HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu4BaTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu4HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu4BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Thu5HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu5BaTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu5HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu5BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Thu6HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu6BaTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu6HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu6BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thu7HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu7BaTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu7HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thu7BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Thu3HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu4HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu5HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu6HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu7HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu2HaiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu7BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu6BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu5BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu4BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu3BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu2BaTiet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Thu7HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu6HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu5HaiTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu3HaiTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu4HaiTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu2HaiTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Thu6BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu5BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu4BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu3BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Thu7BaTietChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thu2BaTietChieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, 0)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ID_CT2_2T;
    private javax.swing.JLabel ID_CT2_3T;
    private javax.swing.JLabel ID_CT3_2T;
    private javax.swing.JLabel ID_CT3_3T;
    private javax.swing.JLabel ID_CT4_2T;
    private javax.swing.JLabel ID_CT4_3T;
    private javax.swing.JLabel ID_CT5_2T;
    private javax.swing.JLabel ID_CT5_3T;
    private javax.swing.JLabel ID_CT6_2T;
    private javax.swing.JLabel ID_CT6_3T;
    private javax.swing.JLabel ID_CT7_2T;
    private javax.swing.JLabel ID_CT7_3T;
    private javax.swing.JLabel ID_ST2_2T;
    private javax.swing.JLabel ID_ST2_3T;
    private javax.swing.JLabel ID_ST3_2T;
    private javax.swing.JLabel ID_ST3_3T;
    private javax.swing.JLabel ID_ST4_2T;
    private javax.swing.JLabel ID_ST4_3T;
    private javax.swing.JLabel ID_ST5_2T;
    private javax.swing.JLabel ID_ST5_3T;
    private javax.swing.JLabel ID_ST6_2T;
    private javax.swing.JLabel ID_ST6_3T;
    private javax.swing.JLabel ID_ST7_2T;
    private javax.swing.JLabel ID_ST7_3T;
    private javax.swing.JLabel NAME_CT2_2T;
    private javax.swing.JLabel NAME_CT2_3T;
    private javax.swing.JLabel NAME_CT3_2T;
    private javax.swing.JLabel NAME_CT3_3T;
    private javax.swing.JLabel NAME_CT4_2T;
    private javax.swing.JLabel NAME_CT4_3T;
    private javax.swing.JLabel NAME_CT5_2T;
    private javax.swing.JLabel NAME_CT5_3T;
    private javax.swing.JLabel NAME_CT6_2T;
    private javax.swing.JLabel NAME_CT6_3T;
    private javax.swing.JLabel NAME_CT7_2T;
    private javax.swing.JLabel NAME_CT7_3T;
    private javax.swing.JLabel NAME_ST2_3T;
    private javax.swing.JLabel NAME_ST3_2T;
    private javax.swing.JLabel NAME_ST3_3T;
    private javax.swing.JLabel NAME_ST4_2T;
    private javax.swing.JLabel NAME_ST4_3T;
    private javax.swing.JLabel NAME_ST5_2T;
    private javax.swing.JLabel NAME_ST5_3T;
    private javax.swing.JLabel NAME_ST6_2T;
    private javax.swing.JLabel NAME_ST6_3T;
    private javax.swing.JLabel NAME_ST7_2T;
    private javax.swing.JLabel NAME_ST7_3T;
    private javax.swing.JLabel Name_ST2_2T;
    private javax.swing.JLabel PHONG_CT2_2T;
    private javax.swing.JLabel PHONG_CT2_3T;
    private javax.swing.JLabel PHONG_CT3_2T;
    private javax.swing.JLabel PHONG_CT3_3T;
    private javax.swing.JLabel PHONG_CT4_2T;
    private javax.swing.JLabel PHONG_CT4_3T;
    private javax.swing.JLabel PHONG_CT5_2T;
    private javax.swing.JLabel PHONG_CT5_3T;
    private javax.swing.JLabel PHONG_CT6_2T;
    private javax.swing.JLabel PHONG_CT6_3T;
    private javax.swing.JLabel PHONG_CT7_2T;
    private javax.swing.JLabel PHONG_CT7_3T;
    private javax.swing.JLabel PHONG_ST2_2T;
    private javax.swing.JLabel PHONG_ST2_3T;
    private javax.swing.JLabel PHONG_ST3_2T;
    private javax.swing.JLabel PHONG_ST3_3T;
    private javax.swing.JLabel PHONG_ST4_2T;
    private javax.swing.JLabel PHONG_ST4_3T;
    private javax.swing.JLabel PHONG_ST5_2T;
    private javax.swing.JLabel PHONG_ST5_3T;
    private javax.swing.JLabel PHONG_ST6_2T;
    private javax.swing.JLabel PHONG_ST6_3T;
    private javax.swing.JLabel PHONG_ST7_2T;
    private javax.swing.JLabel PHONG_ST7_3T;
    private javax.swing.JPanel Thu2BaTiet;
    private javax.swing.JPanel Thu2BaTietChieu;
    private javax.swing.JPanel Thu2HaiTiet;
    private javax.swing.JPanel Thu2HaiTietChieu;
    private javax.swing.JPanel Thu3BaTiet;
    private javax.swing.JPanel Thu3BaTietChieu;
    private javax.swing.JPanel Thu3HaiTiet;
    private javax.swing.JPanel Thu3HaiTietChieu;
    private javax.swing.JPanel Thu4BaTiet;
    private javax.swing.JPanel Thu4BaTietChieu;
    private javax.swing.JPanel Thu4HaiTiet;
    private javax.swing.JPanel Thu4HaiTietChieu;
    private javax.swing.JPanel Thu5BaTiet;
    private javax.swing.JPanel Thu5BaTietChieu;
    private javax.swing.JPanel Thu5HaiTiet;
    private javax.swing.JPanel Thu5HaiTietChieu;
    private javax.swing.JPanel Thu6BaTiet;
    private javax.swing.JPanel Thu6BaTietChieu;
    private javax.swing.JPanel Thu6HaiTiet;
    private javax.swing.JPanel Thu6HaiTietChieu;
    private javax.swing.JPanel Thu7BaTiet;
    private javax.swing.JPanel Thu7BaTietChieu;
    private javax.swing.JPanel Thu7HaiTiet;
    private javax.swing.JPanel Thu7HaiTietChieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(BackButton))
        {
            GD_Menu_SV winD_Menu_SV = new GD_Menu_SV(sinhVien);
            winD_Menu_SV.setLocationRelativeTo(null);
            winD_Menu_SV.setVisible(true);
            this.dispose();
        }
    }

}
