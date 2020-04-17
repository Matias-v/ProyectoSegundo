package grafica;

import static grafica.Carrito.listaCarrito;
import java.util.ArrayList;
import logica.Insumo;
import static grafica.Principal.insumo;
import static grafica.IngresarInsumo.lista;
import static grafica.Presupuestos.presu;
import static grafica.Principal.insumo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Presupuesto;

public class CableadoEmpresa extends javax.swing.JFrame {

    Presupuesto presu = new Presupuesto();

    public CableadoEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCarrito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CantCable = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Spinncantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("MS PGothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CABLEADO EMPRESARIAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Router", "Switch" }));
        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 73, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Precio", "Cantidad"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 480, 180));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese la cantidad de cable UTP que necesita(metros):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));

        CantCable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantCableActionPerformed(evt);
            }
        });
        getContentPane().add(CantCable, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 90, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inserte el Nombre del router/switch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, -1));

        Spinncantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(Spinncantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 50, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuantos desea");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 90, -1));

        btnAdd.setText("Agregar a Carrito");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 150, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoActionPerformed
        dispose();
        Carrito ventana = new Carrito();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnCarritoActionPerformed

    private void ComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoActionPerformed

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        Presupuestos pre = new Presupuestos();
        pre.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String producto = txtNombre.getText();

        int cantidad = (Integer) Spinncantidad.getValue();

        if (!CantCable.getText().equals("")) {
            presu.setCantidades(Integer.valueOf(CantCable.getText()));
            presu.setCarrito(insumo.posCable());
            presu.setCosto(insumo.getPrecio(insumo.posCable()));
            listaCarrito.add(presu);
        }
        if (!txtNombre.getText().equals("")) {
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
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void CantCableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantCableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantCableActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CableadoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CableadoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CableadoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CableadoEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CableadoEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JTextField CantCable;
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
