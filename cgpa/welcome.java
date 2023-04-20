package cgpa;
import java.sql.*;
import javax.swing.JOptionPane;

public class welcome extends javax.swing.JFrame 
{
    public welcome() 
    {
        initComponents();
        setSize(700,350);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        branch = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel3.setText("HELLO!!! Let's calculate your CGPA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 102, 365, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Select your Department :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 210, 160, 24);

        branch.setMaximumRowCount(11);
        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Department of BioTechnology", "Department of Chemical Engineering", "Department of Civil Engineering", "Department of Computer Science & Engineering", "Department of Electrical Engineering", "Department of Electonics & Comm. Engineering", "Department of Information Technology", "Department of Mechanical Engineering", "Department of Metallurgy and Materials Engineering" }));
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch);
        branch.setBounds(250, 210, 311, 24);

        jButton1.setFont(new java.awt.Font("AR BONNIE", 0, 24)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 260, 146, 37);

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 0, 36)); // NOI18N
        jLabel5.setText("WELCOME TO THE CGPA CALCULATOR");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(63, 27, 553, 57);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 180, 50, 24);

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });
        getContentPane().add(nameTf);
        nameTf.setBounds(250, 170, 314, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa/pictures/bg1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameTf.getText();
        int index = branch.getSelectedIndex();
        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpa", "root", "ak");
            Statement stmt = conn.createStatement();
            String qry = "insert into cursub values (\"" + name + "\"," + index + ",0.0);";
            stmt.executeUpdate(qry);
            stmt.close();
            conn.close();
            cgcalc a = new cgcalc();
            a.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTf;
    // End of variables declaration//GEN-END:variables
}
