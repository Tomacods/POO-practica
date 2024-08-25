public class Fede_ProfesorTitular {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer horasTrabajadas;
    private Integer antiguedad;
    private Double valorAntiguedad = 1000.00;
    private Double valorHora = 300.00;

    public Fede_ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
        this.antiguedad = antiguedad;
    }

    public Double getRemuneracionAntiguedad(){
        return this.valorAntiguedad * this.getAntiguedad();
    }

    public Double getRemuneracionMensual(){
        return this.valorHora * getHorasTrabajadas() * getRemuneracionAntiguedad();
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

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
}
