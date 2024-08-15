import java.time.LocalDate;

public class PersonaTomas {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String sexo;
    private boolean estudia_Trabaja;

    public PersonaTomas(String nombre, String apellido, LocalDate fechaNacimiento, String sexo, boolean estudia_Trabaja) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.estudia_Trabaja = estudia_Trabaja;
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
    public String getSexo() {
        return sexo;
    }
    public boolean getEstudia_Trabaja() {
        return estudia_Trabaja;
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
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEstudia_Trabaja(boolean estudia_Trabaja) {
        this.estudia_Trabaja = estudia_Trabaja;
    }
    public int getEdad() { //parte del ejercicio 7 del trabajo practico 2
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre + " apellido: " + apellido); 
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Sexo: " + sexo);
        if (estudia_Trabaja) {
            System.out.println("Trabaja");
        } else {
            System.out.println("No trabaja");
        }
    }
}
