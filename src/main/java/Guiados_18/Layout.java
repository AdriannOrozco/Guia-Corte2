
package Guiados_18;
public class Layout extends javax.swing.JFrame {

    public Layout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("jButton1");
        getContentPane().add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("jButton2");
        getContentPane().add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setText("jButton3");
        getContentPane().add(jButton3);

        jButton4.setBackground(new java.awt.Color(204, 153, 0));
        jButton4.setText("jButton4");
        getContentPane().add(jButton4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
