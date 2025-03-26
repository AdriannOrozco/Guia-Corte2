package Guiados_01;

import java.awt.Color;

/*
EJEMPLO 11 | Barra de Menus.
*/
public class BarrasDeMenus extends javax.swing.JFrame {

    public BarrasDeMenus() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        menuItemRojo = new javax.swing.JMenuItem();
        menuItemVerde = new javax.swing.JMenuItem();
        menuItemAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        barraMenus.setBackground(new java.awt.Color(225, 225, 225));
        barraMenus.setForeground(new java.awt.Color(0, 0, 0));

        menuArchivo.setForeground(new java.awt.Color(0, 0, 0));
        menuArchivo.setText("Archivo");

        menuItemAbrir.setBackground(new java.awt.Color(255, 255, 255));
        menuItemAbrir.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuItemAbrir.setForeground(new java.awt.Color(0, 0, 0));
        menuItemAbrir.setText("Abrir");
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuItemGuardar.setForeground(new java.awt.Color(0, 0, 0));
        menuItemGuardar.setText("Guardrar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);

        menuSalir.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(255, 0, 0));
        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);

        menuEdicion.setForeground(new java.awt.Color(0, 0, 0));
        menuEdicion.setText("Edición");

        menuColores.setForeground(new java.awt.Color(0, 0, 0));
        menuColores.setText("Colores");

        menuItemRojo.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuItemRojo.setForeground(new java.awt.Color(0, 0, 0));
        menuItemRojo.setText("Rojo");
        menuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRojoActionPerformed(evt);
            }
        });
        menuColores.add(menuItemRojo);

        menuItemVerde.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuItemVerde.setForeground(new java.awt.Color(0, 0, 0));
        menuItemVerde.setText("Verde");
        menuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerdeActionPerformed(evt);
            }
        });
        menuColores.add(menuItemVerde);

        menuItemAzul.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        menuItemAzul.setForeground(new java.awt.Color(0, 0, 0));
        menuItemAzul.setText("Azul");
        menuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAzulActionPerformed(evt);
            }
        });
        menuColores.add(menuItemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuEdicion);

        menuInsertar.setText("Insertar");
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 277, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRojoActionPerformed
    this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuItemRojoActionPerformed

    private void menuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerdeActionPerformed
    this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuItemVerdeActionPerformed

    private void menuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAzulActionPerformed
    this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuItemAzulActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarrasDeMenus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JPanel fondo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAzul;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemRojo;
    private javax.swing.JMenuItem menuItemVerde;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
