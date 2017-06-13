
package Modelos;

import tiquetico.Categorias;

/**
 *
 * @author Joaquín
 */
public class Ticket {
    private String idTicket;
    private String problema;
    private String idCliente;
    private String fechaIngreso;
    private String categoria;
    
    public Ticket(String idTicket,String problema,String idCliente,String fechaIngreso,String categoria){
        this.idTicket = idTicket;
        this.problema = problema;
        this.idCliente = idCliente;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria; 
    }
    
    public Ticket(String idTicket,String problema){
        this.idTicket = idTicket;
        this.problema = problema;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
