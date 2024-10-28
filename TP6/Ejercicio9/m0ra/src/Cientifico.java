import java.util.LinkedList;

public class Cientifico implements Runnable { // Hilo consumidor

    private Servidor servidor;
    private LinkedList<Paquete> cuaderno = new LinkedList<>();

    public Cientifico(Servidor servidor) {
        super();
        this.servidor = servidor;
    }

    @Override
    public void run() {
        int cantidad = 0;

        while (cantidad < 10) { //asumi q las dos boyas solo van a mandar 5 paquetes
            try {
                Paquete paquete = servidor.quitar(); 
                if (paquete == null) { //sino queda colgado por la excepcion
                    break;
                }

                if (paquete != null) {
                    cuaderno.add(paquete); 
                    System.out.println("Cientifico consultó: " + paquete);
                }
                
                cantidad++; 
            } catch (InterruptedException e) {
                System.err.println("cientifico interrumpido.");
                break; 
            }
        }

        informe(); // Llama al informe después de completar las consultas
    }


    private void informe() {
        Double sumaTemp1 = 0.0;
        Double sumaVel1 = 0.0;
        Double sumaTemp2 = 0.0;
        Double sumaVel2 = 0.0;
        Integer cantidad1 = 0;
        Integer cantidad2 = 0;
        for (Paquete p : cuaderno) {
            if (p.getNombre().equals("CIDMAR-1")) {
                sumaTemp1 += p.getTemperatura();
                sumaVel1 += p.getVelocidad_viento();
                cantidad1++;
            } else if (p.getNombre().equals("CIDMAR-2")) {
                sumaTemp2 += p.getTemperatura();
                sumaVel2 += p.getVelocidad_viento();
                cantidad2++;
            }
        }
        System.out.println("Temperatura promedio CIDMAR-1: " + sumaTemp1 / cantidad1);
        System.out.println("Velocidad del viento promedio CIDMAR-1: " + sumaVel1 / cantidad1);
        System.out.println("Temperatura promedio CIDMAR-2: " + sumaTemp2 / cantidad2);
        System.out.println("Velocidad del viento promedio CIDMAR-2: " + sumaVel2 / cantidad2);
    }

}
