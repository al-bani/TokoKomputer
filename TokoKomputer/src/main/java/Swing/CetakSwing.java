/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Controller.CetakController;
import Interface.CetakInterface;
import Pojo.Cetak;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class CetakSwing extends javax.swing.JFrame {

    /**
     * Creates new form Cetak
     */
    
    CetakInterface cetakInterface;
    
    public CetakSwing() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    public void emptyFields(){
        txt_invoice.setText("");
        txt_print.setText("");
        cb_keuntungan.setSelected(false);
            cb_tot_pem.setSelected(false);
            cb_tot_prod.setSelected(false);
            cb_tot_pes.setSelected(false);
            cb_jum_pes.setSelected(false);
            cb_keuntungan.setSelected(false);
            cb_total_harga_pesanan.setSelected(false);
            cb_check_all.setSelected(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        panel_background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_print = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_invoice = new javax.swing.JTextField();
        btn_add_record = new javax.swing.JButton();
        cb_tot_pem = new javax.swing.JCheckBox();
        cb_tot_prod = new javax.swing.JCheckBox();
        cb_tot_pes = new javax.swing.JCheckBox();
        cb_jum_pes = new javax.swing.JCheckBox();
        cb_keuntungan = new javax.swing.JCheckBox();
        btn_print = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_check_all = new javax.swing.JCheckBox();
        btn_kembali = new javax.swing.JButton();
        cb_total_harga_pesanan = new javax.swing.JCheckBox();
        txt_tanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_background.setBackground(new java.awt.Color(238, 238, 238));

        txt_print.setEditable(false);
        txt_print.setColumns(20);
        txt_print.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        txt_print.setRows(5);
        txt_print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txt_print);

        jLabel1.setText("Nomor Invoice");

        btn_add_record.setText("Add Record");
        btn_add_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_recordActionPerformed(evt);
            }
        });

        cb_tot_pem.setText("Total Pembeli");
        cb_tot_pem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_tot_prod.setText("Total Produk");
        cb_tot_prod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_tot_pes.setText("Total Pesanan");
        cb_tot_pes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_jum_pes.setText("Jumlah Pesanan");
        cb_jum_pes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cb_keuntungan.setText("Keuntungan");
        cb_keuntungan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_print.setText("Print");
        btn_print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("CETAK INVOICE");

        cb_check_all.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_check_all.setText("Check All");
        cb_check_all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_check_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_check_allActionPerformed(evt);
            }
        });

        btn_kembali.setText("Kembali");
        btn_kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        cb_total_harga_pesanan.setText("Total Harga Pesanan");

        jLabel3.setText("Tanggal Invoice");

        javax.swing.GroupLayout panel_backgroundLayout = new javax.swing.GroupLayout(panel_background);
        panel_background.setLayout(panel_backgroundLayout);
        panel_backgroundLayout.setHorizontalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_backgroundLayout.createSequentialGroup()
                .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_backgroundLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_backgroundLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_backgroundLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add_record, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tot_pem)
                            .addComponent(cb_tot_prod)
                            .addComponent(cb_tot_pes)
                            .addComponent(cb_jum_pes)
                            .addComponent(cb_keuntungan)
                            .addComponent(cb_total_harga_pesanan)
                            .addComponent(cb_check_all)))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel_backgroundLayout.setVerticalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_backgroundLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_tot_pem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_tot_prod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_tot_pes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_jum_pes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_total_harga_pesanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_keuntungan)
                        .addGap(11, 11, 11)
                        .addComponent(cb_check_all)
                        .addGap(41, 41, 41)
                        .addComponent(btn_add_record, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_recordActionPerformed
        String totalPembeli = "", totalProduk = "", totalPesanan = "", jumlahPesanan = "", keuntungan = "", totalHarga = "";
        cetakInterface = new CetakController();
        
        if (cb_tot_pem.isSelected()) {
            int totalPembeliINT = cetakInterface.hitungTotalPem();
            totalPembeli = Integer.toString(totalPembeliINT);
        }
        
        if (cb_tot_prod.isSelected()) {
            int totalProdukINT = cetakInterface.hitungTotalProd();
            totalProduk = Integer.toString(totalProdukINT);
        }
        
        if (cb_tot_pes.isSelected()) {
            int totalPesananINT = cetakInterface.hitungTotalPes();
            totalPesanan = Integer.toString(totalPesananINT);
        }
        
        if (cb_jum_pes.isSelected()) {
            int totalJumlahPesanan = cetakInterface.hitungJumPes();
            jumlahPesanan = Integer.toString(totalJumlahPesanan);
        }
        
        if (cb_keuntungan.isSelected()) {
            double totalKeuntungan = cetakInterface.hitungKeuntungan();
            keuntungan = Double.toString(totalKeuntungan);
        }
        
        if (cb_total_harga_pesanan.isSelected()) {
            double totalHargaDouble = cetakInterface.hitungTotalHarga();
            totalHarga = Double.toString(totalHargaDouble);
        }
        
        if (txt_invoice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "anda belum mengisi Invoice");
        } else {
            txt_print.setText("");
            txt_print.append("\t\t INVOICE TOKO KOMPUTER\n\n\n"
                    
                    + "Nomor Invoice :\t\t" + txt_invoice.getText() + "\nTanggal : " + txt_tanggal.getText() + "\n"
                    + "======================================================\n\n"
                            + "Total Pembeli :\t\t" + totalPembeli + "\n"
                            + "Total Produk :\t\t" + totalProduk + "\n"
                            + "total Pesanan :\t\t" + totalPesanan + "\n"
                            + "Jumlah Pesanan :\t\t" + jumlahPesanan + "\n"
                            + "Total Harga Pesanan :\tRp." + totalHarga + "\n"
                            + "Total Keuntungan :\tRp." + keuntungan + "\n");
        }
    }//GEN-LAST:event_btn_add_recordActionPerformed

    private void cb_check_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_check_allActionPerformed
       cb_keuntungan.setSelected(true);
       cb_tot_pem.setSelected(true);
       cb_tot_prod.setSelected(true);
       cb_tot_pes.setSelected(true);
       cb_jum_pes.setSelected(true);
       cb_keuntungan.setSelected(true);
       cb_total_harga_pesanan.setSelected(true);
       
        if (!cb_check_all.isSelected()) {
            cb_keuntungan.setSelected(false);
            cb_tot_pem.setSelected(false);
            cb_tot_prod.setSelected(false);
            cb_tot_pes.setSelected(false);
            cb_jum_pes.setSelected(false);
            cb_keuntungan.setSelected(false);
            cb_total_harga_pesanan.setSelected(false);
        }
    }//GEN-LAST:event_cb_check_allActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        if (txt_print.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "anda belum menambahkan Record");
        } else {
            try {
                txt_print.print();
            } catch (PrinterException pe) {
                Logger.getLogger(CetakSwing.class.getName()).log(Level.SEVERE, null, pe);
            }
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_kembaliActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CetakSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CetakSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CetakSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CetakSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CetakSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_record;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_print;
    private javax.swing.JCheckBox cb_check_all;
    private javax.swing.JCheckBox cb_jum_pes;
    private javax.swing.JCheckBox cb_keuntungan;
    private javax.swing.JCheckBox cb_tot_pem;
    private javax.swing.JCheckBox cb_tot_pes;
    private javax.swing.JCheckBox cb_tot_prod;
    private javax.swing.JCheckBox cb_total_harga_pesanan;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_background;
    private javax.swing.JTextField txt_invoice;
    private javax.swing.JTextArea txt_print;
    private javax.swing.JTextField txt_tanggal;
    // End of variables declaration//GEN-END:variables
}
