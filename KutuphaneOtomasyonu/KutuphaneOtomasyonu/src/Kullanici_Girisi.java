import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kullanici_Girisi extends javax.swing.JFrame {
    public static String id; 
    public Kullanici_Girisi() {
        initComponents();
        this.setLocationRelativeTo(null);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kul_AdiLabel = new javax.swing.JLabel();
        KulAdiText = new javax.swing.JTextField();
        SifreLabel = new javax.swing.JLabel();
        SifreText = new javax.swing.JPasswordField();
        oturumacmabutonu = new javax.swing.JButton();
        iptalbutonu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Kul_AdiLabel.setText("Kullanıcı Adı");

        SifreLabel.setText("Şifre");

        oturumacmabutonu.setBackground(javax.swing.UIManager.getDefaults().getColor("List.selectionBackground"));
        oturumacmabutonu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        oturumacmabutonu.setText("Oturum Aç");
        oturumacmabutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oturumacmabutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oturumacmabutonuActionPerformed(evt);
            }
        });

        iptalbutonu.setBackground(javax.swing.UIManager.getDefaults().getColor("close_button_highlight"));
        iptalbutonu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        iptalbutonu.setText("İptal");
        iptalbutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iptalbutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptalbutonuMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-user-96.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SifreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kul_AdiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SifreText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(KulAdiText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iptalbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oturumacmabutonu)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Kul_AdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(KulAdiText)))
                        .addGap(18, 18, 18)
                        .addComponent(SifreText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oturumacmabutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iptalbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptalbutonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptalbutonuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_iptalbutonuMouseClicked
    
    private void oturumacmabutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oturumacmabutonuActionPerformed
        Yonetici obj = new Yonetici();
        ArrayList list = new ArrayList();
        
        try {
            obj.dosya_okuma(list, "kisiler");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kullanici_Girisi.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
        String user=KulAdiText.getText();   
        String pass= SifreText.getText();
        int sayac=0;
        for(int i=index;i<list.size();i+=9){
           if(user.equalsIgnoreCase((String) list.get(i)) && pass.equalsIgnoreCase((String)list.get(i+3)) && Integer.parseInt(user)>10 &&list.indexOf(user)!=-1){
                    new Kullanici_Ekrani().setVisible(true);
                    setVisible(false);
                    sayac=1;
                    break;
                }
        }
        if(sayac==0){
             JOptionPane.showMessageDialog(rootPane, "Kullanıcı Adı ya da Şifre Hatalı","Uyarı",0);
        }
        id=KulAdiText.getText();
        
    }//GEN-LAST:event_oturumacmabutonuActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField KulAdiText;
    private javax.swing.JLabel Kul_AdiLabel;
    private javax.swing.JLabel SifreLabel;
    private javax.swing.JPasswordField SifreText;
    private javax.swing.JButton iptalbutonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton oturumacmabutonu;
    // End of variables declaration//GEN-END:variables
}
