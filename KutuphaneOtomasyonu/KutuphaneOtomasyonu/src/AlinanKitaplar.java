import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AlinanKitaplar extends javax.swing.JFrame {

    public AlinanKitaplar()  {
        initComponents();
        
        Yonetici obj=new Yonetici();
        ArrayList arraylist=new ArrayList();
        ArrayList arr=new ArrayList();
        try {
            obj.dosya_okuma(arr, "kisiler");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlinanKitaplar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            obj.dosya_okuma(arraylist, "kitaplar");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlinanKitaplar.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList ydizi=new ArrayList<>();
        for(int i=0;i<40;i+=4){
            Object id=arr.get(i);
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
            if(arr.get(i).equals(ydizi.get(0))){
            index=i;
            }
        }  
        for(int i=index;i<arr.size();i=i+9){
            if(!(arr.get(i+6).equals("null"))){
                Object book=arr.get(i+6);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+4)+" "+arr.get(i+5);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] row = {book,kisi};
                model.addRow(row);
            }
            if(!(arr.get(i+7).equals("null"))){
                Object book=arr.get(i+7);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+4)+" "+arr.get(i+5);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] row = {book,kisi};
                model.addRow(row);
            }
            if(!(arr.get(i+8).equals("null"))){
                Object book=arr.get(i+8);
                Object kisi=arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "+arr.get(i+4)+" "+arr.get(i+5);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                Object[] row = {book,kisi};
                model.addRow(row);
            }     
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IptalButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 250));
        setUndecorated(true);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alınan Kitaplar", "Alan Kişi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IptalButonu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IptalButonu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IptalButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IptalButonuMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_IptalButonuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IptalButonu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
