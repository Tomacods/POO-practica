package paginaweb;

public class Cocina extends Electrodomesctico{
    private Boolean esElectrica;

    public Cocina(String marca, Integer precio, String modelo, String color, Boolean esElectrica) {
        super(marca,precio, modelo, color);
        this.esElectrica = esElectrica;
    }
    public Boolean getEsElectrica() {
        return esElectrica;
    }
    public void setEsElectrica(Boolean esElectrica) {
        this.esElectrica = esElectrica;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ", Eléctrica: " + (esElectrica ? "Sí" : "No");
    }
}
