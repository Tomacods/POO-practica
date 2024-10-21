public class App {
    public static void main(String[] args) throws Exception {

        Compartido compartido = new Compartido();
        Thread[] hilos = new Thread[4];

        for (int i = 0; i < 4; i++) {
            Ejercicio2 productor = new Ejercicio2(compartido);
            hilos[i] = new Thread(productor);
            hilos[i].start();
        }

        for (int i = 0; i < 4; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Contador: " + compartido.getContador());
    }
}
