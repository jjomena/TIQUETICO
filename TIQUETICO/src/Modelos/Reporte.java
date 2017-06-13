/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Joaquín
 */
public class Reporte {
    String idTicket;
    String idCliente;
    String problema;
    String ingresoTicket;
    String inicioAtencion;
    String tiempo;
    String categoria;
    String comentario;
    String estado;
    
    public Reporte(String idTicket,String idCliente,
            String problema,String ingresoTicket,String inicioAtencion,
            String tiempo,String categoria,String comentario, String estado){
        this.idTicket = idTicket;
        this.idCliente = idCliente;
        this.problema = problema;
        this.ingresoTicket = ingresoTicket;
        this.inicioAtencion = inicioAtencion;
        this.tiempo = tiempo;
        this.categoria = categoria;
        this.comentario = comentario;
        this.estado = estado;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getIngresoTicket() {
        return ingresoTicket;
    }

    public void setIngresoTicket(String ingresoTicket) {
        this.ingresoTicket = ingresoTicket;
    }

    public String getInicioAtencion() {
        return inicioAtencion;
    }

    public void setInicioAtencion(String inicioAtencion) {
        this.inicioAtencion = inicioAtencion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
