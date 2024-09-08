package paginaweb;

public class Electrodomesctico {
    protected String marca;
    protected Integer precio;
    protected String modelo;
    protected String color;

    public Electrodomesctico(String marca, Integer precio, String modelo, String color) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public Integer getPrecio() {
        return precio;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Precio: $" + precio + ", Marca: " + marca;
    }
}
