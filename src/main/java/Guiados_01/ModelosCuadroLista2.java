package Guiados_01;

import javax.swing.DefaultComboBoxModel;

/*
EJEMPLO 6 | Modelos de cuadro de listas 2.
*/

public class ModelosCuadroLista2 extends javax.swing.JFrame {

    public ModelosCuadroLista2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboNumeros = new javax.swing.JComboBox<>();
        btnPares = new javax.swing.JButton();
        btnImpares = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cboNumeros.setBackground(new java.awt.Color(225, 225, 225));
        cboNumeros.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        cboNumeros.setForeground(new java.awt.Color(0, 0, 0));
        cboNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumerosActionPerformed(evt);
            }
        });

        btnPares.setBackground(new java.awt.Color(0, 0, 0));
        btnPares.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnPares.setForeground(new java.awt.Color(255, 255, 255));
        btnPares.setText("PARES");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnImpares.setBackground(new java.awt.Color(0, 0, 0));
        btnImpares.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnImpares.setForeground(new java.awt.Color(255, 255, 255));
        btnImpares.setText("IMPARES");
        btnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImparesActionPerformed(evt);
            }
        });

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        btnVaciar.setBackground(new java.awt.Color(255, 0, 0));
        btnVaciar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciar.setText("VACIAR COMBO BOX");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboNumeros, 0, 155, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPares, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImpares))
                    .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPares)
                    .addComponent(btnImpares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVaciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
     int i;  
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();      
    for (i=0;i<10;i+=2) {
    modelo.addElement("Número "+i);
}      
    cboNumeros.setModel(modelo);

    }//GEN-LAST:event_btnParesActionPerformed

    private void btnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImparesActionPerformed
    int i;
    DefaultComboBoxModel modelo = new DefaultComboBoxModel();       
    for (i=1;i<10;i+=2) {
   modelo.addElement("Número "+i);
    }   
    cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnImparesActionPerformed

    private void cboNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumerosActionPerformed
      etiResultado.setText(cboNumeros.getSelectedItem().toString());
    }//GEN-LAST:event_cboNumerosActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
     DefaultComboBoxModel modelo = new DefaultComboBoxModel();
     
     modelo.addElement("");
     cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnVaciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelosCuadroLista2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpares;
    private javax.swing.JButton btnPares;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JComboBox<String> cboNumeros;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
