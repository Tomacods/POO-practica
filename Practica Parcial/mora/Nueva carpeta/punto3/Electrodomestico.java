public abstract class Electrodomestico {
    protected  String modelo;
    protected int precio;
    protected String marca;
    protected String color;
//  Constructor
    public Electrodomestico(String modelo, int precio, String marca, String color) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
    }
//  Getters
    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
    
    //Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    


}
