package banco;

public class CuentaBilleteraVirtual extends Cuenta{
    private String cvu;
    private int monto;
    private int cuotas;

    public CuentaBilleteraVirtual(int saldo, String dueño, String numeroCuenta, String cvu) {
        super(saldo, dueño, numeroCuenta);
        this.cvu = cvu;
    }

    public String getCvu() {
        return cvu;
    }

    public void setCvu(String cvu) {
        this.cvu = cvu;
    }
    
    /*Para las billeteras virtuales cuando se paga con crédito el interés por cuota es del 8%.
En el caso de los pagos con más de una cuota, solo se descontará la primera cuota del saldo */
@Override
public void pagarConDebito(double monto) {
    if (saldo >= monto) {
        saldo -= monto;
    } else {
        System.out.println("Saldo insuficiente.");
    }
}

@Override
public void pagarConCredito(double monto, int cuotas) {
    double interes = monto * 0.08 * cuotas;
    double montoTotal = monto + interes;
    if (saldo >= montoTotal / cuotas) {
        saldo -= montoTotal / cuotas;
    } else {
        System.out.println("Saldo insuficiente.");
    }
}
    
}
