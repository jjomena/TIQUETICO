package Controladores;

/**
 *
 * @author Joaquín
 */
public class ControladorLogin {
    
    public ControladorLogin(){}
    
    /*Metodo que envia la peticion de conectarse con el servidor, si este lo logra
    *de forma exitosa retorna true si no false
    */
    public static boolean peticionConectarEmpleado(String usuario,String password){
        String sentencia;
        sentencia = "CONECTAR_EMPLEADO ["+usuario+"<"+password+"]";
        String respuesta="CONECTAR_EMPLEADO [true]";//AQUI VA EL METODO QUE ENVIA AL SERVIDOR, esto es un ejemplo como se espera respuesta
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
}
