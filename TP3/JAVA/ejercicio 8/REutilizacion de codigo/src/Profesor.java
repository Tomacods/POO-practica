public abstract class Profesor {
    protected String nombre;
    protected String apellido;
    protected Integer edad;
    protected Integer horasTrabajadas ;
    protected Double valorHora = 300.0;

    public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
    }
    //getter y setter
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
    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }
    //herencia de remunrecion mensual
    public abstract Double get_remuneracion_mensual();
}
