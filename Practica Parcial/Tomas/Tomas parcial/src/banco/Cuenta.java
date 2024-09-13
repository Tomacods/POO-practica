package banco;

public  abstract class Cuenta {
    protected int saldo;
    protected String dueño;
    protected String numeroCuenta;

    public Cuenta(int saldo, String dueño, String numeroCuenta) {
        this.saldo = saldo;
        this.dueño = dueño;
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getDueño() {
        return dueño;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public abstract void pagarConDebito(double monto);
    public abstract void pagarConCredito(double monto, int cuotas);

    
}
