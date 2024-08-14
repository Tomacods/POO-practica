import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

//constructor
    public Persona (String nombre, String apellido, LocalDate fechaNacimiento){ 
        this.nombre = nombre;
        this.apellido= apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    //getters 
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public LocalDate getFechaNac (){
        return fechaNacimiento;
    }


    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNac(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString(){
        return "//Nombre: " + nombre + "// Apellido: " + apellido + "// Fecha de nacimiento " + fechaNacimiento;

    }
}
