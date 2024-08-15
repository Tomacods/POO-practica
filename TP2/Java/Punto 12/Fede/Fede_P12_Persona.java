import java.time.LocalDate;

public class Fede_P12_Persona {
    
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String sexo;
    private Fede_P12_Puesto puesto;

    public Fede_P12_Persona(String nombre, String apellido, LocalDate nacimiento, String sexo, Fede_P12_Puesto puesto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.puesto = puesto;
    }

    public void imprimir(){
        System.out.println("Nombre y apellido: " + getNombre() + " " + getApellido());
        System.out.println("Fecha de nacimiento: " + getNacimiento() + "    Edad: "+ getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Puesto: " + puesto.getPuesto())
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
