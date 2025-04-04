package Guiados_31;

import Guiados_33_Reutilizacion.elementosventana.BotonContador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ventanaprincipal extends javax.swing.JFrame {

    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;

    public ventanaprincipal() {
        initComponents();
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setTitle("Ejercicio de Herencia");
        this.setSize(250, 300);

        btnBotonA = new BotonContador();
        btnBotonA.setText("Botón A");
        btnBotonA.setBounds(10, 10, 100, 30);
        this.getContentPane().add(btnBotonA);

        btnBotonB = new BotonContador();
        btnBotonB.setText("Botón B");
        btnBotonB.setBounds(130, 10, 100, 30);
        this.getContentPane().add(btnBotonB);
        
        btnBotonC = new BotonContador();
        btnBotonC.setText("Botón C");
        btnBotonC.setBounds(70, 50, 100, 30);
        this.getContentPane().add(btnBotonC);

        btnBotonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonA(evt);
            }
        });

        btnBotonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonB(evt);
            }
        });
        
        btnBotonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonC(evt);
            }
        });
    }
    
    public void PulsacionBotonA(ActionEvent evt){
        btnBotonA.incrementa();
    }
    
    public void PulsacionBotonB(ActionEvent evt){
        btnBotonB.incrementa();
    }
    
     public void PulsacionBotonC(ActionEvent evt){
        btnBotonC.incrementa();
        btnBotonC.incrementa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReiniciar = new javax.swing.JButton();
        btnVerPulsaciones1 = new javax.swing.JButton();
        txtIniciar = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReiniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnReiniciar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnVerPulsaciones1.setBackground(new java.awt.Color(0, 0, 0));
        btnVerPulsaciones1.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        btnVerPulsaciones1.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPulsaciones1.setText("VER PULSACIONES");
        btnVerPulsaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsaciones1ActionPerformed(evt);
            }
        });

        txtIniciar.setBackground(new java.awt.Color(204, 204, 204));
        txtIniciar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtIniciar.setForeground(new java.awt.Color(0, 0, 0));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnVerPulsaciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(btnVerPulsaciones1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPulsaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsaciones1ActionPerformed
     String info;
    
    info = "El botón A se ha pulsado "+btnBotonA.getPulsaciones()+" veces\n";
    info = info + "El botón B se ha pulsado "+btnBotonB.getPulsaciones()+" veces\n";
    info = info + "El botón C se ha pulsado "+btnBotonC.getPulsaciones()+" veces\n";
    JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnVerPulsaciones1ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       btnBotonA.reiniciar();
       btnBotonB.reiniciar();
       btnBotonC.reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    int puls; String info = "Pulsaciones inicializadas";
    puls = Integer.parseInt(txtIniciar.getText());
    btnBotonA.setPulsaciones(puls);
    btnBotonB.setPulsaciones(puls);
    btnBotonC.setPulsaciones(puls);
    JOptionPane.showMessageDialog(null,info);
    }//GEN-LAST:event_btnIniciarActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones1;
    private javax.swing.JTextField txtIniciar;
    // End of variables declaration//GEN-END:variables
}
