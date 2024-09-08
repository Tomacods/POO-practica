public class Heladera extends Electrodomestico{
    private int capacidad_total;
    private int capacidad_freezer;
    public Heladera(String modelo, int precio, String marca, String color, int capacidad_freezer, int capacidad_total){
        super(modelo, precio, marca, color);
        this.capacidad_freezer=capacidad_freezer;
        this.capacidad_total=capacidad_total;
    }
    public int getCapacidad_total() {
        return capacidad_total;
    }
    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }
    public int getCapacidad_freezer() {
        return capacidad_freezer;
    }
    public void setCapacidad_freezer(int capacidad_freezer) {
        this.capacidad_freezer = capacidad_freezer;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + "\n" +
        "Precio: " + precio + "\n" + "Modelo" + modelo + "\n" +
        "Capacidad en kg: " + capacidad_total + "\n" + "Capacidad en litros: " +
        "\n" + capacidad_freezer + "\n" + "Color: " + color + "\n";
    }
    

}
