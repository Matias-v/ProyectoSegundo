package grafica;
import javax.swing.JOptionPane;
import logica.Insumo;
public class Principal extends javax.swing.JFrame {
    
    public static Insumo insumo = new Insumo();
    
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCarrito = new javax.swing.JButton();
        BtnEliminarInsumo = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnIngresarInsumo = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnGenPresu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini carrito.png"))); // NOI18N
        BtnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        BtnEliminarInsumo.setText("Eliminar");
        BtnEliminarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarInsumoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, 30));

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, 30));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, 30));

        BtnIngresarInsumo.setText("Ingresar un Insumo");
        BtnIngresarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarInsumoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngresarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 30));

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 150, 30));

        BtnGenPresu1.setText("Generar Presupuesto");
        BtnGenPresu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenPresu1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGenPresu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarInsumoActionPerformed
        dispose();
        IngresarInsumo ventana = new IngresarInsumo();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnIngresarInsumoActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
       int option = JOptionPane.showConfirmDialog(null, "Realmente desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       if(option == 0){
          System.exit(0);
       }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnGenPresu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenPresu1ActionPerformed
        dispose();
        Presupuestos ventana = new Presupuestos();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnGenPresu1ActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        dispose();
        BuscarSueldo ventana = new BuscarSueldo();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        dispose();
        Modificar ventana = new Modificar();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarInsumoActionPerformed
        dispose();
        Eliminar ventana = new Eliminar();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnEliminarInsumoActionPerformed

    private void BtnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoActionPerformed
        dispose();
        Carrito ventana = new Carrito();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnCarritoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JButton BtnEliminarInsumo;
    private javax.swing.JButton BtnGenPresu1;
    private javax.swing.JButton BtnIngresarInsumo;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
