package Modelos;

import java.util.Calendar;

/**
 *
 * @author Joaquín
 */
public class ModeloTiempo {
    Calendar calendario = Calendar.getInstance();
    int tiempoAcumulado;
    int hora, minutos, segundos;
    
    
    public void iniciarProceso(){
        int hora = 3;
        int min = 15;
        int seg = 10;
        //
        int hora2 = 3;
        int min2 = 20;
        int seg2 = 5;
        //
        int parHora = (12-hora)*3600;
        int parHora2 = (12-hora2)*3600;
        //
        int parMin = (60-min)*60;
        int parMin2 = (60-min2)*60;
        //
        int parSeg = (60-seg);
        int parSeg2 = (60-seg2);
        //
        int Calculo = parHora+parMin+parSeg;
        int Calculo2 = parHora2+parMin2+parSeg2;
        //
        int diferencia = Calculo-Calculo2;
        //
        int w = diferencia / 3600;
        System.out.println("W:"+w);
        //
        diferencia = diferencia-(w*3600);
        //
        int y = diferencia / 60;
        //
        diferencia = diferencia-(y*60);
        
        System.out.println("HORAS: "+w+" minutos "+y+" Segundos "+diferencia);
        
        
        
        
    }
    
    public void pausarProceso(){
        
        
        
    }
    
    
}
