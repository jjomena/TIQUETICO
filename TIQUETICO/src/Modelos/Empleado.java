package Modelos;

import tiquetico.Categorias;

/**
 *
 * @author Joaquín
 */
public class Empleado {
    String nombre;
    String categoria;
    String ticketsResueltos;
    String ticketsPendientes;
    
    public Empleado(String nombre,String categoria,
            String ticketResueltos,String ticketsPendientes){
        this.nombre = nombre;
        this.categoria = categoria;
        this.ticketsResueltos = ticketResueltos;
        this.ticketsPendientes = ticketsPendientes;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTicketsResueltos() {
        return ticketsResueltos;
    }

    public void setTicketsResueltos(String ticketsResueltos) {
        this.ticketsResueltos = ticketsResueltos;
    }

    public String getTicketsPendientes() {
        return ticketsPendientes;
    }

    public void setTicketsPendientes(String ticketsPendientes) {
        this.ticketsPendientes = ticketsPendientes;
    }
    
    
    
}
