public class Ejercicio2 implements Runnable {

    private Compartido compartido;

    public Ejercicio2(Compartido compartido) {
        super();
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            compartido.incrementar();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
