import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fede_P9_Persona {

    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String sexo;
    private Boolean trabaja;
    private Boolean estudia;

    public Fede_P9_Persona(String nombre, String apellido, LocalDate nacimiento, String sexo, Boolean trabaja, Boolean estudia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.estudia = estudia;
    }

    public void imprimir(){
        System.out.println("Nombre y apellido: " + getNombre() + " " + getApellido());
        System.out.println("Fecha de nacimiento: " + getNacimiento() + "    Edad: "+ ChronoUnit.YEARS.between(getNacimiento(), LocalDate.now()));
        System.out.println("Sexo: " + getSexo());
        System.out.println("Trabaja? " + getTrabaja());
        System.out.println("Estudia? " + getEstudia());
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    public Boolean getEstudia() {
        return estudia;
    }

    public void setEstudia(Boolean estudia) {
        this.estudia = estudia;
    }
}