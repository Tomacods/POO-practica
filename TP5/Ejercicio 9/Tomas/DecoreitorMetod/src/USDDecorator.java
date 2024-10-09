public class USDDecorator implements ProductoDecorator {
    private Producto producto;

    public USDDecorator(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getPrecio() {
        return "$USD " + producto.getPrecio();
    }
}