public class Cocina extends Electrodomestico{
    private Double capacidadTotal;
    private Double litro;
    public Cocina(String modelo, String marca, String color, Double precio, Double capacidadTotal, Double litro) {
        super(modelo, marca, color, precio);
        this.capacidadTotal = capacidadTotal;
        this.litro = litro;
    }
}
