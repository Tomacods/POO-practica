public  abstract class Juego { //Producto
    protected String id;
    protected Double importe;

    public Juego(String id, Double importe) {
        this.id = id;
        this.importe = importe;
    }

    public abstract Double getPrecio();
}
