package banco;

public class CuentaBanco extends Cuenta{
    private String cbu;



    public CuentaBanco(int saldo, String dueño, String numeroCuenta, String cbu) {
        super(saldo, dueño, numeroCuenta);
        this.cbu = cbu;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    /*cuando se paga con débito desde una
cuenta bancaria esta recibe un reintegro del 10%, en cambio al realizar el pago por
crédito desde esta hay que tener en cuenta la cantidad de cuotas ya que si son
menores o iguales a 3 esta no presenta interés, si esto no ocurre deberá sumarle un
interés del 2% por cantidad de cuotas elegidas, esto quiere decir que si se eligió 12
cuotas tendrá un 24% de interés.*/ 

@Override
public void pagarConDebito(double monto) {
    if (saldo >= monto) {
        saldo -= monto;
        saldo += monto * 0.10; // Reintegro del 10%
    } else {
        System.out.println("Saldo insuficiente.");
    }
}

@Override
public void pagarConCredito(double monto, int cuotas) {
    double interes = 0;
    if (cuotas > 3) {
        interes = monto * 0.02 * cuotas;
    }
    double montoTotal = monto + interes;
    if (saldo >= montoTotal / cuotas) {
        saldo -= montoTotal / cuotas;
    } else {
        System.out.println("Saldo insuficiente.");
    }
}
}
    
