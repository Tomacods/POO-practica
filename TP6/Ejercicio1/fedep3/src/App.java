public class App {
    public static void main(String[] args) throws Exception {
        for (Integer i=1; i <= 6; i++) {
            HolaMundo thread = new HolaMundo(i);
            thread.start();
        }
    }
}
