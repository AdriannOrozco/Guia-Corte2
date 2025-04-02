
package Guiados_14;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class filechooser1 extends javax.swing.JFrame {

    public filechooser1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        elegirFichero = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        menuAbrir.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuAbrir.setForeground(new java.awt.Color(0, 0, 0));
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAbrir);
        menuArchivo.add(separador);

        menuGuardar.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuGuardar.setForeground(new java.awt.Color(0, 0, 0));
        menuGuardar.setText("Guardar");
        menuArchivo.add(menuGuardar);

        barraMenus.add(menuArchivo);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        int resp;

        resp = elegirFichero.showOpenDialog(this);

        if (resp == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, elegirFichero.getSelectedFile().toString());

        } else if (resp == JFileChooser.CANCEL_OPTION) {

            JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(filechooser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filechooser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filechooser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filechooser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filechooser1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JFileChooser elegirFichero;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
