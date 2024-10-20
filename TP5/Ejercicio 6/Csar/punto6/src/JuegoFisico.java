public class JuegoFisico extends Juego {
    private Double precioTraslado;
    
public JuegoFisico(Integer id, Double importe, Double precioTraslado) {
        super(id, importe);
        this.precioTraslado = precioTraslado;
    }
@Override
public Double getPrecio() {
    return this.importe + this.precioTraslado;
}
}
