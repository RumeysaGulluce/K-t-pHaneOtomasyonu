
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kullanici_Ekrani extends javax.swing.JFrame {

    public Kullanici_Ekrani() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KisiselBilgilerButonu = new javax.swing.JButton();
        KitapAramaButonu = new javax.swing.JButton();
        OduncAlmaButonu = new javax.swing.JButton();
        IadeEtmeButonu = new javax.swing.JButton();
        uzerimdekilerButonu = new javax.swing.JButton();
        ResimLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menü = new javax.swing.JMenu();
        OturumuKapat = new javax.swing.JMenuItem();
        Cikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KisiselBilgilerButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-resume-24.png"))); // NOI18N
        KisiselBilgilerButonu.setText("Şahsi Bilgilerim");
        KisiselBilgilerButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KisiselBilgilerButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KisiselBilgilerButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        KitapAramaButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-bookmark-book-24.png"))); // NOI18N
        KitapAramaButonu.setText("Kitap Arama");
        KitapAramaButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapAramaButonuMouseClicked(evt);
            }
        });
        getContentPane().add(KitapAramaButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, -1));

        OduncAlmaButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-borrow-book-24.png"))); // NOI18N
        OduncAlmaButonu.setText("Ödünç Alma");
        OduncAlmaButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OduncAlmaButonuMouseClicked(evt);
            }
        });
        getContentPane().add(OduncAlmaButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 140, -1));

        IadeEtmeButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-return-book-24.png"))); // NOI18N
        IadeEtmeButonu.setText("İade Etme");
        IadeEtmeButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IadeEtmeButonuMouseClicked(evt);
            }
        });
        getContentPane().add(IadeEtmeButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 130, -1));

        uzerimdekilerButonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons82-book-24.png"))); // NOI18N
        uzerimdekilerButonu.setText("Üzerimdekiler");
        uzerimdekilerButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uzerimdekilerButonuMouseClicked(evt);
            }
        });
        getContentPane().add(uzerimdekilerButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, -1));

        ResimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/librarybackground.jpg"))); // NOI18N
        ResimLabel.setPreferredSize(new java.awt.Dimension(960, 650));
        getContentPane().add(ResimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void KisiselBilgilerButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KisiselBilgilerButonuMouseClicked
        SahsiBilgiler obj = new SahsiBilgiler();  
        obj.setVisible(true);
         
    }//GEN-LAST:event_KisiselBilgilerButonuMouseClicked

    private void KitapAramaButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapAramaButonuMouseClicked
        KitapArama obj = new KitapArama();
        obj.setVisible(true);
    }//GEN-LAST:event_KitapAramaButonuMouseClicked

    private void OduncAlmaButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OduncAlmaButonuMouseClicked
        OduncAlma obj = new OduncAlma();
        obj.setVisible(true);
    }//GEN-LAST:event_OduncAlmaButonuMouseClicked

    private void IadeEtmeButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IadeEtmeButonuMouseClicked
        IadeEtme obj = new IadeEtme();
        obj.setVisible(true);
    }//GEN-LAST:event_IadeEtmeButonuMouseClicked

    private void OturumuKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OturumuKapatActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OturumuKapatActionPerformed

    private void CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CikisActionPerformed

    private void uzerimdekilerButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uzerimdekilerButonuMouseClicked
        uzerimdekiler obj = null;
        try {
            obj = new uzerimdekiler();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kullanici_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_uzerimdekilerButonuMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cikis;
    private javax.swing.JButton IadeEtmeButonu;
    private javax.swing.JButton KisiselBilgilerButonu;
    private javax.swing.JButton KitapAramaButonu;
    private javax.swing.JMenu Menü;
    private javax.swing.JButton OduncAlmaButonu;
    private javax.swing.JMenuItem OturumuKapat;
    private javax.swing.JLabel ResimLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton uzerimdekilerButonu;
    // End of variables declaration//GEN-END:variables
}
