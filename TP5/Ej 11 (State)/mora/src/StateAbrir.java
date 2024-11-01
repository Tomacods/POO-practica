import java.util.ArrayList;
public class StateAbrir implements State {
  //  private ArrayList<Cliente> clientes;


    @Override
    public void atender(ArrayList<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++ ){
            //clientes.remove(clientes.get(i));
            if (i+1 < clientes.size()){
                
        System.out.println("Siguiente cliente: " + clientes.get(i+1).getNombre());
    

            }

    }

    }

    
    @Override
    public void abrir() {
        System.out.println("Caja abierta.");
    }

    @Override
    public void suspender() {
        System.out.println("Caja suspendida");
    }

    @Override
    public void cerrar() {
        System.out.println("Caja cerrada");
    }

}
