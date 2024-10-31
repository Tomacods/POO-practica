public class Producto implements Component {
    private Double precio;

    public Producto(Double precio) {
        this.precio = precio;
    }

    @Override
    public String getPrecio() {
        String cadena = String.format("%.2f", precio);
        return cadena ;

    }

}
