public class Lavarropa extends Electrodomestico {
    private boolean carga_frontal;
    private int capacidad_kg;

    public Lavarropa(String modelo, int precio, String marca, String color, boolean carga_frontal, int capacidad_kg) {
        super(modelo, precio, marca, color);
        this.capacidad_kg = capacidad_kg;
        this.carga_frontal = carga_frontal;
    }

    public boolean isCarga_frontal() {
        return carga_frontal;
    }

    public void setCarga_frontal(boolean carga_frontal) {
        this.carga_frontal = carga_frontal;
    }

    public int getCapacidad_kg() {
        return capacidad_kg;
    }

    public void setCapacidad_kg(int capacidad_kg) {
        this.capacidad_kg = capacidad_kg;
    }

    @Override
    public String toString() {
        return  "Lavarropa" + "\n"+ "Modelo: "+modelo + "\n"+"Carga frontal: "+ carga_frontal + "\n"+"Precio: " + precio
                + "\n"+"Capacidad kg: " + capacidad_kg + "\n"+"Marca: "+ marca + "\n"+"Color: " + color + "\n";
    }
    

}
