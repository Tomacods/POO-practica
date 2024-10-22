public class Tarjeta extends Thread{
    private int id;
    private final Cuenta cuenta;

    public Tarjeta(int id, Cuenta cuenta) {
        this.id = id;
        this.cuenta = cuenta;
    }
    @Override
    public void run() {
        cuenta.descontar(100.0f);
        cuenta.descontar(100.0f);
    }
}
