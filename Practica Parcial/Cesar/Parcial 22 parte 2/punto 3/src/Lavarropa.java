public class Lavarropa extends Electrodomestico {
    private Boolean cargafrontal;
    private Double capKilo;
    public Lavarropa(String modelo, String marca, String color, Double precio, Boolean cargafrontal, Double capKilo) {
        super(modelo, marca, color, precio);
        this.cargafrontal = cargafrontal;
        this.capKilo = capKilo;
    }
    @Override
    public String toString() {
        return super.toString()+ "Tiene carga frontal?" + (cargafrontal ? "Si" : "No") + "Capacidad maxima: "+ capKilo;
    }
    

}
