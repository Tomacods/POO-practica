public class App {
    public static void main(String[] args) throws Exception {

        Incrementar contador = new Incrementar();

        Thread h1 = new Thread(contador);
        Thread h2 = new Thread(contador);
        Thread h3 = new Thread(contador);
        Thread h4 = new Thread(contador);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El valor del contador quedó en: " + contador.getContador());
    }
}
