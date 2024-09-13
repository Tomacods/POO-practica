public class Producto {
    private String articulo;
    private Integer dosis;
    private Integer precio;
    
    
    public Producto(String articulo, Integer dosis, Integer precio) {
        this.articulo = articulo;
        this.dosis = dosis;
        this.precio = precio;
    }
    public Integer getPrecio() {
        return precio;
    }
    public String toString() {
        return articulo+"            "+ dosis+"mg"+"            " + precio+"\n";
    }
}
