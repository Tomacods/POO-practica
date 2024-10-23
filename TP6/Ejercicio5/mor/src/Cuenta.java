public class Cuenta {
    private Double saldo;

    public Cuenta (Double saldo){
        this.saldo = saldo;
    }

    public synchronized void descontar (Double cantidad){
        saldo -= cantidad;
        notifyAll();
    }
    public Double getSaldo(){
        return saldo;
    }

    
}