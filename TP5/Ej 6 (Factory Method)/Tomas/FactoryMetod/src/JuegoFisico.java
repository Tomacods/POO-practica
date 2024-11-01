public class JuegoFisico extends Juego {

    private float precioTraslado;

    public JuegoFisico(String id, float importe, float precioTraslado) {
        super(id, importe);
        this.precioTraslado = precioTraslado;
    }
    @Override
    public float getPrecio() {
        return importe + precioTraslado;
    }
    
}
