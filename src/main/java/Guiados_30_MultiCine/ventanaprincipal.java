package Guiados_30_MultiCine;

import javax.swing.JOptionPane;

public class ventanaprincipal extends javax.swing.JFrame {

    SalaCine central;
    SalaCine vo;

    public ventanaprincipal() {
        initComponents();
        setLocationRelativeTo(null);

        central = new SalaCine();
        vo = new SalaCine();

        central.setAforo(500);
        central.setEntrada(8.0);

        vo.setAforo(80);
        vo.setEntrada(600);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBasico = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        etiSalaCentral = new javax.swing.JLabel();
        etiSalaCentral1 = new javax.swing.JLabel();
        etiCentralPelicula = new javax.swing.JLabel();
        btnCentralNueva = new javax.swing.JButton();
        btnCentralCambiar = new javax.swing.JButton();
        btnCentralOcupacion = new javax.swing.JButton();
        btnCentralVaciar = new javax.swing.JButton();
        btnCentralIngresos = new javax.swing.JButton();
        panelVOriginal = new javax.swing.JPanel();
        etiSalaVersionOriginal = new javax.swing.JLabel();
        etiSalaOriginal = new javax.swing.JLabel();
        etiOriginalPelicula = new javax.swing.JLabel();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalCambiar = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngresos = new javax.swing.JButton();
        btnIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBasico.setBackground(new java.awt.Color(255, 255, 255));

        panelCentral.setBackground(new java.awt.Color(51, 51, 51));

        etiSalaCentral.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        etiSalaCentral.setForeground(new java.awt.Color(255, 255, 255));
        etiSalaCentral.setText("SALA CENTRAL");

        etiSalaCentral1.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiSalaCentral1.setForeground(new java.awt.Color(255, 255, 255));
        etiSalaCentral1.setText("Película:");

        etiCentralPelicula.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiCentralPelicula.setForeground(new java.awt.Color(255, 255, 255));
        etiCentralPelicula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnCentralNueva.setBackground(new java.awt.Color(0, 0, 0));
        btnCentralNueva.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCentralNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnCentralNueva.setText("NUEVA VENTA");
        btnCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralNuevaActionPerformed(evt);
            }
        });

        btnCentralCambiar.setBackground(new java.awt.Color(0, 0, 0));
        btnCentralCambiar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCentralCambiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCentralCambiar.setText("CAMBIAR");
        btnCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralCambiarActionPerformed(evt);
            }
        });

        btnCentralOcupacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCentralOcupacion.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCentralOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCentralOcupacion.setText("% OCUPACIÓN");
        btnCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralOcupacionActionPerformed(evt);
            }
        });

        btnCentralVaciar.setBackground(new java.awt.Color(0, 0, 0));
        btnCentralVaciar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCentralVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnCentralVaciar.setText("VACÍAR");
        btnCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralVaciarActionPerformed(evt);
            }
        });

        btnCentralIngresos.setBackground(new java.awt.Color(0, 0, 0));
        btnCentralIngresos.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCentralIngresos.setForeground(new java.awt.Color(255, 255, 255));
        btnCentralIngresos.setText("INGRESOS");
        btnCentralIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(btnCentralNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCentralOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnCentralVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCentralIngresos))
                    .addComponent(etiSalaCentral)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(etiSalaCentral1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(btnCentralCambiar)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCentralCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(etiSalaCentral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiSalaCentral1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentralNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentralOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentralVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentralIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        panelVOriginal.setBackground(new java.awt.Color(51, 51, 51));

        etiSalaVersionOriginal.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        etiSalaVersionOriginal.setForeground(new java.awt.Color(255, 255, 255));
        etiSalaVersionOriginal.setText("SALA VERSIÓN ORIGINAL");

        etiSalaOriginal.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiSalaOriginal.setForeground(new java.awt.Color(255, 255, 255));
        etiSalaOriginal.setText("Película:");

        etiOriginalPelicula.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiOriginalPelicula.setForeground(new java.awt.Color(255, 255, 255));
        etiOriginalPelicula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnOriginalNueva.setBackground(new java.awt.Color(0, 0, 0));
        btnOriginalNueva.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnOriginalNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginalNueva.setText("NUEVA VENTA");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalCambiar.setBackground(new java.awt.Color(0, 0, 0));
        btnOriginalCambiar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnOriginalCambiar.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginalCambiar.setText("CAMBIAR");
        btnOriginalCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalCambiarActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setBackground(new java.awt.Color(0, 0, 0));
        btnOriginalOcupacion.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnOriginalOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginalOcupacion.setText("% OCUPACIÓN");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setBackground(new java.awt.Color(0, 0, 0));
        btnOriginalVaciar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnOriginalVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginalVaciar.setText("VACÍAR");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngresos.setBackground(new java.awt.Color(0, 0, 0));
        btnOriginalIngresos.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnOriginalIngresos.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginalIngresos.setText("INGRESOS");
        btnOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addComponent(btnOriginalNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOriginalOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnOriginalVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOriginalIngresos))
                    .addComponent(etiSalaVersionOriginal)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addComponent(etiSalaOriginal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(btnOriginalCambiar)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOriginalCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addComponent(etiSalaVersionOriginal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiSalaOriginal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOriginalNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOriginalOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOriginalVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOriginalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        btnIngresosTotales.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresosTotales.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnIngresosTotales.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresosTotales.setText("INGRESOS TOTALES");
        btnIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBasicoLayout = new javax.swing.GroupLayout(panelBasico);
        panelBasico.setLayout(panelBasicoLayout);
        panelBasicoLayout.setHorizontalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresosTotales)
                    .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelBasicoLayout.setVerticalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresosTotales)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralCambiarActionPerformed
        String titulo;
        titulo = JOptionPane.showInputDialog(null, "Introduce el titulo de la película: ");
        etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCentralCambiarActionPerformed

    private void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralNuevaActionPerformed
        central.entraUno();
    }//GEN-LAST:event_btnCentralNuevaActionPerformed

    private void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralOcupacionActionPerformed
        String info;

        info = "Sala Central:\n";
        info = info + "Película: " + central.getPelicula() + "\n";
        info = info + "Aforo: " + central.getAforo() + "\n";
        info = info + "Ocupadas: " + central.getOcupadas() + "\n";
        info = info + "Libres: " + central.getLibres() + "\n";
        info = info + "Porcentaje Ocupación: " + central.getPorcentaje() + "\n";

        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralOcupacionActionPerformed

    private void btnCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralVaciarActionPerformed
        central.Vaciar();
        etiCentralPelicula.setText("");

    }//GEN-LAST:event_btnCentralVaciarActionPerformed

    private void btnCentralIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralIngresosActionPerformed
        String info;
        info = "Ingresos de la sala" + central.getIngresos() + " euros";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralIngresosActionPerformed

    private void btnOriginalCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalCambiarActionPerformed
        String titulo;
        titulo = JOptionPane.showInputDialog(null, "Introduce el titulo de la película: ");
        etiOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_btnOriginalCambiarActionPerformed

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
        vo.entraUno();
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
        String info;
        info = "Sala Central:\n";
        info = info + "Película: " + vo.getPelicula() + "\n";
        info = info + "Aforo: " + vo.getAforo() + "\n";
        info = info + "Ocupadas: " + vo.getOcupadas() + "\n";
        info = info + "Libres: " + vo.getLibres() + "\n";
        info = info + "Porcentaje Ocupación: " + vo.getPorcentaje() + "\n";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
        vo.Vaciar();
        etiOriginalPelicula.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    private void btnOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresosActionPerformed
        String info;
        info = "Ingresos de la sala" + central.getIngresos() + " euros";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalIngresosActionPerformed

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
       double sumaIngresos;
       sumaIngresos = vo.getIngresos() + central.getIngresos();
       JOptionPane.showMessageDialog(null, "La suma de los ingresos de ambas salas es: " + sumaIngresos);
       
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralCambiar;
    private javax.swing.JButton btnCentralIngresos;
    private javax.swing.JButton btnCentralNueva;
    private javax.swing.JButton btnCentralOcupacion;
    private javax.swing.JButton btnCentralVaciar;
    private javax.swing.JButton btnIngresosTotales;
    private javax.swing.JButton btnOriginalCambiar;
    private javax.swing.JButton btnOriginalIngresos;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiOriginalPelicula;
    private javax.swing.JLabel etiSalaCentral;
    private javax.swing.JLabel etiSalaCentral1;
    private javax.swing.JLabel etiSalaOriginal;
    private javax.swing.JLabel etiSalaVersionOriginal;
    private javax.swing.JPanel panelBasico;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}
