
package Guiados_07;
public class ToggleButtons extends javax.swing.JFrame {

    public ToggleButtons() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        tbtnFormacion = new javax.swing.JToggleButton();
        etiPrecioInstalacion = new javax.swing.JLabel();
        tbtnInstalacion = new javax.swing.JToggleButton();
        txtPrecioBase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        etiTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        tbtnAlimentacionBD.setBackground(new java.awt.Color(0, 255, 0));
        tbtnAlimentacionBD.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        tbtnAlimentacionBD.setForeground(new java.awt.Color(0, 0, 0));
        tbtnAlimentacionBD.setText("ALIMENTACIÓN");

        etiPrecioAlimentacionBD.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        etiPrecioAlimentacionBD.setForeground(new java.awt.Color(0, 0, 0));
        etiPrecioAlimentacionBD.setText("200");

        etiPrecioFormacion.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        etiPrecioFormacion.setForeground(new java.awt.Color(0, 0, 0));
        etiPrecioFormacion.setText("200");

        tbtnFormacion.setBackground(new java.awt.Color(255, 255, 0));
        tbtnFormacion.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        tbtnFormacion.setForeground(new java.awt.Color(0, 0, 0));
        tbtnFormacion.setText("FORMACIÓN");

        etiPrecioInstalacion.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        etiPrecioInstalacion.setForeground(new java.awt.Color(0, 0, 0));
        etiPrecioInstalacion.setText("40");

        tbtnInstalacion.setBackground(new java.awt.Color(0, 0, 255));
        tbtnInstalacion.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        tbtnInstalacion.setForeground(new java.awt.Color(255, 255, 255));
        tbtnInstalacion.setText("INSTALACIÓN");

        txtPrecioBase.setBackground(new java.awt.Color(225, 225, 225));
        txtPrecioBase.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        txtPrecioBase.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRECIO BASE");

        etiTotal.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiTotal.setForeground(new java.awt.Color(0, 0, 0));
        etiTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(tbtnFormacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbtnInstalacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiPrecioInstalacion)
                                .addComponent(etiPrecioFormacion)
                                .addComponent(etiPrecioAlimentacionBD))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(62, 62, 62)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbtnInstalacion)
                        .addComponent(etiPrecioInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbtnFormacion)
                        .addComponent(etiPrecioFormacion))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbtnAlimentacionBD)
                        .addComponent(etiPrecioAlimentacionBD))
                    .addGap(46, 46, 46)
                    .addComponent(btnCalcular)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio_base;
        double precio_instal;
        double precio_for;
        double precio_ali;

        precio_base = Double.parseDouble(txtPrecioBase.getText());
        
        precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
        precio_for = Double.parseDouble(etiPrecioFormacion.getText());
        precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
        
        double precio_total;

        precio_total = precio_base;
        if (tbtnInstalacion.isSelected()) {
            precio_total = precio_total + precio_instal;
        }
        if (tbtnFormacion.isSelected()) {
            precio_total = precio_total + precio_for;
        }
        if (tbtnAlimentacionBD.isSelected()) {
            precio_total = precio_total + precio_ali;
        }
        etiTotal.setText(precio_total+" €");
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToggleButtons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
