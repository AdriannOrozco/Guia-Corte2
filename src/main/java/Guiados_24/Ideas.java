package Guiados_24;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Ideas extends javax.swing.JFrame {

    JLabel etiTexto;

    public Ideas() {
        initComponents();
        CreacionVentana();
    }

    public void CreacionVentana() {
        etiTexto = new JLabel();
        etiTexto.setBounds(50, 50, 300, 250);
        etiTexto.setText("");
        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE);
        this.getContentPane().add(etiTexto);

        etiTexto.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                etiTextoMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                etiTextoMouseExited(evt);
            }

            public void mousePressed(MouseEvent evt) {
                etiTextoMousePressed(evt);
            }

            public void mouseClicked(MouseEvent evt) {
                etiTextoMouseClicked(evt);
            }
        });

        txtDato.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent evt) {
                txtDatoKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                txtDatoKeyReleased(evt);
            }

            public void keyTyped(KeyEvent evt) {
                txtDatoKeyTyped(evt);
            }

        });

    }

    public void etiTextoMouseEntered(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de entrar a la etiqueta.");
    }

    public void etiTextoMouseExited(MouseEvent evt) {
        etiTexto.setText("El ratón acaba de salir de la etiqueta.");
    }

    public void etiTextoMousePressed(MouseEvent evt) {
        if (evt.getButton() == MouseEvent.BUTTON1) {
            etiTexto.setText("Se acaba de pulsar el botón izquierdo");
        } else if (evt.getButton() == MouseEvent.BUTTON2) {
            etiTexto.setText("Se acaba de pulsar el botón central");
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            etiTexto.setText("Se acaba de pulsar el botón derecho");
        }
    }

    public void etiTextoMouseClicked(MouseEvent evt) {
        txtSeñal.setText("El mouse fue clickeado");
    }

    public void txtDatoKeyPressed(KeyEvent evt) {
        etiTexto.setText("Tecla presionada: " + evt.getKeyChar());
    }

    public void txtDatoKeyReleased(KeyEvent evt) {
        etiTexto.setText("Tecla liberada: " + evt.getKeyChar());
    }

    public void txtDatoKeyTyped(KeyEvent evt) {
        etiTexto.setText("Tecla tipeada: " + evt.getKeyChar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSeñal = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSeñal.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        txtSeñal.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSeñal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeñal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ideas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ideas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ideas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ideas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ideas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtDato;
    private javax.swing.JLabel txtSeñal;
    // End of variables declaration//GEN-END:variables
}
