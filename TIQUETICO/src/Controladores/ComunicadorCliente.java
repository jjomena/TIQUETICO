/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class ComunicadorCliente {
    private BufferedReader in;
    private PrintWriter out;
    private String serverAddress;
    private Socket socket;
    private String usuario;
    private boolean estadoConexion;
    private String respuestaServidor;
    private static ComunicadorCliente INSTANCE = null;
    
/*
    public ComunicadorCliente(String direccionServer, int puerto) throws IOException {
        
        //usuario = usuario;
        serverAddress = direccionServer;
        socket = new Socket(direccionServer, 9001);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        estadoConexion=false;
        
    }
    */
    
    public void generarComunicacion(String direccionServer, int puerto)throws IOException{
        serverAddress = direccionServer;
        socket = new Socket(direccionServer, 9001);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        estadoConexion=false;
        
    }
    
        /*Patron de diseño Singleton*/
    private synchronized static void createInstance() throws IOException{
        if(INSTANCE == null){
            INSTANCE = new ComunicadorCliente();
        }
    }
    
    public static ComunicadorCliente getInstance() throws IOException{
        createInstance();
        return INSTANCE;
    }
    
    public void enviarMensaje(String mensaje){
        //System.out.println("Este es el mensaje que se va a enviar:"+mensaje);
        out.println(mensaje);
        
        
    }
    
    public String retornarRespuesta(){
        
        return this.respuestaServidor;
    }
    
    
    
    public void run() throws IOException {
        boolean flag=true;
        while (flag) {
            
            
            /*
            Scanner entrada = new Scanner(System.in);
            if(estadoConexion){
                System.out.println("introduzca el mensaje");
            }else{
                System.out.println("introduzca sus credenciales");
            }
            
            enviarMensaje(entrada.nextLine());
            */
            
            
            
            String line = in.readLine();

            if (line.startsWith("CONECTAR_EMPLEADO")) {
                line=line.replaceAll(" ", "");
                
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
                
            } else if (line.startsWith("SOLICITAR_TICKETS")) {
                
                
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
                
                
            } else if(line.startsWith("RESERVAR_TICKET")){
                
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
                
            }else if(line.startsWith("ACTUALIZAR_TICKET")){
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
            }else if(line.startsWith("LIBERAR_TICKET")){
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
            }else if(line.startsWith("REPORTE_TICKET")){
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
            }else if(line.startsWith("DESCONECTAR_EMPLEADO")){
                
                System.out.println("Retorno del servidor:");
                System.out.println(line + "\n");
                this.respuestaServidor=line;
                
                estadoConexion=false;
                socket.close();
                flag=false;
            }else{
                System.out.println("ERROR! No se ha reconocido la instrucción.");
            }
        }
        
        if(!flag){
            System.out.println("La conexión se ha cerrado!!!");
        }
    }
    
    
}
