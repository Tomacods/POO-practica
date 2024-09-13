public abstract class Cuenta {
    protected Double saldo;
    protected String dueño;
    protected Integer nrocuenta;
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Cuenta(Double saldo, String dueño, Integer nrocuenta) {
        this.saldo = saldo;
        this.dueño = dueño;
        this.nrocuenta = nrocuenta;
    }

    public abstract void pago();
}
