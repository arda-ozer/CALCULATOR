
/**
 *
 * @author ardaozer
 */
public class HesapMakinesi extends javax.swing.JFrame {

    /**
     *
     */
    public HesapMakinesi() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b21 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        sonuc = new javax.swing.JTextField();
        sayi1 = new javax.swing.JButton();
        sayi4 = new javax.swing.JButton();
        sayi2 = new javax.swing.JButton();
        sayi5 = new javax.swing.JButton();
        sayi6 = new javax.swing.JButton();
        sayi7 = new javax.swing.JButton();
        sayi8 = new javax.swing.JButton();
        sayi9 = new javax.swing.JButton();
        sayi0 = new javax.swing.JButton();
        sayi3 = new javax.swing.JButton();
        topla = new javax.swing.JButton();
        carp = new javax.swing.JButton();
        ondalikCevir = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        esit = new javax.swing.JButton();
        cikar = new javax.swing.JButton();
        bol = new javax.swing.JButton();
        nokta1 = new javax.swing.JButton();

        b21.setText("-");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Makinesi");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.blue);
        setResizable(false);

        lbl.setBackground(new java.awt.Color(255, 255, 255));
        lbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl.setForeground(new java.awt.Color(0, 0, 0));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        sonuc.setEditable(false);
        sonuc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sonuc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sonuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucActionPerformed(evt);
            }
        });

        sayi1.setBackground(new java.awt.Color(51, 51, 51));
        sayi1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi1.setForeground(new java.awt.Color(255, 255, 255));
        sayi1.setText("1");
        sayi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi1ActionPerformed(evt);
            }
        });

        sayi4.setBackground(new java.awt.Color(51, 51, 51));
        sayi4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi4.setForeground(new java.awt.Color(255, 255, 255));
        sayi4.setText("4");
        sayi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi4ActionPerformed(evt);
            }
        });

        sayi2.setBackground(new java.awt.Color(51, 51, 51));
        sayi2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi2.setForeground(new java.awt.Color(255, 255, 255));
        sayi2.setText("2");
        sayi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi2ActionPerformed(evt);
            }
        });

        sayi5.setBackground(new java.awt.Color(51, 51, 51));
        sayi5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi5.setForeground(new java.awt.Color(255, 255, 255));
        sayi5.setText("5");
        sayi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi5ActionPerformed(evt);
            }
        });

        sayi6.setBackground(new java.awt.Color(51, 51, 51));
        sayi6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi6.setForeground(new java.awt.Color(255, 255, 255));
        sayi6.setText("6");
        sayi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi6ActionPerformed(evt);
            }
        });

        sayi7.setBackground(new java.awt.Color(51, 51, 51));
        sayi7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi7.setForeground(new java.awt.Color(255, 255, 255));
        sayi7.setText("7");
        sayi7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi7ActionPerformed(evt);
            }
        });

        sayi8.setBackground(new java.awt.Color(51, 51, 51));
        sayi8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi8.setForeground(new java.awt.Color(255, 255, 255));
        sayi8.setText("8");
        sayi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi8ActionPerformed(evt);
            }
        });

        sayi9.setBackground(new java.awt.Color(51, 51, 51));
        sayi9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi9.setForeground(new java.awt.Color(255, 255, 255));
        sayi9.setText("9");
        sayi9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi9ActionPerformed(evt);
            }
        });

        sayi0.setBackground(new java.awt.Color(51, 51, 51));
        sayi0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi0.setForeground(new java.awt.Color(255, 255, 255));
        sayi0.setText("0");
        sayi0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi0ActionPerformed(evt);
            }
        });

        sayi3.setBackground(new java.awt.Color(51, 51, 51));
        sayi3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sayi3.setForeground(new java.awt.Color(255, 255, 255));
        sayi3.setText("3");
        sayi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayi3ActionPerformed(evt);
            }
        });

        topla.setBackground(new java.awt.Color(51, 51, 51));
        topla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        topla.setForeground(new java.awt.Color(255, 255, 255));
        topla.setText("+");
        topla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplaActionPerformed(evt);
            }
        });

        carp.setBackground(new java.awt.Color(51, 51, 51));
        carp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carp.setForeground(new java.awt.Color(255, 255, 255));
        carp.setText("X");
        carp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpActionPerformed(evt);
            }
        });

        ondalikCevir.setBackground(new java.awt.Color(51, 51, 51));
        ondalikCevir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ondalikCevir.setForeground(new java.awt.Color(255, 255, 255));
        ondalikCevir.setText("1/X");
        ondalikCevir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ondalikCevirActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        esit.setBackground(new java.awt.Color(51, 51, 51));
        esit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        esit.setForeground(new java.awt.Color(255, 255, 255));
        esit.setText("=");
        esit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esitActionPerformed(evt);
            }
        });

        cikar.setBackground(new java.awt.Color(51, 51, 51));
        cikar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cikar.setForeground(new java.awt.Color(255, 255, 255));
        cikar.setText("-");
        cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarActionPerformed(evt);
            }
        });

        bol.setBackground(new java.awt.Color(51, 51, 51));
        bol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bol.setForeground(new java.awt.Color(255, 255, 255));
        bol.setText("/");
        bol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolActionPerformed(evt);
            }
        });

        nokta1.setBackground(new java.awt.Color(51, 51, 51));
        nokta1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nokta1.setForeground(new java.awt.Color(255, 255, 255));
        nokta1.setText(".");
        nokta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sonuc, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sayi0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sayi7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sayi4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sayi8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sayi9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sayi5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sayi6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sayi3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(esit, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ondalikCevir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nokta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sayi7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sayi5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sayi3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sayi0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nokta1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ondalikCevir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getAccessibleContext().setAccessibleName("HesapMakinesi");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double cevap, sayi;
    private int op;

    public void Hesaplama() {

        switch (op) {
            case 1 -> {

                cevap = sayi + Double.parseDouble(sonuc.getText());
                sonuc.setText(Double.toString(cevap));
            }
            case 2 -> {

                cevap = sayi - Double.parseDouble(sonuc.getText());
                sonuc.setText(Double.toString(cevap));
            }
            case 3 -> {

                cevap = sayi * Double.parseDouble(sonuc.getText());
                sonuc.setText(Double.toString(cevap));
            }
            case 4 -> {

                cevap = sayi / Double.parseDouble(sonuc.getText());
                sonuc.setText(Double.toString(cevap));
            }
        }
    }

    public void setEkran(String deger) {

        sonuc.setText(sonuc.getText() + deger);
    }

    private void sonucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucActionPerformed
        sonuc.setEditable(false);
    }//GEN-LAST:event_sonucActionPerformed

    private void sayi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi1ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi1ActionPerformed

    private void sayi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi4ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi4ActionPerformed

    private void sayi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi2ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi2ActionPerformed

    private void sayi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi5ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi5ActionPerformed

    private void sayi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi6ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi6ActionPerformed

    private void sayi7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi7ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi7ActionPerformed

    private void sayi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi8ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi8ActionPerformed

    private void sayi9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi9ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi9ActionPerformed

    private void sayi0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi0ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi0ActionPerformed

    private void sayi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayi3ActionPerformed
        setEkran(evt.getActionCommand());
    }//GEN-LAST:event_sayi3ActionPerformed

    private void toplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplaActionPerformed
        sayi = Double.parseDouble(sonuc.getText());
        op = 1;
        sonuc.setText("");
        lbl.setText(sayi + " + ");

    }//GEN-LAST:event_toplaActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed

    }//GEN-LAST:event_b21ActionPerformed

    private void carpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpActionPerformed
        sayi = Double.parseDouble(sonuc.getText());
        op = 3;
        sonuc.setText("");
        lbl.setText(sayi + " x ");
    }//GEN-LAST:event_carpActionPerformed

    private void ondalikCevirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ondalikCevirActionPerformed
        double x = Double.parseDouble(sonuc.getText());
        double ondalik = 1 / x;
        sonuc.setText(Double.toString(ondalik));

    }//GEN-LAST:event_ondalikCevirActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        lbl.setText("");
        sonuc.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void esitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esitActionPerformed

        Hesaplama();
    }//GEN-LAST:event_esitActionPerformed

    private void cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarActionPerformed
        sayi = Double.parseDouble(sonuc.getText());
        op = 2;
        sonuc.setText("");
        lbl.setText(sayi + " - ");
    }//GEN-LAST:event_cikarActionPerformed

    private void bolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolActionPerformed
        sayi = Double.parseDouble(sonuc.getText());
        op = 4;
        sonuc.setText("");
        lbl.setText(sayi + " / ");
    }//GEN-LAST:event_bolActionPerformed

    private void nokta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokta1ActionPerformed
        sonuc.setText(sonuc.getText() + ".");
    }//GEN-LAST:event_nokta1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new HesapMakinesi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b21;
    private javax.swing.JButton bol;
    private javax.swing.JButton carp;
    private javax.swing.JButton cikar;
    private javax.swing.JButton clear;
    private javax.swing.JButton esit;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton nokta1;
    private javax.swing.JButton ondalikCevir;
    private javax.swing.JButton sayi0;
    public javax.swing.JButton sayi1;
    private javax.swing.JButton sayi2;
    private javax.swing.JButton sayi3;
    private javax.swing.JButton sayi4;
    private javax.swing.JButton sayi5;
    private javax.swing.JButton sayi6;
    private javax.swing.JButton sayi7;
    private javax.swing.JButton sayi8;
    private javax.swing.JButton sayi9;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton topla;
    // End of variables declaration//GEN-END:variables
}
