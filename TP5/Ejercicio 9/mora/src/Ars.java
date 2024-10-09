public class Ars implements Component {
    private Producto producto;
    public Ars(Producto producto){
        this.producto=producto;
    }
    @Override
    public String getPrecio() {
        //String cadena = String.format("%.2f", precio);
        return "$ARS " + producto.getPrecio() ;
    }

}
