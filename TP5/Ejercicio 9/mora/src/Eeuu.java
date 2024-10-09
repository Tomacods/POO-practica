public class Eeuu implements Component {
    private Producto producto;
    public Eeuu(Producto producto){
        this.producto=producto;
    }
    @Override
    public String getPrecio() {
        //String cadena = String.format("%.2f", precio);
        return "$USD " + producto.getPrecio() ;
    }

}
