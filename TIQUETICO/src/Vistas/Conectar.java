package Vistas;

import Controladores.ControladorConexion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar extends javax.swing.JFrame {
    private String dirrecion;
    private String puerto;
    
    public Conectar() {
        this.setUndecorated(true);
        initComponents();
    }
    
    public void agregarUsuario(String usuario){
        txtNombreEmpleado.setText(usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConectar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        PanelConexion = new javax.swing.JPanel();
        labelBienvenido = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JLabel();
        labelParametrosConexion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConectar.setBackground(new java.awt.Color(255, 255, 255));

        btnCerrar.setFont(new java.awt.Font("Arial", 2, 8)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCerrar.jpg"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCliente.setText("CLIENTE");

        PanelConexion.setBackground(new java.awt.Color(153, 153, 153));

        labelBienvenido.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelBienvenido.setText("Bienvenido");

        txtNombreEmpleado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtNombreEmpleado.setText("NOMBRE EMPLEADO");

        labelParametrosConexion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelParametrosConexion.setText("Ingrese los parámetro de Conexión");

        txtDireccion.setText("Ingrese Dirección");
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
        });

        txtPuerto.setText("Ingrese Puerto");
        txtPuerto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPuertoFocusGained(evt);
            }
        });

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConexionLayout = new javax.swing.GroupLayout(PanelConexion);
        PanelConexion.setLayout(PanelConexionLayout);
        PanelConexionLayout.setHorizontalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConexionLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(labelBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEmpleado))
                    .addGroup(PanelConexionLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelParametrosConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion)
                            .addComponent(txtPuerto)))
                    .addGroup(PanelConexionLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btnConectar)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        PanelConexionLayout.setVerticalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBienvenido)
                    .addComponent(txtNombreEmpleado))
                .addGap(18, 18, 18)
                .addComponent(labelParametrosConexion)
                .addGap(18, 18, 18)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnConectar)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelConectarLayout = new javax.swing.GroupLayout(PanelConectar);
        PanelConectar.setLayout(PanelConectarLayout);
        PanelConectarLayout.setHorizontalGroup(
            PanelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConectarLayout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelConectarLayout.setVerticalGroup(
            PanelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        // TODO add your handling code here:
        txtDireccion.setText("");
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtPuertoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuertoFocusGained
        // TODO add your handling code here:
        txtPuerto.setText("");
    }//GEN-LAST:event_txtPuertoFocusGained

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed

        dirrecion = txtDireccion.getText();
        puerto = txtPuerto.getText();
        try {
            ControladorConexion.conectarServidor(dirrecion,puerto);
            Login login = new Login();
            login.show();
        } catch (IOException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConectarActionPerformed

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
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conectar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conectar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConectar;
    private javax.swing.JPanel PanelConexion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelParametrosConexion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtNombreEmpleado;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
}
