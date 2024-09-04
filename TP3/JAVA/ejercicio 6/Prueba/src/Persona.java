public abstract class Persona {
    private String nombre;
    private String apellido;

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
    return this. nombre;
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    public String getApe11ido(){
    return this.apellido;
    }

    public void setApe11ido(String apellido){
    this.apellido = apellido;
    }

    public abstract String materia();  
}