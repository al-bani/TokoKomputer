/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Controller.PenjualController;
import Interface.PenjualInterface;
import Pojo.Penjual;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alzildan
 */
public class Register extends javax.swing.JFrame {
    PenjualInterface penjualServ = new PenjualController();
    Penjual penjual;
    String username, password, nama_depan, nama_belakang, alamat, email, confirm_password;
    boolean login = false;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_register.setEnabled(false);
    }
    
    public void showPassword(){
        if (cb_show_password.isSelected()) {
            txt_password.setEchoChar((char)0);
            txt_konfirmasi_password.setEchoChar((char)0);
            cb_show_password.setText("Hide Password");
        } else {
            txt_password.setEchoChar('*');
            txt_konfirmasi_password.setEchoChar('*');
            cb_show_password.setText("Show Password");
        }
    }
    
    public void close(){
         WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_cek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_nama_depan = new javax.swing.JTextField();
        txt_nama_belakang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_konfirmasi_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextPane();
        btn_register = new javax.swing.JButton();
        checkbox_snk = new javax.swing.JCheckBox();
        cb_show_password = new javax.swing.JCheckBox();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setText("Email");

        jLabel3.setText("Username");

        btn_cek.setText("cek");
        btn_cek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cekActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Lengkap");

        txt_nama_belakang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_belakangActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        jLabel6.setText("Konfirmasi Password");

        jLabel7.setText("Alamat");

        jScrollPane1.setViewportView(txt_alamat);

        btn_register.setText("Register");
        btn_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        checkbox_snk.setText("Syarat dan Ketentuan yang tersedia");
        checkbox_snk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkbox_snk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_snkActionPerformed(evt);
            }
        });
        checkbox_snk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkbox_snkKeyPressed(evt);
            }
        });

        cb_show_password.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cb_show_password.setText("Show Password");
        cb_show_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_show_passwordActionPerformed(evt);
            }
        });

        btn_kembali.setText("kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_username)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_cek))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_nama_depan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nama_belakang)
                                    .addGap(4, 4, 4)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_kembali)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_register))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkbox_snk)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_konfirmasi_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7)
                                    .addComponent(cb_show_password))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cek))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama_depan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama_belakang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_konfirmasi_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(cb_show_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox_snk)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register)
                    .addComponent(btn_kembali))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkbox_snkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_snkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_snkActionPerformed

    private void txt_nama_belakangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_belakangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_belakangActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

            username = txt_username.getText();
            password = txt_password.getText();
            nama_depan = txt_nama_depan.getText();
            nama_belakang = txt_nama_belakang.getText();
            email = txt_email.getText();
            alamat = txt_alamat.getText();
            confirm_password = txt_konfirmasi_password.getText();
            
            if ("".equals(username) || "".equals(password) || "".equals(nama_depan) || "".equals(email) || "".equals(alamat) || "".equals(confirm_password)) {
                JOptionPane.showMessageDialog(null, "anda belum mengisi data");
            } else {
                if (checkbox_snk.isSelected()) {
                    if (password.equals(confirm_password)) {
                        try {
                            int status = penjualServ.Register(username, password, nama_depan, nama_belakang, alamat, email);

                            if (status == 1) {
                                JOptionPane.showMessageDialog(null, "data berhasil disimpan, silahkan login!!");
                                new Login().setVisible(true);
                                close();
                            } else {
                                JOptionPane.showMessageDialog(null, "data tidak berhasil disimpan");
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "server error");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "maaf password tidak sesuai");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "maaf anda belum menyetujui Syarat dan ketentuan");
                }
            }
            
    
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cekActionPerformed
       username = txt_username.getText();
       
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "harap isi username");
        } else {
            int status = penjualServ.cekUsername(username);
            
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "maaf username sudah dipakai");
                 btn_register.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "username tersedia");
                btn_register.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_cekActionPerformed

    private void checkbox_snkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkbox_snkKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_snkKeyPressed

    private void cb_show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_show_passwordActionPerformed
        showPassword();
    }//GEN-LAST:event_cb_show_passwordActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        Login login = new Login();
        login.setVisible(true);
        close();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox cb_show_password;
    private javax.swing.JCheckBox checkbox_snk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_konfirmasi_password;
    private javax.swing.JTextField txt_nama_belakang;
    private javax.swing.JTextField txt_nama_depan;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
