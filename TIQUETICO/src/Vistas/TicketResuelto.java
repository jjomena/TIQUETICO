package Vistas;

/**
 *
 * @author Joaquín
 */
public class TicketResuelto extends javax.swing.JFrame {

    /**
     * Creates new form TicketResuelto
     */
    public TicketResuelto() {
        this.setUndecorated(true);
        initComponents();
    }
    
    /*Permite mostrar en el panel la informacion del ticket resuelto*/
    public void mostratTicketResuelto(String idTicket,String usuario,String cliente,
            String asunto,String fechaIngreso,String fechaAtencion,String tiempo,
            String categoria,String comentario){
        txtIdTicket.setText(idTicket);
        txtEmpleado.setText(usuario);
        txtIdCliente.setText(cliente);
        txtAsuntoTicket.setText(asunto);
        txtFechaIngreso.setText(fechaIngreso);
        txtFechaInicioAtencion.setText(fechaAtencion);
        txtTiempoResolucion.setText(tiempo);
        txtCategoria.setText(categoria);
        TxtComentario.setText(comentario);
        TxtComentario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTicketResuelto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTicketId = new javax.swing.JLabel();
        labelAtendidopor = new javax.swing.JLabel();
        labelcliente = new javax.swing.JLabel();
        labelasunto = new javax.swing.JLabel();
        labelFechaIngresoTicket = new javax.swing.JLabel();
        labelInicioAtencion = new javax.swing.JLabel();
        labelTiempoResolucion = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelComentario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtComentario = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtIdTicket = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JLabel();
        txtAsuntoTicket = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JLabel();
        txtFechaInicioAtencion = new javax.swing.JLabel();
        txtTiempoResolucion = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTicketResuelto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Ticket Resuelto");

        labelTicketId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTicketId.setText("Ticket Id:");

        labelAtendidopor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelAtendidopor.setText("Atendido por:");

        labelcliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcliente.setText("id del cliente que realizo el reporte:  ");

        labelasunto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelasunto.setText("Asunto:");

        labelFechaIngresoTicket.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaIngresoTicket.setText("Ingreso del Ticket:");

        labelInicioAtencion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelInicioAtencion.setText("Inicio de atención del Ticket:");

        labelTiempoResolucion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTiempoResolucion.setText("Tiempo efectivo de Resolución:");

        labelCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCategoria.setText("Categoría:");

        labelComentario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelComentario.setText("Comentario:");

        TxtComentario.setColumns(20);
        TxtComentario.setRows(5);
        jScrollPane1.setViewportView(TxtComentario);

        jButton1.setText("OK");

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCerrar.jpg"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtIdTicket.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIdTicket.setText("#Ticket");

        txtEmpleado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmpleado.setText("Nombre_Empleado");

        txtIdCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIdCliente.setText("#Cliente");

        txtAsuntoTicket.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAsuntoTicket.setText("Asunto_Ticket");

        txtFechaIngreso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFechaIngreso.setText("Fecha_Ingreso");

        txtFechaInicioAtencion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFechaInicioAtencion.setText("Fecha_Inicio_Atencion");

        txtTiempoResolucion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTiempoResolucion.setText("Tiempo de Resolucion");

        txtCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCategoria.setText("Categoria_Ticket");

        javax.swing.GroupLayout PanelTicketResueltoLayout = new javax.swing.GroupLayout(PanelTicketResuelto);
        PanelTicketResuelto.setLayout(PanelTicketResueltoLayout);
        PanelTicketResueltoLayout.setHorizontalGroup(
            PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                        .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelAtendidopor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmpleado))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelasunto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAsuntoTicket))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelFechaIngresoTicket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaIngreso))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelInicioAtencion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaInicioAtencion))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelTiempoResolucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoResolucion))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoria))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelTicketId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdTicket))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(labelcliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCliente))
                            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(labelComentario)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTicketResueltoLayout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(btnCerrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTicketResueltoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        PanelTicketResueltoLayout.setVerticalGroup(
            PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrar))
                    .addGroup(PanelTicketResueltoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTicketId)
                    .addComponent(txtIdTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtendidopor)
                    .addComponent(txtEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcliente)
                    .addComponent(txtIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelasunto)
                    .addComponent(txtAsuntoTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaIngresoTicket)
                    .addComponent(txtFechaIngreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInicioAtencion)
                    .addComponent(txtFechaInicioAtencion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoResolucion)
                    .addComponent(txtTiempoResolucion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(txtCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(labelComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTicketResueltoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTicketResueltoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTicketResueltoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTicketResuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTicketResuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(TicketResuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketResuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketResuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketResuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketResuelto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTicketResuelto;
    private javax.swing.JTextArea TxtComentario;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAtendidopor;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelComentario;
    private javax.swing.JLabel labelFechaIngresoTicket;
    private javax.swing.JLabel labelInicioAtencion;
    private javax.swing.JLabel labelTicketId;
    private javax.swing.JLabel labelTiempoResolucion;
    private javax.swing.JLabel labelasunto;
    private javax.swing.JLabel labelcliente;
    private javax.swing.JLabel txtAsuntoTicket;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtFechaIngreso;
    private javax.swing.JLabel txtFechaInicioAtencion;
    private javax.swing.JLabel txtIdCliente;
    private javax.swing.JLabel txtIdTicket;
    private javax.swing.JLabel txtTiempoResolucion;
    // End of variables declaration//GEN-END:variables
}
