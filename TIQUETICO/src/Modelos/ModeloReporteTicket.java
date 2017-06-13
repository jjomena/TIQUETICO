package Modelos;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class ModeloReporteTicket extends AbstractListModel {

    private ArrayList<Reporte> listaReportes = new ArrayList<>();
    @Override
    public int getSize() {
        return listaReportes.size();
    }

    @Override
    public Object getElementAt(int index) {
        Reporte reporte = listaReportes.get(index);
        String cadena = reporte.getIdTicket();
        cadena = cadena+":"+reporte.getProblema();
        return cadena;
    }
    public void agregarReporte(Reporte reporte){
        listaReportes.add(reporte);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminarReporte(int index){
        listaReportes.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
        public Reporte getReporte(int index){
        return listaReportes.get(index);
    }
    
    public void eliminarTodosReportes(){
        listaReportes.clear();
    }
    
}
