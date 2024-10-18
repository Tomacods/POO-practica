public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            HolaMundoHilo thread = new HolaMundoHilo(i);
            thread.start();
        }
    }
}