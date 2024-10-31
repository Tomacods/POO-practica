public class Torta {
    private final String nombre;
    private String relleno;
    private String masa;
    private String decoracion;
    
    
    public Torta(String nombre){
        this.nombre = nombre;
    }
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }
    @Override
    public String toString() {
        return "Torta [nombre=" + nombre + ", relleno=" + relleno + ", masa=" + masa + ", decoracion=" + decoracion;
    }
}
