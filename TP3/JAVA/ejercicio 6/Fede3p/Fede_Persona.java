public abstract class Fede_Persona {
    
    private String nombre;
    private String apellido;

    public Fede_Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract String materia();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
