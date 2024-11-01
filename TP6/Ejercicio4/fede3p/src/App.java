import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch l1 = new CountDownLatch(1);
        CountDownLatch l2 = new CountDownLatch(1);
        CountDownLatch l3 = new CountDownLatch(1);
        CountDownLatch l4 = new CountDownLatch(1);

        Corredor c1 = new Corredor(1, l1);
        Corredor c2 = new Corredor(2, l2);
        Corredor c3 = new Corredor(3, l3);
        Corredor c4 = new Corredor(4, l4);

        long starttime = System.currentTimeMillis();

        c1.start();
        l1.await();
        c2.start();
        l2.await();
        c3.start();
        l3.await();
        c4.start();
        l4.await();

        long endtime = System.currentTimeMillis();
        long totalTime = (endtime - starttime) / 1000;

        System.out.println("Tiempo total: " + totalTime + " segundos");
    }
}
