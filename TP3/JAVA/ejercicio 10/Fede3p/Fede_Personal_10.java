public abstract class Fede_Personal_10 {
    
    protected String nombre;
    protected String apellido;
    protected Integer antiguedad;
    protected String sector;
    protected Integer horasMensual;

    public Fede_Personal_10(String nombre, String apellido, Integer antiguedad, String sector, Integer horasMensual){
        this.nombre =nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.sector = sector;
        this.horasMensual = horasMensual;
    }

    public abstract Integer horas_trabajadas();

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

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
