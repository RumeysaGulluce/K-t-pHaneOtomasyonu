
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class uzerimdekiler extends javax.swing.JFrame {

    public uzerimdekiler() throws FileNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        Yonetici obj = new Yonetici(); 
        ArrayList arr=new ArrayList<>();
        obj.dosya_okuma(arr, "kisiler");
        
        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object ID=arr.get(i);
            ydizi.add(ID);
        }
        
        ArrayList ydizi2=new ArrayList<>();
        for(int i=1;i<11;i++){
            Object ID=String.valueOf(i);
            ydizi2.add(ID);
        }
        
        ydizi.removeAll(ydizi2);

        int index=0;
        for(int i=0;i<41;i+=4){ 
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }
        Kullanici_Girisi obj3 = new Kullanici_Girisi();
        DefaultTableModel model = (DefaultTableModel)KitapBilgiTable.getModel();
        Object[] row = new Object[1];
        Object[] row2 = new Object[1];
        Object[] row3 = new Object[1];
        
        for(int i=index;i<arr.size();i=i+9){
             
            if(arr.get(i).equals(obj3.id)){
                row[0]=(String) arr.get(i+6);
                row2[0]=(String) arr.get(i+7);
                row3[0]=(String) arr.get(i+8);
                
                model.addRow(row);
                model.addRow(row2);
                model.addRow(row3);    
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        KitapBilgiTable = new javax.swing.JTable();
        IptalButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 250));
        setUndecorated(true);
        setResizable(false);

        KitapBilgiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Üzerimdekiler"
            }
        ));
        jScrollPane1.setViewportView(KitapBilgiTable);

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
                .addGap(482, 482, 482)
                .addComponent(IptalButonu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IptalButonu)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IptalButonu;
    private javax.swing.JTable KitapBilgiTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
