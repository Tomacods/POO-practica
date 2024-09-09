public abstract class Electrodomestico {
    protected String modelo;
    protected String marca;
    protected String color;
    protected Integer precio;

    public Electrodomestico(String modelo, String marca, String color, Integer precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Modelo= " + modelo + ", Marca= " + marca + ", Color= " + color + ", Precio= " + precio;
    } 
}
