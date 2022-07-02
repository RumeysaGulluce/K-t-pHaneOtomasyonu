import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KullaniciArama extends javax.swing.JFrame {

    public KullaniciArama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KulAraText = new javax.swing.JTextField();
        AraButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KullaniciBilgiTable = new javax.swing.JTable();
        IptalButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 220));
        setUndecorated(true);
        setResizable(false);

        AraButonu.setText("Ara");
        AraButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AraButonuMouseClicked(evt);
            }
        });

        KullaniciBilgiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Adı", "Soyadı", "Bölüm", "Sınıf"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(KullaniciBilgiTable);

        IptalButonu.setText("İptal");
        IptalButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IptalButonuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IptalButonu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(KulAraText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KulAraText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(IptalButonu)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AraButonuMouseClicked
        Yonetici obj = new Yonetici();
        ArrayList list = new ArrayList();
        DefaultTableModel model = (DefaultTableModel)KullaniciBilgiTable.getModel();
        
        try {
            obj.dosya_okuma(list, "kisiler");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KullaniciArama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String girdi=KulAraText.getText();
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<41;i+=4){
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
         Object[] row= new Object[5];
         model.setRowCount(0);
            for(int i=index+1;i<list.size();i+=9){  
                if(girdi.equalsIgnoreCase((String) list.get(i)+" "+ (String)list.get(i+1))){
                    row[0]=(String) list.get(i-1);
                    row[1]=(String) list.get(i);
                    row[2]=(String) list.get(i+1);
                    row[3]=(String) list.get(i+3);
                    row[4]=(String) list.get(i+4);
                    model.addRow(row);
                    model.getRowCount();
                }       
            }
            if(model.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Kullanıcı Bulunamadı.","Uyarı",0);
            }
            KulAraText.setText(null);
    }//GEN-LAST:event_AraButonuMouseClicked

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AraButonu;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JTextField KulAraText;
    private javax.swing.JTable KullaniciBilgiTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
