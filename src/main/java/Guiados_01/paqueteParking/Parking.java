package Guiados_01.paqueteParking;

/*
EJEMPLO 17 | Paneles de desplazamiento 2.
 */
public class Parking extends javax.swing.JFrame {

    int coches;

    public Parking() {
        initComponents();
        coches = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEntro = new javax.swing.JButton();
        btnSalio = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiCoches = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnEntro.setBackground(new java.awt.Color(0, 0, 0));
        btnEntro.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        btnEntro.setForeground(new java.awt.Color(255, 255, 255));
        btnEntro.setText("Entró un coche");
        btnEntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntroActionPerformed(evt);
            }
        });

        btnSalio.setBackground(new java.awt.Color(0, 0, 0));
        btnSalio.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        btnSalio.setForeground(new java.awt.Color(255, 255, 255));
        btnSalio.setText("Salió un coche");
        btnSalio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalioActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COCHES EN EL PARKING");

        etiCoches.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiCoches.setForeground(new java.awt.Color(0, 0, 0));
        etiCoches.setText("0");
        etiCoches.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEntro)
                    .addComponent(btnSalio)
                    .addComponent(btnReiniciar))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnEntro)
                .addGap(18, 18, 18)
                .addComponent(btnSalio)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiCoches))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntroActionPerformed
        coches = coches + 1;
        etiCoches.setText("" + coches);

    }//GEN-LAST:event_btnEntroActionPerformed

    private void btnSalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalioActionPerformed
        if (coches > 0) {
            coches = coches - 1;
            etiCoches.setText("" + coches);
        }

    }//GEN-LAST:event_btnSalioActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        coches = 0;
        etiCoches.setText("0");

    }//GEN-LAST:event_btnReiniciarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntro;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalio;
    private javax.swing.JLabel etiCoches;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
