package Guiados_01;
public class JRadioButton extends javax.swing.JFrame {
    
/*
EJEMPLO 2 | JRadioButton
*/
    
    public JRadioButton() {
        initComponents();
        setLocationRelativeTo(null);
        optRojo.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoColores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();
        jPanelColores = new javax.swing.JPanel();
        optRojo = new javax.swing.JRadioButton();
        optVerde = new javax.swing.JRadioButton();
        optAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(etiResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 30));

        jPanelColores.setBackground(new java.awt.Color(225, 225, 225));
        jPanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 0, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        optRojo.setBackground(new java.awt.Color(225, 225, 225));
        grupoColores.add(optRojo);
        optRojo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        optRojo.setForeground(new java.awt.Color(0, 0, 0));
        optRojo.setText("Rojo");

        grupoColores.add(optVerde);
        optVerde.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        optVerde.setForeground(new java.awt.Color(0, 0, 0));
        optVerde.setText("Verde");

        grupoColores.add(optAzul);
        optAzul.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        optAzul.setForeground(new java.awt.Color(0, 0, 0));
        optAzul.setText("Azul");

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optRojo)
                    .addComponent(optVerde)
                    .addComponent(optAzul))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optAzul)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
      String mensaje = "Color seleccionado: ";
      
        if (optRojo.isSelected()) {
          mensaje = mensaje + "Rojo" ;  
        }
        if (optVerde.isSelected()) {
          mensaje = mensaje + "Verde ";
        }
        if (optAzul.isSelected()) {
          mensaje = mensaje + "Azul ";
        }
        etiResultado.setText(mensaje);
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.ButtonGroup grupoColores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JRadioButton optAzul;
    private javax.swing.JRadioButton optRojo;
    private javax.swing.JRadioButton optVerde;
    // End of variables declaration//GEN-END:variables
}
