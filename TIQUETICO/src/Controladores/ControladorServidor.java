package Controladores;

import Vistas.PanelServidor;
import tiquetico.Categorias;

/**
 *
 * @author Joaquín
 */
public class ControladorServidor {
    
    public ControladorServidor(){}
    
    
    public static void mostrarConexionesExistentes(String nombre,Categorias categoria,
            String ticketsResueltos,String ticketsPendientes){
        
         PanelServidor servidor = PanelServidor.getInstance();
         servidor.agregarEmpleado(nombre, nombre, ticketsResueltos, ticketsPendientes);
    }
    
    public static void mostrarTicketPendientes(String numTicket,String problema){
        PanelServidor servidor = PanelServidor.getInstance();
        servidor.agregarTicketPendiente(numTicket, problema);  
    }
    
}
