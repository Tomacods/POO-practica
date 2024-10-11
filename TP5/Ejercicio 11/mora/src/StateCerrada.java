import java.util.ArrayList;

public class StateCerrada implements State{
    @Override
    
    public void atender(ArrayList<Cliente> clientes) {
        System.out.println("No se puede atender, la caja esta cerrada");
        
    }

    @Override
    public void abrir(){
        System.out.println("Caja abierta.");
    }
@Override
    public void suspender(){
System.out.println("Caja suspendida");
    }
    @Override
    public void cerrar(){
System.out.println("Caja cerrada");
    }

}
