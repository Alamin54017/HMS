
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer-pc
 */
public class uprec extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement st=null;
    ResultSet rs=null;

    /**
     * Creates new form addvoter
     */
    public uprec() {
        initComponents();
        ID.setText(manrecep.k);
        ch();
    }
    public void ch(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hms","root","");
            String sql="SELECT * FROM recinfo WHERE userid='"+ID.getText()+"'";
            st=conn.prepareStatement(sql);
            rs=st.executeQuery();
            if(rs.next()){
                Name.setText(rs.getString("name"));
                FNAME.setText(rs.getString("f_name"));
                MNAME.setText(rs.getString("m_name"));
                phone.setText(rs.getString("phone"));
                GENDER.setSelectedItem(rs.getString("gender"));
                ADDRESS.setText(rs.getString("pr_address"));
                PADDRESS.setText(rs.getString("pe_address"));
                
            sql="SELECT * FROM reclogin WHERE userid='"+ID.getText()+"'";
            st=conn.prepareStatement(sql);
            rs=st.executeQuery();
                rs.next();
                PASSWORD.setText(rs.getString("pass"));
            }
            else{
                JOptionPane.showMessageDialog(null, "ID not Found");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        FNAME = new javax.swing.JTextField();
        MNAME = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        PADDRESS = new javax.swing.JTextField();
        GENDER = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 557));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Edit Receptionist Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Receptionist ID:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Father's Name:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mother's Name:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Present Address:-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Permanent Address:-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 206, 30));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 206, 30));
        jPanel1.add(FNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 206, 30));
        jPanel1.add(MNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 206, 30));
        jPanel1.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 237, 66));
        jPanel1.add(PADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 237, 64));

        GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_tick_box_26px.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 460, -1, 46));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_26px.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 460, -1, 46));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Password:-");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 85, -1));
        jPanel1.add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 206, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Phone:-");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 206, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer-pc\\Pictures\\hms\\Annotation 2020-03-28 011256.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 940, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        manrecep a=new manrecep();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hms","root", "");

            String sql = "UPDATE recinfo SET userid='"+ID.getText()+"',name='"+Name.getText()+"',f_name='"+FNAME.getText()+"',m_name='"+MNAME.getText()+"',phone='"+phone.getText()+"',gender='"+GENDER.getSelectedItem().toString()+"',pr_address='"+ADDRESS.getText()+"',pe_address='"+PADDRESS.getText()+"' WHERE userid='"+ID.getText()+"'";
            Statement stt = conn.createStatement();
            stt.executeUpdate(sql);
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hms","root", "");
            sql = "UPDATE reclogin SET userid='"+ID.getText()+"',pass='"+PASSWORD.getText()+"' WHERE userid='"+ID.getText()+"'";
            stt = conn.createStatement();
            stt.executeUpdate(sql);
            conn.close();
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dashboard d=new dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(addrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addrec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JTextField FNAME;
    private javax.swing.JComboBox<String> GENDER;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MNAME;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PADDRESS;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
