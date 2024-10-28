import java.util.Random;

public class Paquete {
    private String nombre;
    private Double temperatura, velocidad_viento, tiempo;

    public Paquete(String nombre) {
        this.nombre = nombre;
        generarRandom();
    }

    private void generarRandom() {
        Random random = new Random();
        this.temperatura = random.nextDouble(5, 30);
        this.velocidad_viento = random.nextDouble(3, 47);
        this.tiempo = random.nextDouble();
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getVelocidad_viento() {
        return velocidad_viento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Paquete [nombre=" + nombre + ", temperatura=" + temperatura + ", velocidad_viento=" + velocidad_viento
                + ", tiempo=" + tiempo + "]";
    }

}
