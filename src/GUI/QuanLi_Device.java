/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.DeviceDao;

import POJO.Device;
import Utils.Connect;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.RowFilter;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.html.parser.DTDConstants;


/**
 *
 * @author QuanLDM
 */
public class QuanLi_Device extends javax.swing.JFrame {

    private String dataconstructor = "";
    private String dataconstructor1 = "";
    private String dataconstructor2 = "";
    
    

    /**
     * Creates new form QuanLi_Device
     */
    public QuanLi_Device(String data) {
        initComponents();
        setTitle("Quản lí thiết bị trường học");
        this.dataconstructor = data;
        

        btn_muon32.setEnabled(false);
        btn_edit_32.setEnabled(false);
        btn_delete_32.setEnabled(false);
        btn_hong_32.setEnabled(false);
        jtf_ma32.setEditable(false);
        ArrayList<Device> dv = DeviceDao.layDSdevice("select * from thietbi ");
        DefaultTableModel model = (DefaultTableModel) jtb_ds.getModel();

        Object[] obj = new Object[5];
        for (int i = 0; i < dv.size(); i++) {
            obj[0] = dv.get(i).getMa32();
            obj[1] = dv.get(i).getTen32();
            obj[2] = dv.get(i).getLoai32();
            obj[3] = dv.get(i).getTinhtrang32();
            if (dv.get(i).getTrangthai32().equals("0")) {
                obj[4] = "Chưa mượn";
            } else {
                obj[4] = "Đang mượn";
            }
//            obj[4] = dv.get(i).getTrangthai32();
            model.addRow(obj);

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

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_ma32 = new javax.swing.JTextField();
        jtf_ten32 = new javax.swing.JTextField();
        jtf_tinhtrang32 = new javax.swing.JTextField();
        jtf_trangthai32 = new javax.swing.JTextField();
        btn_them_32 = new javax.swing.JButton();
        btn_edit_32 = new javax.swing.JButton();
        btn_delete_32 = new javax.swing.JButton();
        btn_hong_32 = new javax.swing.JButton();
        btn_muon32 = new javax.swing.JButton();
        jtf_loai32 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_ds = new javax.swing.JTable();
        jtf_search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Danh sách thiết bị");

        jPanel3.setForeground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mã");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Tên");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Loại");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Tình trạng");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Trạng thái");

        jtf_ma32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_ma32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ma32ActionPerformed(evt);
            }
        });

        jtf_ten32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtf_tinhtrang32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_tinhtrang32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tinhtrang32ActionPerformed(evt);
            }
        });

        jtf_trangthai32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btn_them_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_them_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_them_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btn_them_32.setText("Thêm");
        btn_them_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_32ActionPerformed(evt);
            }
        });

        btn_edit_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_edit_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_edit_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btn_edit_32.setText("Sửa");
        btn_edit_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_32ActionPerformed(evt);
            }
        });

        btn_delete_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_delete_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_delete_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btn_delete_32.setText("Xóa");
        btn_delete_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_32ActionPerformed(evt);
            }
        });

        btn_hong_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_hong_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_hong_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report.png"))); // NOI18N
        btn_hong_32.setText("Báo hỏng");
        btn_hong_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hong_32ActionPerformed(evt);
            }
        });

        btn_muon32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_muon32.setForeground(new java.awt.Color(0, 51, 51));
        btn_muon32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inspiration.png"))); // NOI18N
        btn_muon32.setText("Mượn");
        btn_muon32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muon32ActionPerformed(evt);
            }
        });

        jtf_loai32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/parchment.png"))); // NOI18N
        jButton1.setText("Lịch sử ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jtf_trangthai32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(jtf_tinhtrang32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_ten32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_ma32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_loai32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_them_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hong_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_muon32, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_ma32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them_32))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_ten32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_delete_32)
                    .addComponent(jtf_loai32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_tinhtrang32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hong_32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_trangthai32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_muon32))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jtb_ds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtb_ds.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtb_ds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ THIẾT BỊ", "TÊN THIẾT BỊ", "LOẠI", "TÌNH TRẠNG", "TRẠNG THÁI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_ds.setGridColor(new java.awt.Color(0, 153, 0));
        jtb_ds.setRowHeight(30);
        jtb_ds.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jtb_ds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_dsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_ds);
        if (jtb_ds.getColumnModel().getColumnCount() > 0) {
            jtb_ds.getColumnModel().getColumn(3).setMinWidth(10);
        }

        jtf_search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_search.setForeground(new java.awt.Color(204, 204, 204));
        jtf_search.setText("Search");
        jtf_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_searchMouseClicked(evt);
            }
        });
        jtf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_searchActionPerformed(evt);
            }
        });
        jtf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_searchKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_dsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_dsMouseClicked

        DefaultTableModel tmodel = (DefaultTableModel) jtb_ds.getModel();
        int selectrowindex = jtb_ds.getSelectedRow();
        jtf_ma32.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        jtf_ten32.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        jtf_loai32.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        jtf_tinhtrang32.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        jtf_trangthai32.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        dataconstructor1 = jtf_ma32.getText();
        boolean a = jtb_ds.isEditing();
        if (jtf_ma32.getText() != null) {
            btn_edit_32.setEnabled(true);
            btn_delete_32.setEnabled(true);
        }
        if (jtf_tinhtrang32.getText().equals("Normal")) {
            btn_hong_32.setEnabled(true);
            btn_muon32.setEnabled(true);
        } else {
            btn_hong_32.setEnabled(false);

        }

        if (jtf_trangthai32.getText().equals("Chưa mượn") && jtf_tinhtrang32.getText().equals("Normal")) {
            btn_muon32.setEnabled(true);
        } else {
            btn_muon32.setEnabled(false);
        }
        if (a == false) {
            JOptionPane.showMessageDialog(null, "Bạn không thể chỉnh sửa ở đây ");
        }
        dataconstructor2 = jtf_ma32.getText();
        System.out.println(dataconstructor2);
    }//GEN-LAST:event_jtb_dsMouseClicked

    private void btn_them_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_32ActionPerformed
        Add li = new Add(dataconstructor);
        li.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_them_32ActionPerformed

    private void btn_delete_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_32ActionPerformed
        // TODO add your handling code here:
        String sql = "delete from thietbi where ma =?";
        try {
            Connection con = Connect.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, jtf_ma32.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (Exception e) {
        }
        QuanLi_Device s = new QuanLi_Device(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_delete_32ActionPerformed

    private void jtf_ma32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ma32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ma32ActionPerformed

    private void jtf_tinhtrang32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tinhtrang32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tinhtrang32ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        MENU s = new MENU(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    private void btn_edit_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_32ActionPerformed
        try {
            Connection con = Connect.getConnection();
            String value1 = jtf_ma32.getText();
            String value2 = jtf_ten32.getText();
            String value3 = jtf_loai32.getText();
            String sql = "UPDATE thietbi set ten='" + value2 + "' ,loai='" + value3 + "' where ma='" + value1 + "' ";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công ");
            con.close();
            QuanLi_Device s = new QuanLi_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_edit_32ActionPerformed

    private void btn_hong_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hong_32ActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = Connect.getConnection();
            String value1 = "Error";
            String value2 = jtf_ma32.getText();
            String sql = "UPDATE thietbi set tinhtrang='" + value1 + "' where ma='" + value2 + "'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Báo hỏng thành công");
            con.close();
            QuanLi_Device s = new QuanLi_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_hong_32ActionPerformed

    private void btn_muon32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muon32ActionPerformed
        Muon dv = new Muon(dataconstructor, dataconstructor1);
        dv.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_muon32ActionPerformed

    private void jtf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtb_ds.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_ds.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtf_search.getText().trim()));
    }//GEN-LAST:event_jtf_searchKeyReleased

    private void jtf_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_searchMouseClicked
         jtf_search.setText("");
    }//GEN-LAST:event_jtf_searchMouseClicked

    private void jtf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_searchActionPerformed
     
    }//GEN-LAST:event_jtf_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LichSuFindMa_Device s = new LichSuFindMa_Device(dataconstructor,dataconstructor2);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete_32;
    private javax.swing.JButton btn_edit_32;
    private javax.swing.JButton btn_hong_32;
    private javax.swing.JButton btn_muon32;
    private javax.swing.JButton btn_them_32;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtb_ds;
    private javax.swing.JTextField jtf_loai32;
    private javax.swing.JTextField jtf_ma32;
    private javax.swing.JTextField jtf_search;
    private javax.swing.JTextField jtf_ten32;
    private javax.swing.JTextField jtf_tinhtrang32;
    private javax.swing.JTextField jtf_trangthai32;
    // End of variables declaration//GEN-END:variables
}
