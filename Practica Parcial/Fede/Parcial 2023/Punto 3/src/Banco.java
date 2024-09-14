public class Banco extends Cuenta{
    
    private Integer cbu;

    public Banco(Integer saldo, String dueno, Integer nroCuenta, Integer cbu){
        super(saldo, dueno, nroCuenta);
        this.cbu = cbu;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    @Override
    public void pagoDebito(Double precio) {
        if ((double) saldo >= precio){
            saldo = (int)((double) saldo - precio);
            saldo = (int) ((double) saldo + precio * 0.1);
        } else {
            System.out.println("El saldo es insuficiente para realizar este movimiento.");
        }
    }

    @Override
    public void pagoCredito(Double precio, Integer cuotas) {
        Double interes = 0.0;
        if (cuotas > 3){
            interes = precio * 0.02 * (double) cuotas;
        } Double total = interes + precio;
        if ((double) saldo >= (total/(double) cuotas)){
            saldo = (int)((double) saldo - (total/(double) cuotas));
        } else {
            System.out.println("El saldo es insuficiente para realizar este movimiento.");
        }
    }
}
