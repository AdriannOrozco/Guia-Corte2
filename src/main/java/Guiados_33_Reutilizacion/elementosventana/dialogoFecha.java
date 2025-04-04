package Guiados_33_Reutilizacion.elementosventana;

public class dialogoFecha extends javax.swing.JDialog {

    int Dia;
    int Mes;
    int Anio;
    int BotonPulsado;

    public dialogoFecha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        slash1 = new javax.swing.JLabel();
        slash2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtDia.setBackground(new java.awt.Color(204, 204, 204));
        txtDia.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtDia.setForeground(new java.awt.Color(0, 0, 0));

        txtMes.setBackground(new java.awt.Color(204, 204, 204));
        txtMes.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtMes.setForeground(new java.awt.Color(0, 0, 0));

        txtAnio.setBackground(new java.awt.Color(204, 204, 204));
        txtAnio.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtAnio.setForeground(new java.awt.Color(0, 0, 0));

        slash1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        slash1.setForeground(new java.awt.Color(0, 0, 0));
        slash1.setText("/");

        slash2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        slash2.setForeground(new java.awt.Color(0, 0, 0));
        slash2.setText("/");

        btnAceptar.setBackground(new java.awt.Color(51, 51, 51));
        btnAceptar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slash1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slash2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slash1)
                    .addComponent(slash2))
                .addGap(40, 40, 40)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(86, Short.MAX_VALUE))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        BotonPulsado = 1;
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        Dia = Integer.parseInt(txtDia.getText());
        Mes = Integer.parseInt(txtMes.getText());
        Anio = Integer.parseInt(txtAnio.getText());

        BotonPulsado = 0;
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    public String getFecha(){
        String cadena;
        cadena = Dia+"/"+Mes+"/"+Anio;
        return cadena;
    }
    public String getFechaCompleta() {
    String cadena;
    cadena = Dia + " de ";
    
    if (Mes==1) {
        cadena = cadena + "Enero";
    } else if (Mes==2) {
        cadena = cadena + "Febrero";
    } else if (Mes==3) {
        cadena = cadena + "Marzo";
    } else if (Mes==4) {
        cadena = cadena + "Abril";
    } else if (Mes==5) {
        cadena = cadena + "Mayo";
    } else if (Mes==6) {
        cadena = cadena + "Junio";
    } else if (Mes==7) {
        cadena = cadena + "Julio";
    } else if (Mes==8) {
        cadena = cadena + "Agosto";
    } else if (Mes==9) {
        cadena = cadena + "Septiembre";
    } else if (Mes==10) {
        cadena = cadena + "Octubre";
    } else if (Mes==11) {
        cadena = cadena + "Noviembre";
    } else if (Mes==12) {
        cadena = cadena + "Diciembre";
    }
    cadena = cadena + " de "+Anio;
    return cadena;
}
    
    
    
    public int getBotonPulsado(){
        return BotonPulsado;
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogoFecha dialog = new dialogoFecha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel slash1;
    private javax.swing.JLabel slash2;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
