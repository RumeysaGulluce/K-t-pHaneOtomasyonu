import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kullaniciİslemleri extends javax.swing.JFrame {

    public Kullaniciİslemleri(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdiLabel = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        BolumLabel = new javax.swing.JLabel();
        SilButonu = new javax.swing.JButton();
        GuncelleButonu = new javax.swing.JButton();
        AdiText = new javax.swing.JTextField();
        AraButonu = new javax.swing.JButton();
        SoyadiLabel = new javax.swing.JLabel();
        SoyadiText = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        IptalButonu = new javax.swing.JButton();
        SinifLabel = new javax.swing.JLabel();
        BolumText = new javax.swing.JTextField();
        SinifText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));

        AdiLabel.setText("Adı");

        BolumLabel.setText("Bölüm");

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

        AraButonu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        AraButonu.setText("Ara");
        AraButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AraButonuMouseClicked(evt);
            }
        });

        SoyadiLabel.setText("Soyadı");

        IDLabel.setText("ID");

        IptalButonu.setText("İptal");
        IptalButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IptalButonuMouseClicked(evt);
            }
        });

        SinifLabel.setText("Sınıf");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SoyadiText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdiText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BolumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SinifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BolumText)
                            .addComponent(SinifText))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AraButonu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GuncelleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SilButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IptalButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdiText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoyadiText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BolumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BolumText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SinifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SinifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SilButonu)
                    .addComponent(GuncelleButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IptalButonu)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AraButonuMouseClicked
        Yonetici obj=new Yonetici();
        ArrayList list=new ArrayList<>();
        try {
            obj.dosya_okuma(list, "kisiler");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kitapİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ID=IDText.getText();
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=list.get(i);
            ydizi.add(id);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object id=String.valueOf(i);
            ydizi2.add(id);
        }
        
        ydizi.removeAll(ydizi2);
        int index=0; 
        for(int i=0;i<41;i+=4){ 
            if(list.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        
        for(int i=index;i<list.size();i+=9){
            if(ID.equals(list.get(i)) ){
                int index2=i;
                 AdiText.setText((String) list.get(index2+1));
                 SoyadiText.setText((String) list.get(index2+2));
                 BolumText.setText((String) list.get(index2+4));
                 SinifText.setText((String) list.get(index2+5));
                 break;
               }
            else if(!list.contains(ID) && list.get(i)!=ID){
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bulunamadı.","Bilgi",0);
            
            AdiText.setText(null);
            SoyadiText.setText(null);
            BolumText.setText(null);
            SinifText.setText(null);
            break;
            } 
            else if(Integer.parseInt(ID)<11){
               JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bulunamadı.","Bilgi",0);
               
               AdiText.setText(null);
               SoyadiText.setText(null);
               BolumText.setText(null);
               SinifText.setText(null);
               break;
            }
        }   
    }//GEN-LAST:event_AraButonuMouseClicked

    private void SilButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilButonuMouseClicked
        Yonetici obj=new Yonetici();
        String ID=IDText.getText();
        try {
            obj.KullaniciSilme(ID);
        } catch (IOException ex) {
            Logger.getLogger(Kullaniciİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(rootPane, "Kullanıcı Silinmiştir.","Bilgi",0);
        
        IDText.setText(null);
        AdiText.setText(null);
        SoyadiText.setText(null);
        BolumText.setText(null);
        SinifText.setText(null);            
    }//GEN-LAST:event_SilButonuMouseClicked

    private void GuncelleButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuncelleButonuMouseClicked
        Yonetici obj=new Yonetici();
        String IDNo=IDText.getText();
        String ad=AdiText.getText();
        String soyad=SoyadiText.getText();
        String bolum = BolumText.getText();
        String sinif=SinifText.getText();

        try {
            obj.KullaniciGuncelleme(IDNo, ad, soyad,bolum, sinif);
        } catch (IOException ex) {
            Logger.getLogger(Kullaniciİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bilgileri Güncellenmiştir.","Bilgi",0);
       
    }//GEN-LAST:event_GuncelleButonuMouseClicked

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdiLabel;
    private javax.swing.JTextField AdiText;
    private javax.swing.JButton AraButonu;
    private javax.swing.JLabel BolumLabel;
    private javax.swing.JTextField BolumText;
    private javax.swing.JButton GuncelleButonu;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDText;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JButton SilButonu;
    private javax.swing.JLabel SinifLabel;
    private javax.swing.JTextField SinifText;
    private javax.swing.JLabel SoyadiLabel;
    private javax.swing.JTextField SoyadiText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
