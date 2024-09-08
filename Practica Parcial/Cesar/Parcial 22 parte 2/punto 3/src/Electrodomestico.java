public abstract class Electrodomestico {
    protected String modelo;
    protected String marca;
    protected String color;
    protected Double precio;

    public Electrodomestico(String modelo, String marca, String color, Double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", precio=" + precio
                + "]";
    } 
}
