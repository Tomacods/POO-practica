import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente("mora", 21);
        Cliente c2 = new Cliente("lila", 89);
        clientes.add(c1);
        clientes.add(c2);
        Caja caja = new Caja("Cajero 1");
        Banco banco = new Banco(caja);
        
        caja.atender(clientes); //default

        caja.setState(new StateAbrir());
        banco.abrirCaja();
        banco.atenderClientes(clientes);

        caja.setState(new StateSuspendida());
        banco.suspenderCaja();
        banco.atenderClientes(clientes);

        caja.setState(new StateCerrada());
        banco.cerrarCaja();
        banco.atenderClientes(clientes);

    }
}
