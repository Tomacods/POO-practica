package paginaweb;

public class Heladera extends Electrodomesctico{
    private Integer capacidad;
    private Integer capacidadFreezer;

    public Heladera(String marca, Integer precio, String modelo, String color, Integer capacidad, Integer capacidadFreezer) {
        super(marca, precio, modelo, color);
        this.capacidad = capacidad;
        this.capacidadFreezer = capacidadFreezer;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public Integer getCapacidadFreezer() {
        return capacidadFreezer;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public void setCapacidadFreezer(Integer capacidadFreezer) {
        this.capacidadFreezer = capacidadFreezer;
    }



    @Override
    public String toString() {
        return super.toString() + ", Capacidad Total: " + capacidad + " litros" + ", Capacidad Freezer: " + capacidadFreezer + " litros";
    }
}
