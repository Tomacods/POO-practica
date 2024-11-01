import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class Corredor extends Thread {

    private final Integer numero;
    private final CountDownLatch latch; //barrera que sincroniza hilos
    private long tiempo;

    public Corredor (Integer numero, CountDownLatch latch) {
        this.numero = numero;
        this.latch = latch;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("El corredor " + numero + " empezó el recorrido!");
            tiempo = ThreadLocalRandom.current().nextInt(5,11) * 1000;
            Thread.sleep(tiempo);
            System.err.println("El corredor terminó el recorrido en: " + (tiempo/1000) + " segundos.");
            latch.countDown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public long getTiempo() {
        return tiempo;
    }
}