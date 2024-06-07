/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BEKUIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class KelolaBarang extends javax.swing.JFrame {

    /**
     * Creates new form KelolaBarang2
     */
    public KelolaBarang() {
        initComponents();
        etIdBarang.setVisible(false);
        table();
    }
    
        void hapusForm(){
        etNamaBarang.setText("");
        etHargaBarang.setText("");
        etIdBarang.setText("");
        etKategoriBarang.setText("");
        }
        
        void refresh(){
            try{
            String refresh = "SELECT*FROM barang WHERE nama_barang='" +etNamaBarang.getText()+ "'";
            Connection con1 = (Connection) Koneksi.getConnection();
            PreparedStatement pst2 = con1.prepareStatement(refresh);
            pst2.execute();
            tCari.setText("");
            table();
            hapusForm();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());                
            }
        }
        
    void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_barang");
        tbl.addColumn("nama_barang");
        tbl.addColumn("harga_barang");
        tbl.addColumn("kategori_barang");
        
        
        
        try {
            String sql = "SELECT * FROM barang WHERE nama_barang like '%" + tCari.getText() + "%'";
            String sql2 = "SELECT * FROM barang WHERE harga_barang like '%" + tCari.getText() + "%'";
            String sql3 = "SELECT * FROM barang WHERE kategori_barang like '%" + tCari.getText() + "%'";            
            
            if(!sql.isEmpty()){    
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    tableTampil.setModel(tbl);
                }
            }
            if(!sql2.isEmpty()){
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql2);
            
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    tableTampil.setModel(tbl);
                }
            }
            if(!sql3.isEmpty()){
                Connection con = (Connection) Koneksi.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql3);
            
                while(rs.next()){
                    tbl.addRow(new Object[]{
                        rs.getInt("id_barang"),
                        rs.getString("nama_barang"),
                        rs.getDouble("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    tableTampil.setModel(tbl);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada" + e.getMessage());
        }
        
    }        
    
        public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id_barang");
        tbl.addColumn("nama_barang");
        tbl.addColumn("harga_barang");
        tbl.addColumn("kategori_barang");        
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getInt("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getInt("harga_barang"),
                    rs.getString("kategori_barang")
                });
                tableTampil.setModel(tbl);
            }
//            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
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
        etIdBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etNamaBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etKategoriBarang = new javax.swing.JTextField();
        etHargaBarang = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTampil = new javax.swing.JTable();
        BackToMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MENGELOLA DATA BARANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Harga Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Kategori Barang");

        btnSimpan.setBackground(new java.awt.Color(25, 55, 109));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTampil.setBackground(new java.awt.Color(25, 55, 109));
        btnTampil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTampil.setForeground(new java.awt.Color(255, 255, 255));
        btnTampil.setText("TAMPIL");
        btnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTampilMouseClicked(evt);
            }
        });
        btnTampil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                btnTampilComponentMoved(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(25, 55, 109));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(25, 55, 109));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCariMouseClicked(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(25, 167, 206));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tableTampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga Barang", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTampilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTampil);

        BackToMenu.setBackground(new java.awt.Color(224, 52, 68));
        BackToMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackToMenu.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenu.setText("BACK");
        BackToMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMenuMouseClicked(evt);
            }
        });
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(etIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etHargaBarang)
                                    .addComponent(etKategoriBarang)
                                    .addComponent(etNamaBarang)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tCari)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimpan)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnTampil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackToMenu))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnTampil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            int n = JOptionPane.showConfirmDialog(  
                      null,
                      "Apakah data sudah benar?" ,
                      "",
                      JOptionPane.YES_OPTION,
                      JOptionPane.CLOSED_OPTION);

            if(n == JOptionPane.YES_OPTION)
            {
                String sql = "INSERT INTO barang (nama_barang,harga_barang,kategori_barang) VALUES('"+etNamaBarang.getText() +"','" +etHargaBarang.getText() + "','" +etKategoriBarang.getText() +"')";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
                refresh();
            }            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTampilMouseClicked
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btnTampilMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
            int n = JOptionPane.showConfirmDialog(  
                      null,
                      "Yakin ingin mengubah data barang?" ,
                      "",
                      JOptionPane.YES_OPTION,
                      JOptionPane.CLOSED_OPTION);

            if(n == JOptionPane.YES_OPTION)
            {
                String sql = ("UPDATE barang SET nama_barang='"+etNamaBarang.getText()+"', harga_barang='"+etHargaBarang.getText()+"', kategori_barang='"+etKategoriBarang.getText()+"'  WHERE id_barang='"+etIdBarang.getText()+"' ");
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                refresh();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
            }            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah" + e.getMessage());
        }

    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        try {
            int n = JOptionPane.showConfirmDialog(  
                      null,
                      "Yakin ingin menghapus data barang?" ,
                      "",
                      JOptionPane.YES_OPTION,
                      JOptionPane.CLOSED_OPTION);

            if(n == JOptionPane.YES_OPTION)
            {
                String sql = "DELETE FROM barang WHERE nama_barang='"+etNamaBarang.getText()+"' ";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                refresh();
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
            }            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus" + e.getMessage());
        }

    }//GEN-LAST:event_btnHapusMouseClicked

    private void tCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:

        cari();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void tableTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTampilMouseClicked
        int baris = tableTampil.rowAtPoint(evt.getPoint());
        String ib = tableTampil.getValueAt(baris, 0).toString();
        etIdBarang.setText(ib);
        String nb = tableTampil.getValueAt(baris, 1).toString();
        etNamaBarang.setText(nb);
        String hb = tableTampil.getValueAt(baris, 2).toString();
        etHargaBarang.setText(hb);
        String kb = tableTampil.getValueAt(baris, 3).toString();
        etKategoriBarang.setText(kb);
    }//GEN-LAST:event_tableTampilMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void BackToMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToMenuMouseClicked
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToMenuMouseClicked

    private void btnTampilComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnTampilComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTampilComponentMoved

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
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampil;
    private javax.swing.JTextField etHargaBarang;
    private javax.swing.JTextField etIdBarang;
    private javax.swing.JTextField etKategoriBarang;
    private javax.swing.JTextField etNamaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tableTampil;
    // End of variables declaration//GEN-END:variables
}
