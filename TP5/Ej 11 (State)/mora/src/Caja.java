import java.util.ArrayList;
public class Caja {
    private State state;
    private String nombreCajero;
   //private Cliente cliente;

    public Caja(String nombreCajero){
        this.nombreCajero=nombreCajero;
        this.state = new StateCerrada();//state default
    }
    public void setState(State state){
        this.state=state;
    }
   /*  public State getState(){
        return state;
    }*/

    public void atender(ArrayList<Cliente> clientes){
        state.atender(clientes);
     

    }

    public void suspender(){
        state.suspender();
    }
    public void abrir(){
        state.abrir();
    }
    public void cerrar(){
        state.cerrar();
    }

}
