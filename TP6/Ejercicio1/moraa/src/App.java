public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 6; i++) {
            Hilo h = new Hilo(i);
            h.start();
            h.join();
        }
        System.out.println("Fin del main");
    }
}
