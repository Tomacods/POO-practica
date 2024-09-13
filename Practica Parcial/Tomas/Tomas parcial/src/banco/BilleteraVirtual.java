package banco;

public class BilleteraVirtual extends Cuenta{
    private String cvu;
    private int monto;
    private int cuotas;

    public BilleteraVirtual(int saldo, String dueño, String numeroCuenta, String cvu) {
        super(saldo, dueño, numeroCuenta);
        this.cvu = cvu;
    }

    public String getCvu() {
        return cvu;
    }

    public void setCvu(String cvu) {
        this.cvu = cvu;
    }
    
    //Para las billeteras virtuales cuando se paga con crédito el interés por cuota es del 8%   
    @Override
    protected void pagarCredito(int monto, int cuotas) {
        saldo -= monto + (monto * 0.08 * cuotas);
    }

    @Override
    protected void pagarDebito(int monto) {
        saldo -= monto;
    }
    
}
