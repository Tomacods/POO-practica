public class HiloConsumidor implements Runnable {
    private Compartido compartido;

    public HiloConsumidor(Compartido compartido) {
        super();
        this.compartido = compartido;
    }

    public void run() {
        Integer cantidadNull = 0;
        while (cantidadNull < 5) {
            String mensaje = compartido.quitar();
            if (mensaje != "") {
                System.out.println(mensaje);
            } else {
                cantidadNull = cantidadNull + 1;
            }
        }
    }

}
//traten de ejecutar variando la cantidad de null a esperar y vean que sucede si el valor es menor o si el valor es mayor. 