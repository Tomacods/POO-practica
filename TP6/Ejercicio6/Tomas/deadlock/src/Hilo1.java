public class Hilo1 extends Thread {
    @Override
    public void run() {
        synchronized (Main.Lock1) { // Changed to Main.Lock1
            System.out.println("Hilo1: Reteniendo a Lock1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Hilo1: Error al dormir");
            }
            System.out.println("Hilo1: Esperando por Lock2");
            synchronized (Main.Lock2) { // Changed to Main.Lock2
                System.out.println("Hilo1: Tengo Lock1 y Lock2");
            }
        }
    }
}