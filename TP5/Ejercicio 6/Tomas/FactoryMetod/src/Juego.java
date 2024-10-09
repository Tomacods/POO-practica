public abstract class Juego {
    protected String id;
    protected float importe;

    public Juego (String id, float importe) {
        this.id = id;
        this.importe = importe;
    }
    public abstract float getPrecio();
    
}
