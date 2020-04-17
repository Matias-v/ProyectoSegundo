package grafica;

import java.util.ArrayList;
import logica.Insumo;
import static grafica.Principal.insumo;
import static grafica.IngresarInsumo.lista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar extends javax.swing.JFrame {

    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboTipo = new javax.swing.JComboBox<String>();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FondoBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarjeta de video", "Mother", "Fuente", "Ram", "Disco duro", "Cpu", "Periferico", "Router", "Switch", "Gabinete", "Disipador" }));
        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 40));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 480, 180));

        FondoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(FondoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        Principal pri = new Principal();
        pri.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JLabel FondoBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
