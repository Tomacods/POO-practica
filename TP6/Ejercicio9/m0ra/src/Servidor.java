import java.util.LinkedList;

public class Servidor { // clase Compartida
    private LinkedList<Paquete> colaPaquetes = new LinkedList<>();

    public synchronized void agregar(Paquete paquete) {
        colaPaquetes.add(paquete);
        notifyAll();
        
    }

    public synchronized Paquete quitar() throws InterruptedException{  //throws InterruptedException {

        while (colaPaquetes.isEmpty()) {
            wait();
        }

        return colaPaquetes.removeFirst();
    }
}
