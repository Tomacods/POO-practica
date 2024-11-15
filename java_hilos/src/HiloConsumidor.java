


/**La clase HiloConsumidor implementa la interfaz Runnable y representa un hilo consumidor que consume mensajes de un recurso compartido. */
public class HiloConsumidor implements Runnable {
    private Compartido compartido;

    public HiloConsumidor(Compartido compartido) {
        super();
        this.compartido = compartido;
    }

    public void run() {
        Integer cantidadNull = 0; // si se cambia el 0 por un numero mas grande se puede ver que el hilo se queda esperando a que se agreguen mas mensajes
        while (cantidadNull < 5) {  // esta condicon está para que el hilo consumidor no se quede esperando indefinidamente
            String mensaje = compartido.quitar();
            if (mensaje != "") { //si el mensaje es distinto de vacio se imprime
                System.out.println(mensaje);
            } else {
                cantidadNull = cantidadNull + 1; //se agrega un null al array cada vez que se agrega un mensaje vacio
            }
        }
    }
}
//traten de ejecutar variando la cantidad de null a esperar y vean que sucede si el valor es menor o si el valor es mayor. 
