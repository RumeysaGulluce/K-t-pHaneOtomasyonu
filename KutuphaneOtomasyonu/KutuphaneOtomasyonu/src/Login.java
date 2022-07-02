public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisPanel = new javax.swing.JPanel();
        resimLabel = new javax.swing.JLabel();
        yoneticigirisbutonu = new javax.swing.JButton();
        kullanicigirisbutonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        girisPanel.setBackground(new java.awt.Color(0, 102, 153));

        resimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resimLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımages/icons8-books-80.png"))); // NOI18N

        javax.swing.GroupLayout girisPanelLayout = new javax.swing.GroupLayout(girisPanel);
        girisPanel.setLayout(girisPanelLayout);
        girisPanelLayout.setHorizontalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resimLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        girisPanelLayout.setVerticalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addComponent(resimLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        yoneticigirisbutonu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        yoneticigirisbutonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yoneticigirisbutonu.setText("YÖNETİCİ GİRİŞİ");
        yoneticigirisbutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yoneticigirisbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticigirisbutonuActionPerformed(evt);
            }
        });

        kullanicigirisbutonu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        kullanicigirisbutonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kullanicigirisbutonu.setText("KULLANICI GİRİŞİ");
        kullanicigirisbutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kullanicigirisbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicigirisbutonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(yoneticigirisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(kullanicigirisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yoneticigirisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanicigirisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yoneticigirisbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticigirisbutonuActionPerformed
        Yonetici_Girisi obj = new Yonetici_Girisi();
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_yoneticigirisbutonuActionPerformed

    private void kullanicigirisbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicigirisbutonuActionPerformed
        Kullanici_Girisi obj = new Kullanici_Girisi();
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kullanicigirisbutonuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel girisPanel;
    private javax.swing.JButton kullanicigirisbutonu;
    private javax.swing.JLabel resimLabel;
    private javax.swing.JButton yoneticigirisbutonu;
    // End of variables declaration//GEN-END:variables
}
