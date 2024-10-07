public class Coche implements Vehiculo {
    private int velocidad;

    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
        velocidad = 10; // Velocidad inicial
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
        velocidad = 0;
    }

    @Override
    public int obtenerVelocidad() {
        return velocidad;
    }
}

