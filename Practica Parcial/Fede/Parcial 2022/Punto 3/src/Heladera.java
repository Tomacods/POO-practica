public class Heladera extends Electrodomestico{
    
    private Integer capTotal;
    private Integer litrosFreezer;

    public Heladera(String modelo, Integer precio, String marca, String color, Integer capTotal, Integer litrosFreezer){
        super(modelo, precio, marca, color);
        this.capTotal = capTotal;
        this.litrosFreezer = litrosFreezer;
    }

    @Override
    public String toString() {
        return super.toString() + "      Capacidad total: " + capTotal + "      Freezer en litros:" + litrosFreezer;
    }
}
