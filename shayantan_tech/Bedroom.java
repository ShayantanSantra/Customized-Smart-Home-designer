/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shayantan_tech;
import java.sql.*;
import java.io.File;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shaya
 */
public final class Bedroom extends javax.swing.JFrame {
   // int rate;
    PreparedStatement stat1,stat2,stat3,stat4,stat5,stat6;
    Connection con = null;
    ResultSet rs, rs1,rs2,rs3,rs4,rs5,rs6;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true";
    
    /**
     * Creates new form Bedroom
     */
    public Bedroom(String para1,String para2) {
        initComponents();
        GetRoom();
        System.out.println(para1);
        String ass=para1;
        String username=para2;
        user.setText(username);
        jLabel8.setText(ass);
        //jComboBox1.removeAllItems();
        itemlist.removeAllItems();
        CatList.removeAllItems();
        
        //Getcat();
        
    }

    private Bedroom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void GetRoom()
    {
        //itemlist.removeAllItems();
        try
        {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            stat3 = con.prepareStatement("select distinct room from product2");
            rs3=stat3.executeQuery();
            while(rs3.next())
            {
                roombox.addItem(rs3.getString("room"));
            }
        }
         catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
    }
//    public void getProd()
//    {
//        
//    }

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roomtype = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        under = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        CatList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        roombox = new javax.swing.JComboBox<>();
        itemlist = new javax.swing.JComboBox<>();
        ShowAll = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Step 3: Select the components you want to add!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1167, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel2.setText("Suggested Categories:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel3.setText("Following devices are compatible with");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 447, 75));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel4.setText("Select Room Type :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 240, 56));

        roomtype.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        getContentPane().add(roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 210, 70));

        jButton1.setBackground(new java.awt.Color(242, 127, 36));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/iconfinder_hammer_builder_build_labor_4622503.png"))); // NOI18N
        jButton1.setText("Build");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 700, 204, 88));

        under.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        under.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        under.setText("under");
        getContentPane().add(under, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, 75));
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 593, 93, 43));

        CatList.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CatList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatListActionPerformed(evt);
            }
        });
        getContentPane().add(CatList, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 201, 46));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 194, 53));

        roombox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        roombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomboxActionPerformed(evt);
            }
        });
        getContentPane().add(roombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 201, 50));

        itemlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistActionPerformed(evt);
            }
        });
        getContentPane().add(itemlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 547, 213, -1));

        ShowAll.setText("Show All");
        ShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(ShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, 46));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 547, 141, 27));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 83, 53));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel9.setText("Hello");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 100, -1, 60));

        user.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 274, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaya\\Downloads\\frame2.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 640, 270));
        getContentPane().add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 547, 129, 27));

        add.setBackground(new java.awt.Color(242, 127, 36));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/iconfinder_list-add_118777.png"))); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 194, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Compatible products");

        jLabel7.setText("Price:");

        jLabel11.setText("Brand:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 475, 1137, -1));

        jButton2.setBackground(new java.awt.Color(242, 127, 36));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/iconfinder_Arrow_Left_1063872.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, 210, 88));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shayantan_tech/miscemptyroom-ae-004.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -5, 1170, 830));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 280, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(rate);
        String id=user.getText();
        String a=jLabel8.getText();
        dispose();
        new Build(id,a).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CatListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatListActionPerformed
        // TODO add your handling code here:
        itemlist.removeAllItems();
       // System.out.println(ass)
     
       // String assit =(String) jLabel8.getText();
       //under.setText("under");
        jLabel5.setText((String) CatList.getSelectedItem());
        String item=(String) CatList.getSelectedItem();
        System.out.println(item);
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            stat4=con.prepareStatement("select name from product2 where category=? AND "+jLabel8.getText()+"='true'");
   
            //  Select name from product2 where category='Smart TV' AND alexa='true'
            stat4.setString(1,item);
          // stat4.setString(2, assit);
            
            
           // stat4.setString(2, ass);
            rs4=stat4.executeQuery();
            while(rs4.next())
            {
                itemlist.addItem(rs4.getString(1));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
       // itemlist.removeAllItems();
        
        
    }//GEN-LAST:event_CatListActionPerformed

    private void roomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomboxActionPerformed
        // TODO add your handling code here:
       // roomtype.setText((String) roombox.getSelectedItem());
        String r = (String) roombox.getSelectedItem();
        System.out.println(r);
        CatList.removeAllItems();
        itemlist.removeAllItems();
    
        try
        {
//            String r = (String) roombox.getSelectedItem();
//            System.out.println(r);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            stat2 = con.prepareStatement("select distinct category,room from product2 where room=?");
            stat2.setString(1,r);
            //String selectQuery="select cat from category where room='berdroom'";
            rs2=stat2.executeQuery();
            while(rs2.next())
            {
                CatList.addItem(rs2.getString(1));
                //System.out.println("cat");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
    
        
    }//GEN-LAST:event_roomboxActionPerformed

    private void ShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllActionPerformed
        // TODO add your handling code here:
        brand.setText("");
        price.setText("");
        
        CatList.removeAllItems();
        try
        {
//            String r = (String) roombox.getSelectedItem();
//            System.out.println(r);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            stat2 = con.prepareStatement("select distinct category from product2");
            //stat2.setString(1,r);
            //String selectQuery="select cat from category where room='berdroom'";
            rs2=stat2.executeQuery();
            while(rs2.next())
            {
                CatList.addItem(rs2.getString("category"));
                //System.out.println("cat");
            }
            
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
    
    }//GEN-LAST:event_ShowAllActionPerformed

    private void itemlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistActionPerformed
        // TODO add your handling code here:
        //price.setText((String) itemlist.getSelectedItem());
        String r=(String) itemlist.getSelectedItem();
        System.out.println(r);
        try
        {
//            String r = (String) roombox.getSelectedItem();
//            System.out.println(r);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            stat5 = con.prepareStatement("select price,brand from product2 where name=?");
            stat5.setString(1,r);
            //String selectQuery="select cat from category where room='berdroom'";
            rs5=stat5.executeQuery();
            while(rs5.next())
            {
                //System.out.println("test");
                price.setText((String) rs5.getString("price"));
                brand.setText((String) rs5.getString("brand"));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
        
    }//GEN-LAST:event_itemlistActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String pr=(String) itemlist.getSelectedItem();
        try
        {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // String url = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true";
             con = DriverManager.getConnection(url);
             stat6=con.prepareStatement("insert into users(name,prodname,price,brand)values(?,?,?,?)");
             stat6.setString(1,user.getText());
             System.out.println(user.getText());
             stat6.setString(2,pr);
             System.out.println(pr);
             stat6.setString(3,price.getText());
             System.out.println(price.getText());
             stat6.setString(4,brand.getText());
             System.out.println(brand.getText());
             stat6.executeUpdate();
             JOptionPane.showMessageDialog(null,"Success");
            }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // new StartUI(String para1,para2).setVisible(true);
       String name=user.getText();
       dispose();
       new StartUI(name).setVisible(true);
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bedroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bedroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bedroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bedroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bedroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatList;
    private javax.swing.JButton ShowAll;
    private javax.swing.JButton add;
    private javax.swing.JLabel brand;
    private javax.swing.JComboBox<String> itemlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel price;
    private javax.swing.JComboBox<String> roombox;
    private javax.swing.JLabel roomtype;
    private javax.swing.JLabel under;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}