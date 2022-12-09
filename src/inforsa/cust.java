package inforsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cust extends javax.swing.JFrame {


    private Connection con;
    private Statement stat;
    private ResultSet res;
    public cust() {
        initComponents();
        konek();
        tabel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lihat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabel_lihat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_lihat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 200, 570, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CUST.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 580, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void konek(){
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/inforsa", "root", "");
    stat=con.createStatement();
    } catch(ClassNotFoundException | SQLException e){
                System.out.println("Error loading driver : "+e.getMessage());
}   
}
private void tabel(){
    DefaultTableModel tb= new DefaultTableModel();
    tb.addColumn("nim");
    tb.addColumn("nama");
    tb.addColumn("departemen");
    tb.addColumn("divisi");
    
    tabel_lihat.setModel(tb);
    try{
    res=stat.executeQuery("SELECT * FROM `inforsa`");

    while (res.next())
    {
    tb.addRow(new Object[]{
    res.getString("nim"),
    res.getString("nama"),
    res.getString("departemen"),
    res.getString("divisi"),
    });
    }
    
    }catch (Exception e){
    }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_lihat;
    // End of variables declaration//GEN-END:variables
}
