import java.util.ArrayList;

public class StateSuspendida implements State{
    // private ArrayList<Cliente> clientes;
    @Override
    public void atender(ArrayList<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++ ){
        if (clientes.get(i).getEdad() > 60){
        System.out.println("Atendiendo a: " +  clientes.get(i).getNombre());
        } else {
            System.out.println("Caja suspendida. Por favor espere..");
        }}
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
