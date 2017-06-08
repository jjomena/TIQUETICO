package tiquetico;


public class Usuarios {
    private static int contadorID = 1;
    private int idUsuario;
    
    private String nombre;
    private Categorias categoria;
    
    Usuarios(){
        this.idUsuario = contadorID;
        Usuarios.contadorID++;
    }
    
    public Usuarios(String nombre,Categorias categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.idUsuario = contadorID;
        Usuarios.contadorID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    
    
}
