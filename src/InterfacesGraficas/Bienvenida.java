/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas;

/**
 *
 * @author yaxim
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InciarSimulacion = new javax.swing.JButton();
        CargarArchivo = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JButton();
        CrearDocumento = new javax.swing.JButton();
        AgregarDocumento = new javax.swing.JButton();
        EliminarDocumento = new javax.swing.JButton();
        ColaImpresion = new javax.swing.JButton();
        AgregarUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 112, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BdCnOul BT", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenida");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 50));

        InciarSimulacion.setText("Iniciar Simulación");
        jPanel2.add(InciarSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, -1));

        CargarArchivo.setText("Cargar Archivo");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        EliminarUsuario.setText("Eliminar Usuarios");
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, -1));

        CrearDocumento.setText("Crear Documentos");
        CrearDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(CrearDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, -1));

        AgregarDocumento.setText("Agregar Documentos");
        AgregarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 200, -1));

        EliminarDocumento.setText("Eliminar Documentos");
        EliminarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(EliminarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 200, -1));

        ColaImpresion.setText("Visualizar Cola de Impresión");
        jPanel2.add(ColaImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 200, -1));

        AgregarUsuario.setText("Agregar Usuarios");
        AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));

        jButton1.setText("Lista Usurios y Documentos");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, -1));

        jButton3.setText("Eliminar Documento Encolado");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        // TODO add your handling code here:
        
        CargarArchivo cargar = new CargarArchivo ();
        cargar.setVisible(true);
        cargar.setLocationRelativeTo(null);
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
        
        AgregarUsuario adUser = new AgregarUsuario();
        adUser.setVisible(true);
        adUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_AgregarUsuarioActionPerformed

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        // TODO add your handling code here:
        
        EliminarUsuario deleteUser = new EliminarUsuario();
        deleteUser.setVisible(true);
        deleteUser.setLocationRelativeTo(null); 
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void CrearDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDocumentoActionPerformed
        // TODO add your handling code here:
        
        CrearDocumento create = new CrearDocumento();
        create.setVisible(true);
        create.setLocationRelativeTo(null); 
    }//GEN-LAST:event_CrearDocumentoActionPerformed

    private void AgregarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDocumentoActionPerformed
        // TODO add your handling code here:
        
        AgregarDocumento adDocument = new AgregarDocumento();
        adDocument.setVisible(true);
        adDocument.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_AgregarDocumentoActionPerformed

    private void EliminarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDocumentoActionPerformed
        // TODO add your handling code here:
        
        EliminarDocumento deleteDocument = new EliminarDocumento();
        deleteDocument.setVisible(true);
        deleteDocument.setLocationRelativeTo(null);
    }//GEN-LAST:event_EliminarDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDocumento;
    private javax.swing.JButton AgregarUsuario;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton ColaImpresion;
    private javax.swing.JButton CrearDocumento;
    private javax.swing.JButton EliminarDocumento;
    private javax.swing.JButton EliminarUsuario;
    private javax.swing.JButton InciarSimulacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
