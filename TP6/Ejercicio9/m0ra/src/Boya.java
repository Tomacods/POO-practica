import java.util.Random;

public class Boya extends Thread { // Hilo productor
    private String nombre;
    private Servidor servidor;

    public Boya(String nombre, Servidor servidor) {
        this.nombre = nombre;
        this.servidor = servidor;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            try {

                if (random.nextDouble() < 0.4) {
                    throw new ComunicacionException(
                            "ERROR: " + nombre + " Hubo una falla en la comunicación, se perdió el paquete");
                    // System.out.println("ERROR: " + nombre + " Hubo una falla en la comunicación,
                    // se perdió el paquete");
                }

                Paquete paquete = new Paquete(nombre);
                this.servidor.agregar(paquete);
                System.out.println("Boya " + nombre + " ha enviado el paquete: " + paquete);

                // try {
                Thread.sleep(1000);
            } catch (ComunicacionException e) {
                System.out.println(e.getMessage());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        servidor.agregar(null); // sino queda colgado por la excepcion

    }
}