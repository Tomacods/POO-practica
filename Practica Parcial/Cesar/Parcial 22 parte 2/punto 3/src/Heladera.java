public class Heladera extends Electrodomestico{
    private Integer capacidadTotal;
    private Integer litro;
    public Integer getCapacidadTotal() {
        return capacidadTotal;
    }
    public void setCapacidadTotal(Integer capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }
    public Integer getLitro() {
        return litro;
    }
    public void setLitro(Integer litro) {
        this.litro = litro;
    }
    public Heladera(String modelo, String marca, String color, Integer precio, Integer capacidadTotal, Integer litro) {
        super(modelo, marca, color, precio);
        this.capacidadTotal = capacidadTotal;
        this.litro = litro;
    }
    @Override
    public String toString() {
    
        return super.toString()+ " Capacidad total= " + capacidadTotal + "Litro= "+ litro ;
    }
}
