
public abstract class Personal {
    protected String nombre;
    protected Integer antiguedad;
    protected String sector;
    protected Integer horasTrabajadas;

    public Personal(String nombre, Integer antiguedad, String sector, Integer horasTrabajadas) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.sector = sector;
        this.horasTrabajadas = horasTrabajadas;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    public Integer getAntiguedad() {
        return antiguedad;
    }
    public String getSector() {
        return sector;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    // metodo abstracto
    public abstract Integer HorasTrabajadas();
    
}
