public class App {
    public static void main(String[] args) throws Exception {
    Cuenta cuenta = new Cuenta(2000.0f);

    Tarjeta [] tarjetas = new Tarjeta[10];
    for (int i = 0 ; i < 10 ; i++) {
        tarjetas[i] = new Tarjeta(i, cuenta);
    }
    for (Tarjeta tarjeta : tarjetas) {
        tarjeta.start();
    }
    for (Tarjeta tarjeta : tarjetas) {
        tarjeta.join();
    }
    System .out.println("Saldo final: " + cuenta.getSaldo());
    }
}
