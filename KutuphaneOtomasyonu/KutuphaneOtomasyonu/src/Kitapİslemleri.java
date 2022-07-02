import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kitapİslemleri extends javax.swing.JFrame {

    public Kitapİslemleri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        YayinYiliLabel = new javax.swing.JLabel();
        YazarLabel = new javax.swing.JLabel();
        AdLabel = new javax.swing.JLabel();
        YazarText = new javax.swing.JTextField();
        IptalButonu = new javax.swing.JButton();
        DilText = new javax.swing.JTextField();
        SayfaSayisiText = new javax.swing.JTextField();
        DilLabel = new javax.swing.JLabel();
        AdText = new javax.swing.JTextField();
        SayfaSayisiLabel = new javax.swing.JLabel();
        TurLabel = new javax.swing.JLabel();
        BarkodLabel = new javax.swing.JLabel();
        BarkodText = new javax.swing.JTextField();
        SilButonu = new javax.swing.JButton();
        GuncelleButonu = new javax.swing.JButton();
        AraButonu = new javax.swing.JButton();
        yayinYiliText = new javax.swing.JTextField();
        TurText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 190));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        YayinYiliLabel.setText("Yayın Yılı");

        YazarLabel.setText("Yazar");

        AdLabel.setText("Ad");

        IptalButonu.setText("İptal");
        IptalButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IptalButonuMouseClicked(evt);
            }
        });

        DilLabel.setText("Dil");

        SayfaSayisiLabel.setText("Sayfa Sayısı");

        TurLabel.setText("Tür");

        BarkodLabel.setText("Barkod No");

        SilButonu.setText("Sil");
        SilButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SilButonuMouseClicked(evt);
            }
        });

        GuncelleButonu.setText("Güncelle");
        GuncelleButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuncelleButonuMouseClicked(evt);
            }
        });

        AraButonu.setText("Ara");
        AraButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AraButonuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SayfaSayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YayinYiliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YazarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarkodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SayfaSayisiText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(DilText)
                    .addComponent(YazarText)
                    .addComponent(AdText)
                    .addComponent(BarkodText)
                    .addComponent(yayinYiliText)
                    .addComponent(TurText))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AraButonu)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuncelleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SilButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IptalButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BarkodLabel)
                    .addComponent(BarkodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AraButonu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YazarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YazarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TurText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YayinYiliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yayinYiliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DilText)
                    .addComponent(DilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SayfaSayisiText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuncelleButonu)
                            .addComponent(SilButonu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IptalButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SayfaSayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked

    private void AraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AraButonuMouseClicked
        
        Yonetici obj=new Yonetici();
        ArrayList list=new ArrayList<>();
        try {
            obj.dosya_okuma(list, "kitaplar");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kitapİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

        int index=list.indexOf(BarkodText.getText());
        AdText.setText((String) list.get(index+1));
        YazarText.setText((String) list.get(index+2));
        TurText.setText((String) list.get(index+3));
        yayinYiliText.setText((String) list.get(index+4));
        DilText.setText((String) list.get(index+5));
        SayfaSayisiText.setText((String) list.get(index+6));

    }//GEN-LAST:event_AraButonuMouseClicked

    private void SilButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilButonuMouseClicked
       Yonetici obj=new Yonetici();
        try {
            obj.kitapSilme(BarkodText.getText());
        } catch (IOException ex) {
            Logger.getLogger(Kitapİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Kitap Silinmiştir.","Bilgi",0);
        
        AdText.setText(null);
        YazarText.setText(null);
        TurText.setText(null);
        yayinYiliText.setText(null);
        DilText.setText(null);
        SayfaSayisiText.setText(null);
        
        
    }//GEN-LAST:event_SilButonuMouseClicked

    private void GuncelleButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuncelleButonuMouseClicked
        
        Yonetici obj=new Yonetici();
        String BarkodNo=BarkodText.getText();
        String ad=AdText.getText();
        String yazar=YazarText.getText();
        String tur = TurText.getText();
        String yil=yayinYiliText.getText();
        String dil=DilText.getText();
        String sayfa=SayfaSayisiText.getText();
        
        try {
            obj.KitapGuncelleme(BarkodNo, ad, yazar,tur, yil, dil, sayfa);
        } catch (IOException ex) {
            Logger.getLogger(Kitapİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Kitap Bilgileri Güncellenmiştir.","Bilgi",0);
    }//GEN-LAST:event_GuncelleButonuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdLabel;
    private javax.swing.JTextField AdText;
    private javax.swing.JButton AraButonu;
    private javax.swing.JLabel BarkodLabel;
    private javax.swing.JTextField BarkodText;
    private javax.swing.JLabel DilLabel;
    private javax.swing.JTextField DilText;
    private javax.swing.JButton GuncelleButonu;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JLabel SayfaSayisiLabel;
    private javax.swing.JTextField SayfaSayisiText;
    private javax.swing.JButton SilButonu;
    private javax.swing.JLabel TurLabel;
    private javax.swing.JTextField TurText;
    private javax.swing.JLabel YayinYiliLabel;
    private javax.swing.JLabel YazarLabel;
    private javax.swing.JTextField YazarText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField yayinYiliText;
    // End of variables declaration//GEN-END:variables
}
