package grafica;

import javax.swing.JOptionPane;
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

public class Carrito extends javax.swing.JFrame {

    static ArrayList<Presupuesto> listaCarrito = new ArrayList<>();

    String matris[][] = new String[presu.tamanio()][4];

    public void restarCantidad() {
        try {
            for (int cont = 0; cont < insumo.tamanio(); cont++) {
                int pos = presu.getCarrito(cont);

                String nombre = insumo.getNombre(pos);
                if (insumo.getNombre(pos).contains(nombre)) {

                    String nom = insumo.getNombre(pos);
                    String tipo = insumo.getTipo(pos);
                    double precio = insumo.getPrecio(pos);
                    int cantInicial = insumo.getCantidad(pos);

                    int cantRestar = presu.getCantidades(cont);

                    insumo.eliminar(pos);
                    int cantFinal = cantInicial - cantRestar;

                    insumo.setCantidad(cantFinal);
                    insumo.setNombre(nom);
                    insumo.setPrecio(precio);
                    insumo.setTipo(tipo);
                }
            }
        } catch (Exception e) {
        }
    }

    public Carrito() {
        initComponents();
        setLocationRelativeTo(null);
        try {
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
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jbtnConfirmarCompra = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnSacar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARRITO");
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

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jbtnConfirmarCompra.setText("CONFIRMAR COMPRA");
        jbtnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnConfirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        btnVaciar.setText("Vaciar Carrito");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el nombre del producto a sacar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 30));

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 70, 30));

        jLabelFondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        Principal pri = new Principal();
        pri.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jbtnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarCompraActionPerformed
        Insumo insu = new Insumo();

        int option = JOptionPane.showConfirmDialog(null, "Antes de continuar, desea registrarse como cliente para acceder a beneficios \n y ofertas exclusivas?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == 0) {
            dispose();
            Clientes ventana = new Clientes();
            ventana.setVisible(true);
            restarCantidad();
        } else {
            dispose();
            Boleta ventana = new Boleta();
            ventana.setVisible(true);
            restarCantidad();
        }


    }//GEN-LAST:event_jbtnConfirmarCompraActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        try {
            for (int cont = 0; cont < presu.tamanio(); cont++) {
                listaCarrito.remove(cont);
                presu.eliminar(cont);
            }
            JOptionPane.showMessageDialog(null, "Se vacio con exito, recargue la ventana");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnVaciarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        String nombreSacar = txtNombre.getText();
        try {
            for (int cont = 0; cont < presu.tamanio(); cont++) {
                if (insumo.getNombre(presu.getCarrito(cont)).contains(nombreSacar)) {
                    presu.eliminar(cont);
                    listaCarrito.remove(cont);
                }
            }
            JOptionPane.showMessageDialog(null, "Se Saco con exito, recargue la ventana");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnSacarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnConfirmarCompra;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
