package Controladores;

import java.io.IOException;

/**
 *
 * @author Joaquín
 */
public class ControladorConexion {
    
    public static void conectarServidor(String direccion,String puerto) throws IOException{
        int puertoId = Integer.parseInt(puerto);
        ComunicadorCliente conexion = ComunicadorCliente.getInstance();
        conexion.generarComunicacion(direccion, puertoId);
        conexion.run();
    }
}
