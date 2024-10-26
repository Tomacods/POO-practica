public class ArgentinaDecorator extends ProductoDecorator {
    private Producto producto; //No se si hacerlo en el padre y luego heredarlo es lo mismo xd
    public ArgentinaDecorator (Producto producto){
        this.producto = producto;
    }
@Override
public String getPrecio(){
    return "$ARS"+producto.getPrecio();
}
}
