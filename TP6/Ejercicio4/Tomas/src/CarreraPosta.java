import java.util.concurrent.CountDownLatch; //esta libreria se utiliza para sincronizar hilos



public class CarreraPosta {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(1);
        CountDownLatch latch4 = new CountDownLatch(1);

        Corredor corredor1 = new Corredor(1, latch1);
        Corredor corredor2 = new Corredor(2, latch2);
        Corredor corredor3 = new Corredor(3, latch3);
        Corredor corredor4 = new Corredor(4, latch4);

        long startTime = System.currentTimeMillis();

        corredor1.start();
        latch1.await();
        corredor2.start();
        latch2.await();
        corredor3.start();
        latch3.await();
        corredor4.start();
        latch4.await();

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("Tiempo total " + totalTime + " segundos.");
    }
}