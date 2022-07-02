import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class OduncAlma extends javax.swing.JFrame {
    public static String kitap;
    public OduncAlma() {
        initComponents();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KitapAraText = new javax.swing.JTextField();
        AraButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KitapBilgiTable = new javax.swing.JTable();
        IptalButonu = new javax.swing.JButton();
        OduncAlButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 190));
        setUndecorated(true);
        setResizable(false);

        AraButonu.setText("Ara");
        AraButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AraButonuMouseClicked(evt);
            }
        });

        KitapBilgiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barkod No", "Adı", "Yazar", "Tür", "Durum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(KitapBilgiTable);

        IptalButonu.setText("İptal");
        IptalButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IptalButonuMouseClicked(evt);
            }
        });

        OduncAlButonu.setText("Ödünç Al");
        OduncAlButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OduncAlButonuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OduncAlButonu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IptalButonu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(KitapAraText, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KitapAraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AraButonu))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IptalButonu)
                    .addComponent(OduncAlButonu))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AraButonuMouseClicked
        Yonetici obj = new Yonetici();
        ArrayList list = new ArrayList();
        DefaultTableModel model = (DefaultTableModel)KitapBilgiTable.getModel();

        try {
            obj.dosya_okuma(list, "kitaplar");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OduncAlma.class.getName()).log(Level.SEVERE, null, ex);
        }

        kitap=KitapAraText.getText();
            model.setRowCount(0);   
            for(int i=0;i<list.size();i+=8){ 
            if(kitap.equalsIgnoreCase((String) list.get(i))){
                String d1=(String) list.get(i);
                String d2=(String) list.get(i+1);
                String d3=(String) list.get(i+2);
                String d4=(String) list.get(i+3);
                String d5=(String) list.get(i+7);
                Object[] row = {d1,d2,d3,d4,d5};
                model.addRow(row);                
            }   
            } 
        KitapAraText.setText(null);        
        
    }//GEN-LAST:event_AraButonuMouseClicked

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked

    private void OduncAlButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OduncAlButonuMouseClicked
        KitapBilgileri obj = null;
        try {
            obj = new KitapBilgileri();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OduncAlma.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        Uye obj2 =new Uye();
        Kullanici_Girisi obj3 = new Kullanici_Girisi();
         
        try {
            obj2.kitapAlma(obj3.id, kitap);
        } catch (IOException ex) {
            Logger.getLogger(OduncAlma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_OduncAlButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AraButonu;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JTextField KitapAraText;
    private javax.swing.JTable KitapBilgiTable;
    private javax.swing.JButton OduncAlButonu;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
