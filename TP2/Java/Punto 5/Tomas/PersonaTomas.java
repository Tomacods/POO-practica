import java.time.LocalDate;


public class PersonaTomas {
    private String nombre;
    private String apellido;
    private LocalDate  fechaNacimiento;

    public PersonaTomas(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaNacimiento;
    }
}
