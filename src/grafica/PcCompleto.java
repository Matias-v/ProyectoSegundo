
package grafica;

import static grafica.Carrito.listaCarrito;
import static grafica.IngresarInsumo.lista;
import static grafica.Principal.insumo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static grafica.Presupuestos.presu;
import java.util.ArrayList;
import logica.Insumo;
import logica.Presupuesto;

public class PcCompleto extends javax.swing.JFrame {


    public PcCompleto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        Spinncantidad = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ComboTipo = new javax.swing.JComboBox<String>();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnCarrito = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 30));

        Spinncantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(Spinncantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 50, 30));

        btnAdd.setText("Agregar a Carrito");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 140, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 480, 110));

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarjeta de video", "Mother", "Fuente", "Ram", "Disco duro", "Cpu", "Periferico", "Gabinete", "Disipador" }));
        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 103, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PC PERSONALIZADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inserte el Nombre del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuantos desea");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        BtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini carrito.png"))); // NOI18N
        BtnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        Presupuestos pre = new Presupuestos();
        pre.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String producto = txtNombre.getText();
        int cantidad = (Integer) Spinncantidad.getValue();

        for (int cont = 0; cont < insumo.tamanio(); cont++) {
            if (insumo.getNombre(cont).contains(producto)) {

                presu.setCantidades(cantidad);
                presu.setCarrito(cont);
                presu.setCosto(insumo.getPrecio(cont));
                listaCarrito.add(presu);

                JOptionPane.showMessageDialog(null, "se ingreso correctamente");
                txtNombre.setText("");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void ComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tipo = String.valueOf(ComboTipo.getSelectedItem()).toLowerCase();
        String matris[][] = new String[lista.size()][4];

        if (lista.size() != 0) {
            for (int cont = 0; cont < lista.size(); cont++) {
                if (insumo.getTipo(cont).contains(tipo)) {

                    matris[cont][0] = lista.get(cont).getTipo(cont);
                    matris[cont][1] = lista.get(cont).getNombre(cont);
                    matris[cont][2] = lista.get(cont).precioToString(cont);
                    matris[cont][3] = lista.get(cont).cantidadToString(cont);

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        matris,
                        new String[]{
                            "Tipo", "Nombre", "Precio", "Cantidad"
                        }
                    ));
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene Insumos Ingresados");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BtnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoActionPerformed
        dispose();
        Carrito ventana = new Carrito();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnCarritoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PcCompleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JSpinner Spinncantidad;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
