public class Fede_ProfesorSuplente {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer horasTrabajadas;
    private Double valorHora = 200.00;

    public Fede_ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getRemuneracionMensual(){
        return this.valorHora * this.getHorasTrabajadas();
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
