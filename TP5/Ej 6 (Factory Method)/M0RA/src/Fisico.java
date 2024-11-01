public class Fisico extends Juego{
    private Double precio_traslado;

    public Fisico(String id, Double importe, Double precio_traslado) {
        super(id, importe);
        this.precio_traslado= precio_traslado;
    }

    @Override
    public Double getPrecio() {
        return precio_traslado * importe;
    }
    
}
