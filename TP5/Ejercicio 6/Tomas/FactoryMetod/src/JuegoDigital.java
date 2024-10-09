public class JuegoDigital extends Juego {
    private float precioPlataforma;

    public JuegoDigital(String id, float importe, float precioPlataforma) {
        super(id, importe);
        this.precioPlataforma = precioPlataforma;
    }
    @Override
    public float getPrecio() {
        return importe + precioPlataforma;
    }
    
}
