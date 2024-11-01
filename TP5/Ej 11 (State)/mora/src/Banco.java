import java.util.ArrayList;

public class Banco {
    private Caja caja;

    public Banco(Caja caja) {
        this.caja = caja;
    }
    public void abrirCaja(){
        caja.abrir();
    }
    public void cerrarCaja(){
        caja.cerrar();
    }
    public void suspenderCaja(){
        caja.suspender();
    }
    public void atenderClientes(ArrayList<Cliente> clientes){
        caja.atender(clientes);
    }
    

}
