
package Guiados_01.ProyectoCalculos;

/*
EJEMPLO 18 | Código Centralizado.
 */
public class VentanaCalculos extends javax.swing.JFrame {

    public VentanaCalculos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    void Sumar(){
        String cad1, cad2;
        int a,b,s;
        
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        s=a+b;
        etiResultado.setText(""+s);
    }
    
    void Restar(){
         String cad1, cad2;
        int a,b,r;
        
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        r=a-b;
        etiResultado.setText(""+r);
    }
    
    void Borrar(){
        txtNumero1.setText("");
        txtNumero2.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiNumeroUno = new javax.swing.JLabel();
        etiNumeroDos = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNumero2 = new javax.swing.JTextField();
        etiResultado = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        menuCalcular = new javax.swing.JMenu();
        menuSumar = new javax.swing.JMenuItem();
        menuRestar = new javax.swing.JMenuItem();
        menuBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiNumeroUno.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiNumeroUno.setForeground(new java.awt.Color(0, 0, 0));
        etiNumeroUno.setText("Número 1:");

        etiNumeroDos.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        etiNumeroDos.setForeground(new java.awt.Color(0, 0, 0));
        etiNumeroDos.setText("Numero 2:");

        txtNumero1.setBackground(new java.awt.Color(225, 225, 225));
        txtNumero1.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtNumero1.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero1.setText("0");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        txtNumero2.setBackground(new java.awt.Color(225, 225, 225));
        txtNumero2.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtNumero2.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero2.setText("0");
        txtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero2ActionPerformed(evt);
            }
        });

        etiResultado.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSumar.setBackground(new java.awt.Color(225, 225, 225));
        btnSumar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(0, 0, 0));
        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(225, 225, 225));
        btnRestar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(0, 0, 0));
        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(225, 225, 225));
        btnBorrar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 13)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(etiNumeroUno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(etiNumeroDos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumero2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiNumeroUno)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiNumeroDos)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSumar)
                .addGap(18, 18, 18)
                .addComponent(btnRestar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBarra.setBackground(new java.awt.Color(225, 225, 225));
        menuBarra.setForeground(new java.awt.Color(0, 0, 0));

        menuCalcular.setText("Calcular");

        menuSumar.setBackground(new java.awt.Color(225, 225, 225));
        menuSumar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        menuSumar.setForeground(new java.awt.Color(0, 0, 0));
        menuSumar.setText("Sumar");
        menuSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSumarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuSumar);

        menuRestar.setBackground(new java.awt.Color(225, 225, 225));
        menuRestar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        menuRestar.setForeground(new java.awt.Color(0, 0, 0));
        menuRestar.setText("Restar");
        menuRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuRestar);

        menuBorrar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        menuBorrar.setForeground(new java.awt.Color(0, 0, 0));
        menuBorrar.setText("Borrar");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuBorrar);

        menuBarra.add(menuCalcular);

        setJMenuBar(menuBarra);

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

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        Sumar();
    }//GEN-LAST:event_btnSumarActionPerformed

    private void menuSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSumarActionPerformed
       Sumar();
    }//GEN-LAST:event_menuSumarActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        Sumar();
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void txtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero2ActionPerformed
      Sumar();
    }//GEN-LAST:event_txtNumero2ActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
     Restar();
    }//GEN-LAST:event_btnRestarActionPerformed

    private void menuRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestarActionPerformed
      Restar();
    }//GEN-LAST:event_menuRestarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
     Borrar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
    Borrar();
    }//GEN-LAST:event_menuBorrarActionPerformed

 
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
            java.util.logging.Logger.getLogger(VentanaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel etiNumeroDos;
    private javax.swing.JLabel etiNumeroUno;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenu menuCalcular;
    private javax.swing.JMenuItem menuRestar;
    private javax.swing.JMenuItem menuSumar;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
