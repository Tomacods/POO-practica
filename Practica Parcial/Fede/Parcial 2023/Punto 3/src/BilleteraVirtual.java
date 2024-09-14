public class BilleteraVirtual extends Cuenta{
    
    private Integer cvu;

    public BilleteraVirtual(Integer saldo, String dueno, Integer nroCuenta, Integer cvu){
        super(saldo, dueno, nroCuenta);
        this.cvu = cvu;
    }

    public Integer getCvu() {
        return cvu;
    }

    public void setCvu(Integer cvu) {
        this.cvu = cvu;
    }

    @Override
    public void pagoDebito(Double precio) {
        if ((double) saldo >= precio){
            saldo = (int)((double) saldo - precio);
        } else {
            System.out.println("El saldo es insuficiente para realizar este movimiento.");
        }
    }

    @Override
    public void pagoCredito(Double precio, Integer cuotas) {
        Double interes = precio * 0.08 * (double) cuotas;
        Double total = interes + precio;
        if ((double) saldo >= (total/(double) cuotas)){
            saldo = (int)((double) saldo - (total/(double) cuotas));
        } else {
            System.out.println("El saldo es insuficiente para realizar este movimiento.");
        }
    }
}
