public class App {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta = new Cuenta(2000.00);
        for (int i =1; i < 11; i++){
            Tarjeta tarjeta = new Tarjeta(i, cuenta);
            tarjeta.start();
            tarjeta.join();
        }
    }
}
