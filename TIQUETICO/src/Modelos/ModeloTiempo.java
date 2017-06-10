package Modelos;

import java.util.Calendar;

/**
 *
 * @author Joaquín
 */
public class ModeloTiempo {
    
    int tiempoAcumulado=0;
    int hora, minutos, segundos;
    int hora2,minutos2,segundos2;
    
    
    
    public void iniciarProceso(){
        Calendar calendario = Calendar.getInstance();
        this.hora = calendario.get(Calendar.HOUR_OF_DAY);
        this.minutos = calendario.get(Calendar.MINUTE);
        this.segundos = calendario.get(Calendar.SECOND);
        System.out.println("hora "+hora+" minutos "+minutos+" segundos "+segundos);
    }
    
    public void pausarProceso(){
        Calendar calendario2 = Calendar.getInstance();
        this.hora2 = calendario2.get(Calendar.HOUR_OF_DAY);
        this.minutos2 = calendario2.get(Calendar.MINUTE);
        this.segundos2 = calendario2.get(Calendar.SECOND);
        System.out.println("hora "+hora2+" minutos "+minutos2+" segundos "+segundos2);
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
        System.out.println("TIEMPO ACUMULADO "+tiempoAcumulado);
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
