public class Hilo2 extends Thread{

    public void run () {
        synchronized(Main.Lock2) {
            System.out.println("Hilo2: Reteniendo a Lock2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Hilo2: Esperando por Lock1");
            synchronized(Main.Lock1) {
                System.out.println("Hilo2: Tengo Lock1 y Lock2");
            }
        }
    }
    
}
