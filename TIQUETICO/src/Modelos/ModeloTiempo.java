package Modelos;

import java.util.Calendar;

/**
 *
 * @author Joaquín
 */
public class ModeloTiempo {
    Calendar calendario = Calendar.getInstance();
    int tiempoAcumulado=0;
    int hora, minutos, segundos;
    int hora2,minutos2,segundos2;
    
    
    
    public void iniciarProceso(){
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        //
        /*
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
        tiempoAcumulado = tiempoAcumulado+(Calculo-Calculo2);
*/
    }
    
    public void pausarProceso(){
        hora2 = calendario.get(Calendar.HOUR_OF_DAY);
        minutos2 = calendario.get(Calendar.MINUTE);
        segundos2 = calendario.get(Calendar.SECOND);
        //
        int parHora = (12-hora)*3600;
        int parHora2 = (12-hora2)*3600;
        //
        int parMin = (60-minutos)*60;
        int parMin2 = (60-minutos2)*60;
        //
        int parSeg = (60-segundos);
        int parSeg2 = (60-segundos2);
        //
        int Calculo = parHora+parMin+parSeg;
        int Calculo2 = parHora2+parMin2+parSeg2;
        //
        tiempoAcumulado = tiempoAcumulado+(Calculo-Calculo2);
    }
    
    public String calcularProceso(){
//
        int tiempoParcial = tiempoAcumulado;
        int horasParcial = tiempoParcial / 3600;
        //

        tiempoParcial = tiempoParcial-(horasParcial*3600);
        //
        int minutosParcial = tiempoParcial / 60;
        //
        tiempoParcial = tiempoParcial-(minutosParcial*60);
        
        String cadenaHoras = String.valueOf(horasParcial);
        String cadenaMinutos = String.valueOf(minutosParcial);
        String cadenaSegundos = String.valueOf(tiempoParcial);
        //
        String tiempoExacto = cadenaHoras+":"+cadenaMinutos+":"+cadenaSegundos;
        //
        return tiempoExacto;   
    }
    
    public String getTiempoAcumulado(){
        String tiempo = String.valueOf(tiempoAcumulado);
        return tiempo;
    }
}
