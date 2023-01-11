/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;


import Pojo.Promo;
import Interface.PromoInterface;
import Controller.PromoController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ramzi
 */
public class PromoSwing extends javax.swing.JFrame {

    /**
     * Creates new form PromoSwing
     */
    PromoInterface promoInterface;
    
    public PromoSwing() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
        cb_kategori.setEnabled(false);
        btn_update.setEnabled(false);
    }

    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    private void emptyField() {
        txt_kode_promo.setText("");
        txt_nama_promo.setText("");
        txt_potongan_promo.setText("");
    }
    
    private void loadData() {
        promoInterface = new PromoController();
        List<Promo> listPromo = new ArrayList<>();
        listPromo = promoInterface.findAll();
        Object[][] objectPromo = new Object[listPromo.size()][5];
        
        int counter = 0;
        for (Promo promo : listPromo) {
            objectPromo[counter][0] = promo.getKodePromo();
            objectPromo[counter][1] = promo.getNamaPromo();
            objectPromo[counter][2] = promo.getLamaPromo();
            objectPromo[counter][3] = promo.getPotonganPromo();
            objectPromo[counter][4] = promo.getKategoriPromo();
          
            counter++;
        }
        tabel_promo.setModel(new javax.swing.table.DefaultTableModel(
            objectPromo,
            new String [] {
                "Kode Promo ", "Nama Promo ", "Periode Promo", "Potongan Promo", "Kategori Promo"
            }
        ));
    }
    
    private void loadData (Promo promo){
        Object[][] objectPromo = new Object[1][5];
        
            objectPromo[0][0] = promo.getKodePromo();
            objectPromo[0][1] = promo.getNamaPromo();
            objectPromo[0][2] = promo.getLamaPromo();
            objectPromo[0][3] = promo.getPotonganPromo();
            objectPromo[0][4] = promo.getKategoriPromo();
    
    tabel_promo.setModel(new javax.swing.table.DefaultTableModel(
            objectPromo,
            new String [] {
                "Kode Promo ", "Nama Promo ", "Periode Promo", "Potongan Promo", "Kategori Promo"
            }
        ));

    }
    
    private Promo findPromo(int id) {
        Promo promo = new Promo();
        promoInterface = new PromoController();
        promo = promoInterface.findById(id);
    
        return promo;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_promo = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        txt_kode_promo = new javax.swing.JTextField();
        txt_nama_promo = new javax.swing.JTextField();
        txt_potongan_promo = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        cb_kategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radio_kategori = new javax.swing.JRadioButton();
        date_from = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        date_to = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_promo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Promo", "Nama Promo", "Periode Promo", "Potongan Promo", "Kategori Promo"
            }
        ));
        tabel_promo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_promo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_promoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_promo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 367, 588, 224));

        txt_search.setText("Search");
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 333, 162, -1));

        btn_search.setText("Search");
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 333, 75, -1));
        jPanel1.add(txt_kode_promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 65, 318, 30));
        jPanel1.add(txt_nama_promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 139, 318, 30));

        txt_potongan_promo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_potongan_promoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_potongan_promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 65, 169, 30));

        btn_create.setText("Create");
        btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        jPanel1.add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 279, 110, -1));

        btn_update.setText("Update");
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 279, 110, -1));

        btn_delete.setText("Delete");
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 279, 110, -1));

        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 279, 110, -1));

        btn_refresh.setText("refresh");
        btn_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 333, 75, -1));

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motherboard", "Processor (CPU)", "Heatsink", "RAM", "Hard Disk", "VGA Card (GPU)", "Flashdisk", "Monitor", "Keyboard", "Mouse", "Optical Drive", "SSD", "Power Supply", "LAN Card", "WLAN Card", "Sound Card", "Printer", "Scanner", "Speaker", "Webcam" }));
        cb_kategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cb_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 222, 28));

        jLabel1.setText("Kode Promo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 43, -1, -1));

        jLabel2.setText("Nama Promo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 115, -1, -1));

        jLabel3.setText("Periode Promo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 191, -1, -1));

        jLabel4.setText("Potongan Promo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 43, -1, -1));

        jLabel5.setText("Kategori Produk");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("%");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 69, -1, -1));

        radio_kategori.setText("Tambahkan Promo pada Kategori Tertentu");
        radio_kategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_kategoriActionPerformed(evt);
            }
        });
        jPanel1.add(radio_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));
        jPanel1.add(date_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("->");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 219, -1, -1));
        jPanel1.add(date_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 219, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        String nama_promo, periode_promo;
        int kode_promo,potongan_promo;
        promoInterface= new PromoController();
        
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date startDate = date_from.getDate();
            Date endDate = date_to.getDate();
            
            long selisihWaktuLong = endDate.getTime() - startDate.getTime();
            long selisihHari =  TimeUnit.MILLISECONDS.toDays(selisihWaktuLong);
            String SelisihWaktu = Long.toString(selisihHari) + " Hari";
        
        if (selisihHari < 0) {
            JOptionPane.showMessageDialog(null, "Tanggal promo tidak boleh kebelakang");
        } else {
            kode_promo = Integer.parseInt(txt_kode_promo.getText());
            nama_promo = txt_nama_promo.getText();
            periode_promo = SelisihWaktu;
            potongan_promo = Integer.parseInt(txt_potongan_promo.getText());

            Promo promo = new Promo();
            promo.setKodePromo(kode_promo);
            promo.setNamaPromo(nama_promo);
            promo.setLamaPromo(periode_promo);
            promo.setPotonganPromo(potongan_promo);
            promo.setKategoriPromo(cb_kategori.getSelectedItem().toString());

            promoInterface.create(promo);
            JOptionPane.showMessageDialog(null, "Data Promo created successfully");
            loadData();
            emptyField();
        }
        
        
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyField();
        txt_kode_promo.setEditable(true);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
    String nama_promo, periode_promo;
        int kode_promo,potongan_promo;
        promoInterface= new PromoController();
        txt_kode_promo.setEditable(true);
        
        kode_promo = Integer.parseInt(txt_kode_promo.getText());
        nama_promo = txt_nama_promo.getText();
      
        potongan_promo = Integer.parseInt(txt_potongan_promo.getText());
        
        Promo promo = new Promo();
        promo.setKodePromo(kode_promo);
        promo.setNamaPromo(nama_promo);
        promo.setKategoriPromo(cb_kategori.getSelectedItem().toString());
        promo.setPotonganPromo(potongan_promo);
        
        promoInterface.update(promo);
        JOptionPane.showMessageDialog(null, "Data Promo created successfully");
        loadData();
        btn_create.setEnabled(true);
        emptyField();    }//GEN-LAST:event_btn_updateActionPerformed

    private void tabel_promoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_promoMouseClicked
        String nama_promo;
        txt_kode_promo.setEditable(false);
        btn_create.setEnabled(false);
        btn_update.setEnabled(true);
        int kode_promo,potongan_promo;
        
        int row = tabel_promo.getSelectedRow();
        
        kode_promo = Integer.parseInt(tabel_promo.getValueAt(row, 0).toString());
        nama_promo = tabel_promo.getValueAt(row, 1).toString();
        potongan_promo = Integer.parseInt(tabel_promo.getValueAt(row, 3).toString());
        
        txt_kode_promo.setText(kode_promo+"");
        txt_nama_promo.setText(nama_promo+"");
        txt_potongan_promo.setText(potongan_promo+"");
                
    }//GEN-LAST:event_tabel_promoMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int id;
        promoInterface = new PromoController();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_kode_promo.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            promoInterface.delete(id);
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        int id;
        Promo searchedPromo = new Promo();
        
        id = Integer.parseInt(txt_search.getText());
        searchedPromo = findPromo(id);
        if (searchedPromo != null) {
            loadData(searchedPromo);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadData();
        btn_create.setEnabled(false);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void radio_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_kategoriActionPerformed
        cb_kategori.setEnabled(true);
        
        if (!radio_kategori.isSelected()) {
            cb_kategori.setEnabled(false);
        }
    }//GEN-LAST:event_radio_kategoriActionPerformed

    private void txt_potongan_promoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_potongan_promoKeyTyped
       char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_potongan_promoKeyTyped

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
            java.util.logging.Logger.getLogger(PromoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PromoSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_kategori;
    private com.toedter.calendar.JDateChooser date_from;
    private com.toedter.calendar.JDateChooser date_to;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_kategori;
    private javax.swing.JTable tabel_promo;
    private javax.swing.JTextField txt_kode_promo;
    private javax.swing.JTextField txt_nama_promo;
    private javax.swing.JTextField txt_potongan_promo;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
