public class Main {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        hilo1.start();
        hilo2.start();
    }

    private static class Hilo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Hilo 1: Reteniendo a Lock1...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Hilo 1: Esperando a Lock2...");
                synchronized (Lock2) {
                    System.out.println("Hilo 1: Reteniendo a Lock1 y Lock2");
                }
            }
        }
    }

    private static class Hilo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Hilo 2: Reteniendo a Lock2...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Hilo 2: Esperando por Lock1...");
                synchronized (Lock1) {
                    System.out.println("Hilo 2: Reteniendo a Lock1 y Lock2");
                }
            }
        }
    }
}
// https://oregoom.com/java/deadlock-entre-hilos/
/*
 * Ambos intentan ejecutar,
 * pero lo hacen en un orden diferente, lo que provoca un deadlock.
 * Hilo1 incorpora primero a lock 1 y espera a Lock2,
 * e Hilo2 incorpora primero a lock2 y espera por lock2.
 * Ninguno de los dos hilos puede continuar porque ambos estan esperando
 * Solucion: que lo hagan en mismo orden, q la clase hilo2 primero incorpore a
 * lock1 y dps a lock2,
 * como lo hace la clase hilo1. sino al reves tambien funciona.
 * salida:
 * Hilo 1: Reteniendo a Lock1...
 * Hilo 1: Esperando a Lock2...
 * Hilo 1: Reteniendo a Lock1 y Lock2
 * Hilo 2: Reteniendo a Lock2...
 * Hilo 2: Esperando por Lock1...
 * Hilo 2: Reteniendo a Lock1 y Lock2
 */
