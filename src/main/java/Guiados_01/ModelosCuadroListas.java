
package Guiados_01;

import javax.swing.DefaultListModel;

/*
EJEMPLO 5 | Modelos de cuadro de listas..
*/

public class ModelosCuadroListas extends javax.swing.JFrame {

    public ModelosCuadroListas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        btnCurso1 = new javax.swing.JButton();
        btnCurso2 = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        etiResultado.setForeground(new java.awt.Color(0, 0, 0));
        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jScrollPane1.setBackground(new java.awt.Color(225, 225, 225));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        lstNombres.setBackground(new java.awt.Color(225, 225, 225));
        lstNombres.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        lstNombres.setForeground(new java.awt.Color(0, 0, 0));
        lstNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNombres);

        btnCurso1.setBackground(new java.awt.Color(0, 0, 0));
        btnCurso1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCurso1.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso1.setText("CURSO 1");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnCurso2.setBackground(new java.awt.Color(0, 0, 0));
        btnCurso2.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnCurso2.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso2.setText("CURSO 2");
        btnCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso2ActionPerformed(evt);
            }
        });

        btnVaciar.setBackground(new java.awt.Color(255, 0, 0));
        btnVaciar.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciar.setText("VACIAR");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCurso1)
                            .addComponent(btnCurso2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVaciar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
    DefaultListModel modelo = new DefaultListModel();
    modelo.addElement("");
    modelo.addElement("");
    modelo.addElement("");
    lstNombres.setModel(modelo);
    }//GEN-LAST:event_btnVaciarActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelosCuadroListas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnCurso2;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    // End of variables declaration//GEN-END:variables
}
