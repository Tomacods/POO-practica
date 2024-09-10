public class Lavarropa extends Electrodomestico{
    
    private Boolean cargaFrontal;
    private Integer capKilo;

    public Lavarropa(String modelo, Integer precio, String marca, String color, Boolean cargaFrontal, Integer capKilo){
        super(modelo, precio, marca, color);
        this.cargaFrontal = cargaFrontal;
        this.capKilo = capKilo;
    }

    @Override
    public String toString() {
        return super.toString() + "     Carga frontal? " + cargaFrontal + "     Capacidad en kilogramos: " + capKilo;
    }
}
