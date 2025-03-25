package Guiados_01;

/*
EJEMPLO 1 | JCheckBox
*/
public class JCheckBox extends javax.swing.JFrame {

    public JCheckBox() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonAceptar = new javax.swing.JButton();
        chkPerro = new javax.swing.JCheckBox();
        chkGato = new javax.swing.JCheckBox();
        chkRaton = new javax.swing.JCheckBox();
        etiResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAceptar.setBackground(new java.awt.Color(0, 0, 0));
        buttonAceptar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 18)); // NOI18N
        buttonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAceptar.setText("ACEPTAR");
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        chkPerro.setBackground(new java.awt.Color(225, 225, 225));
        chkPerro.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        chkPerro.setForeground(new java.awt.Color(0, 0, 0));
        chkPerro.setText("PERRO");
        jPanel1.add(chkPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 45, -1, -1));

        chkGato.setBackground(new java.awt.Color(225, 225, 225));
        chkGato.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        chkGato.setForeground(new java.awt.Color(0, 0, 0));
        chkGato.setText("GATO");
        jPanel1.add(chkGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 79, -1, -1));

        chkRaton.setBackground(new java.awt.Color(225, 225, 225));
        chkRaton.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 14)); // NOI18N
        chkRaton.setForeground(new java.awt.Color(0, 0, 0));
        chkRaton.setText("RATÓN");
        jPanel1.add(chkRaton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 113, -1, -1));

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(etiResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 400, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
       String mensaje = "Animales elegidos:";
        if (chkPerro.isSelected()) {
            mensaje = mensaje+"Perro ";
        }
        if (chkGato.isSelected()) {
            mensaje = mensaje+"Gato ";
        }
        if (chkRaton.isSelected()) {
            mensaje = mensaje+"Raton ";
        }
        etiResultado.setText(mensaje);
    }//GEN-LAST:event_buttonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCheckBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCheckBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JCheckBox chkGato;
    private javax.swing.JCheckBox chkPerro;
    private javax.swing.JCheckBox chkRaton;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
