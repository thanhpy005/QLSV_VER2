/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.GiangVienDAO;
import controller.TienTrinhDAO;
import controller.TkbDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import model.GiangVien;
import model.LopHocPhan;
import model.MonHoc;
import model.SinhVien;
import model.TienTrinh;

/**
 *
 * @author ThanhNguyen
 */
public class GD_DangKiMon extends javax.swing.JFrame implements ActionListener{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GD_DangKiMon.class.getName());
    private DefaultTableModel model;
    private ArrayList<TienTrinh> list;
    private ArrayList<MonHoc> list2;
    private ArrayList<LopHocPhan> list3;
    private SinhVien sinhVien;
    /**
     * Creates new form GD_DangKiMon
     */
    public GD_DangKiMon(SinhVien s) {
        initComponents();
        pack();
        Properties prop = new Properties();
        try {
            InputStream input = getClass().getResourceAsStream("/config.properties");
            if(input != null) {
                prop.load(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String bgColor = prop.getProperty("backgroundColor", "255,255,255"); // default trắng
        String[] rgb = bgColor.split(",");
        int r = Integer.parseInt(rgb[0].trim());
        int g = Integer.parseInt(rgb[1].trim());
        int b = Integer.parseInt(rgb[2].trim());

    
        getContentPane().setBackground(new Color(r, g, b));
        sinhVien = s;
        RefreshButton.addActionListener(this);
        BackButton.addActionListener(this);
        list  = new TienTrinhDAO().getTienTrinh2KiHoc(s);
        list2 =new TkbDAO().getListMonHoc(s.getMajor(),s.getSchoolYear());
        for(MonHoc i : list2)
        {
            TenMonCheckBox.addItem(i.getTenMon());
        }
        model = (DefaultTableModel) MonHocTable.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã học phần","Tên môn","Phòng Học","Giảng viên","Tiết bắt đầu","Số tiết","Thứ","Thời gian","Thao tác"
        });
        
        
    }
    public void ShowData(ArrayList<LopHocPhan> list)
    {
        for(LopHocPhan i : list)
        {
            GiangVien g = new GiangVienDAO().getGiangVien(i.getMaGV());
            model.addRow(new Object[]{
                i.getMaLHP(),TenMonCheckBox.getSelectedItem().toString(),i.getPhong(),g.getName(),String.valueOf(i.getTietBatDau()),String.valueOf(i.getSoTiet()),i.getThu(),i.getThoiGian(),"Đăng kí"
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TenMonCheckBox = new javax.swing.JComboBox<>();
        RefreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MonHocTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÍ MÔN HỌC");

        jLabel2.setText("Tên môn:");

        RefreshButton.setText("Refresh");

        MonHocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(MonHocTable);

        BackButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TenMonCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RefreshButton)
                .addContainerGap(253, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TenMonCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(20, 20, 20))
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
    private javax.swing.JTable MonHocTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JComboBox<String> TenMonCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(RefreshButton)) btnRefreshButtonClick();
        else btnBackButtonClick();
    }
    public void btnRefreshButtonClick()
    {
        list3 = new TkbDAO().getDsLopHocPhan(list2.get(TenMonCheckBox.getSelectedIndex()).getMaMon(), sinhVien.getSchoolYear());
        model.setRowCount(0);
        ShowData(list3);
        int columIndex = 8;
        MonHocTable.getColumnModel().getColumn(columIndex).setCellRenderer(new ButtonRenderer0());
        MonHocTable.getColumnModel().getColumn(columIndex).setCellEditor(new ButtonEditor0(sinhVien,list3));
        
    }
    public void btnBackButtonClick()
    {
        GD_Menu_SV winD_Menu_SV = new GD_Menu_SV(sinhVien);
        winD_Menu_SV.setLocationRelativeTo(null);
        winD_Menu_SV.setVisible(true);
        this.dispose();
    }
}
class ButtonRenderer0 extends JButton implements TableCellRenderer
{
    public ButtonRenderer0()
    {
        setOpaque(true);
        
    }
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected, boolean hasFocus,int row, int column)
    {
        setText((value == null)? "Đăng kí": value.toString());
        return this;
    }
}
class ButtonEditor0 extends AbstractCellEditor implements TableCellEditor, ActionListener
{
    private JButton button;
    private JTable table;
    private int currentRow;
    private SinhVien sinhVien;
    private ArrayList<LopHocPhan> list;
    public ButtonEditor0(SinhVien s,ArrayList<LopHocPhan> list)
    {
        sinhVien =s;
        this.list = list;
        button = new JButton("Đăng kí");
        button.setOpaque(true);
        button.addActionListener(this);
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,boolean isSelected, int row, int column)
    {
        this.table = table;
        this.currentRow = row;
        button.setText((value == null)? "Đăng kí":value.toString());
        return button;
    }
    @Override
    public Object getCellEditorValue()
    {
        return button.getText();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

        try {
            
            LopHocPhan l = new TkbDAO().getLHP(Integer.parseInt(table.getValueAt(currentRow, 0).toString()));
            
            if(new TkbDAO().getSoLuongHs(l.getMaLHP()) < 5 )
            {
                
                if(new TkbDAO().CapNhapTkb(l,sinhVien))
                {
                    JOptionPane.showMessageDialog(table, "Cập nhập thời khóa biểu thành công!");
                }
                else{
                  
                    JOptionPane.showMessageDialog(table, "Trùng lịch học với môn khác!");
                }
            }
            else {
                JOptionPane.showMessageDialog(table, "Lớp học đã đủ số lượng, vui lòng chọn lớp học khác");
            }
            
            
            fireEditingCanceled();

        } catch (Exception ex) { 
            
            
            if (ex.getMessage() != null && ex.getMessage().contains("SQLITE_CONSTRAINT_UNIQUE")) {
               
                JOptionPane.showMessageDialog(table, "Lỗi: Sinh viên đã đăng kí môn này rồi!");
            } else {
                
                JOptionPane.showMessageDialog(table, "Đã xảy ra lỗi: " + ex.getMessage());
                ex.printStackTrace(); 
            }
            
           
            fireEditingCanceled();
        }
    }

    
    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped(); 
    }
    
}