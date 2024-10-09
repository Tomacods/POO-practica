public class JuegoFisico extends Juego{
    
    private Float precioTraslado;

    public JuegoFisico(String id, Float importe, Float precioTraslado){
        super(id, importe);
        this.precioTraslado = precioTraslado;
    }

    @Override
    public Float getPrecio() {
        return importe + precioTraslado;
    }
}
