
package Guiados_05;

import javax.swing.DefaultListModel;

public class ModelosDeCuadrosDeLista extends javax.swing.JFrame {

    public ModelosDeCuadrosDeLista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlanco = new javax.swing.JPanel();
        etiResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        btnCurso2 = new javax.swing.JButton();
        btnCurso1 = new javax.swing.JButton();
        btnCurso3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lstNombres.setBackground(new java.awt.Color(225, 225, 225));
        lstNombres.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        lstNombres.setForeground(new java.awt.Color(0, 0, 0));
        lstNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNombres);

        btnCurso2.setBackground(new java.awt.Color(0, 0, 0));
        btnCurso2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCurso2.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso2.setText("CURSO 2");
        btnCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso2ActionPerformed(evt);
            }
        });

        btnCurso1.setBackground(new java.awt.Color(0, 0, 0));
        btnCurso1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCurso1.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso1.setText("CURSO 1");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnCurso3.setBackground(new java.awt.Color(255, 0, 0));
        btnCurso3.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCurso3.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso3.setText("VACIAR LA LISTA");
        btnCurso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCurso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCurso1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(btnCurso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCurso3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCurso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCurso2)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso1ActionPerformed
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("Juan");
    modelo.addElement("María");
    modelo.addElement("Luis");
    lstNombres.setModel(modelo);   

    }//GEN-LAST:event_btnCurso1ActionPerformed

    private void btnCurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso2ActionPerformed
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("Ana");
    modelo.addElement("Marta");
    modelo.addElement("Jose");
    lstNombres.setModel(modelo);  
    }//GEN-LAST:event_btnCurso2ActionPerformed

    private void lstNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNombresMouseClicked
    etiResultado.setText(lstNombres.getSelectedValue().toString());
    }//GEN-LAST:event_lstNombresMouseClicked

    private void btnCurso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso3ActionPerformed
    etiResultado.setText("");
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("");
    modelo.addElement("");
    modelo.addElement("");
    modelo.addElement("");
    lstNombres.setModel(modelo);
    }//GEN-LAST:event_btnCurso3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelosDeCuadrosDeLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnCurso2;
    private javax.swing.JButton btnCurso3;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
