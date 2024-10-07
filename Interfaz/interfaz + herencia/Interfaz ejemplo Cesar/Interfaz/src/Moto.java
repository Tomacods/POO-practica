public class Moto implements Vehiculo {
    private int velocidad;

    @Override
    public void arrancar() {
        System.out.println("La moto ha arrancado.");
        velocidad = 15; // Velocidad inicial
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido.");
        velocidad = 0;
    }

    @Override
    public int obtenerVelocidad() {
        return velocidad;
    }
}