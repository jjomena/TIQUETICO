
package Controladores;

import Vistas.PanelCliente;
import tiquetico.Categorias;

/**
 *
 * @author Joaquín
 */
public class ControladorCliente {
    
    public ControladorCliente(){
    }
    
    public static void peticionSolicitarTicket(String COLOR){
        String sentencia;
        sentencia = "SOLICITAR_TICKETS ["+COLOR+"]";
        String respuesta="SOLICITAR_TICKET [COLOR#numTicket<problem<idCliente<"
                + "fechaIngreso/numTicket<problem<idCliente<fechaIngreso/numTicket<"
                + "problem<idCliente<fechaIngreso]"; //AQUI VA EL METODO QUE ENVIA AL SERVIDOR, esto es un ejemplo como se espera respuesta
        boolean bandera=false;
        //
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if('#' ==car){
                bandera=!bandera; 
                cadena =respuesta.substring(i+1, respuesta.length()-1);
                String[] words=cadena.split("/");
                for(String w:words){
                    informacionSolicitarTicket(w,COLOR);
                }
                break;
            }
        }
    }
    
    public static void informacionSolicitarTicket(String ticket,String COLOR){
        String[] infoTicket=ticket.split("<");
        String numTicket=infoTicket[0];
        String problema=infoTicket[1];
        String idCliente=infoTicket[2];
        String fechaIngreso=infoTicket[3];
        //
        PanelCliente cliente = PanelCliente.getInstance();
        cliente.agregarTicketPendiente(numTicket, problema, idCliente, fechaIngreso,COLOR);
    }
    
    public static void peticionReservarTicket(String idUsuario,String idTicket){
        String sentencia;
        sentencia = "RESERVAR_TICKET ["+idUsuario+"<"+idTicket+"]";
        String respuesta = "RESERVAR_TICKET [true#idTicket<idCliente<asunto<ingresoTicket<ingresoAtenciónTicket]";
        boolean bandera=false;
        String peticion = "";
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if('[' ==car){
                bandera=!bandera; 
            }
            if('#' == car){
                bandera=!bandera;
                cadena =respuesta.substring(i+1, respuesta.length()-1);
                break;
            }
            if(bandera){
                peticion+=car;
            }
        }
        peticion=peticion.substring(1, peticion.length());
        if("true".equals(peticion)){
            informacionReservarTicket(cadena);
        }
        else{
            //Agregar msj de error al reservar ticket
        }
        
  
    }
    
    public static void informacionReservarTicket(String ticket){
        String[] infoTicket=ticket.split("<");
        String numTicket=infoTicket[0];
        String idCliente=infoTicket[1];
        String asunto=infoTicket[2];
        String fechaIngreso=infoTicket[3];
        String fechaAtencion=infoTicket[4];
        //
        PanelCliente cliente = PanelCliente.getInstance();
        cliente.mensajeExitoReservarTicket(numTicket);
        cliente.refrescarTicketAtendido(numTicket, idCliente, asunto, fechaIngreso, fechaAtencion); 
        cliente.iniciarProceso();
    }
    
    
    public static boolean peticionResolverTicket(String idUsuario,String idTicket,String comentario,String tiempo){
        String sentencia;
        sentencia = "ACTUALIZAR_TICKET ["+idUsuario+"<"+idTicket+"<"+comentario+"<"+tiempo+"]";
        String respuesta = "ACTUALIZAR_TICKET [true]";
        boolean bandera=false;
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if(('[' ==car)||(']' == car)){
                bandera=!bandera; 
            }
            if(bandera){
                cadena+=car;
            }
        }
        cadena=cadena.substring(1, cadena.length());
        return "true".equals(cadena);
        
    }
    
    public static boolean peticionLiberarTicket(String idUsuario,String idTicket,String comentario,String tiempo){
        String sentencia;
        sentencia = "LIBERAR_TICKET ["+idUsuario+"<"+idTicket+"<"+comentario+"<"+tiempo+"]";
        String respuesta = "LIBERAR_TICKET [true]";
        boolean bandera=false;
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if(('[' ==car)||(']' == car)){
                bandera=!bandera; 
            }
            if(bandera){
                cadena+=car;
            }
        }
        cadena=cadena.substring(1, cadena.length());
        return "true".equals(cadena);
    }
    
    public static boolean peticionCerrarConexion(String idUsuario){
       String sentencia;
       sentencia = "DESCONECTAR_EMPLEADO ["+idUsuario+"]";
       String respuesta = "DESCONECTAR_EMPLEADO [true]";
       boolean bandera=false;
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if(('[' ==car)||(']' == car)){
                bandera=!bandera; 
            }
            if(bandera){
                cadena+=car;
            }
        }
        cadena=cadena.substring(1, cadena.length());
        return "true".equals(cadena);
    }
    
    public static void peticionReporteTicketsLiberados(String idUsuario){
        String sentencia;
        sentencia = "REPORTE_TICKET ["+idUsuario+"]";
        String respuesta = "REPORTE_TICKET [LIBERADOS#idTicket<idCliente<asunto<ingresoTicket<"
                + "inicioAtencionTicket<tiempoResolucion<categoría<comentario<"
                + "estado/idTicket<idCliente<asunto<ingresoTicket<"
                + "inicioAtencionTicket<tiempoResolucion<categoría<comentario<"
                + "estado/idTicket<idCliente<asunto<ingresoTicket<inicioAtencionTicket<"
                + "tiempoResolucion<categoría<comentario<estado]";
        boolean bandera=false;
        //
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if('#' ==car){
                bandera=!bandera; 
                cadena =respuesta.substring(i+1, respuesta.length()-1);
                String[] words=cadena.split("/");
                for(String w:words){
                    informacionReporteTicket(w);
                }
                break;
            }
        }
    }
    
    public static void peticionReporteTicketsResueltos(String idUsuario){
        String sentencia;
        sentencia = "REPORTE_TICKET ["+idUsuario+"]";
        String respuesta = "REPORTE_TICKET [RESUELTOS#idTicket<idCliente<asunto<ingresoTicket<"
                + "inicioAtencionTicket<tiempoResolucion<categoría<comentario<"
                + "estado/idTicket<idCliente<asunto<ingresoTicket<"
                + "inicioAtencionTicket<tiempoResolucion<categoría<comentario<"
                + "estado/idTicket<idCliente<asunto<ingresoTicket<inicioAtencionTicket<"
                + "tiempoResolucion<categoría<comentario<estado]";
        boolean bandera=false;
        //
        String cadena = "";
        for (int i=0; i< respuesta.length(); i++){
            char car = respuesta.charAt(i);
            if('#' ==car){
                bandera=!bandera; 
                cadena =respuesta.substring(i+1, respuesta.length()-1);
                String[] words=cadena.split("/");
                for(String w:words){
                    informacionReporteTicket(w);
                }
                break;
            }
        }
    }
    
    
    public static void informacionReporteTicket(String ticket){
        System.out.println(ticket);
        String[] infoTicket=ticket.split("<");
        String idTicket = infoTicket[0];
        String idCliente = infoTicket[1];
        String asunto = infoTicket[2];
        String ingresoTicket = infoTicket[3];
        String inicioAtencio = infoTicket[4];
        String tiempo = infoTicket[5];
        String categoria = infoTicket[6];
        String comentario = infoTicket[7];
        String estado = infoTicket[8];
        //
        //PanelCliente cliente = PanelCliente.getInstance();
        //cliente.agregarReporteTicket(idTicket, idCliente, tiempo, ingresoTicket, inicioAtencio, tiempo, categoria, comentario, estado);
        
    }
}
