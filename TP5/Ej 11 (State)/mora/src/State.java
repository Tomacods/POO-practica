import java.util.ArrayList;

public interface State {
    /*declara los métodos específicos, 
    tienen que tener sentido para todos los ConcreteStates.*/
    void atender(ArrayList<Cliente> clientes);
    void suspender();
    void cerrar();
    void abrir();
    
}
