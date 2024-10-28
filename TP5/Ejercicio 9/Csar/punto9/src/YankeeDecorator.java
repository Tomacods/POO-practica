public class YankeeDecorator extends ProductoDecorator {
    private Producto producto; //No se si hacerlo en el padre y luego heredarlo es lo mismo xd
    public YankeeDecorator (Producto producto){
        this.producto = producto;
    }
@Override
public String getPrecio(){
    return "$USD"+producto.getPrecio();
}
}
