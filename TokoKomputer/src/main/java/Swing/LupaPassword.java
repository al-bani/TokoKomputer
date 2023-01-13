/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Controller.PenjualController;
import Interface.PenjualInterface;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alzildan
 */
public class LupaPassword extends javax.swing.JFrame {
    PenjualInterface penjualServ = new PenjualController();
    String username, password, confirm_password;
    /**
     * Creates new form LupaPassword
     */
    public LupaPassword() {
        initComponents();
        this.setLocationRelativeTo(null);
        panel_lupa_password.setVisible(false);

    }
    
    public void LoginDirect(){
        new Login().setVisible(true);
        close();
    }
    
    public void showPassword(){
        if (cb_show_password.isSelected()) {
            txt_password.setEchoChar((char)0);
            txt_confirm_password.setEchoChar((char)0);
            cb_show_password.setText("Hide Password");
        } else {
            txt_password.setEchoChar('*');
            txt_confirm_password.setEchoChar('*');
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
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        panel_lupa_password = new javax.swing.JPanel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_confirm_password = new javax.swing.JLabel();
        txt_confirm_password = new javax.swing.JPasswordField();
        btn_save = new javax.swing.JButton();
        cb_show_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Username");

        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
        });

        jLabel2.setText("LUPA PASSWORD");

        btn_cari.setText("cari");
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_kembali.setText("Kembali");
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
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_kembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_kembali)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_password.setText("Password Baru");

        lbl_confirm_password.setText("Konfirmasi Password");

        txt_confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirm_passwordActionPerformed(evt);
            }
        });
        txt_confirm_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_confirm_passwordKeyPressed(evt);
            }
        });

        btn_save.setText("Simpan");
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
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

        javax.swing.GroupLayout panel_lupa_passwordLayout = new javax.swing.GroupLayout(panel_lupa_password);
        panel_lupa_password.setLayout(panel_lupa_passwordLayout);
        panel_lupa_passwordLayout.setHorizontalGroup(
            panel_lupa_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lupa_passwordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_lupa_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_show_password)
                    .addGroup(panel_lupa_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_save)
                        .addGroup(panel_lupa_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_confirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(lbl_confirm_password)
                            .addComponent(lbl_password)
                            .addComponent(txt_password))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panel_lupa_passwordLayout.setVerticalGroup(
            panel_lupa_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lupa_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_confirm_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_show_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(panel_lupa_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_lupa_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
     
    }//GEN-LAST:event_formWindowClosed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        password = txt_password.getText();
        confirm_password = txt_confirm_password.getText();
        username = txt_username.getText();
        
        if ("".equals(password) || "".equals(confirm_password)) {
            JOptionPane.showMessageDialog(null, "Harap isi password");
        }else{
            try {
                if (password.equals(confirm_password)) {
                    int status = penjualServ.updatePassword(username, confirm_password);

                    if (status == 1) {
                        JOptionPane.showMessageDialog(null, "Password sudah diperbarui");
                        LoginDirect();
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password tidak sesuai");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Server Error");
            }
        }
        
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        username = txt_username.getText();

        if ("".equals(username)) {
            JOptionPane.showMessageDialog(null, "Anda belum mengisi Username");
        } else {
             try {
                int status = penjualServ.cekUsername(username);

                if (status == 1) {
                    JOptionPane.showMessageDialog(null, "Username Ditermukan");
                    panel_lupa_password.setVisible(true);
                    txt_username.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Username tidak ditemukan");
                    panel_lupa_password.setVisible(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Server Error");
            }
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_confirm_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirm_passwordKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            password = txt_password.getText();
            confirm_password = txt_confirm_password.getText();
            username = txt_username.getText();

            if ("".equals(password) || "".equals(confirm_password)) {
                JOptionPane.showMessageDialog(null, "Harap isi password");
            }else{
                try {
                    if (password.equals(confirm_password)) {
                        int status = penjualServ.updatePassword(username, confirm_password);

                        if (status == 1) {
                            JOptionPane.showMessageDialog(null, "Password sudah diperbarui");
                            LoginDirect();
                           
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password tidak sesuai");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Server Error");
                }
            }
        }
    }//GEN-LAST:event_txt_confirm_passwordKeyPressed

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            username = txt_username.getText();

            if ("".equals(username)) {
                JOptionPane.showMessageDialog(null, "Anda belum mengisi Username");
            } else {
                 try {
                    int status = penjualServ.cekUsername(username);

                    if (status == 1) {
                         JOptionPane.showMessageDialog(null, "Email Ditermukan");
                        panel_lupa_password.setVisible(true);
                        txt_username.setEditable(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Email tidak ditemukan");
                        panel_lupa_password.setVisible(false);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Server Error");
                }
            }
        }
 
    }//GEN-LAST:event_txt_usernameKeyPressed

    private void cb_show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_show_passwordActionPerformed
       showPassword();
    }//GEN-LAST:event_cb_show_passwordActionPerformed

    private void txt_confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirm_passwordActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        LoginDirect();
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
            java.util.logging.Logger.getLogger(LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LupaPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_save;
    private javax.swing.JCheckBox cb_show_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_confirm_password;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JPanel panel_lupa_password;
    private javax.swing.JPasswordField txt_confirm_password;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
