import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KitapArama extends javax.swing.JFrame {

    public KitapArama() {
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
        ComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 220));
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
                "Barkod No", "Adı", "Yazar", "Tür", "Yayın Yılı", "Dil", "Sayfa Sayısı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        KitapBilgiTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(KitapBilgiTable);

        IptalButonu.setText("İptal");
        IptalButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IptalButonuMouseClicked(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barkod Numarasına göre", "Kitap İsmine göre", "Yazara göre", "Türe göre", "Yıla göre", "Dile göre", "Sayfa Sayısına göre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(KitapAraText, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IptalButonu)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KitapAraText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IptalButonu)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked

    private void AraButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AraButonuMouseClicked
        Yonetici obj = new Yonetici();
        ArrayList list = new ArrayList();
        DefaultTableModel model = (DefaultTableModel)KitapBilgiTable.getModel();
        
        try {
            obj.dosya_okuma(list, "kitaplar");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KitapArama.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object[] row= new Object[7];
        String girdi=KitapAraText.getText();
        if (ComboBox.getSelectedIndex() == 0){
           model.setRowCount(0);
            for(int i=0;i<list.size();i+=8){     
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i);
                row[1]=(String) list.get(i+1);
                row[2]=(String) list.get(i+2);
                row[3]=(String) list.get(i+3);
                row[4]=(String) list.get(i+4);
                row[5]=(String) list.get(i+5);
                row[6]=(String) list.get(i+6);
                
                model.addRow(row);
                model.getRowCount();
            }   
            } 
        KitapAraText.setText(null);
        
        }
        
        else if (ComboBox.getSelectedIndex() == 1){
            model.setRowCount(0);
            for(int i=1;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                model.fireTableDataChanged();
                row[0]=(String) list.get(i-1);
                row[1]=(String) list.get(i);
                row[2]=(String) list.get(i+1);
                row[3]=(String) list.get(i+2);
                row[4]=(String) list.get(i+3);
                row[5]=(String) list.get(i+4);
                row[6]=(String) list.get(i+5);
                
                model.addRow(row);
                model.getRowCount();
            }    
            }
        KitapAraText.setText(null);
        
        }
        
        else if (ComboBox.getSelectedIndex() == 2){
            model.setRowCount(0);
            for(int i=2;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i-2);
                row[1]=(String) list.get(i-1);
                row[2]=(String) list.get(i);
                row[3]=(String) list.get(i+1);
                row[4]=(String) list.get(i+2);
                row[5]=(String) list.get(i+3);
                row[6]=(String) list.get(i+4);
                
                model.addRow(row);
                model.getRowCount();
            }    
            } 
            KitapAraText.setText(null);
            
        }
        else if (ComboBox.getSelectedIndex() == 3){
            model.setRowCount(0);
            for(int i=3;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i-3);
                row[1]=(String) list.get(i-2);
                row[2]=(String) list.get(i-1);
                row[3]=(String) list.get(i);
                row[4]=(String) list.get(i+1);
                row[5]=(String) list.get(i+2);
                row[6]=(String) list.get(i+3);
                
                model.addRow(row);
                model.getRowCount();
            }    
            } 
            KitapAraText.setText(null);
            
        }
        else if (ComboBox.getSelectedIndex() == 4){
            model.setRowCount(0);
            for(int i=4;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i-4);
                row[1]=(String) list.get(i-3);
                row[2]=(String) list.get(i-2);
                row[3]=(String) list.get(i-1);
                row[4]=(String) list.get(i);
                row[5]=(String) list.get(i+1);
                row[6]=(String) list.get(i+2);
                
                model.addRow(row);
                model.getRowCount();
            }    
            } 
            KitapAraText.setText(null);
        }
        else if (ComboBox.getSelectedIndex() == 5){
            model.setRowCount(0);
            for(int i=5;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i-5);
                row[1]=(String) list.get(i-4);
                row[2]=(String) list.get(i-3);
                row[3]=(String) list.get(i-2);
                row[4]=(String) list.get(i-1);
                row[5]=(String) list.get(i);
                row[6]=(String) list.get(i+1);
                
                model.addRow(row);
                model.getRowCount();
            }    
            }
            KitapAraText.setText(null);
        }
        else if (ComboBox.getSelectedIndex() == 6){
            model.setRowCount(0);
            for(int i=6;i<list.size();i+=8){ 
            if(girdi.equalsIgnoreCase((String) list.get(i))){
                row[0]=(String) list.get(i-6);
                row[1]=(String) list.get(i-5);
                row[2]=(String) list.get(i-4);
                row[3]=(String) list.get(i-3);
                row[4]=(String) list.get(i-2);
                row[5]=(String) list.get(i-1);
                row[6]=(String) list.get(i);
                
                model.addRow(row);
                model.getRowCount();
            }    
            }
        KitapAraText.setText(null);   
        }
         if(model.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Kitap Bulunamadı.","Uyarı",0);
                }
        
    }//GEN-LAST:event_AraButonuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AraButonu;
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JButton IptalButonu;
    private javax.swing.JTextField KitapAraText;
    private javax.swing.JTable KitapBilgiTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
