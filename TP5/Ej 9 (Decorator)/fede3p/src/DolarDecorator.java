public class DolarDecorator implements ProdDecorator {

    private Producto producto;

    public DolarDecorator(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getPrecio() {
        return "$USD " + producto.getPrecio();
    }
}