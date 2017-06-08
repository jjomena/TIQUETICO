
package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import tiquetico.Categorias;

public class PanelServidor extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public PanelServidor() {
        //this.setUndecorated(true);
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void refrescarPanelEmpleados(String nombre,Categorias categoria,
            String ticketsResueltos,String ticketsPendientes){
        agregarEmpleadosComboBox(nombre);
        JLabel usuario = new javax.swing.JLabel(nombre);
        usuario.setFont(new Font("Arial", Font.BOLD, 16));

        PanelConexionesEmpleados.setLayout(new GridLayout(0,1,5,5));
        PanelConexionesEmpleados.add(usuario);
        PanelConexionesEmpleados.revalidate();
        PanelConexionesEmpleados.repaint();
        usuario.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                informacionUsuario(categoria,ticketsResueltos,ticketsPendientes);
            }

            @Override
            public void mousePressed(MouseEvent e) {
               //nothing
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //nothing
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                usuario.setBackground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                usuario.setBackground(new Color(255,255,255));
            }
        }); 
    }
    
    public void informacionUsuario(Categorias categoria,String ticketsResueltos,
            String ticketsPendientes){
        String path;
        URL url = null;
        ImageIcon icon;
        if(null == categoria){
            path = "/imagenes/iconGris.png";
            iconCategoria.setIcon(new ImageIcon("imagenes/iconGris.jpg"));
        }
        else switch (categoria) {
            case VERDE:
                path = "/imagenes/iconVerde.jpg";            
                break;
            case AMARILLO:
                path = "/imagenes/iconAmarillo.jpg";             
                break;
            default:
                path = "/imagenes/iconRojo.jpg";               
                break;
        }
        url = this.getClass().getResource(path);
        icon = new ImageIcon(url);
        iconCategoria.setIcon(icon);
        iconCategoria.repaint();
        //
        txtTicketsResueltos.setText(ticketsResueltos);
        txtTicketsPendientes.setText(ticketsPendientes);
        
        
    }
    
    public void refrescarPanelTicketsSinAsignar(String ticket){
        JLabel ticketNuevo = new javax.swing.JLabel(ticket);
        ticketNuevo.setFont(new Font("Arial", Font.BOLD, 12));
        //
        JCheckBox check = new JCheckBox("",false);
        PanelContornoEstados.setLayout(new GridLayout(0,2,5,5));
        PanelContornoEstados.add(ticketNuevo);
        PanelContornoEstados.add(check);
        PanelContornoEstados.revalidate();
        PanelContornoEstados.repaint(); 
    }
    
    public void agregarEmpleadosComboBox(String nombre){
        ComboBoxEncargados.addItem(nombre);
    }
    
    public void agregarMonitoreoConexiones(String nombre, String estado){
        JLabel usuario = new javax.swing.JLabel(nombre);
        JLabel estadoUsuario = new javax.swing.JLabel(estado);
        //
        PanelMonitoreoConexiones.setLayout(new GridLayout(0,2,5,5));
        PanelMonitoreoConexiones.add(usuario);
        PanelMonitoreoConexiones.add(estadoUsuario);
        PanelMonitoreoConexiones.revalidate();
        PanelMonitoreoConexiones.repaint();
    }
    
    public void agregarMonitoreoActividades(String numTicket,String Usuario){
        JLabel actividad = new javax.swing.JLabel("Se asigna ticket "+numTicket+" a"+Usuario); 
        actividad.setFont(new Font("Arial", Font.PLAIN, 12));
       //
        PanelMonitoreoActividades.setLayout(new GridLayout(0,2,5,5));
        PanelMonitoreoActividades.add(actividad);
        PanelMonitoreoActividades.revalidate();
        PanelMonitoreoActividades.repaint();
    }
    
    public void agregarMonitoreoTickets(String numTicket,String estado){
        JLabel ticket = new javax.swing.JLabel(numTicket);
        JLabel estadoUsuario = new javax.swing.JLabel(estado);
        //
        PanelMonitoreoConexiones.setLayout(new GridLayout(0,2,5,5));
        PanelMonitoreoConexiones.add(ticket);
        PanelMonitoreoConexiones.add(estadoUsuario);
        PanelMonitoreoConexiones.revalidate();
        PanelMonitoreoConexiones.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        TabMonitoreo = new javax.swing.JTabbedPane();
        TabPanelConexiones = new javax.swing.JPanel();
        PanelConexionesEmpleados = new javax.swing.JPanel();
        PanelConexionesEstado = new javax.swing.JPanel();
        labelTicketsPendientes = new java.awt.Label();
        labelCategoria = new java.awt.Label();
        labelFechaActivo = new java.awt.Label();
        labelTicketsResueltos = new java.awt.Label();
        jDateChooserActivoDesde = new com.toedter.calendar.JDateChooser();
        txtTicketsResueltos = new javax.swing.JLabel();
        txtTicketsPendientes = new javax.swing.JLabel();
        iconCategoria = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TabPanelTickets = new javax.swing.JPanel();
        ScrollPaneTicketsEstado = new javax.swing.JScrollPane();
        PanelContornoEstados = new javax.swing.JPanel();
        btnTicketsVerde = new javax.swing.JButton();
        btnTicketsAmarillo = new javax.swing.JButton();
        btnTicketsRojo = new javax.swing.JButton();
        ScrollPaneVerde = new javax.swing.JScrollPane();
        PanelTicketsVerde = new javax.swing.JPanel();
        ScrollPaneTicketsAmarillo = new javax.swing.JScrollPane();
        ScrollPaneAmarillo = new javax.swing.JScrollPane();
        PanelTicketsAmarillo = new javax.swing.JPanel();
        ScrollPaneRojo = new javax.swing.JScrollPane();
        PanelTicketsRojo = new javax.swing.JPanel();
        btnAgregarTickets = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TabPanelConsultas = new javax.swing.JPanel();
        PanelConsultas = new javax.swing.JPanel();
        labelEncargado = new javax.swing.JLabel();
        ComboBoxEncargados = new javax.swing.JComboBox<>();
        labelFiltroFecha = new javax.swing.JLabel();
        labelFiltroEstado = new javax.swing.JLabel();
        ComboBoxFiltroEstado = new javax.swing.JComboBox<>();
        labelFiltroCategoria = new javax.swing.JLabel();
        ComboBoxFiltroCategoria = new javax.swing.JComboBox<>();
        labelDesde = new javax.swing.JLabel();
        labelHasta = new javax.swing.JLabel();
        labelPromedioAtencion = new javax.swing.JLabel();
        ProgressBarPromedioAtencion = new javax.swing.JProgressBar();
        ScrollPaneTickets = new javax.swing.JScrollPane();
        PanelConsultasTickets = new javax.swing.JPanel();
        jDateChooserFiltroHasta = new com.toedter.calendar.JDateChooser();
        jDateChooserFiltroDesde = new com.toedter.calendar.JDateChooser();
        TabPanelConfiguracion = new javax.swing.JPanel();
        PanelConfigVerde = new javax.swing.JPanel();
        labelTiempoInviertidoVerde = new javax.swing.JLabel();
        Spinner1 = new javax.swing.JSpinner();
        Spinner2 = new javax.swing.JSpinner();
        PanelConfigAmarillo = new javax.swing.JPanel();
        labelTiempoInvertidoAmarillo = new javax.swing.JLabel();
        Spinner3 = new javax.swing.JSpinner();
        Spinner4 = new javax.swing.JSpinner();
        PanelConfigRojo = new javax.swing.JPanel();
        labelTiempoInvertidoRojo = new javax.swing.JLabel();
        Spinner5 = new javax.swing.JSpinner();
        Spinner6 = new javax.swing.JSpinner();
        labelMetricaEvaluacion = new javax.swing.JLabel();
        TabPanelMonitoreo = new javax.swing.JPanel();
        labelMonitoreoConexiones = new javax.swing.JLabel();
        ScrollPaneMonitoreoConexiones = new javax.swing.JScrollPane();
        PanelMonitoreoConexiones = new javax.swing.JPanel();
        ScrollPaneMonitoreoActividades = new javax.swing.JScrollPane();
        PanelMonitoreoActividades = new javax.swing.JPanel();
        labelMonitoreoActividades = new javax.swing.JLabel();
        ScrollPaneMonitoreoTickets = new javax.swing.JScrollPane();
        PanelMonitoreoTickets = new javax.swing.JPanel();
        labelMonitoreoTickets = new javax.swing.JLabel();
        btnBajarServidor = new javax.swing.JToggleButton();
        labelTiquetico = new javax.swing.JLabel();
        labelServidor = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        PanelPrincipal.setBackground(new java.awt.Color(0, 204, 204));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TabMonitoreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabMonitoreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        TabPanelConexiones.setBackground(new java.awt.Color(255, 255, 255));

        PanelConexionesEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        PanelConexionesEmpleados.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 10)));
        PanelConexionesEmpleados.setMaximumSize(new java.awt.Dimension(450, 300));
        PanelConexionesEmpleados.setMinimumSize(new java.awt.Dimension(450, 300));
        PanelConexionesEmpleados.setName(""); // NOI18N

        javax.swing.GroupLayout PanelConexionesEmpleadosLayout = new javax.swing.GroupLayout(PanelConexionesEmpleados);
        PanelConexionesEmpleados.setLayout(PanelConexionesEmpleadosLayout);
        PanelConexionesEmpleadosLayout.setHorizontalGroup(
            PanelConexionesEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        PanelConexionesEmpleadosLayout.setVerticalGroup(
            PanelConexionesEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        PanelConexionesEstado.setBackground(new java.awt.Color(255, 255, 255));
        PanelConexionesEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelConexionesEstado.setPreferredSize(new java.awt.Dimension(561, 300));

        labelTicketsPendientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTicketsPendientes.setText("Tickets Pendientes: ");

        labelCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCategoria.setPreferredSize(new java.awt.Dimension(75, 19));
        labelCategoria.setText("Categoría: ");

        labelFechaActivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaActivo.setText("Activo desde: ");

        labelTicketsResueltos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTicketsResueltos.setText("Tickets Resueltos: ");

        txtTicketsResueltos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTicketsResueltos.setText("#Tickets");

        txtTicketsPendientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTicketsPendientes.setText("#Tickets");

        iconCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconGris.png"))); // NOI18N

        javax.swing.GroupLayout PanelConexionesEstadoLayout = new javax.swing.GroupLayout(PanelConexionesEstado);
        PanelConexionesEstado.setLayout(PanelConexionesEstadoLayout);
        PanelConexionesEstadoLayout.setHorizontalGroup(
            PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionesEstadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConexionesEstadoLayout.createSequentialGroup()
                        .addComponent(labelTicketsResueltos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTicketsResueltos))
                    .addGroup(PanelConexionesEstadoLayout.createSequentialGroup()
                        .addComponent(labelTicketsPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTicketsPendientes))
                    .addGroup(PanelConexionesEstadoLayout.createSequentialGroup()
                        .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFechaActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserActivoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconCategoria))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        PanelConexionesEstadoLayout.setVerticalGroup(
            PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionesEstadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFechaActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserActivoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTicketsResueltos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTicketsResueltos))
                .addGap(32, 32, 32)
                .addGroup(PanelConexionesEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTicketsPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTicketsPendientes))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabPanelConexionesLayout = new javax.swing.GroupLayout(TabPanelConexiones);
        TabPanelConexiones.setLayout(TabPanelConexionesLayout);
        TabPanelConexionesLayout.setHorizontalGroup(
            TabPanelConexionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConexionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PanelConexionesEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(PanelConexionesEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
            .addGroup(TabPanelConexionesLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jButton1)
                .addGap(332, 332, 332))
        );
        TabPanelConexionesLayout.setVerticalGroup(
            TabPanelConexionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConexionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabPanelConexionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelConexionesLayout.createSequentialGroup()
                        .addComponent(PanelConexionesEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(164, 164, 164))
                    .addGroup(TabPanelConexionesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PanelConexionesEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        TabMonitoreo.addTab("Conexiones", TabPanelConexiones);

        TabPanelTickets.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPaneTicketsEstado.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneTicketsEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ScrollPaneTicketsEstado.setAutoscrolls(true);

        PanelContornoEstados.setBackground(new java.awt.Color(255, 255, 255));
        PanelContornoEstados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelContornoEstadosLayout = new javax.swing.GroupLayout(PanelContornoEstados);
        PanelContornoEstados.setLayout(PanelContornoEstadosLayout);
        PanelContornoEstadosLayout.setHorizontalGroup(
            PanelContornoEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        PanelContornoEstadosLayout.setVerticalGroup(
            PanelContornoEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        ScrollPaneTicketsEstado.setViewportView(PanelContornoEstados);

        btnTicketsVerde.setBackground(new java.awt.Color(102, 153, 0));
        btnTicketsVerde.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTicketsVerde.setForeground(new java.awt.Color(255, 255, 255));
        btnTicketsVerde.setText("LEVE");
        btnTicketsVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsVerdeActionPerformed(evt);
            }
        });

        btnTicketsAmarillo.setBackground(new java.awt.Color(204, 255, 102));
        btnTicketsAmarillo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTicketsAmarillo.setForeground(new java.awt.Color(255, 255, 255));
        btnTicketsAmarillo.setText("MEDIA");

        btnTicketsRojo.setBackground(new java.awt.Color(255, 0, 0));
        btnTicketsRojo.setForeground(new java.awt.Color(255, 255, 255));
        btnTicketsRojo.setText("URGENTE");

        ScrollPaneVerde.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneVerde.setForeground(new java.awt.Color(153, 153, 0));
        ScrollPaneVerde.setAutoscrolls(true);

        PanelTicketsVerde.setBackground(new java.awt.Color(255, 255, 255));
        PanelTicketsVerde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0)));
        PanelTicketsVerde.setAutoscrolls(true);

        javax.swing.GroupLayout PanelTicketsVerdeLayout = new javax.swing.GroupLayout(PanelTicketsVerde);
        PanelTicketsVerde.setLayout(PanelTicketsVerdeLayout);
        PanelTicketsVerdeLayout.setHorizontalGroup(
            PanelTicketsVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        PanelTicketsVerdeLayout.setVerticalGroup(
            PanelTicketsVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        ScrollPaneVerde.setViewportView(PanelTicketsVerde);

        ScrollPaneAmarillo.setAutoscrolls(true);

        PanelTicketsAmarillo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTicketsAmarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout PanelTicketsAmarilloLayout = new javax.swing.GroupLayout(PanelTicketsAmarillo);
        PanelTicketsAmarillo.setLayout(PanelTicketsAmarilloLayout);
        PanelTicketsAmarilloLayout.setHorizontalGroup(
            PanelTicketsAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        PanelTicketsAmarilloLayout.setVerticalGroup(
            PanelTicketsAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        ScrollPaneAmarillo.setViewportView(PanelTicketsAmarillo);

        ScrollPaneRojo.setAutoscrolls(true);

        PanelTicketsRojo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTicketsRojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        javax.swing.GroupLayout PanelTicketsRojoLayout = new javax.swing.GroupLayout(PanelTicketsRojo);
        PanelTicketsRojo.setLayout(PanelTicketsRojoLayout);
        PanelTicketsRojoLayout.setHorizontalGroup(
            PanelTicketsRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        PanelTicketsRojoLayout.setVerticalGroup(
            PanelTicketsRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        ScrollPaneRojo.setViewportView(PanelTicketsRojo);

        btnAgregarTickets.setText("Ingresar Nuevos Tickets");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabPanelTicketsLayout = new javax.swing.GroupLayout(TabPanelTickets);
        TabPanelTickets.setLayout(TabPanelTicketsLayout);
        TabPanelTicketsLayout.setHorizontalGroup(
            TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                        .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPanelTicketsLayout.createSequentialGroup()
                                .addComponent(ScrollPaneTicketsEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPanelTicketsLayout.createSequentialGroup()
                                        .addComponent(btnTicketsRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnTicketsAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnTicketsVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ScrollPaneVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ScrollPaneAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ScrollPaneRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPanelTicketsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAgregarTickets)))
                        .addGap(186, 186, 186))
                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ScrollPaneTicketsAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabPanelTicketsLayout.setVerticalGroup(
            TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TabPanelTicketsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPaneTicketsAmarillo))
                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                        .addGap(0, 146, Short.MAX_VALUE)
                        .addComponent(btnAgregarTickets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollPaneRojo)
                            .addComponent(ScrollPaneAmarillo)
                            .addComponent(ScrollPaneVerde))
                        .addGap(113, 113, 113)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPanelTicketsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addGroup(TabPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelTicketsLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnTicketsVerde)
                        .addGap(28, 28, 28)
                        .addComponent(btnTicketsAmarillo)
                        .addGap(18, 18, 18)
                        .addComponent(btnTicketsRojo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPanelTicketsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScrollPaneTicketsEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );

        TabMonitoreo.addTab("Tickets", TabPanelTickets);

        TabPanelConsultas.setBackground(new java.awt.Color(255, 255, 255));

        labelEncargado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelEncargado.setText("Encargado:");

        ComboBoxEncargados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));

        labelFiltroFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFiltroFecha.setText("Fitro por fecha ");

        labelFiltroEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFiltroEstado.setText("Filtro por Estado");

        ComboBoxFiltroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Satisfactorios", "Pendientes", "En Proceso" }));

        labelFiltroCategoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFiltroCategoria.setText("Filtro por Categoría");

        ComboBoxFiltroCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Verdes", "Amarillos", "Rojos" }));

        labelDesde.setText("Desde: ");

        labelHasta.setText("Hasta: ");

        labelPromedioAtencion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPromedioAtencion.setText("Promedio de Atención de Tickets");

        ScrollPaneTickets.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneTickets.setAutoscrolls(true);

        PanelConsultasTickets.setBackground(new java.awt.Color(255, 255, 255));
        PanelConsultasTickets.setAutoscrolls(true);

        javax.swing.GroupLayout PanelConsultasTicketsLayout = new javax.swing.GroupLayout(PanelConsultasTickets);
        PanelConsultasTickets.setLayout(PanelConsultasTicketsLayout);
        PanelConsultasTicketsLayout.setHorizontalGroup(
            PanelConsultasTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        PanelConsultasTicketsLayout.setVerticalGroup(
            PanelConsultasTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        ScrollPaneTickets.setViewportView(PanelConsultasTickets);

        javax.swing.GroupLayout PanelConsultasLayout = new javax.swing.GroupLayout(PanelConsultas);
        PanelConsultas.setLayout(PanelConsultasLayout);
        PanelConsultasLayout.setHorizontalGroup(
            PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultasLayout.createSequentialGroup()
                .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(labelEncargado)
                        .addGap(29, 29, 29)
                        .addComponent(ComboBoxEncargados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelFiltroEstado)
                                .addComponent(labelFiltroFecha)
                                .addComponent(ComboBoxFiltroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFiltroCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxFiltroCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelConsultasLayout.createSequentialGroup()
                                .addComponent(labelDesde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFiltroDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(labelHasta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFiltroHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(labelPromedioAtencion))
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(ProgressBarPromedioAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(ScrollPaneTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        PanelConsultasLayout.setVerticalGroup(
            PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEncargado)
                            .addComponent(ComboBoxEncargados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelFiltroFecha))
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addComponent(labelPromedioAtencion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProgressBarPromedioAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConsultasLayout.createSequentialGroup()
                        .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelDesde)
                                .addComponent(labelHasta))
                            .addComponent(jDateChooserFiltroHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFiltroDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(labelFiltroEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxFiltroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(labelFiltroCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPaneTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TabPanelConsultasLayout = new javax.swing.GroupLayout(TabPanelConsultas);
        TabPanelConsultas.setLayout(TabPanelConsultasLayout);
        TabPanelConsultasLayout.setHorizontalGroup(
            TabPanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        TabPanelConsultasLayout.setVerticalGroup(
            TabPanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabMonitoreo.addTab("Consultas", TabPanelConsultas);

        TabPanelConfiguracion.setBackground(new java.awt.Color(255, 255, 255));

        PanelConfigVerde.setBackground(new java.awt.Color(255, 255, 255));
        PanelConfigVerde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 2, true));
        PanelConfigVerde.setMaximumSize(new java.awt.Dimension(330, 300));
        PanelConfigVerde.setMinimumSize(new java.awt.Dimension(330, 300));

        labelTiempoInviertidoVerde.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTiempoInviertidoVerde.setText("Tiempo Invertido (Minutos)");

        javax.swing.GroupLayout PanelConfigVerdeLayout = new javax.swing.GroupLayout(PanelConfigVerde);
        PanelConfigVerde.setLayout(PanelConfigVerdeLayout);
        PanelConfigVerdeLayout.setHorizontalGroup(
            PanelConfigVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfigVerdeLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(PanelConfigVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelConfigVerdeLayout.createSequentialGroup()
                        .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTiempoInviertidoVerde))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        PanelConfigVerdeLayout.setVerticalGroup(
            PanelConfigVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfigVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTiempoInviertidoVerde)
                .addGap(69, 69, 69)
                .addGroup(PanelConfigVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelConfigAmarillo.setBackground(new java.awt.Color(255, 255, 255));
        PanelConfigAmarillo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
        PanelConfigAmarillo.setMaximumSize(new java.awt.Dimension(330, 300));
        PanelConfigAmarillo.setMinimumSize(new java.awt.Dimension(330, 300));
        PanelConfigAmarillo.setName(""); // NOI18N

        labelTiempoInvertidoAmarillo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTiempoInvertidoAmarillo.setText("Tiempo Invertido (Minutos)");

        javax.swing.GroupLayout PanelConfigAmarilloLayout = new javax.swing.GroupLayout(PanelConfigAmarillo);
        PanelConfigAmarillo.setLayout(PanelConfigAmarilloLayout);
        PanelConfigAmarilloLayout.setHorizontalGroup(
            PanelConfigAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfigAmarilloLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PanelConfigAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelConfigAmarilloLayout.createSequentialGroup()
                        .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTiempoInvertidoAmarillo))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelConfigAmarilloLayout.setVerticalGroup(
            PanelConfigAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfigAmarilloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelTiempoInvertidoAmarillo)
                .addGap(62, 62, 62)
                .addGroup(PanelConfigAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelConfigRojo.setBackground(new java.awt.Color(255, 255, 255));
        PanelConfigRojo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        PanelConfigRojo.setMaximumSize(new java.awt.Dimension(330, 300));
        PanelConfigRojo.setMinimumSize(new java.awt.Dimension(330, 300));

        labelTiempoInvertidoRojo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTiempoInvertidoRojo.setText("Tiempo Invertido (Minutos)");

        javax.swing.GroupLayout PanelConfigRojoLayout = new javax.swing.GroupLayout(PanelConfigRojo);
        PanelConfigRojo.setLayout(PanelConfigRojoLayout);
        PanelConfigRojoLayout.setHorizontalGroup(
            PanelConfigRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConfigRojoLayout.createSequentialGroup()
                .addGroup(PanelConfigRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelConfigRojoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(Spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelConfigRojoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTiempoInvertidoRojo)))
                .addGap(97, 97, 97))
        );
        PanelConfigRojoLayout.setVerticalGroup(
            PanelConfigRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfigRojoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTiempoInvertidoRojo)
                .addGap(67, 67, 67)
                .addGroup(PanelConfigRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        labelMetricaEvaluacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelMetricaEvaluacion.setText("Métrica de Evaluación");

        javax.swing.GroupLayout TabPanelConfiguracionLayout = new javax.swing.GroupLayout(TabPanelConfiguracion);
        TabPanelConfiguracion.setLayout(TabPanelConfiguracionLayout);
        TabPanelConfiguracionLayout.setHorizontalGroup(
            TabPanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabPanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelConfiguracionLayout.createSequentialGroup()
                        .addComponent(PanelConfigVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelConfigAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelConfigRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMetricaEvaluacion))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        TabPanelConfiguracionLayout.setVerticalGroup(
            TabPanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetricaEvaluacion)
                .addGap(8, 8, 8)
                .addGroup(TabPanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelConfigVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelConfigAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelConfigRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabMonitoreo.addTab("Configuración", TabPanelConfiguracion);

        TabPanelMonitoreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelMonitoreoConexiones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMonitoreoConexiones.setText("Monitoreo de Conexiones");

        ScrollPaneMonitoreoConexiones.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneMonitoreoConexiones.setAutoscrolls(true);

        PanelMonitoreoConexiones.setBackground(new java.awt.Color(255, 255, 255));
        PanelMonitoreoConexiones.setAutoscrolls(true);

        javax.swing.GroupLayout PanelMonitoreoConexionesLayout = new javax.swing.GroupLayout(PanelMonitoreoConexiones);
        PanelMonitoreoConexiones.setLayout(PanelMonitoreoConexionesLayout);
        PanelMonitoreoConexionesLayout.setHorizontalGroup(
            PanelMonitoreoConexionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        PanelMonitoreoConexionesLayout.setVerticalGroup(
            PanelMonitoreoConexionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        ScrollPaneMonitoreoConexiones.setViewportView(PanelMonitoreoConexiones);

        ScrollPaneMonitoreoActividades.setAutoscrolls(true);

        PanelMonitoreoActividades.setBackground(new java.awt.Color(255, 255, 255));
        PanelMonitoreoActividades.setAutoscrolls(true);

        javax.swing.GroupLayout PanelMonitoreoActividadesLayout = new javax.swing.GroupLayout(PanelMonitoreoActividades);
        PanelMonitoreoActividades.setLayout(PanelMonitoreoActividadesLayout);
        PanelMonitoreoActividadesLayout.setHorizontalGroup(
            PanelMonitoreoActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        PanelMonitoreoActividadesLayout.setVerticalGroup(
            PanelMonitoreoActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        ScrollPaneMonitoreoActividades.setViewportView(PanelMonitoreoActividades);

        labelMonitoreoActividades.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMonitoreoActividades.setText("Monitoreo de Actividades");

        ScrollPaneMonitoreoTickets.setAutoscrolls(true);

        PanelMonitoreoTickets.setBackground(new java.awt.Color(255, 255, 255));
        PanelMonitoreoTickets.setAutoscrolls(true);

        javax.swing.GroupLayout PanelMonitoreoTicketsLayout = new javax.swing.GroupLayout(PanelMonitoreoTickets);
        PanelMonitoreoTickets.setLayout(PanelMonitoreoTicketsLayout);
        PanelMonitoreoTicketsLayout.setHorizontalGroup(
            PanelMonitoreoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );
        PanelMonitoreoTicketsLayout.setVerticalGroup(
            PanelMonitoreoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        ScrollPaneMonitoreoTickets.setViewportView(PanelMonitoreoTickets);

        labelMonitoreoTickets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelMonitoreoTickets.setText("Monitoreo de Tickets");

        javax.swing.GroupLayout TabPanelMonitoreoLayout = new javax.swing.GroupLayout(TabPanelMonitoreo);
        TabPanelMonitoreo.setLayout(TabPanelMonitoreoLayout);
        TabPanelMonitoreoLayout.setHorizontalGroup(
            TabPanelMonitoreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelMonitoreoLayout.createSequentialGroup()
                .addGroup(TabPanelMonitoreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelMonitoreoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ScrollPaneMonitoreoConexiones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollPaneMonitoreoActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollPaneMonitoreoTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabPanelMonitoreoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(labelMonitoreoConexiones)
                        .addGap(225, 225, 225)
                        .addComponent(labelMonitoreoActividades)
                        .addGap(240, 240, 240)
                        .addComponent(labelMonitoreoTickets)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        TabPanelMonitoreoLayout.setVerticalGroup(
            TabPanelMonitoreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelMonitoreoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(TabPanelMonitoreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMonitoreoActividades)
                    .addComponent(labelMonitoreoConexiones)
                    .addComponent(labelMonitoreoTickets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabPanelMonitoreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPaneMonitoreoActividades)
                    .addComponent(ScrollPaneMonitoreoConexiones)
                    .addComponent(ScrollPaneMonitoreoTickets))
                .addContainerGap())
        );

        TabMonitoreo.addTab("Monitoreo", TabPanelMonitoreo);

        btnBajarServidor.setBackground(new java.awt.Color(153, 153, 153));
        btnBajarServidor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBajarServidor.setText("Bajar Servidor");

        labelTiquetico.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelTiquetico.setText("TIQUETICO");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TabMonitoreo, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelTiquetico, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBajarServidor)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBajarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTiquetico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabMonitoreo))
        );

        labelServidor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelServidor.setForeground(new java.awt.Color(0, 0, 204));
        labelServidor.setText("SERVIDOR");

        btnCerrar.setFont(new java.awt.Font("Arial", 2, 8)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCerrar.jpg"))); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelServidor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelServidor))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketsVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTicketsVerdeActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        refrescarPanelEmpleados("Joaquin Mena", Categorias.VERDE,"8","12");
        refrescarPanelEmpleados("Maria Castro", Categorias.ROJO,"12","6");
        refrescarPanelEmpleados("Juan Hernandez", Categorias.AMARILLO,"20","45");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        refrescarPanelTicketsSinAsignar("T00 Maquina en mal estado");
        refrescarPanelTicketsSinAsignar("T01 No hay internet");
        refrescarPanelTicketsSinAsignar("T02 Monitor no enciene");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelServidor().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEncargados;
    private javax.swing.JComboBox<String> ComboBoxFiltroCategoria;
    private javax.swing.JComboBox<String> ComboBoxFiltroEstado;
    private javax.swing.JPanel PanelConexionesEmpleados;
    private javax.swing.JPanel PanelConexionesEstado;
    private javax.swing.JPanel PanelConfigAmarillo;
    private javax.swing.JPanel PanelConfigRojo;
    private javax.swing.JPanel PanelConfigVerde;
    private javax.swing.JPanel PanelConsultas;
    private javax.swing.JPanel PanelConsultasTickets;
    private javax.swing.JPanel PanelContornoEstados;
    private javax.swing.JPanel PanelMonitoreoActividades;
    private javax.swing.JPanel PanelMonitoreoConexiones;
    private javax.swing.JPanel PanelMonitoreoTickets;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTicketsAmarillo;
    private javax.swing.JPanel PanelTicketsRojo;
    private javax.swing.JPanel PanelTicketsVerde;
    private javax.swing.JProgressBar ProgressBarPromedioAtencion;
    private javax.swing.JScrollPane ScrollPaneAmarillo;
    private javax.swing.JScrollPane ScrollPaneMonitoreoActividades;
    private javax.swing.JScrollPane ScrollPaneMonitoreoConexiones;
    private javax.swing.JScrollPane ScrollPaneMonitoreoTickets;
    private javax.swing.JScrollPane ScrollPaneRojo;
    private javax.swing.JScrollPane ScrollPaneTickets;
    private javax.swing.JScrollPane ScrollPaneTicketsAmarillo;
    private javax.swing.JScrollPane ScrollPaneTicketsEstado;
    private javax.swing.JScrollPane ScrollPaneVerde;
    private javax.swing.JSpinner Spinner1;
    private javax.swing.JSpinner Spinner2;
    private javax.swing.JSpinner Spinner3;
    private javax.swing.JSpinner Spinner4;
    private javax.swing.JSpinner Spinner5;
    private javax.swing.JSpinner Spinner6;
    private javax.swing.JTabbedPane TabMonitoreo;
    private javax.swing.JPanel TabPanelConexiones;
    private javax.swing.JPanel TabPanelConfiguracion;
    private javax.swing.JPanel TabPanelConsultas;
    private javax.swing.JPanel TabPanelMonitoreo;
    private javax.swing.JPanel TabPanelTickets;
    private javax.swing.JButton btnAgregarTickets;
    private javax.swing.JToggleButton btnBajarServidor;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnTicketsAmarillo;
    private javax.swing.JButton btnTicketsRojo;
    private javax.swing.JButton btnTicketsVerde;
    private javax.swing.JLabel iconCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooserActivoDesde;
    private com.toedter.calendar.JDateChooser jDateChooserFiltroDesde;
    private com.toedter.calendar.JDateChooser jDateChooserFiltroHasta;
    private java.awt.Label labelCategoria;
    private javax.swing.JLabel labelDesde;
    private javax.swing.JLabel labelEncargado;
    private java.awt.Label labelFechaActivo;
    private javax.swing.JLabel labelFiltroCategoria;
    private javax.swing.JLabel labelFiltroEstado;
    private javax.swing.JLabel labelFiltroFecha;
    private javax.swing.JLabel labelHasta;
    private javax.swing.JLabel labelMetricaEvaluacion;
    private javax.swing.JLabel labelMonitoreoActividades;
    private javax.swing.JLabel labelMonitoreoConexiones;
    private javax.swing.JLabel labelMonitoreoTickets;
    private javax.swing.JLabel labelPromedioAtencion;
    private javax.swing.JLabel labelServidor;
    private java.awt.Label labelTicketsPendientes;
    private java.awt.Label labelTicketsResueltos;
    private javax.swing.JLabel labelTiempoInvertidoAmarillo;
    private javax.swing.JLabel labelTiempoInvertidoRojo;
    private javax.swing.JLabel labelTiempoInviertidoVerde;
    private javax.swing.JLabel labelTiquetico;
    private javax.swing.JLabel txtTicketsPendientes;
    private javax.swing.JLabel txtTicketsResueltos;
    // End of variables declaration//GEN-END:variables
}
