public class Cocina extends Electrodomestico {
    private Boolean eselec;

    public Cocina(String modelo, String marca, String color, Double precio, Boolean eselec) {
        super(modelo, marca, color, precio);
        this.eselec = eselec;
    }
    @Override
    public String toString() {
        return super.toString()+ "Es electrico? = " + (eselec ? "Si" : "No");
    }
}
