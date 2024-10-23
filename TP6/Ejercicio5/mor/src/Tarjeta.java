public class Tarjeta extends Thread { //extends Process
    private Integer id;
    private Cuenta cuenta;

    public Tarjeta(Integer id, Cuenta cuenta){
        super();
        this.id=id;
        this.cuenta=cuenta;
    }
    @Override
    public void run(){
        try{
            System.out.println("Uso de tarjeta " + id + ", se descuenta 100");
        cuenta.descontar(100.00);
        System.out.println("Uso de tarjeta" + id + ", se descuenta 100");
        cuenta.descontar(100.00);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo()); 
        Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    
}
