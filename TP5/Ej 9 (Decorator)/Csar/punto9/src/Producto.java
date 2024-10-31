public class Producto {
    private String nombre;
    private Double precio;
    public Producto(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPrecio(){
        return String.format("%.2f",precio);
        
    }

}
