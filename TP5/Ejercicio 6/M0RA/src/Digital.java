public class Digital extends Juego{
    private Double precio_plataforma;

    public Digital(String id, Double importe, Double precio_plataforma) {
        super(id, importe);
        this.precio_plataforma= precio_plataforma;
    }
@Override
    public Double getPrecio() {
        return precio_plataforma * importe;
    }
    
}
