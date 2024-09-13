package banco;

public class Banco extends Cuenta{
    private String cbu;
    private int cuotas;
    private int monto;


    public Banco(int saldo, String dueño, String numeroCuenta, String cbu) {
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
    protected void pagarCredito(int monto , int cuotas) {
        if(cuotas <= 3){
            saldo -= monto;
        }else{
            saldo -= monto + (monto * 0.02 * cuotas);
        }
    }

    @Override
    protected void pagarDebito(int monto) {
        saldo -= monto - (monto * 0.10);
    }
    
}
