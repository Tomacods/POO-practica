public class JuegoDigital extends Juego {
    
    private Float precioPlataforma;
    
    public JuegoDigital(String id, Float importe, Float precioPlataforma){
        super(id, importe);
        this.precioPlataforma = precioPlataforma;
    }

    @Override
    public Float getPrecio() {
        return importe + precioPlataforma;
    }
}
