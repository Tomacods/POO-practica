public class Lavarropa extends Electrodomestico {
    private Boolean cargafrontal;
    private Integer capKilo;
    public Lavarropa(String modelo, String marca, String color, Integer precio, Boolean cargafrontal, Integer capKilo) {
        super(modelo, marca, color, precio);
        this.cargafrontal = cargafrontal;
        this.capKilo = capKilo;
    }
    @Override
    public String toString() {
        return super.toString()+ " Tiene carga frontal? " + (cargafrontal ? "Si" : "No") + " Capacidad maxima: "+ capKilo;
    }
}
