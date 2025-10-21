
package view;

import controller.TienTrinhDAO;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.TienTrinh;
import model.SinhVien;


public class GD_XemTienTrinh extends javax.swing.JFrame implements ActionListener{
    private SinhVien sv;
    private ArrayList<TienTrinh> list;
    DefaultTableModel m1,m2,m3,m4,m5,m6,m7,m8;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GD_XemTienTrinh.class.getName());

    
    
    public GD_XemTienTrinh(SinhVien sinhVien) {
        initComponents();
        BackButton.addActionListener(this);
        sv = sinhVien;
        list = new TienTrinhDAO().getTienTrinh(sv);
        m1 = (DefaultTableModel) DiemKi1Table.getModel();
        m2 = (DefaultTableModel) DiemKi2Table.getModel();
        m3 = (DefaultTableModel) DiemKi3Table.getModel();
        m4 = (DefaultTableModel) DiemKi4Table.getModel();
        m5 = (DefaultTableModel) DiemKi5Table.getModel();
        m6 = (DefaultTableModel) DiemKi6Table.getModel();
        m7 = (DefaultTableModel) DiemKi7Table.getModel();
        m8 = (DefaultTableModel) DiemKi8Table.getModel();
        m1.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m2.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m3.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m4.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m5.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m6.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m7.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        m8.setColumnIdentifiers(new Object[]{
            "Tên môn","Kết quả","Trạng Thái"
        });
        LoadDataTable();
        GpaTab1Label.setText(String.format("%.1f",TbKetQua(m1)));
        GpaTab2Label.setText(String.format("%.1f",TbKetQua(m2)));
        GpaTab3Label.setText(String.format("%.1f",TbKetQua(m3)));
        GpaTab4Label.setText(String.format("%.1f",TbKetQua(m4)));
        GpaTab5Label.setText(String.format("%.1f",TbKetQua(m5)));
        GpaTab6Label.setText(String.format("%.1f",TbKetQua(m6)));
        GpaTab7Label.setText(String.format("%.1f",TbKetQua(m7)));
        GpaTab8Label.setText(String.format("%.1f",TbKetQua(m8)));
      
        
        
    }
    public float TbKetQua(DefaultTableModel m)
    {
        float res = 0;
        int cnt=0;
        
        for(int i = 0;i<m.getRowCount();i++)
        {
            if((float)m.getValueAt(i, 1) > 0)
            {
                res += (float)m.getValueAt(i, 1);
                cnt++;
            }
        }
        return res/cnt;
    }
    public void LoadDataTable()
    {
        for(TienTrinh i : list)
        {
            if(i.getHocKi() == 1)
            {
                m1.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 2)
            {
                m2.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 3)
            {
                m3.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 4)
            {
                m4.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 5)
            {
                m5.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 6)
            {
                m6.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 7)
            {
                m7.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
            }
            else if(i.getHocKi() == 8)
            {
                m8.addRow(new Object[]{
                    i.getTenMon(),i.getKetQua(),(i.getKetQua() != 0)?"Hoàn thành" : "Chưa hoàn thành"
                });
               
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

        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DiemKi1Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        GpaTab1Label = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DiemKi2Table = new javax.swing.JTable();
        GpaTab2Label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DiemKi3Table = new javax.swing.JTable();
        GpaTab3Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DiemKi4Table = new javax.swing.JTable();
        GpaTab4Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        DiemKi5Table = new javax.swing.JTable();
        GpaTab5Label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        DiemKi6Table = new javax.swing.JTable();
        GpaTab6Label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        DiemKi7Table = new javax.swing.JTable();
        GpaTab7Label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        DiemKi8Table = new javax.swing.JTable();
        GpaTab8Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DiemKi1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DiemKi1Table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GPA:");

        GpaTab1Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab1Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab1Label.setText("jLabel2");
        GpaTab1Label.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab1Label)
                    .addComponent(jLabel1))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 1", jPanel3);

        DiemKi2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(DiemKi2Table);

        GpaTab2Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab2Label.setText("jLabel2");
        GpaTab2Label.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("GPA:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab2Label))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab2Label)
                    .addComponent(jLabel3))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 2", jPanel6);

        DiemKi3Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(DiemKi3Table);

        GpaTab3Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab3Label.setText("jLabel2");
        GpaTab3Label.setToolTipText("");
        GpaTab3Label.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("GPA:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab3Label))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab3Label)
                    .addComponent(jLabel5))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 3", jPanel7);

        DiemKi4Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(DiemKi4Table);

        GpaTab4Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab4Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab4Label.setText("jLabel2");
        GpaTab4Label.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("GPA:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab4Label))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab4Label)
                    .addComponent(jLabel6))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 4", jPanel8);

        DiemKi5Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(DiemKi5Table);

        GpaTab5Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab5Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab5Label.setText("jLabel2");
        GpaTab5Label.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("GPA:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab5Label))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab5Label)
                    .addComponent(jLabel7))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 5", jPanel9);

        DiemKi6Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(DiemKi6Table);

        GpaTab6Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab6Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab6Label.setText("jLabel2");
        GpaTab6Label.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("GPA:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab6Label))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab6Label)
                    .addComponent(jLabel8))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 6", jPanel10);

        DiemKi7Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(DiemKi7Table);

        GpaTab7Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab7Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab7Label.setText("jLabel2");
        GpaTab7Label.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("GPA:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab7Label))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab7Label)
                    .addComponent(jLabel9))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 7", jPanel11);

        DiemKi8Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(DiemKi8Table);

        GpaTab8Label.setBackground(new java.awt.Color(255, 255, 255));
        GpaTab8Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GpaTab8Label.setText("jLabel2");
        GpaTab8Label.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("GPA:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(GpaTab8Label))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaTab8Label)
                    .addComponent(jLabel2))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane12.addTab("Kì 8", jPanel12);

        BackButton.setText("Quay lại");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane12)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTable DiemKi1Table;
    private javax.swing.JTable DiemKi2Table;
    private javax.swing.JTable DiemKi3Table;
    private javax.swing.JTable DiemKi4Table;
    private javax.swing.JTable DiemKi5Table;
    private javax.swing.JTable DiemKi6Table;
    private javax.swing.JTable DiemKi7Table;
    private javax.swing.JTable DiemKi8Table;
    private javax.swing.JLabel GpaTab1Label;
    private javax.swing.JLabel GpaTab2Label;
    private javax.swing.JLabel GpaTab3Label;
    private javax.swing.JLabel GpaTab4Label;
    private javax.swing.JLabel GpaTab5Label;
    private javax.swing.JLabel GpaTab6Label;
    private javax.swing.JLabel GpaTab7Label;
    private javax.swing.JLabel GpaTab8Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(BackButton))
        {
            GD_Menu_SV winD_Menu_SV = new GD_Menu_SV(sv);
            winD_Menu_SV.setLocationRelativeTo(null);
            winD_Menu_SV.setVisible(true);
            this.dispose();
        }
    }
}
