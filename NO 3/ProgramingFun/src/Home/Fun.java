package Home;

import java.awt.Color;

public class Fun extends javax.swing.JFrame {

    public Fun() {
        initComponents();
        rbBlack.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtFun = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnKiri = new javax.swing.JButton();
        btnKanan = new javax.swing.JButton();
        rbRed = new javax.swing.JRadioButton();
        rbYellow = new javax.swing.JRadioButton();
        rbBlack = new javax.swing.JRadioButton();
        rbOrange = new javax.swing.JRadioButton();
        rbGreen = new javax.swing.JRadioButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFun.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        txtFun.setText("Programming is Fun...");
        txtFun.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtFunAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnKiri.setText("<=");
        btnKiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiriActionPerformed(evt);
            }
        });

        btnKanan.setText("=>");
        btnKanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKananActionPerformed(evt);
            }
        });

        rbRed.setText("Red");
        rbRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRedActionPerformed(evt);
            }
        });

        rbYellow.setText("Yellow");
        rbYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYellowActionPerformed(evt);
            }
        });

        rbBlack.setText("Black");
        rbBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBlackActionPerformed(evt);
            }
        });

        rbOrange.setText("Orange");
        rbOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrangeActionPerformed(evt);
            }
        });

        rbGreen.setText("Green");
        rbGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKiri)
                .addGap(18, 18, 18)
                .addComponent(btnKanan)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtFun))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rbRed)
                        .addGap(18, 18, 18)
                        .addComponent(rbYellow)
                        .addGap(18, 18, 18)
                        .addComponent(rbBlack)
                        .addGap(18, 18, 18)
                        .addComponent(rbOrange)
                        .addGap(18, 18, 18)
                        .addComponent(rbGreen)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbRed)
                    .addComponent(rbYellow)
                    .addComponent(rbBlack)
                    .addComponent(rbOrange)
                    .addComponent(rbGreen))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txtFun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKiri)
                    .addComponent(btnKanan))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFunAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtFunAncestorMoved

    }//GEN-LAST:event_txtFunAncestorMoved

    private void btnKiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiriActionPerformed
        java.awt.Point currentLocation = txtFun.getLocation();
        int x = currentLocation.x - 5; // Geser 5 piksel ke kiri

        // Periksa jika x lebih kecil dari 0 (ujung kiri panel)
        if (x >= 0) {
        txtFun.setLocation(x, currentLocation.y);
        }
    }//GEN-LAST:event_btnKiriActionPerformed

    private void btnKananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKananActionPerformed
        java.awt.Point currentLocation = txtFun.getLocation();
        int x = currentLocation.x + 5; // Geser 5 piksel ke kanan

        // Periksa jika x lebih besar dari lebar panel minus lebar txtFun
        int panelWidth = getContentPane().getWidth();
        int txtFunWidth = txtFun.getWidth();
        if (x <= panelWidth - txtFunWidth) {
        txtFun.setLocation(x, currentLocation.y);
        }
    }//GEN-LAST:event_btnKananActionPerformed

    private void rbRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRedActionPerformed
        // Mengubah warna teks menjadi merah saat kotak centang "rbRed" dipilih
        Color textColor = Color.RED;
        txtFun.setForeground(textColor);
        
        // Menonaktifkan radio button yang lain
        rbYellow.setSelected(false);
        rbBlack.setSelected(false);
        rbOrange.setSelected(false);
        rbGreen.setSelected(false);
    }//GEN-LAST:event_rbRedActionPerformed

    private void rbYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYellowActionPerformed
        // Mengubah warna teks menjadi kuning saat kotak centang "rbYellow" dipilih
        Color textColor = Color.YELLOW;
        txtFun.setForeground(textColor);
        
        // Menonaktifkan radio button yang lain
        rbRed.setSelected(false);
        rbBlack.setSelected(false);
        rbOrange.setSelected(false);
        rbGreen.setSelected(false);
    }//GEN-LAST:event_rbYellowActionPerformed

    private void rbBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBlackActionPerformed
        Color textColor = Color.BLACK;
        txtFun.setForeground(textColor);
        
        // Menonaktifkan radio button yang lain
        rbRed.setSelected(false);
        rbYellow.setSelected(false);
        rbOrange.setSelected(false);
        rbGreen.setSelected(false);
    }//GEN-LAST:event_rbBlackActionPerformed

    private void rbOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrangeActionPerformed
        Color textColor = Color.ORANGE;
        txtFun.setForeground(textColor);
        
        // Menonaktifkan radio button yang lain
        rbRed.setSelected(false);
        rbYellow.setSelected(false);
        rbBlack.setSelected(false);
        rbGreen.setSelected(false);
    }//GEN-LAST:event_rbOrangeActionPerformed

    private void rbGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGreenActionPerformed
        Color textColor = Color.GREEN;
        txtFun.setForeground(textColor);
        
        // Menonaktifkan radio button yang lain
        rbRed.setSelected(false);
        rbYellow.setSelected(false);
        rbOrange.setSelected(false);
        rbBlack.setSelected(false);
    }//GEN-LAST:event_rbGreenActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKanan;
    private javax.swing.JButton btnKiri;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbBlack;
    private javax.swing.JRadioButton rbGreen;
    private javax.swing.JRadioButton rbOrange;
    private javax.swing.JRadioButton rbRed;
    private javax.swing.JRadioButton rbYellow;
    private javax.swing.JLabel txtFun;
    // End of variables declaration//GEN-END:variables
}
