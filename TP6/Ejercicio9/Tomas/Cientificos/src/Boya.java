
import java.util.*;


class Boya {
    private List<Sensor> sensores;
    private String nombre;

    public Boya(List<Sensor> sensores, String nombre) {
        this.sensores = sensores;
        this.nombre = nombre;
    }

    public void enviarPaquete(Servidor servidor) throws FallaComunicacionException {
        if (new Random().nextDouble() < 0.4) {
            throw new FallaComunicacionException("ERROR: " + nombre + " Hubo una falla en la comunicación, se perdió el paquete");
        }
        Map<String, Double> datos = new HashMap<>();
        for (Sensor sensor : sensores) {
            datos.put(sensor.getClass().getSimpleName(), sensor.sensar());
        }
        servidor.almacenarPaquete(datos);
    }
}
