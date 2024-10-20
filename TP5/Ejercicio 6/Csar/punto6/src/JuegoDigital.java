public class JuegoDigital extends Juego{
    private Double precioPlataforma;

    public JuegoDigital(Integer id, Double importe, Double precioPlataforma) {
        super(id, importe);
        this.precioPlataforma = precioPlataforma;
    }
    @Override
    public Double getPrecio(){
        return this.precioPlataforma + this.importe;
    }
}
