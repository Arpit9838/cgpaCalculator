package cgpa;
import java.sql.*;
import javax.swing.JOptionPane;
public class cgcalc extends javax.swing.JFrame {
String na=new String();
    public cgcalc() 
    {
        initComponents();
        setSize(700,600);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wllbl = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s1g = new javax.swing.JTextField();
        s2g = new javax.swing.JTextField();
        s4g = new javax.swing.JTextField();
        s3g = new javax.swing.JTextField();
        l3g = new javax.swing.JTextField();
        l2g = new javax.swing.JTextField();
        s5g = new javax.swing.JTextField();
        l1g = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                act(evt);
            }
        });
        getContentPane().setLayout(null);

        wllbl.setFont(new java.awt.Font("Segoe UI Semilight", 1, 30)); // NOI18N
        wllbl.setText("Enter your Expected Grade Points");
        getContentPane().add(wllbl);
        wllbl.setBounds(140, 80, 480, 40);

        s2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s2.setText("Subject 2");
        getContentPane().add(s2);
        s2.setBounds(230, 220, 240, 25);

        s1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s1.setText("Subject 1");
        getContentPane().add(s1);
        s1.setBounds(230, 190, 240, 25);

        s4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s4.setText("Subject 4");
        getContentPane().add(s4);
        s4.setBounds(230, 280, 240, 25);

        s3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s3.setText("Subject 3");
        getContentPane().add(s3);
        s3.setBounds(230, 250, 240, 25);

        l3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l3.setText("Lab 3");
        getContentPane().add(l3);
        l3.setBounds(230, 400, 240, 25);

        l2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l2.setText("Lab 2");
        getContentPane().add(l2);
        l2.setBounds(230, 370, 240, 25);

        l1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        l1.setText("Lab 1");
        getContentPane().add(l1);
        l1.setBounds(230, 340, 240, 25);

        s5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        s5.setText("Subject 5");
        getContentPane().add(s5);
        s5.setBounds(230, 310, 240, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 160, 80, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Expected Grade Point ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 160, 210, 22);

        s1g.setBackground(new java.awt.Color(51, 51, 51));
        s1g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s1g.setForeground(new java.awt.Color(255, 255, 153));
        s1g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1gActionPerformed(evt);
            }
        });
        getContentPane().add(s1g);
        s1g.setBounds(500, 190, 100, 25);

        s2g.setBackground(new java.awt.Color(51, 51, 51));
        s2g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s2g.setForeground(new java.awt.Color(255, 255, 153));
        s2g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2gActionPerformed(evt);
            }
        });
        getContentPane().add(s2g);
        s2g.setBounds(500, 220, 100, 25);

        s4g.setBackground(new java.awt.Color(51, 51, 51));
        s4g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s4g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(s4g);
        s4g.setBounds(500, 280, 100, 25);

        s3g.setBackground(new java.awt.Color(51, 51, 51));
        s3g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s3g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(s3g);
        s3g.setBounds(500, 250, 100, 25);

        l3g.setBackground(new java.awt.Color(51, 51, 51));
        l3g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l3g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(l3g);
        l3g.setBounds(500, 400, 100, 25);

        l2g.setBackground(new java.awt.Color(51, 51, 51));
        l2g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l2g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(l2g);
        l2g.setBounds(500, 370, 100, 25);

        s5g.setBackground(new java.awt.Color(51, 51, 51));
        s5g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s5g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(s5g);
        s5g.setBounds(500, 310, 100, 25);

        l1g.setBackground(new java.awt.Color(51, 51, 51));
        l1g.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l1g.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(l1g);
        l1g.setBounds(500, 340, 100, 25);

        submit.setFont(new java.awt.Font("AR BONNIE", 0, 24)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(520, 450, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa/pictures/bg1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1gActionPerformed

    private void s2gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2gActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        double ans = ((Double.parseDouble(s1g.getText()) * 4) + (Double.parseDouble(s2g.getText()) * 3) + (Double.parseDouble(s3g.getText()) * 3) + (Double.parseDouble(s4g.getText()) * 3) + (Double.parseDouble(s5g.getText()) * 3) + (Double.parseDouble(l1g.getText()) * 2) + (Double.parseDouble(l2g.getText()) * 2) + (Double.parseDouble(l3g.getText()) * 2)) / 22;
        try {
            Class.forName("java.sql.DriverManager");
            Connection conn1= DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpa", "root", "1234");
            Statement stmt1 = conn1.createStatement();
            String qry = "Update cursub SET cg=" + ans + " where name=\"" + na + "\";";
            stmt1.executeUpdate(qry);
            stmt1.close();
            conn1.close();
            finalcg a = new finalcg();
            a.setVisible(true);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
         try {
            Class.forName("java.sql.DriverManager");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgpa", "root", "1234");
            Statement stmt2 = conn2.createStatement();
            String qry = "Select * from cursub;";
            ResultSet rs = stmt2.executeQuery(qry);
            String epwd = new String();
            int dept = 0;
            rs.last();
            epwd = rs.getString("name");
            dept = rs.getInt("subInd");
            rs.close();
            stmt2.close();
            Statement st = conn2.createStatement();
            String Dep = new String();
            switch (dept) 
            {
                case 1:
                    Dep = "BT";
                    break;
                case 2:
                    Dep = "Chem";
                    break;
                case 3:
                    Dep = "Civil";
                    break;
                case 4:
                    Dep = "Cse";
                    break;
                case 5:
                    Dep = "Ele";
                    break;
                case 6:
                    Dep = "Ece";
                    break;
                case 7:
                    Dep = "IT";
                    break;
                case 8:
                    Dep = "Mech";
                    break;
                case 9:
                    Dep = "Meta";
                    break;
                default:
                    break;
            }
            String qr = "Select * from subject where Dept=\"" + Dep + "\";";
            ResultSet ak = st.executeQuery(qr);
            ak.first();
            s1.setText(ak.getString("Sub1"));
            s2.setText(ak.getString("Sub2"));
            s3.setText(ak.getString("Sub3"));
            s4.setText(ak.getString("Sub4"));
            s5.setText(ak.getString("Sub5"));
            l1.setText(ak.getString("Lab1"));
            l2.setText(ak.getString("Lab2"));
            l3.setText(ak.getString("Lab3"));
            wllbl.setText("Welcome " + epwd + "!! Enter your Expected Grade Points");
            na = epwd;
            ak.close();
            st.close();
            conn2.close();

        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void act(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_act
               // TODO add your handling code here:
    }//GEN-LAST:event_act

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
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cgcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cgcalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField l1g;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField l2g;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField l3g;
    private javax.swing.JLabel s1;
    private javax.swing.JTextField s1g;
    private javax.swing.JLabel s2;
    private javax.swing.JTextField s2g;
    private javax.swing.JLabel s3;
    private javax.swing.JTextField s3g;
    private javax.swing.JLabel s4;
    private javax.swing.JTextField s4g;
    private javax.swing.JLabel s5;
    private javax.swing.JTextField s5g;
    private javax.swing.JButton submit;
    private javax.swing.JLabel wllbl;
    // End of variables declaration//GEN-END:variables
}
