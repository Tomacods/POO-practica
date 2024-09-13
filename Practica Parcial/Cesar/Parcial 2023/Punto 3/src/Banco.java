public class Banco extends Cuenta{
    private Integer cbu;

    public Banco(Double saldo, String dueño, Integer nrocuenta, Integer cbu) {
        super(saldo, dueño, nrocuenta);
        this.cbu = cbu;
    }


    @Override
    public void pago(Integer fpago, Double deuda,Integer mes){
        //Pago 1 Debito
        Double Saldo = this.getSaldo();
        if (fpago == 1){
            Saldo = Saldo - deuda;
            Saldo = Saldo + (deuda*0.1);
        }// pago 2 Credito
        else {
            if(mes <= 3){
                Saldo = Saldo - deuda;
            }else{
                Double interes = 0.0;
                interes = 0.2 * mes;
                Saldo = Saldo - (deuda+(deuda*interes));
            }
        }
        setSaldo(Saldo);
    }
}
