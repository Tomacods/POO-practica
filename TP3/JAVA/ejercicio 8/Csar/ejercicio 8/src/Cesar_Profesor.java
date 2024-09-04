public abstract class Cesar_Profesor {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer horastrabajadas;

    public Cesar_Profesor(String nombre, String apellido, Integer edad, Integer horastrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horastrabajadas = horastrabajadas;
    }

    public abstract Double getRemuneracionMensual ();

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(Integer horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
}
