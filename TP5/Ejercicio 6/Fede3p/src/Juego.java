public abstract class Juego {
    
    protected  String id;
    protected Float importe;

    public Juego (String id, Float importe){
        this.id = id;
        this.importe = importe;
    }

    public abstract Float getPrecio();
}
