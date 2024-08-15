import java.time.LocalDate;

public class Fede_P11_Persona {

    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String sexo;
    private Boolean trabaja;
    private Boolean estudia;

    public Fede_P11_Persona(String nombre, String apellido, LocalDate nacimiento, String sexo, Boolean trabaja, Boolean estudia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.estudia = estudia;
    }

    public void imprimir(){
        System.out.println("Nombre y apellido: " + getNombre() + " " + getApellido());
        System.out.println("Fecha de nacimiento: " + getNacimiento() + "    Edad: "+ getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Trabaja? " + getTrabaja());
        System.out.println("Estudia? " + getEstudia());
    }

    public void nuevoEmpleado(){
        System.out.print("Ingrese el nombre: ");
        setNombre();
        System.out.print("Ingrese el apellido: ");
        getNacimiento();
        System.out.print("Ingrese el sexo: ");
        get
        System.out.print("Trabaja? ");
        System.out.print("Estudia? ");
    }

    public Integer getEdad(){
        return LocalDate.now().compareTo(getNacimiento());
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
