public class Heladera extends Electrodomestico{
    private Double capacidadTotal;
    private Double litro;
    public Double getCapacidadTotal() {
        return capacidadTotal;
    }
    public void setCapacidadTotal(Double capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }
    public Double getLitro() {
        return litro;
    }
    public void setLitro(Double litro) {
        this.litro = litro;
    }
    public Heladera(String modelo, String marca, String color, Double precio, Double capacidadTotal, Double litro) {
        super(modelo, marca, color, precio);
        this.capacidadTotal = capacidadTotal;
        this.litro = litro;
    }
    @Override
    public String toString() {
    
        return super.toString()+ "Capacidad total= " + capacidadTotal + "Litro= "+ litro ;
    }
}
