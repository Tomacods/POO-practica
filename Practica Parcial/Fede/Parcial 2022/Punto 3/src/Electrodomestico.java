public abstract class Electrodomestico {

    protected String modelo;
    protected Integer precio;
    protected String marca;
    protected String color;

    public Electrodomestico (String modelo, Integer precio, String marca, String color){
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
    }

    public String toString() {
        return "Modelo: " + modelo + "      Precio: $" + precio + "      Marca: "+ marca + "      Color: " + color;
    }
}