import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FedePersona {

    private String nombre;
    private String apellido;
    private LocalDate nacimiento;

    public FedePersona(String nombre, String apellido, LocalDate nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public String toString(){
        return ("Apellido y nombre:" + getApellido() + "," + getNombre() + ". Fecha de nacimiento: " + getNacimiento());
    }
    
    public String edad(){
        return "Su edad es: " + ChronoUnit.YEARS.between(getNacimiento(), LocalDate.now());
    }

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

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
