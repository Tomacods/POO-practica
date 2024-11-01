public class PesoDecorator implements ProdDecorator{
    
    private Producto producto;

    public PesoDecorator(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getPrecio() {
        return "$ARS " + producto.getPrecio();
    }
}
