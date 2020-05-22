/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shayantan_tech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author shaya
 */
public class Verification extends javax.swing.JFrame {

    /**
     * Creates new form Verification
     */
    public Verification() {
        initComponents();
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
        empid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        empempty = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("EmployeeID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 76, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 165, 120, 40));

        empid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empidKeyReleased(evt);
            }
        });
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 86, 149, -1));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 179, 149, -1));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 110, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Verify Yourself!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 503, 54));

        empempty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empemptyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empemptyKeyReleased(evt);
            }
        });
        getContentPane().add(empempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 121, 149, 22));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 214, 149, 23));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/iconfinder_Arrow_Left_1063872.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/ssl-check-1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -40, 630, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(empid.getText().trim().isEmpty() && password.getText().trim().isEmpty()){
            empempty.setText("Username is empty");
            jLabel4.setText("Password is Empty");
        }
        else if(empid.getText().trim().isEmpty())
        {
            empempty.setText("Username is empty");
        }
        else if(password.getText().trim().isEmpty())
        {
            jLabel4.setText("Password is Empty");
        }
        else
        {
        try
        {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true";
             Connection con = DriverManager.getConnection(url);
             String query = "Select * from auth where Empname=? and pass=?";
             PreparedStatement pst = con.prepareStatement(query);
             pst.setString(1, empid.getText());
             pst.setString(2, password.getText());
             ResultSet rs=pst.executeQuery();
             if(rs.next()){
                 JOptionPane.showMessageDialog(null,"Validation is successful");
                 dispose();
                 new AdminUI().setVisible(true);
             }
             else{
                 JOptionPane.showMessageDialog(null,"data doesnt match");
                 empid.setText("");
                 password.setText("");
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empidKeyReleased
        // TODO add your handling code here:
        empempty.setText("");
    }//GEN-LAST:event_empidKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        jLabel4.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainUI().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void empemptyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empemptyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_empemptyKeyPressed

    private void empemptyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empemptyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_empemptyKeyReleased

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
            java.util.logging.Logger.getLogger(Verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empempty;
    private javax.swing.JTextField empid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}