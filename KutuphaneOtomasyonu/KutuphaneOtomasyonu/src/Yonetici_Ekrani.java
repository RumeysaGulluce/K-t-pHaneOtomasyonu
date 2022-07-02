public class Yonetici_Ekrani extends javax.swing.JFrame {

    public Yonetici_Ekrani() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KulIslemButonu = new javax.swing.JButton();
        KulAraButonu = new javax.swing.JButton();
        KitapIslemButonu = new javax.swing.JButton();
        KitapAramaButonu = new javax.swing.JButton();
        KitapEkleButonu = new javax.swing.JButton();
        KullanıcıEkleButonu = new javax.swing.JButton();
        AlinanKitaplarButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menü = new javax.swing.JMenu();
        OturumuKapat = new javax.swing.JMenuItem();
        Cikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KulIslemButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-contact-details-16.png"))); // NOI18N
        KulIslemButonu.setText("Kullanıcı İşlemleri");
        KulIslemButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KulIslemButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KulIslemButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 25));

        KulAraButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-search-contacts-16.png"))); // NOI18N
        KulAraButonu.setText("Kullanıcı Arama");
        KulAraButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KulAraButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KulAraButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 25));

        KitapIslemButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons82-book-16.png"))); // NOI18N
        KitapIslemButonu.setText("Kitap İşlemleri");
        KitapIslemButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapIslemButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KitapIslemButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 25));

        KitapAramaButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-bookmark-book-16.png"))); // NOI18N
        KitapAramaButonu.setText("Kitap Arama");
        KitapAramaButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapAramaButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KitapAramaButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 25));

        KitapEkleButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-book-16.png"))); // NOI18N
        KitapEkleButonu.setText("Kitap Ekleme");
        KitapEkleButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapEkleButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KitapEkleButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 25));

        KullanıcıEkleButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-add-user-group-woman-man-16.png"))); // NOI18N
        KullanıcıEkleButonu.setText("Kullanıcı Ekleme");
        KullanıcıEkleButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KullanıcıEkleButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KullanıcıEkleButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 25));

        AlinanKitaplarButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-book-shelf-16.png"))); // NOI18N
        AlinanKitaplarButonu.setText("Alınan Kitaplar");
        AlinanKitaplarButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlinanKitaplarButonuMouseClicked(evt);
            }
        });
        getContentPane().add(AlinanKitaplarButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 140, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/study-ın-the-library-desktop-background-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menü.setText("Menü");

        OturumuKapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-logout-rounded-left-24.png"))); // NOI18N
        OturumuKapat.setText("Oturumu Kapat");
        OturumuKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OturumuKapatActionPerformed(evt);
            }
        });
        Menü.add(OturumuKapat);

        Cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-close-window-24.png"))); // NOI18N
        Cikis.setText("Çıkış");
        Cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CikisActionPerformed(evt);
            }
        });
        Menü.add(Cikis);

        jMenuBar1.add(Menü);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KulIslemButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KulIslemButonuMouseClicked
        Kullaniciİslemleri obj = new Kullaniciİslemleri();
        obj.setVisible(true);
    }//GEN-LAST:event_KulIslemButonuMouseClicked

    private void CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CikisActionPerformed

    private void KulAraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KulAraButonuMouseClicked
        KullaniciArama obj = new KullaniciArama();
        obj.setVisible(true);
    }//GEN-LAST:event_KulAraButonuMouseClicked

    private void KitapIslemButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapIslemButonuMouseClicked
        Kitapİslemleri obj = new Kitapİslemleri();
        obj.setVisible(true);
    }//GEN-LAST:event_KitapIslemButonuMouseClicked

    private void KitapAramaButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapAramaButonuMouseClicked
        KitapArama obj = new KitapArama();
        obj.setVisible(true);
    }//GEN-LAST:event_KitapAramaButonuMouseClicked

    private void OturumuKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OturumuKapatActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OturumuKapatActionPerformed

    private void KitapEkleButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapEkleButonuMouseClicked
        KitapEkle obj = new KitapEkle();
        obj.setVisible(true);
    }//GEN-LAST:event_KitapEkleButonuMouseClicked

    private void KullanıcıEkleButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KullanıcıEkleButonuMouseClicked
        KullaniciEkle obj = new KullaniciEkle();
        obj.setVisible(true);
    }//GEN-LAST:event_KullanıcıEkleButonuMouseClicked

    private void AlinanKitaplarButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlinanKitaplarButonuMouseClicked
        AlinanKitaplar obj = new AlinanKitaplar();   
        obj.setVisible(true);
    }//GEN-LAST:event_AlinanKitaplarButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlinanKitaplarButonu;
    private javax.swing.JMenuItem Cikis;
    private javax.swing.JButton KitapAramaButonu;
    private javax.swing.JButton KitapEkleButonu;
    private javax.swing.JButton KitapIslemButonu;
    private javax.swing.JButton KulAraButonu;
    private javax.swing.JButton KulIslemButonu;
    private javax.swing.JButton KullanıcıEkleButonu;
    private javax.swing.JMenu Menü;
    private javax.swing.JMenuItem OturumuKapat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
