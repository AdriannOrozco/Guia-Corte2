package Guiados_01;

public class MenusEmergentes extends javax.swing.JFrame {

/*
EJEMPLO 13 | Barra de Menus.
*/
    public MenusEmergentes() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        menuRojo = new javax.swing.JMenuItem();
        menuVerde = new javax.swing.JMenuItem();
        menuAzul = new javax.swing.JMenuItem();

        menuRojo.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuRojo.setForeground(new java.awt.Color(0, 0, 0));
        menuRojo.setText("Rojo");
        menuEmergente.add(menuRojo);

        menuVerde.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menuVerde.setForeground(new java.awt.Color(0, 0, 0));
        menuVerde.setText("Verdes");
        menuEmergente.add(menuVerde);

        menuAzul.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuAzul.setForeground(new java.awt.Color(0, 0, 0));
        menuAzul.setText("Azul");
        menuEmergente.add(menuAzul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*if (evt.getButton() == 1) {
            JOptionPane.showMessageDialog(null, "Pulso el izquierdo");
        } else if (evt.getButton() == 2) {
            JOptionPane.showMessageDialog(null, "Pulso el central");
        } else if (evt.getButton() == 3) {
            JOptionPane.showMessageDialog(null, "Pulso el derecho");
        }*/
        
        menuEmergente.show(this,evt.getX(),evt.getY());

    }//GEN-LAST:event_formMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenusEmergentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuAzul;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem menuRojo;
    private javax.swing.JMenuItem menuVerde;
    // End of variables declaration//GEN-END:variables
}
