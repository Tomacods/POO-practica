import java.util.concurrent.CountDownLatch; //esta libreria se utiliza para sincronizar hilos
import java.util.concurrent.ThreadLocalRandom; //esta libreria se utiliza para generar numeros aleatorios

class Corredor extends Thread {
    //declaro que voy a usar
    private final int numero;
    private final CountDownLatch latch; //latch es una barrera que se utiliza para sincronizar hilos
    private long tiempo;
    //constructor
    public Corredor(int numero, CountDownLatch latch) {
        this.numero = numero;
        this.latch = latch;
    }

    @Override
    public void run() { //metodo que se ejecuta cuando se inicia el hilo
        try {
            System.out.println("Inicia Corredor " + numero); //imprime el numero del corredor
            tiempo = ThreadLocalRandom.current().nextInt(5, 11) * 1000; //genera un numero aleatorio entre 5 y 10 y lo multiplica por 1000
            Thread.sleep(tiempo); //duerme el hilo por el tiempo generado
            System.out.println("Tiempo: " + (tiempo / 1000) + " segundos"); //imprime el tiempo que tardo en recorrer
            latch.countDown(); //decrementa el contador de la barrera
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt();
        }
    }

    public long getTiempo() { //metodo que devuelve el tiempo que tardo en recorrer
        return tiempo;
    }
}
