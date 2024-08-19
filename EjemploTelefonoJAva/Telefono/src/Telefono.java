public  class Telefono {
    private String marca;
    private String imei;
    private String modelo;
    private String descripcion;
    private Double precio;

    public Telefono(String marca, String imei, String modelo, String descripcion, Double precio) {
        this.marca = marca;
        this.imei = imei;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Telefono (){
        this.marca = "sin registrar";
        this.imei = "sin registrar";
    }
    
    @Override
    public String toString (){
        return "Marca: " + marca + "\nImei: " + imei + "\nModelo: " + modelo + "\nDescripcion: " + descripcion + "\nPrecio: " + precio;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public String getImei() {
        return imei;
    }
    public String getModelo() {
        return modelo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Double getPrecio() {
        return precio;
    }


}

