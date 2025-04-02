
package Guiados_15;

public class ScrollPane extends javax.swing.JFrame {

    public ScrollPane() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpImagen = new javax.swing.JScrollPane();
        etiImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scpImagen.setBackground(new java.awt.Color(255, 255, 255));

        etiImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Pictures\\Fondos de pantalla\\jude-bellingham-real-madrid-2023-24-1704387569-125541.jpg")); // NOI18N
        etiImagen.setText("jLabel1");
        scpImagen.setViewportView(etiImagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(scpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scpImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScrollPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiImagen;
    private javax.swing.JScrollPane scpImagen;
    // End of variables declaration//GEN-END:variables
}
