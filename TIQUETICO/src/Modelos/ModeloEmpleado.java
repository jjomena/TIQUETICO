package Modelos;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
/**
 *
 * @author Joaquín
 */
public class ModeloEmpleado extends AbstractListModel {

    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
    @Override
    public int getSize() {
        return listaEmpleados.size();
    }

    @Override
    public Object getElementAt(int index) {
        Empleado empleado = listaEmpleados.get(index);
        String cadena = empleado.getNombre();
        return cadena;
    }
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarEmpleado(int index){
        listaEmpleados.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Empleado getEmpleado(int index){
        return listaEmpleados.get(index);
    }
    
    public void eliminarTodosEmpleados(){
        listaEmpleados.clear();
    }
    
    
}
