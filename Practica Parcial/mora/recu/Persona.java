public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;

    public Persona (String nombre, String apellido, String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }
    
    public String getDni (){
        return dni;
    }
    public String getApellido (){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return " Nombre:" + nombre + "\n" + "Apellido:" + apellido + "\n"+"Dni:" + dni + "\n";
    }

    
    
}
