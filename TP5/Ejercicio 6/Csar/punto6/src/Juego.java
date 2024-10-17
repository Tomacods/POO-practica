public abstract class Juego {
    protected Integer id;
    protected Double importe;

    public Juego(Integer id, Double importe) {
        this.id = id;
        this.importe = importe;
    }

    public abstract Double getPrecio();
}
