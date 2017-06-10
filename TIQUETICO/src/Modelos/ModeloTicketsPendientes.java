
package Modelos;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Joaquín
 */
public class ModeloTicketsPendientes extends AbstractListModel {

    private ArrayList<Ticket> lista = new ArrayList<>();
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Ticket ticket = lista.get(index);
        String cadena = ticket.getIdTicket();
        cadena = cadena+":"+ticket.getProblema();
        return cadena;
    }
    
    public void agregarTicket(Ticket ticket){
        lista.add(ticket);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarTicket(int index){
        lista.remove(index);
         this.fireIntervalRemoved(index, getSize(), getSize()+1);
    }
    
    public Ticket getTicket(int index){
        return lista.get(index);
    }
    
}
