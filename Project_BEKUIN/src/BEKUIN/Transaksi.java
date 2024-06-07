/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BEKUIN;

import BEKUIN.Koneksi;
import BEKUIN.session;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 *
 * @author asus
 */
public class Transaksi extends javax.swing.JFrame {


    public static ArrayList<cBarang> barang;
    public static Object[] kolom;
    DefaultTableModel cart;
    
    public Transaksi() {
        initComponents();
        IDBarang.setVisible(false); 
        etKasir.setVisible(false);
        KodeTransaksi.setVisible(false);
        table();
        
        
        JumlahBarangTransaksi.setText(String.valueOf(0));        
        JenisPembeli.setText("Pembeli");
    
        barang = new ArrayList<>();
        kolom = new Object[4];
        cart = new DefaultTableModel();
        
        cart.addColumn("Barang");
        cart.addColumn("Harga");
        cart.addColumn("Jumlah");      
        cart.addColumn("Total");         
  

        etKasir.setText(session.get_nama_user());        

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
                TableMenuBarang.setModel(tbl);
               
            }


        } catch (Exception e){
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
                        rs.getInt("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
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
                        rs.getInt("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
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
                        rs.getInt("harga_barang"),
                        rs.getString("kategori_barang")
                    });
                    TableMenuBarang.setModel(tbl);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada" + e.getMessage());
        }
        
    }
    
        void refresh(){
            try{
            String refresh = "SELECT*FROM barang WHERE nama_barang='" +BarangTransaksi.getText()+ "'";
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
        
        void hapusForm(){
        BarangTransaksi.setText("");
        HargaTransaksi.setText("");
        IDBarang.setText("");
        //JumlahBarangTransaksi.setText(String.valueOf(0));
        //PembeliTransaksi.setText("");
        TotalHargaBarangTransaksi.setText("");
        if(KodePelanggan.getText().isEmpty()){
            JenisPembeli.setText("Pembeli");            
        }
        //JenisPembeli.setText("Pembeli");
        //KodePelanggan.setText("-");
        JumlahBarangTransaksi.setText(String.valueOf(jumlah = 0));
        }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PembeliTransaksi = new javax.swing.JTextField();
        BarangTransaksi = new javax.swing.JTextField();
        HargaTransaksi = new javax.swing.JTextField();
        TotalHargaBarangTransaksi = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableMenuBarang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        KeranjangBelanja = new javax.swing.JTable();
        TambahJumlahBarang = new javax.swing.JButton();
        KurangiJumlahBarang = new javax.swing.JButton();
        JumlahBarangTransaksi = new javax.swing.JTextField();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        MasukkanKeranjangTransaksi = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        IDBarang = new javax.swing.JTextField();
        HapusBarangKeranjang = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        KodePelanggan = new javax.swing.JTextField();
        cekKodePelanggan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalTagihanPembeli = new javax.swing.JTextField();
        SELESAI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BackToMenu1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        JenisPembeli = new javax.swing.JTextField();
        etKasir = new javax.swing.JTextField();
        KodeTransaksi = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Pembeli");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Jumlah");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Harga");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total");

        HargaTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTransaksiActionPerformed(evt);
            }
        });

        TotalHargaBarangTransaksi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TotalHargaBarangTransaksiMouseMoved(evt);
            }
        });
        TotalHargaBarangTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaBarangTransaksiActionPerformed(evt);
            }
        });

        TableMenuBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga", "Kategori"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableMenuBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMenuBarangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableMenuBarang);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("KERANJANG");

        KeranjangBelanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Barang", "Harga", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(KeranjangBelanja);

        TambahJumlahBarang.setBackground(new java.awt.Color(0, 153, 51));
        TambahJumlahBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TambahJumlahBarang.setForeground(new java.awt.Color(255, 255, 255));
        TambahJumlahBarang.setText("+");
        TambahJumlahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahJumlahBarangMouseClicked(evt);
            }
        });
        TambahJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahJumlahBarangActionPerformed(evt);
            }
        });

        KurangiJumlahBarang.setBackground(new java.awt.Color(224, 52, 68));
        KurangiJumlahBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KurangiJumlahBarang.setForeground(new java.awt.Color(255, 255, 255));
        KurangiJumlahBarang.setText("-");
        KurangiJumlahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KurangiJumlahBarangMouseClicked(evt);
            }
        });
        KurangiJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangiJumlahBarangActionPerformed(evt);
            }
        });

        JumlahBarangTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBarangTransaksiActionPerformed(evt);
            }
        });

        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCariMouseClicked(evt);
            }
        });
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(201, 238, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(51, 51, 51));
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

        MasukkanKeranjangTransaksi.setBackground(new java.awt.Color(61, 90, 128));
        MasukkanKeranjangTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MasukkanKeranjangTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        MasukkanKeranjangTransaksi.setText("MASUKKAN KERANJANG");
        MasukkanKeranjangTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasukkanKeranjangTransaksiMouseClicked(evt);
            }
        });
        MasukkanKeranjangTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukkanKeranjangTransaksiActionPerformed(evt);
            }
        });

        btnTampil.setBackground(new java.awt.Color(102, 102, 102));
        btnTampil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTampil.setForeground(new java.awt.Color(255, 255, 255));
        btnTampil.setText("REFRESH");
        btnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTampilMouseClicked(evt);
            }
        });

        IDBarang.setText("ID");

        HapusBarangKeranjang.setBackground(new java.awt.Color(224, 52, 68));
        HapusBarangKeranjang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HapusBarangKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        HapusBarangKeranjang.setText("HAPUS BARANG");
        HapusBarangKeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HapusBarangKeranjangMouseClicked(evt);
            }
        });
        HapusBarangKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBarangKeranjangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Kode");

        cekKodePelanggan.setBackground(new java.awt.Color(201, 238, 255));
        cekKodePelanggan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cekKodePelanggan.setForeground(new java.awt.Color(51, 51, 51));
        cekKodePelanggan.setText("CEK");
        cekKodePelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cekKodePelangganMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 50, 105));
        jLabel9.setText("PEMBAYARAN");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Total Tagihan");

        SELESAI.setBackground(new java.awt.Color(43, 52, 103));
        SELESAI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SELESAI.setForeground(new java.awt.Color(255, 255, 255));
        SELESAI.setText("SELESAI");
        SELESAI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SELESAIMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(25, 50, 105));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KASIR BEKU-IN");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jl. Rungkut Menanggal Harapan No.A-14, Rungkut Menanggal, Kec. Gn. Anyar, Kota SBY, Jawa Timur ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(129, 129, 129))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(23, 23, 23))
        );

        BackToMenu1.setBackground(new java.awt.Color(102, 102, 102));
        BackToMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackToMenu1.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenu1.setText("KEMBALI KE MENU");
        BackToMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMenu1MouseClicked(evt);
            }
        });
        BackToMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenu1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Jenis");

        etKasir.setText("Kasir");

        KodeTransaksi.setText("Kode Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnTampil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MasukkanKeranjangTransaksi))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCari)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(TotalTagihanPembeli)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(HapusBarangKeranjang)
                                .addComponent(SELESAI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BackToMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(IDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(KodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(TotalHargaBarangTransaksi)
                                .addGap(395, 395, 395))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(KodePelanggan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cekKodePelanggan))
                                    .addComponent(PembeliTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(HargaTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(TambahJumlahBarang)
                                        .addGap(18, 18, 18)
                                        .addComponent(JumlahBarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(KurangiJumlahBarang))
                                    .addComponent(BarangTransaksi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(JenisPembeli, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(396, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cekKodePelanggan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(JenisPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PembeliTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HargaTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TambahJumlahBarang)
                                .addComponent(JumlahBarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KurangiJumlahBarang)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TotalHargaBarangTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampil)
                    .addComponent(MasukkanKeranjangTransaksi)
                    .addComponent(HapusBarangKeranjang))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalTagihanPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SELESAI)
                        .addGap(18, 18, 18)
                        .addComponent(BackToMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HargaTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTransaksiActionPerformed

    }//GEN-LAST:event_HargaTransaksiActionPerformed

    private void TotalHargaBarangTransaksiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalHargaBarangTransaksiMouseMoved

    }//GEN-LAST:event_TotalHargaBarangTransaksiMouseMoved

    private void TotalHargaBarangTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaBarangTransaksiActionPerformed

    }//GEN-LAST:event_TotalHargaBarangTransaksiActionPerformed

    private void TableMenuBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMenuBarangMouseClicked
        int baris = TableMenuBarang.rowAtPoint(evt.getPoint());
        String ib = TableMenuBarang.getValueAt(baris, 0).toString();
        IDBarang.setText(ib);
        String nb = TableMenuBarang.getValueAt(baris, 1).toString();
        BarangTransaksi.setText(nb);
        String hb = TableMenuBarang.getValueAt(baris, 2).toString();
        HargaTransaksi.setText(hb);
        
        
    }//GEN-LAST:event_TableMenuBarangMouseClicked

    private void TambahJumlahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahJumlahBarangMouseClicked
        jumlah++;
        JumlahBarangTransaksi.setText(Integer.toString(jumlah));

        TotalHargaBarangTransaksi.setText(String.valueOf(Integer.parseInt(JumlahBarangTransaksi.getText()) * Integer.parseInt(HargaTransaksi.getText())));
    }//GEN-LAST:event_TambahJumlahBarangMouseClicked

    private void TambahJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahJumlahBarangActionPerformed
//        jumlah++;
//        JumlahBarangTransaksi.setText(Integer.toString(jumlah));
//
//        TotalHargaBarangTransaksi.setText(String.valueOf(Integer.parseInt(JumlahBarangTransaksi.getText()) * Integer.parseInt(HargaTransaksi.getText())));
    }//GEN-LAST:event_TambahJumlahBarangActionPerformed

    private void KurangiJumlahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KurangiJumlahBarangMouseClicked
        JumlahBarangTransaksi.setText(String.valueOf(jumlah--));

        TotalHargaBarangTransaksi.setText(String.valueOf(Integer.parseInt(JumlahBarangTransaksi.getText()) * Integer.parseInt(HargaTransaksi.getText())));
    }//GEN-LAST:event_KurangiJumlahBarangMouseClicked

    private void tCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariMouseClicked

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void MasukkanKeranjangTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasukkanKeranjangTransaksiMouseClicked

        
        try{
            cBarang pesanan = new cBarang();
            pesanan.setNama_Barang(BarangTransaksi.getText());
            pesanan.setHarga_Barang(Integer.parseInt(HargaTransaksi.getText()));
            pesanan.setJumlah_Barang(Integer.parseInt(JumlahBarangTransaksi.getText()));
            pesanan.setTotal_Harga(Integer.parseInt(TotalHargaBarangTransaksi.getText()));          
            
            kolom[0] = BarangTransaksi.getText();
            kolom[1] = Integer.parseInt(HargaTransaksi.getText());
            kolom[2] = Integer.parseInt(JumlahBarangTransaksi.getText());
            kolom[3] = Integer.parseInt(TotalHargaBarangTransaksi.getText());

            barang.add(pesanan);
            cart.addRow(kolom);
            KeranjangBelanja.setModel(cart);
            
            int hargatotal = 0;
            for(int o=0; o<barang.size(); o++){
                hargatotal += barang.get(o).getTotal_Harga();                
            }

            int hargaTotalFinal = hargatotal - (hargatotal*10) / 100; 
            
            if(JenisPembeli.getText().toString().equals("Pelanggan")){
                TotalTagihanPembeli.setText(String.valueOf(hargaTotalFinal));   
            }else if(JenisPembeli.getText().toString().equals("Pembeli")){
                TotalTagihanPembeli.setText(String.valueOf(hargatotal));                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Barang gagal masuk ke keranjang " + e.getMessage());
        }
    }//GEN-LAST:event_MasukkanKeranjangTransaksiMouseClicked

    private void MasukkanKeranjangTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukkanKeranjangTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasukkanKeranjangTransaksiActionPerformed

    private void btnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTampilMouseClicked
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btnTampilMouseClicked

    private void HapusBarangKeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusBarangKeranjangMouseClicked
        int rowIndex = KeranjangBelanja.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) KeranjangBelanja.getModel();
        model.removeRow(rowIndex);
        KeranjangBelanja.revalidate();
        KeranjangBelanja.repaint();
        
            int hargatotal = 0;
            for(int o=0; o<barang.size(); o++){
                hargatotal += barang.get(o).getTotal_Harga();                
            }

            int hargaTotalFinal = hargatotal - (hargatotal*10) / 100; 
            
            if(JenisPembeli.getText().toString().equals("Pelanggan")){
                TotalTagihanPembeli.setText(String.valueOf(hargaTotalFinal));   
            }else if(JenisPembeli.getText().toString().equals("Pembeli")){
                TotalTagihanPembeli.setText(String.valueOf(hargatotal));                
            }        

        int kolomBarang = KeranjangBelanja.getColumnModel().getColumnIndex("Barang");
        ArrayList<Object> dataBarang = new ArrayList<>();
        for (int row = 0; row < KeranjangBelanja.getRowCount(); row++) {
            Object value = KeranjangBelanja.getModel().getValueAt(row, kolomBarang);
            dataBarang.add(value);
        }

        int kolomHarga = KeranjangBelanja.getColumnModel().getColumnIndex("Harga");
        ArrayList<Object> dataHarga = new ArrayList<>();
        for (int row = 0; row < KeranjangBelanja.getRowCount(); row++) {
            Object value = KeranjangBelanja.getModel().getValueAt(row, kolomHarga);
            dataHarga.add(value);
        }

        int kolomJumlah = KeranjangBelanja.getColumnModel().getColumnIndex("Jumlah");
        ArrayList<Object> dataJumlah = new ArrayList<>();
        for (int row = 0; row < KeranjangBelanja.getRowCount(); row++) {
            Object value = KeranjangBelanja.getModel().getValueAt(row, kolomJumlah);
            dataJumlah.add(value);
        }

        int kolomTotal = KeranjangBelanja.getColumnModel().getColumnIndex("Total");
        ArrayList<Object> dataTotal = new ArrayList<>();
        for (int row = 0; row < KeranjangBelanja.getRowCount(); row++) {
            Object value = KeranjangBelanja.getModel().getValueAt(row, kolomTotal);
            dataTotal.add(value);
        }
        

    }//GEN-LAST:event_HapusBarangKeranjangMouseClicked

    private void HapusBarangKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBarangKeranjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusBarangKeranjangActionPerformed

    private void BackToMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToMenu1MouseClicked
        new MenuKasir().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToMenu1MouseClicked

    private void BackToMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenu1ActionPerformed

  
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;    

    private void cekKodePelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekKodePelangganMouseClicked
        if (KodePelanggan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan Kode Pelanggan");
        }else {
            String Query = "SELECT * FROM pelanggan WHERE kode_pelanggan='"+KodePelanggan.getText()+"' ";
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bekuin","root","");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if(Rs.next()){
                    JOptionPane.showMessageDialog(null, "Pelanggan Terdaftar");
                    KodePelanggan.setText(Rs.getString("kode_pelanggan"));
                    PembeliTransaksi.setText(Rs.getString("nama_pelanggan"));
                    JenisPembeli.setText("Pelanggan");
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Pelanggan Tidak Terdaftar");
                    JenisPembeli.setText("Pembeli");
                    KodePelanggan.setText(Rs.getString("-"));                    
                    PembeliTransaksi.setText(" ");                 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }}        
    }//GEN-LAST:event_cekKodePelangganMouseClicked

    

    
    private void SELESAIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SELESAIMouseClicked

        
        DefaultTableModel model = (DefaultTableModel) KeranjangBelanja.getModel();
        SimpleDateFormat Calendar = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String tgl = String.valueOf(Calendar.format(timestamp)); 
    
        int gt = 0;
        int length = 10;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        String randomString = sb.toString();
        //System.out.println(randomString); 
        KodeTransaksi.setText(randomString);
        
        try {
			 
            for(int i = 0; i < model.getRowCount(); i++){
                
                String barang = model.getValueAt(i, 0).toString();
                int harga = Integer.valueOf(model.getValueAt(i, 1).toString());
                int jumlah = Integer.valueOf(model.getValueAt(i, 2).toString());
                int total = Integer.valueOf(model.getValueAt(i, 3).toString());
                
                String sql = "INSERT INTO transaksi (kode_transaksi, kasir, kode_pelanggan, jenis_pembeli, nama_pembeli, barang, harga, jumlah, total, grand_total, tanggal) VALUES('"+randomString+"','"+etKasir.getText()+"','"+KodePelanggan.getText()+"','"+JenisPembeli.getText()+"','"+PembeliTransaksi.getText()+"','"+barang+"','"+harga+"','"+jumlah+"','"+total+"', '"+gt+"','"+tgl+"')";
                
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
            }
            
            String sql1 = "UPDATE transaksi SET grand_total = ? WHERE kode_transaksi= ?  ORDER BY kode_transaksi LIMIT 1";
                
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst1 = con.prepareStatement(sql1);
                pst1.setString(1,TotalTagihanPembeli.getText());
                pst1.setString(2,KodeTransaksi.getText());
                 int rowsUpdated = pst1.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
            }
            
            JOptionPane.showMessageDialog(this,"Proses transaksi telah selesai");
            hapusForm();
            TotalTagihanPembeli.setText(" ");
            KodeTransaksi.setText(" ");           
            PembeliTransaksi.setText(" ");
                DefaultTableModel dm = (DefaultTableModel) KeranjangBelanja.getModel();
                int rowCount = dm.getRowCount();
                //Remove rows one by one from the end of the table
                for (int i = rowCount - 1; i >= 0; i--) {
                    dm.removeRow(0);
                }           
            barang.clear();
            
            
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex);            
        }        
    }//GEN-LAST:event_SELESAIMouseClicked

    private void JumlahBarangTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBarangTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahBarangTransaksiActionPerformed

    private void KurangiJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangiJumlahBarangActionPerformed
        JumlahBarangTransaksi.setText(String.valueOf(jumlah--));

        TotalHargaBarangTransaksi.setText(String.valueOf(Integer.parseInt(JumlahBarangTransaksi.getText()) * Integer.parseInt(HargaTransaksi.getText())));    
    }//GEN-LAST:event_KurangiJumlahBarangActionPerformed


    private int jumlah;    
    

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu1;
    private javax.swing.JTextField BarangTransaksi;
    private javax.swing.JButton HapusBarangKeranjang;
    private javax.swing.JTextField HargaTransaksi;
    private javax.swing.JTextField IDBarang;
    private javax.swing.JTextField JenisPembeli;
    private javax.swing.JTextField JumlahBarangTransaksi;
    private javax.swing.JTable KeranjangBelanja;
    private javax.swing.JTextField KodePelanggan;
    private javax.swing.JTextField KodeTransaksi;
    private javax.swing.JButton KurangiJumlahBarang;
    private javax.swing.JButton MasukkanKeranjangTransaksi;
    private javax.swing.JTextField PembeliTransaksi;
    private javax.swing.JButton SELESAI;
    private javax.swing.JTable TableMenuBarang;
    private javax.swing.JButton TambahJumlahBarang;
    private javax.swing.JTextField TotalHargaBarangTransaksi;
    private javax.swing.JTextField TotalTagihanPembeli;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnTampil;
    private javax.swing.JButton cekKodePelanggan;
    private javax.swing.JTextField etKasir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tCari;
    // End of variables declaration//GEN-END:variables
}
