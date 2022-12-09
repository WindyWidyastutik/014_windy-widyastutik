package inforsa;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class awal extends javax.swing.JFrame {
    public awal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pencetuserActionPerformed = new javax.swing.JButton();
        pencetadminActionPerformed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pencetuserActionPerformed.setText("USER");
        getContentPane().add(pencetuserActionPerformed);
        pencetuserActionPerformed.setBounds(250, 180, 75, 23);

        pencetadminActionPerformed.setBackground(new java.awt.Color(242, 242, 242));
        pencetadminActionPerformed.setText("ADMIN");
        getContentPane().add(pencetadminActionPerformed);
        pencetadminActionPerformed.setBounds(70, 180, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/awal.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pencetuserActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dispose();
        cust cust = new cust ();
        cust.setVisible(true);
    }                                          

    private void pencetadminActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dispose();
        // objek
        admin admin = new admin ();
        admin.setVisible(true);
    }                                           

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pencetadminActionPerformed;
    private javax.swing.JButton pencetuserActionPerformed;
    // End of variables declaration//GEN-END:variables
}
