public class Producto {
    private double precio;

    public Producto (double precio){
        this.precio = precio;
    }
    public String getPrecio(){
        return String.format("%.2f",precio);
    }
}
