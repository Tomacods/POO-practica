
public class MateriaFede  {
    
    private String nombre;
    private String codigo;

    public MateriaFede(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}