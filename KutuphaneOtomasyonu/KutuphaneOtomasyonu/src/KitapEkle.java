import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KitapEkle extends javax.swing.JFrame {

    public KitapEkle() {
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
        EkleButonu = new javax.swing.JButton();
        TurBox = new javax.swing.JComboBox();
        YayinYiliText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 200));
        setUndecorated(true);

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

        BarkodText.setEditable(false);

        EkleButonu.setText("Ekle");
        EkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonuActionPerformed(evt);
            }
        });

        TurBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Biyografi", "Deneme", "Edebiyat", "Eğitim", "Hikaye", "Kişisel Gelişim", "Masal", "Roman", "Diğer" }));

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
                    .addComponent(SayfaSayisiText)
                    .addComponent(DilText)
                    .addComponent(YazarText)
                    .addComponent(AdText)
                    .addComponent(BarkodText)
                    .addComponent(TurBox, 0, 140, Short.MAX_VALUE)
                    .addComponent(YayinYiliText))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(IptalButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BarkodLabel)
                    .addComponent(BarkodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(TurBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YayinYiliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YayinYiliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DilText)
                    .addComponent(DilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SayfaSayisiText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SayfaSayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EkleButonu)
                    .addComponent(IptalButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked

    private void EkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleButonuActionPerformed
        Yonetici obj = new Yonetici();
        String ad=AdText.getText();
        String yazar=YazarText.getText();
        String tur = null;
        String yil=YayinYiliText.getText();
        String dil=DilText.getText();
        String sayfa=SayfaSayisiText.getText();
        if (TurBox.getSelectedIndex() == 0){
            tur="Biyografi";
        } 
        else if(TurBox.getSelectedIndex() == 1){
            tur ="Deneme";
        }
        else if(TurBox.getSelectedIndex() == 2){
            tur ="Edebiyat";
        }
        else if(TurBox.getSelectedIndex() == 3){
            tur ="Eğitim";
        }
        else if(TurBox.getSelectedIndex() == 4){
            tur ="Hikaye";
        }
        else if(TurBox.getSelectedIndex() == 5){
            tur ="Kişisel Gelişim";
        }
        else if(TurBox.getSelectedIndex() == 6){
            tur ="Masal";
        }
        else if(TurBox.getSelectedIndex() == 7){
            tur ="Roman";
        }
        else if(TurBox.getSelectedIndex() == 8){
            tur ="Diğer";
        }
        
        try {
            obj.KitapEkleme(ad, yazar, tur, yil, dil, sayfa);
        } catch (IOException ex) {
            Logger.getLogger(KitapEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Kitap Eklenmiştir.","Bilgi",0);
        
        AdText.setText(null);
        YazarText.setText(null);
        TurBox.setSelectedIndex(0);
        YayinYiliText.setText(null);
        DilText.setText(null);
        SayfaSayisiText.setText(null);               
    }//GEN-LAST:event_EkleButonuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdLabel;
    private javax.swing.JTextField AdText;
    private javax.swing.JLabel BarkodLabel;
    private javax.swing.JTextField BarkodText;
    private javax.swing.JLabel DilLabel;
    private javax.swing.JTextField DilText;
    private javax.swing.JButton EkleButonu;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JLabel SayfaSayisiLabel;
    private javax.swing.JTextField SayfaSayisiText;
    private javax.swing.JComboBox TurBox;
    private javax.swing.JLabel TurLabel;
    private javax.swing.JLabel YayinYiliLabel;
    private javax.swing.JTextField YayinYiliText;
    private javax.swing.JLabel YazarLabel;
    private javax.swing.JTextField YazarText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
