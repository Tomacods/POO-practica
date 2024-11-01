public class ARSDecorator implements ProductoDecorator {
    private Producto producto;

    public ARSDecorator(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getPrecio() {
        return "$ARS " + producto.getPrecio();
    }
    
}
