
package Guiados_02;

public class BotonesDeOpcion extends javax.swing.JFrame {

    public BotonesDeOpcion() {
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
        jPanel2 = new javax.swing.JPanel();
        optRojo = new javax.swing.JRadioButton();
        optVerde = new javax.swing.JRadioButton();
        optAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono ExtraBold", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optRojo)
                    .addComponent(optVerde)
                    .addComponent(optAzul))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optAzul)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     String mensaje = "El color elegido es: ";
        
        if (optRojo.isSelected()) {
            mensaje = mensaje + "Rojo";
        } else if (optVerde.isSelected()) {
            mensaje= mensaje + "Verde";
        } else if (optAzul.isSelected()) {
            mensaje = mensaje + "Azul";
        }  
        etiResultado.setText(mensaje);
     

    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BotonesDeOpcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.ButtonGroup grupoColores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton optAzul;
    private javax.swing.JRadioButton optRojo;
    private javax.swing.JRadioButton optVerde;
    // End of variables declaration//GEN-END:variables
}
