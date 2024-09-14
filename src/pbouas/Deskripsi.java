package pbouas;

import javax.swing.ImageIcon;

public class Deskripsi extends javax.swing.JFrame {

    String[] dMakanan = {
        "Nasi Goreng", 
        "Steak", 
        "Ramen",
        "Cendol", 
        "Es Teh", 
        "Coffee Latte",
    };
    String[] dFoto = {
        "nasigoreng.jpg",
        "steak.jpg",
        "ramen.jpg",
        "cendol.jpeg",
        "esteh.jpeg",
        "latte.jpeg",
    };
    String[] dDeskripsi = {
        "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan yang menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu dan toping.",
        "Steik adalah sepotong besar daging, biasanya daging sapi (dikenal pula dengan istilah bistik). Daging merah, dada ayam, dan ikan sering kali dipotong menjadi steik.",
        "Ramen adalah masakan mi kuah Jepang yang berasal dari Jepang dan Tiongkok. Orang Jepang juga menyebut ramen sebagai chuka soba atau shina soba karena soba atau o-soba dalam bahasa Jepang sering juga berarti mi.",
        "Es Cendol merupakan minuman penutup es manis yang mengandung tetesan tepung beras hijau, santan, dan sirop gula aren.",
        "Es teh adalah minuman teh yang disajikan dingin dengan es batu. Biasanya, Es teh seringkali ditambahkan rasa seperti melati, dan buah-buahan seperti lemon, ceri, dan stroberi, atau susu.",
        "Latte atau Caffè latte (Bahasa Italia yang artinya kopi susu) adalah espreso atau kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di bagian atasnya. Perbandingan antara susu dengan kopi pada caffè latte adalah 2:1.",
    };
    
    public Deskripsi() {
        initComponents();
    }
    
    public Deskripsi(int x) {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/foto/"+dFoto[x]));
        
        namaMakanan.setText(dMakanan[x]);
        foto.setIcon(icon);
        deskripsi.setText(dDeskripsi[x]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panel1 = new customSwing.Panel();
        namaMakanan = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        deskripsi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(107, 36, 12));
        panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panel1.setRoundBottomLeft(15);
        panel1.setRoundBottomRight(15);
        panel1.setRoundTopLeft(15);
        panel1.setRoundTopRight(15);

        namaMakanan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namaMakanan.setForeground(new java.awt.Color(255, 255, 255));
        namaMakanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaMakanan.setText("Nama Makanan");

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/nasigoreng.jpg"))); // NOI18N
        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        deskripsi.setEditable(false);
        deskripsi.setBackground(new java.awt.Color(107, 36, 12));
        deskripsi.setColumns(3);
        deskripsi.setForeground(new java.awt.Color(255, 255, 255));
        deskripsi.setLineWrap(true);
        deskripsi.setRows(3);
        deskripsi.setTabSize(2);
        deskripsi.setText("deskripsiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        deskripsi.setWrapStyleWord(true);
        deskripsi.setBorder(null);
        deskripsi.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setToolTipText("Exit");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.black));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(foto)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deskripsi))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(namaMakanan)
                .addGap(18, 18, 18)
                .addComponent(foto)
                .addGap(12, 12, 12)
                .addComponent(deskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(319, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Deskripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deskripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deskripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deskripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deskripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel namaMakanan;
    private customSwing.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
