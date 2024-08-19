public class Telefono {

    private String marca;
    private String imei;
    private String modelo;
    private String descripcion;
    private Double precio;

    public Telefono(){
        this.marca = "sin marca";
        this.imei = "sin registrar";
    }

    public Telefono(String marca, String imei, String modelo, String descripcion, Double precio){
        this.marca = marca;
        this.imei = imei;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString(){
        return  this.marca + ", " + this.modelo + ", " + this.precio;
    }

}