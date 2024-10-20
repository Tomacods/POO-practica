import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class App {
    public static void main(String[] args) throws Exception {
        List<Sensor> sensores = Arrays.asList(new Termometro(), new Anemometro());
        Boya boya1 = new Boya(sensores, "CIDMAR-1");
        Boya boya2 = new Boya(sensores, "CIDMAR-2");
        Servidor servidor = new Servidor();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        AtomicInteger paquetesEnviados = new AtomicInteger(0);

        Runnable productor = () -> {
            while (paquetesEnviados.get() < 5) {
                try {
                    boya1.enviarPaquete(servidor);
                    paquetesEnviados.incrementAndGet();
                    Thread.sleep(5000);
                } catch (FallaComunicacionException e) {
                    System.out.println(e.getMessage());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable consumidor = () -> {
            while (paquetesEnviados.get() < 5 || !servidor.colaPaquetes.isEmpty()) {
                servidor.consultarPaquetes();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        executor.execute(productor);
        executor.execute(consumidor);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
}