
package Guiados_35_VisorFotos.paqueteprincipal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class ventanaprincipal extends javax.swing.JFrame {
    
    public ventanaprincipal() {
        initComponents();
        ConfiguracionVentana();
    }
    
    public void ConfiguracionVentana(){
        this.setSize(800,600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelInterno = new javax.swing.JDesktopPane();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        menuCerrarTodo = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        menuCascada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panelInterno.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jPanel1.add(panelInterno, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        barraMenus.setBackground(new java.awt.Color(204, 204, 204));
        barraMenus.setForeground(new java.awt.Color(0, 0, 0));

        menuArchivo.setText("Archivo");

        menuArchivoAbrir.setBackground(new java.awt.Color(204, 204, 204));
        menuArchivoAbrir.setForeground(new java.awt.Color(0, 0, 0));
        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoCerrar.setBackground(new java.awt.Color(255, 255, 255));
        menuArchivoCerrar.setForeground(new java.awt.Color(0, 0, 0));
        menuArchivoCerrar.setText("Cerrar");
        menuArchivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrar);

        menuCerrarTodo.setBackground(new java.awt.Color(204, 204, 204));
        menuCerrarTodo.setForeground(new java.awt.Color(0, 0, 0));
        menuCerrarTodo.setText("Cerrar todo");
        menuCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarTodoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuCerrarTodo);

        menuInfo.setBackground(new java.awt.Color(204, 204, 204));
        menuInfo.setForeground(new java.awt.Color(0, 0, 0));
        menuInfo.setText("Info");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuInfo);
        menuArchivo.add(separador1);

        menuArchivoSalir.setBackground(new java.awt.Color(204, 204, 204));
        menuArchivoSalir.setForeground(new java.awt.Color(0, 0, 0));
        menuArchivoSalir.setText("Salir");
        menuArchivo.add(menuArchivoSalir);

        barraMenus.add(menuArchivo);

        menuVentana.setText("Ventana");

        menuCascada.setForeground(new java.awt.Color(0, 0, 0));
        menuCascada.setText("Cascada");
        menuCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCascadaActionPerformed(evt);
            }
        });
        menuVentana.add(menuCascada);

        barraMenus.add(menuVentana);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
    JFileChooser abrir = new JFileChooser();
    int boton = abrir.showOpenDialog(null);
    
        if (boton == JFileChooser.APPROVE_OPTION) {
            
        ventanainterna vi = new ventanainterna();
        vi.setResizable(true);
        vi.setMaximizable(true);
        vi.setIconifiable(true);
        vi.setClosable(true);

        panelInterno.add(vi);

        // Asigna la imagen y se muestra la ventana interna
        String camino = abrir.getSelectedFile().toString();
        vi.setTitle(camino);
        vi.setImagen(camino);
        vi.setVisible(true);
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    private void menuArchivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarActionPerformed
     ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
    if (vactiva != null) {
        vactiva.dispose();
    }
    }//GEN-LAST:event_menuArchivoCerrarActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed
       ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
    if (vactiva != null) {
        String titulo = vactiva.getTitle();
        JOptionPane.showMessageDialog(null, "Camino de la imagen: " + titulo);
    } else {
        JOptionPane.showMessageDialog(null, "No hay ninguna imagen seleccionada");
    }
    }//GEN-LAST:event_menuInfoActionPerformed

    private void menuCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarTodoActionPerformed
       int i;
       JInternalFrame v[] = panelInterno.getAllFrames();
       
       for(i = 0; i < v.length; i++){
           v[i].dispose();
       }
    }//GEN-LAST:event_menuCerrarTodoActionPerformed

    private void menuCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCascadaActionPerformed
    int x = 2;
    int y = 2; 
    JInternalFrame[] ventanas = panelInterno.getAllFrames();

    for (int i = 0; i < ventanas.length; i++) {
        ventanas[i].setSize(600, 400);
        ventanas[i].setLocation(x, y);
        x += 20;
        y += 20;
    }
    }//GEN-LAST:event_menuCascadaActionPerformed

   
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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuCascada;
    private javax.swing.JMenuItem menuCerrarTodo;
    private javax.swing.JMenuItem menuInfo;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
