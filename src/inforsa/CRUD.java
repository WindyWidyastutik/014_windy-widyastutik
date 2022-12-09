package inforsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUD extends javax.swing.JFrame {

    Connection con = null;
    final String dburl = "jdbc:mysql://localhost:3306/inforsa";
    final String username = "root";
    final String password = "";
    DefaultTableModel model;
    private Statement stat;
    private ResultSet res;
    
    public CRUD() {
        initComponents();
         String[] inforsa = {"nim","nama","departemen","divisi"};
        model = new DefaultTableModel (inforsa, 0);
        tabel_lihat.setModel (model);
        lihat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nim = new javax.swing.JTextField();
        departemen = new javax.swing.JTextField();
        divisi = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        pencettambah = new javax.swing.JButton();
        pencetupdate = new javax.swing.JButton();
        pencethapus = new javax.swing.JButton();
        pencetreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lihat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pencetbalik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        getContentPane().add(nim);
        nim.setBounds(220, 130, 179, 20);

        departemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departemenActionPerformed(evt);
            }
        });
        getContentPane().add(departemen);
        departemen.setBounds(220, 230, 179, 22);

        divisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiActionPerformed(evt);
            }
        });
        getContentPane().add(divisi);
        divisi.setBounds(220, 280, 179, 20);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(220, 180, 179, 20);

        pencettambah.setBackground(new java.awt.Color(51, 102, 255));
        pencettambah.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        pencettambah.setForeground(new java.awt.Color(255, 255, 255));
        pencettambah.setText("TAMBAH");
        pencettambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencettambahActionPerformed(evt);
            }
        });
        getContentPane().add(pencettambah);
        pencettambah.setBounds(540, 120, 70, 30);

        pencetupdate.setBackground(new java.awt.Color(51, 102, 255));
        pencetupdate.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        pencetupdate.setForeground(new java.awt.Color(255, 255, 255));
        pencetupdate.setText("UPDATE");
        pencetupdate.setMaximumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setMinimumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setPreferredSize(new java.awt.Dimension(81, 28));
        pencetupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetupdateActionPerformed(evt);
            }
        });
        getContentPane().add(pencetupdate);
        pencetupdate.setBounds(540, 170, 70, 30);

        pencethapus.setBackground(new java.awt.Color(51, 102, 255));
        pencethapus.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        pencethapus.setForeground(new java.awt.Color(255, 255, 255));
        pencethapus.setText("HAPUS");
        pencethapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencethapusActionPerformed(evt);
            }
        });
        getContentPane().add(pencethapus);
        pencethapus.setBounds(540, 220, 72, 30);

        pencetreset.setBackground(new java.awt.Color(51, 102, 255));
        pencetreset.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        pencetreset.setForeground(new java.awt.Color(255, 255, 255));
        pencetreset.setText("RESET");
        pencetreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetresetActionPerformed(evt);
            }
        });
        getContentPane().add(pencetreset);
        pencetreset.setBounds(540, 270, 70, 30);

        tabel_lihat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "Jadwal", "Durasi", "Usia", "Kapasitas", "Harga"
            }
        ));
        tabel_lihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_lihatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_lihat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 700, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/crud.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 700, 430);

        pencetbalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetbalikActionPerformed(evt);
            }
        });
        getContentPane().add(pencetbalik);
        pencetbalik.setBounds(440, 360, 72, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void divisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisiActionPerformed

    }//GEN-LAST:event_divisiActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed

    }//GEN-LAST:event_namaActionPerformed

    private void pencettambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencettambahActionPerformed
        tambah();
    }//GEN-LAST:event_pencettambahActionPerformed

    private void pencetupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetupdateActionPerformed
        update();
    }//GEN-LAST:event_pencetupdateActionPerformed

    private void pencethapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencethapusActionPerformed
        hapus();
    }//GEN-LAST:event_pencethapusActionPerformed

    private void pencetresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetresetActionPerformed
        nim.setText("");
        nama.setText("");
        departemen.setText("");
        divisi.setText("");
    }//GEN-LAST:event_pencetresetActionPerformed

    private void tabel_lihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_lihatMouseClicked
        int i = tabel_lihat.getSelectedRow();
        if (i >-1){
            nim.setText(model.getValueAt(i, 0).toString());
            nama.setText(model.getValueAt(i, 1).toString());
            departemen.setText(model.getValueAt(i, 2).toString());
            divisi.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tabel_lihatMouseClicked
    }
    private void departemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departemenActionPerformed

    }//GEN-LAST:event_departemenActionPerformed

    private void pencetbalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetbalikActionPerformed
        dispose();
        admin admin = new admin();
        admin.setVisible(true);
    }//GEN-LAST:event_pencetbalikActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }
    public void tambah() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (nim.getText().equals("")||
                        nama.getText().equals("")||
                        departemen.getText().equals("")||
                        divisi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "DATA TIDAK KOSONG!");     
                return;
                }  
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `inforsa` WHERE nim = '" + nim.getText() + "'");
                if (rs.next()){
                JOptionPane.showMessageDialog(null, "sudah tersedia!");  
                } else {
                con.createStatement().executeUpdate("INSERT INTO `inforsa` VALUES"+"('"+nim.getText()+"','"+nama.getText()+"','"+departemen.getText()+"','"+divisi.getText()+"')"); 
                JOptionPane.showMessageDialog(null, "Data berhasil di-tambahkan!");
                lihat();} 
                     {
        }
                }catch (SQLException se) {
            System.out.println(se);
            } 
    }
   
    public void hapus() {
         try {
             con = DriverManager.getConnection(dburl, username, password);
                if (nim.getText().equals("")||
                        nama.getText().equals("")||
                        departemen.getText().equals("")||
                        divisi.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "Tidak Ada Data Yang dihapus!");  
                }
             
             
             else {
            con.createStatement().executeUpdate("DELETE FROM `inforsa` WHERE nim = '"+nim.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data berhasil di-hapus!");
            lihat();}
        }       catch(SQLException se){
                System.out.println(se);
        }
    }
    
    public void update() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (nim.getText().equals("")||
                        nama.getText().equals("")||
                        departemen.getText().equals("")||
                        divisi.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "tidak ada data yang dihapus!");  
                return;
                }

            
                else{
            con.createStatement().executeUpdate("UPDATE `inforsa` SET `nim`='"+nim.getText()+"',`nama`='"+nama.getText()+"',`departemen`='"+departemen.getText()+"',`divisi`='"+divisi.getText()+"' WHERE nim = '" + nim.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data berhasil di-update!");
            lihat();}
        }       catch(SQLException se){           
                System.out.println(se);
        }
    }
    
     private void lihat() {
       int row = tabel_lihat.getRowCount();
       for (int i = 0;i<row;i++){
           model.removeRow(0);
       }   
      try {
         con = DriverManager.getConnection(dburl, username, password);
         ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `inforsa`");
         while(rs.next()){
             String[] data = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
             model.addRow(data);
         }
         if (con != null) {
//         JOptionPane.showMessageDialog(null, "Menunggu terhubung dengan database");
         }
      } catch (SQLException se) {
          System.out.println(se);
      }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField departemen;
    private javax.swing.JTextField divisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JButton pencetbalik;
    private javax.swing.JButton pencethapus;
    private javax.swing.JButton pencetreset;
    private javax.swing.JButton pencettambah;
    private javax.swing.JButton pencetupdate;
    private javax.swing.JTable tabel_lihat;
    // End of variables declaration//GEN-END:variables
}
