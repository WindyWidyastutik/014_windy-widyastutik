package inforsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {

    private Connection con;
    private Statement stat;
    private ResultSet res;
    public admin() {
        initComponents();
        konek();
    }
private void konek(){
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/inforsa", "root", "");
    stat=con.createStatement();
    } catch(ClassNotFoundException | SQLException e){
                System.out.println("Login gagal : "+e.getMessage());
}   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGIN = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LOGIN.setText("LOGIN");
        getContentPane().add(LOGIN);
        LOGIN.setBounds(160, 230, 100, 50);

        username.setCaretColor(new java.awt.Color(102, 102, 102));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(160, 120, 190, 30);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(160, 170, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGIN.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
                                  
         try {
            res=stat.executeQuery("SELECT * FROM admin WHERE username='"+username.getText()+"' AND password='"+pw.getText()+"'");
            
            if(res.next()){
                if(username.getText().equals(res.getString("username")) && pw.getText().equals(res.getString("password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    CRUD CRUD = new CRUD();
                    CRUD.setVisible(true);
                    dispose();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         
    }//GEN-LAST:event_usernameActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed

    }//GEN-LAST:event_pwActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
