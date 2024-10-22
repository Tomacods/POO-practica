public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i<= 6; i++){
            HolaMundoHilo thread = new HolaMundoHilo(i);
            thread.start();/*  Siempre lo usamos para inicializar hilos */
        }
    }
}
