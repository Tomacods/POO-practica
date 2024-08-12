
public class Alumno {
    private String nombre = "";
    private String apellido = "";
    private int dni = 0;

    public Alumno(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Alumno(){
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
    }
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = 0;
    }
    public void imprimir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.dni);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public int getDni(){
        return this.dni;
    }
    public String getNombreYapellido(){
        return this.nombre + " " + this.apellido;
    }
    
}
