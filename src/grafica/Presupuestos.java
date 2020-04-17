package grafica;
import java.util.ArrayList;
import logica.Insumo;
import logica.Presupuesto;
import logica.Factura;
import logica.Cliente;
public class Presupuestos extends javax.swing.JFrame {
    
    static Presupuesto presu = new Presupuesto();
    
    public Presupuestos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPcBasico = new javax.swing.JButton();
        btnPcCompleto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCableadoEmpresa = new javax.swing.JButton();
        btnCableadoHogar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        BtnCarrito = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPcBasico.setText("ARMAR PC BASICO");
        btnPcBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcBasicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPcBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, 30));

        btnPcCompleto.setText("ARMAR PC COMPLETO");
        btnPcCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPcCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPcCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presupuestos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btnCableadoEmpresa.setText("CABLEADO EMPRESARIAL");
        btnCableadoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCableadoEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCableadoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, 30));

        btnCableadoHogar.setText("CABLEADO HOGAREÑO");
        btnCableadoHogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCableadoHogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCableadoHogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 30));

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        BtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini carrito.png"))); // NOI18N
        BtnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPcBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcBasicoActionPerformed
        dispose();
        PcBasico ventana = new PcBasico();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnPcBasicoActionPerformed

    private void btnPcCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPcCompletoActionPerformed
        dispose();
        PcCompleto ventana = new PcCompleto();
        ventana.setVisible(true);        ventana.setVisible(true);    }//GEN-LAST:event_btnPcCompletoActionPerformed

    private void btnCableadoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCableadoEmpresaActionPerformed
        dispose();
        CableadoEmpresa ventana = new CableadoEmpresa();

        ventana.setVisible(true);    }//GEN-LAST:event_btnCableadoEmpresaActionPerformed

    private void btnCableadoHogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCableadoHogarActionPerformed
        dispose();
        CableadoHogar ventana = new CableadoHogar();
        ventana.setVisible(true);    }//GEN-LAST:event_btnCableadoHogarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       dispose();
       Principal ventana = new Principal();
       ventana.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

    private void BtnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarritoActionPerformed
        dispose();
        Carrito ventana = new Carrito();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtnCarritoActionPerformed

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
            java.util.logging.Logger.getLogger(Presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presupuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarrito;
    private javax.swing.JButton btnCableadoEmpresa;
    private javax.swing.JButton btnCableadoHogar;
    private javax.swing.JButton btnPcBasico;
    private javax.swing.JButton btnPcCompleto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
