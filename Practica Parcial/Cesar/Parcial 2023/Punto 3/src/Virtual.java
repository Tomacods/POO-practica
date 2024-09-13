public class Virtual extends Cuenta {
    private Integer Cvu;


    public Virtual(Double saldo, String dueño, Integer nrocuenta, Integer cvu) {
        super(saldo, dueño, nrocuenta);
        Cvu = cvu;
    }


    @Override
    public void pago(Integer fpago, Double deuda,Integer mes){
        Double Saldo = this.getSaldo();
        Saldo = Saldo - (deuda+(deuda*0.8));
        setSaldo(Saldo);
    }
}