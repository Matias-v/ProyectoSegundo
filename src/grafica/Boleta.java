
package grafica;

import static grafica.Carrito.listaCarrito;
import java.util.ArrayList;
import logica.Insumo;
import logica.Factura;
import static grafica.Principal.insumo;
import static grafica.IngresarInsumo.lista;
import static grafica.Presupuestos.presu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Presupuesto;
import static grafica.Presupuestos.presu;


public class Boleta extends javax.swing.JFrame {
    
    Factura fac = new Factura();
    String matris[][] = new String[presu.tamanio()][4];

    public Boleta() {
        initComponents();
        this.setLocationRelativeTo(null);
        for (int cont = 0; cont < presu.tamanio(); cont++) {

            matris[cont][0] = lista.get(cont).getTipo(presu.getCarrito(cont));
            matris[cont][1] = lista.get(cont).getNombre(presu.getCarrito(cont));
            matris[cont][3] = listaCarrito.get(cont).cantidadesToString(cont);
            matris[cont][2] = lista.get(cont).precioToString(presu.getCarrito(cont));
            
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String[]{
                        "Tipo", "Nombre", "Precio", "Cantidad"
                    }
            ));
        }
        int numero = (int) (Math.random() * 2000) + 1;
        jtxtRut.setText(String.valueOf(numero));
        double subTotal = presu.calculoPresupuesto();
        jtxtSubTotal.setText(String.valueOf(subTotal));
        fac.setTotal(subTotal);
        jtxtTotal.setText(String.valueOf(fac.getTotal()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtRut = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACTURA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 480, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));
        getContentPane().add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUBTOTAL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 90, 20));
        getContentPane().add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 60, 30));

        jtxtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRutActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 30));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRutActionPerformed
        
    }//GEN-LAST:event_jtxtRutActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        for (int cont = 0; cont < presu.tamanio(); cont++) {
                listaCarrito.remove(cont);
                presu.eliminar(cont);
        }
        dispose();
        Principal pri = new Principal();
        pri.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtRut;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
