package tiquetico;

import java.awt.List;
import java.util.ArrayList;

public class AdministradorUsuarios {
    
    private ArrayList<Usuarios> listaUsuarios;
    
    
    public AdministradorUsuarios(){
        listaUsuarios = new ArrayList<Usuarios>();
    }
    
    public ArrayList<Usuarios> getListaUsuarios(){
        return listaUsuarios;
    }
    
    public Usuarios getUsuarioEnLista(int indice){
        return listaUsuarios.get(indice);
    }
    
    public void registrarUsuario(String nombre, Categorias categoria){
        Usuarios user = new Usuarios(nombre,categoria);
        listaUsuarios.add(user);
    }
    
    
}
