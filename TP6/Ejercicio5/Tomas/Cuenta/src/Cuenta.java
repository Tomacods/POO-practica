public class Cuenta {
    private Float saldo;

    public Cuenta(Float saldoInicial) {
        this.saldo = saldoInicial;
    }
    public synchronized void descontar(float monto) {
        if (saldo >= monto) {
        saldo -= monto;
        System.out.println("nuevo gasto - monto: " + monto + " - Saldo restante " + saldo);
        } else {
        System.out.println("Saldo insuficiente para descontar" + monto);
        }
    }
    public Float getSaldo() {
        return saldo;
    }
}
