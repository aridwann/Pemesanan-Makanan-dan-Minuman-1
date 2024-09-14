package pbouas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MenuUtama extends javax.swing.JFrame {
    private final String[] namaMakanan;
    private final int[] hargaMakanan;
    private final ImageIcon[] foto;
    
    // fungsi untuk mengosongkan input
    public void kosongkanInput(){
        makanan_dipesan1.setText("");
        makanan_dipesan2.setText("");
        makanan_dipesan3.setText("");
        makanan_dipesan4.setText("");
        makanan_dipesan5.setText("");
        makanan_dipesan6.setText("");
        jumlah1.setValue(0);
        jumlah2.setValue(0);
        jumlah3.setValue(0);
        jumlah4.setValue(0);
        jumlah5.setValue(0);
        jumlah6.setValue(0);
        jumlah1.setEnabled(false);
        jumlah2.setEnabled(false);
        jumlah3.setEnabled(false);
        jumlah4.setEnabled(false);
        jumlah5.setEnabled(false);
        jumlah6.setEnabled(false);
    }
    
    public MenuUtama() {
        initComponents();
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        
        
        jTable1.getTableHeader().setDefaultRenderer(headerRenderer);
        headerRenderer.setBackground(new Color(107,36,12)); 
        headerRenderer.setForeground(new Color(228,143,69));
        headerRenderer.setPreferredSize(new Dimension(WIDTH, 20));
        headerRenderer.setFont(new Font("Inter", Font.BOLD, 10));
        
        this.foto = new ImageIcon[]{
            new ImageIcon(getClass().getResource("/foto/nasigoreng.jpg")),
            new ImageIcon(getClass().getResource("/foto/steak.jpg")),
            new ImageIcon(getClass().getResource("/foto/ramen.jpg")),
            new ImageIcon(getClass().getResource("/foto/cendol.jpeg")),
            new ImageIcon(getClass().getResource("/foto/esteh.jpeg")),
            new ImageIcon(getClass().getResource("/foto/latte.jpeg")),
        };
        this.namaMakanan = new String[]{
            "Nasi Goreng", 
            "Steak", 
            "Ramen",
            "Cendol", 
            "Es Teh", 
            "Coffee Latte",
        };
        this.hargaMakanan = new int[]{
            30000, 
            45000, 
            25000,
            10000, 
            6000, 
            35000,
        };
        
        getContentPane().setBackground(Color.WHITE);
        // Mengubah gambar awal
        foto_1.setIcon(foto[0]);
        foto_2.setIcon(foto[1]);
        foto_3.setIcon(foto[2]);
        foto_4.setIcon(foto[3]);
        foto_5.setIcon(foto[4]);
        foto_6.setIcon(foto[5]);
        
        // Mengubah text awal menjadi nama makanan        
        jLabel1.setText(namaMakanan[0]);
        jLabel2.setText(namaMakanan[1]);
        jLabel3.setText(namaMakanan[2]);
        jLabel4.setText(namaMakanan[3]);
        jLabel5.setText(namaMakanan[4]);
        jLabel6.setText(namaMakanan[5]);
        
        // Nonaktifkan jumlah1, jumlah2, jumlah3, jumlah4, jumlah5, jumlah6 pada awalnya
        jumlah1.setEnabled(false);
        jumlah2.setEnabled(false);
        jumlah3.setEnabled(false);
        jumlah4.setEnabled(false);
        jumlah5.setEnabled(false);
        jumlah6.setEnabled(false);
        
        // Inisialisasi tabel dengan kolom yang diperlukan
        DefaultTableModel model = new DefaultTableModel(new String[]{"Menu", "Jumlah", "Harga"}, 0);
        jTable1.setModel(model);
        
        // Tambahkan ChangeListener untuk jumlah1
        jumlah1.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah1.getValue();
            int totalHarga = jumlah * hargaMakanan[0];
            label_harga1.setText(String.format("Rp %,d", totalHarga));
        });

        // Tambahkan ChangeListener untuk jumlah2
        jumlah2.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah2.getValue();
            int totalHarga = jumlah * hargaMakanan[1];
            label_harga2.setText(String.format("Rp %,d", totalHarga));
        });

        // Tambahkan ChangeListener untuk jumlah3
        jumlah3.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah3.getValue();
            int totalHarga = jumlah * hargaMakanan[2];
            label_harga3.setText(String.format("Rp %,d", totalHarga));
        });
        
        // Tambahkan ChangeListener untuk jumlah4
        jumlah4.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah4.getValue();
            int totalHarga = jumlah * hargaMakanan[3];
            label_harga4.setText(String.format("Rp %,d", totalHarga));
        });
        
        // Tambahkan ChangeListener untuk jumlah5
        jumlah5.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah5.getValue();
            int totalHarga = jumlah * hargaMakanan[4];
            label_harga5.setText(String.format("Rp %,d", totalHarga));
        });
        
        // Tambahkan ChangeListener untuk jumlah6
        jumlah6.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            int jumlah = (int) jumlah6.getValue();
            int totalHarga = jumlah * hargaMakanan[5];
            label_harga6.setText(String.format("Rp %,d", totalHarga));
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel6 = new customSwing.Panel();
        panel4 = new customSwing.Panel();
        bersihkan_pesanan = new javax.swing.JButton();
        simpan_pesanan = new javax.swing.JButton();
        titlePesan = new javax.swing.JLabel();
        panel7 = new customSwing.Panel();
        cetakStruk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel5 = new customSwing.Panel();
        panel3 = new customSwing.Panel();
        foto_3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deskripsi_foto3 = new javax.swing.JButton();
        pesan_foto3 = new javax.swing.JButton();
        jumlah3 = new javax.swing.JSpinner();
        makanan_dipesan3 = new javax.swing.JTextField();
        label_harga3 = new javax.swing.JLabel();
        panel2 = new customSwing.Panel();
        foto_2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deskripsi_foto2 = new javax.swing.JButton();
        pesan_foto2 = new javax.swing.JButton();
        jumlah2 = new javax.swing.JSpinner();
        label_harga2 = new javax.swing.JLabel();
        makanan_dipesan2 = new javax.swing.JTextField();
        panel1 = new customSwing.Panel();
        foto_1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deskripsi_foto1 = new javax.swing.JButton();
        pesan_foto1 = new javax.swing.JButton();
        jumlah1 = new javax.swing.JSpinner();
        label_harga1 = new javax.swing.JLabel();
        makanan_dipesan1 = new javax.swing.JTextField();
        panel8 = new customSwing.Panel();
        foto_4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deskripsi_foto4 = new javax.swing.JButton();
        pesan_foto4 = new javax.swing.JButton();
        jumlah4 = new javax.swing.JSpinner();
        label_harga4 = new javax.swing.JLabel();
        makanan_dipesan4 = new javax.swing.JTextField();
        panel9 = new customSwing.Panel();
        foto_5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deskripsi_foto5 = new javax.swing.JButton();
        pesan_foto5 = new javax.swing.JButton();
        jumlah5 = new javax.swing.JSpinner();
        label_harga5 = new javax.swing.JLabel();
        makanan_dipesan5 = new javax.swing.JTextField();
        panel10 = new customSwing.Panel();
        foto_6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deskripsi_foto6 = new javax.swing.JButton();
        pesan_foto6 = new javax.swing.JButton();
        jumlah6 = new javax.swing.JSpinner();
        label_harga6 = new javax.swing.JLabel();
        makanan_dipesan6 = new javax.swing.JTextField();
        btnExit = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        panel6.setBackground(new java.awt.Color(153, 77, 28));
        panel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        panel4.setBackground(new java.awt.Color(107, 36, 12));
        panel4.setPreferredSize(new java.awt.Dimension(260, 448));
        panel4.setRoundBottomLeft(15);
        panel4.setRoundBottomRight(15);
        panel4.setRoundTopLeft(15);
        panel4.setRoundTopRight(15);

        bersihkan_pesanan.setBackground(new java.awt.Color(228, 143, 69));
        bersihkan_pesanan.setForeground(new java.awt.Color(107, 36, 12));
        bersihkan_pesanan.setText("Bersihkan");
        bersihkan_pesanan.setBorderPainted(false);
        bersihkan_pesanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bersihkan_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihkan_pesananActionPerformed(evt);
            }
        });

        simpan_pesanan.setBackground(new java.awt.Color(249, 224, 187));
        simpan_pesanan.setText("Simpan");
        simpan_pesanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan_pesanan.setEnabled(false);
        simpan_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_pesananActionPerformed(evt);
            }
        });

        titlePesan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titlePesan.setForeground(new java.awt.Color(255, 255, 255));
        titlePesan.setText("Pesanan");

        panel7.setBackground(new java.awt.Color(195, 129, 84));
        panel7.setPreferredSize(new java.awt.Dimension(100, 100));
        panel7.setRoundBottomLeft(15);
        panel7.setRoundBottomRight(15);
        panel7.setRoundTopLeft(15);
        panel7.setRoundTopRight(15);

        cetakStruk.setBackground(new java.awt.Color(228, 143, 69));
        cetakStruk.setForeground(new java.awt.Color(107, 36, 12));
        cetakStruk.setText("Cetak");
        cetakStruk.setBorderPainted(false);
        cetakStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakStrukActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(228, 143, 69));
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cetakStruk)
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cetakStruk)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simpan_pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bersihkan_pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titlePesan)
                .addGap(101, 101, 101))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePesan)
                .addGap(18, 18, 18)
                .addComponent(simpan_pesanan)
                .addGap(16, 16, 16)
                .addComponent(bersihkan_pesanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        panel5.setBackground(new java.awt.Color(107, 36, 12));
        panel5.setForeground(new java.awt.Color(255, 255, 255));
        panel5.setPreferredSize(new java.awt.Dimension(628, 240));
        panel5.setRoundBottomLeft(15);
        panel5.setRoundBottomRight(15);
        panel5.setRoundTopLeft(15);
        panel5.setRoundTopRight(15);

        panel3.setBackground(new java.awt.Color(195, 129, 84));
        panel3.setPreferredSize(new java.awt.Dimension(194, 194));
        panel3.setRoundBottomLeft(15);
        panel3.setRoundBottomRight(15);
        panel3.setRoundTopLeft(15);
        panel3.setRoundTopRight(15);

        foto_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/ramen.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nama Makanan");

        deskripsi_foto3.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto3.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto3.setText("Deskripsi");
        deskripsi_foto3.setBorderPainted(false);
        deskripsi_foto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto3ActionPerformed(evt);
            }
        });

        pesan_foto3.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto3.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto3.setText("Pesan");
        pesan_foto3.setBorderPainted(false);
        pesan_foto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto3ActionPerformed(evt);
            }
        });

        makanan_dipesan3.setEditable(false);
        makanan_dipesan3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan3.setEnabled(false);

        label_harga3.setForeground(new java.awt.Color(255, 255, 255));
        label_harga3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga3.setText("Rp.0");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(foto_3)
                                .addGap(22, 22, 22))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(deskripsi_foto3)
                                .addGap(34, 34, 34)
                                .addComponent(pesan_foto3)
                                .addContainerGap())))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(makanan_dipesan3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_harga3)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foto_3)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto3)
                    .addComponent(pesan_foto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(195, 129, 84));
        panel2.setPreferredSize(new java.awt.Dimension(194, 194));
        panel2.setRoundBottomLeft(15);
        panel2.setRoundBottomRight(15);
        panel2.setRoundTopLeft(15);
        panel2.setRoundTopRight(15);

        foto_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/steak.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nama Makanan");

        deskripsi_foto2.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto2.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto2.setText("Deskripsi");
        deskripsi_foto2.setBorderPainted(false);
        deskripsi_foto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto2ActionPerformed(evt);
            }
        });

        pesan_foto2.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto2.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto2.setText("Pesan");
        pesan_foto2.setBorderPainted(false);
        pesan_foto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto2ActionPerformed(evt);
            }
        });

        label_harga2.setForeground(new java.awt.Color(255, 255, 255));
        label_harga2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga2.setText("Rp.0");

        makanan_dipesan2.setEditable(false);
        makanan_dipesan2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan2.setEnabled(false);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(foto_2)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_harga2)
                                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(deskripsi_foto2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pesan_foto2))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(makanan_dipesan2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(12, 12, 12))))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto2)
                    .addComponent(pesan_foto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(195, 129, 84));
        panel1.setPreferredSize(new java.awt.Dimension(194, 194));
        panel1.setRoundBottomLeft(15);
        panel1.setRoundBottomRight(15);
        panel1.setRoundTopLeft(15);
        panel1.setRoundTopRight(15);

        foto_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/nasigoreng.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nama Makanan");

        deskripsi_foto1.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto1.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto1.setText("Deskripsi");
        deskripsi_foto1.setBorderPainted(false);
        deskripsi_foto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto1ActionPerformed(evt);
            }
        });

        pesan_foto1.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto1.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto1.setText("Pesan");
        pesan_foto1.setBorderPainted(false);
        pesan_foto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto1ActionPerformed(evt);
            }
        });

        label_harga1.setForeground(new java.awt.Color(255, 255, 255));
        label_harga1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga1.setText("Rp. 0");

        makanan_dipesan1.setEditable(false);
        makanan_dipesan1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan1.setEnabled(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(foto_1)
                .addGap(16, 18, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsi_foto1)
                            .addComponent(makanan_dipesan1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesan_foto1))
                            .addComponent(jumlah1)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_harga1)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foto_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto1)
                    .addComponent(pesan_foto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel8.setBackground(new java.awt.Color(195, 129, 84));
        panel8.setPreferredSize(new java.awt.Dimension(194, 194));
        panel8.setRoundBottomLeft(15);
        panel8.setRoundBottomRight(15);
        panel8.setRoundTopLeft(15);
        panel8.setRoundTopRight(15);

        foto_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/cendol.jpeg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nama Makanan");

        deskripsi_foto4.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto4.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto4.setText("Deskripsi");
        deskripsi_foto4.setBorderPainted(false);
        deskripsi_foto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto4ActionPerformed(evt);
            }
        });

        pesan_foto4.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto4.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto4.setText("Pesan");
        pesan_foto4.setBorderPainted(false);
        pesan_foto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto4ActionPerformed(evt);
            }
        });

        label_harga4.setForeground(new java.awt.Color(255, 255, 255));
        label_harga4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga4.setText("Rp. 0");

        makanan_dipesan4.setEditable(false);
        makanan_dipesan4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan4.setEnabled(false);

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(foto_4)
                .addGap(16, 18, Short.MAX_VALUE))
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsi_foto4)
                            .addComponent(makanan_dipesan4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesan_foto4))
                            .addComponent(jumlah4)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_harga4)))
                .addContainerGap())
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(foto_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto4)
                    .addComponent(pesan_foto4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel9.setBackground(new java.awt.Color(195, 129, 84));
        panel9.setPreferredSize(new java.awt.Dimension(194, 194));
        panel9.setRoundBottomLeft(15);
        panel9.setRoundBottomRight(15);
        panel9.setRoundTopLeft(15);
        panel9.setRoundTopRight(15);

        foto_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/esteh.jpeg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nama Makanan");

        deskripsi_foto5.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto5.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto5.setText("Deskripsi");
        deskripsi_foto5.setBorderPainted(false);
        deskripsi_foto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto5ActionPerformed(evt);
            }
        });

        pesan_foto5.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto5.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto5.setText("Pesan");
        pesan_foto5.setBorderPainted(false);
        pesan_foto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto5ActionPerformed(evt);
            }
        });

        label_harga5.setForeground(new java.awt.Color(255, 255, 255));
        label_harga5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga5.setText("Rp. 0");

        makanan_dipesan5.setEditable(false);
        makanan_dipesan5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan5.setEnabled(false);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(foto_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsi_foto5)
                            .addComponent(makanan_dipesan5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesan_foto5))
                            .addComponent(jumlah5)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_harga5)))
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foto_5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto5)
                    .addComponent(pesan_foto5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga5)
                .addGap(18, 18, 18))
        );

        panel10.setBackground(new java.awt.Color(195, 129, 84));
        panel10.setPreferredSize(new java.awt.Dimension(194, 194));
        panel10.setRoundBottomLeft(15);
        panel10.setRoundBottomRight(15);
        panel10.setRoundTopLeft(15);
        panel10.setRoundTopRight(15);

        foto_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/latte.jpeg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nama Makanan");

        deskripsi_foto6.setBackground(new java.awt.Color(228, 143, 69));
        deskripsi_foto6.setForeground(new java.awt.Color(107, 36, 12));
        deskripsi_foto6.setText("Deskripsi");
        deskripsi_foto6.setBorderPainted(false);
        deskripsi_foto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deskripsi_foto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsi_foto6ActionPerformed(evt);
            }
        });

        pesan_foto6.setBackground(new java.awt.Color(228, 143, 69));
        pesan_foto6.setForeground(new java.awt.Color(107, 36, 12));
        pesan_foto6.setText("Pesan");
        pesan_foto6.setBorderPainted(false);
        pesan_foto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesan_foto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesan_foto6ActionPerformed(evt);
            }
        });

        label_harga6.setForeground(new java.awt.Color(255, 255, 255));
        label_harga6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_harga6.setText("Rp. 0");

        makanan_dipesan6.setEditable(false);
        makanan_dipesan6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        makanan_dipesan6.setEnabled(false);

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(foto_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsi_foto6)
                            .addComponent(makanan_dipesan6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pesan_foto6))
                            .addComponent(jumlah6)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_harga6)))
                .addContainerGap())
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foto_6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_foto6)
                    .addComponent(pesan_foto6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makanan_dipesan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_harga6)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setToolTipText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.black));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnMinimize.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setText("-");
        btnMinimize.setToolTipText("Minimize");
        btnMinimize.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.black));
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bersihkan_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkan_pesananActionPerformed
        kosongkanInput();
        // Kosongkan data di jTable1
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_bersihkan_pesananActionPerformed

    private void simpan_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_pesananActionPerformed
        // Ambil text dari makanan_dipesan1, makanan_dipesan2, makanan_dipesan3,
        // makanan_depesan4, makanan_dipesan5, makanan_dipesan6
        String[] makanan_hasil = {
            makanan_dipesan1.getText(), 
            makanan_dipesan2.getText(), 
            makanan_dipesan3.getText(), 
            makanan_dipesan4.getText(), 
            makanan_dipesan5.getText(), 
            makanan_dipesan6.getText()};
        
        // Ambil nilai dari jumlah1, jumlah2, jumlah3, jumlah4, jumlah5, jumlah6
        int[] jumlah_hasil = {
            (int) jumlah1.getValue(), 
            (int) jumlah2.getValue(), 
            (int) jumlah3.getValue(),
            (int) jumlah4.getValue(), 
            (int) jumlah5.getValue(), 
            (int) jumlah6.getValue()};
        
        // Inisialisasi variabel subTotalBiaya
        int[] subTotalBiaya = {0,0,0,0,0,0};
        
        // Dapatkan tabel model dari tabel
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        for(int i = 0; i < jumlah_hasil.length; i++){
            // Hitung total per makanan
            subTotalBiaya[i] = jumlah_hasil[i] * hargaMakanan[i];
            
            // Tambahkan data ke dalam tabel
            if (jumlah_hasil[i] > 0) {
                model.addRow(new Object[]{makanan_hasil[i], jumlah_hasil[i], subTotalBiaya[i]});
            }
        }
        kosongkanInput();
    }//GEN-LAST:event_simpan_pesananActionPerformed

    private void deskripsi_foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto3ActionPerformed
        new Deskripsi(2).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto3ActionPerformed

    private void pesan_foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto3ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan3
        makanan_dipesan3.setText(namaMakanan[2]);
        
        // Aktifkan jumlah3 dan simpan_pesanan
        jumlah3.setEnabled(true);
        jumlah3.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto3ActionPerformed

    private void deskripsi_foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto2ActionPerformed
        new Deskripsi(1).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto2ActionPerformed

    private void pesan_foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto2ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan2
        makanan_dipesan2.setText(namaMakanan[1]);
        
        // Aktifkan jumlah2 dan simpan_pesanan
        jumlah2.setEnabled(true);
        jumlah2.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto2ActionPerformed

    private void deskripsi_foto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto1ActionPerformed
        new Deskripsi(0).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto1ActionPerformed

    private void pesan_foto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto1ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan1
        makanan_dipesan1.setText(namaMakanan[0]);
        
        // Aktifkan jumlah1 dan simpan_pesanan
        jumlah1.setEnabled(true);
        jumlah1.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto1ActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void cetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakStrukActionPerformed
        // Ambil model dari jTable1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        StringBuilder strukText = new StringBuilder();
        int totalHarga = 0;

        // Iterasi melalui baris pada tabel
        for (int i = 0; i < model.getRowCount(); i++) {
            String menu = model.getValueAt(i, 0).toString();
            String jumlah = model.getValueAt(i, 1).toString();
            int harga = Integer.parseInt(model.getValueAt(i, 2).toString());
            totalHarga += harga;
            strukText.append(String.format("Menu: %s\nJumlah: %s\nHarga: Rp %,d\n\n", menu, jumlah, harga));
        }

        // Tambahkan total harga ke teks struk
        strukText.append(String.format("Total Harga Keseluruhan: Rp %,d\n", totalHarga));

        this.dispose();
        // Buat frame Struk baru dengan teks yang sudah diformat
        new Struk(strukText.toString()).setVisible(true);
    }//GEN-LAST:event_cetakStrukActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void deskripsi_foto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto4ActionPerformed
        new Deskripsi(3).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto4ActionPerformed

    private void pesan_foto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto4ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan4
        makanan_dipesan4.setText(namaMakanan[3]);
        
        // Aktifkan jumlah1 dan simpan_pesanan
        jumlah4.setEnabled(true);
        jumlah4.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto4ActionPerformed

    private void deskripsi_foto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto5ActionPerformed
        new Deskripsi(4).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto5ActionPerformed

    private void pesan_foto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto5ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan5
        makanan_dipesan5.setText(namaMakanan[4]);
        
        // Aktifkan jumlah1 dan simpan_pesanan
        jumlah5.setEnabled(true);
        jumlah5.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto5ActionPerformed

    private void deskripsi_foto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsi_foto6ActionPerformed
        new Deskripsi(5).setVisible(true);
    }//GEN-LAST:event_deskripsi_foto6ActionPerformed

    private void pesan_foto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesan_foto6ActionPerformed
        // Set text dari jLabel1 ke makanan_dipesan6
        makanan_dipesan6.setText(namaMakanan[5]);
        
        // Aktifkan jumlah1 dan simpan_pesanan
        jumlah6.setEnabled(true);
        jumlah6.setValue(1);
        simpan_pesanan.setEnabled(true);
    }//GEN-LAST:event_pesan_foto6ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersihkan_pesanan;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JButton cetakStruk;
    private javax.swing.JButton deskripsi_foto1;
    private javax.swing.JButton deskripsi_foto2;
    private javax.swing.JButton deskripsi_foto3;
    private javax.swing.JButton deskripsi_foto4;
    private javax.swing.JButton deskripsi_foto5;
    private javax.swing.JButton deskripsi_foto6;
    private javax.swing.JLabel foto_1;
    private javax.swing.JLabel foto_2;
    private javax.swing.JLabel foto_3;
    private javax.swing.JLabel foto_4;
    private javax.swing.JLabel foto_5;
    private javax.swing.JLabel foto_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner jumlah1;
    private javax.swing.JSpinner jumlah2;
    private javax.swing.JSpinner jumlah3;
    private javax.swing.JSpinner jumlah4;
    private javax.swing.JSpinner jumlah5;
    private javax.swing.JSpinner jumlah6;
    private javax.swing.JLabel label_harga1;
    private javax.swing.JLabel label_harga2;
    private javax.swing.JLabel label_harga3;
    private javax.swing.JLabel label_harga4;
    private javax.swing.JLabel label_harga5;
    private javax.swing.JLabel label_harga6;
    private javax.swing.JTextField makanan_dipesan1;
    private javax.swing.JTextField makanan_dipesan2;
    private javax.swing.JTextField makanan_dipesan3;
    private javax.swing.JTextField makanan_dipesan4;
    private javax.swing.JTextField makanan_dipesan5;
    private javax.swing.JTextField makanan_dipesan6;
    private customSwing.Panel panel1;
    private customSwing.Panel panel10;
    private customSwing.Panel panel2;
    private customSwing.Panel panel3;
    private customSwing.Panel panel4;
    private customSwing.Panel panel5;
    private customSwing.Panel panel6;
    private customSwing.Panel panel7;
    private customSwing.Panel panel8;
    private customSwing.Panel panel9;
    private javax.swing.JButton pesan_foto1;
    private javax.swing.JButton pesan_foto2;
    private javax.swing.JButton pesan_foto3;
    private javax.swing.JButton pesan_foto4;
    private javax.swing.JButton pesan_foto5;
    private javax.swing.JButton pesan_foto6;
    private javax.swing.JButton simpan_pesanan;
    private javax.swing.JLabel titlePesan;
    // End of variables declaration//GEN-END:variables
}
