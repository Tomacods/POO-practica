public class Capitulo {
    private String nombre;
    private Integer orden;
    private Boolean visto;
    
    public Capitulo(String nombre, Integer orden, Boolean visto) {
        this.nombre = nombre;
        this.orden = orden;
        this.visto = visto;
    }
    public Integer getOrden() {
        return orden;
    }
    public void setVisto(Boolean visto) {
        this.visto = visto;
    }
    public Boolean getVisto() {
        return visto;
    }
}
