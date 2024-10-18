
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


public class Servidor {
    BlockingDeque <Map<String, Double>> colaPaquetes = new LinkedBlockingDeque<>();
    
    public void almacenarPaquete(Map<String, Double> paquete) {
        try {
            colaPaquetes.put(paquete);
            System.out.println("Paquete almacenado en el servidor");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void consultarPaquetes () {
        List<Map<String, Double>> paquetes = new ArrayList<>();
        colaPaquetes.drainTo(paquetes);
        double sumaTemperatura = 0;
        double sumaViento = 0;
        int count = paquetes.size();

        for (Map<String, Double> paquete : paquetes) {
            sumaTemperatura += paquete.get("Termometro");
            sumaViento += paquete.get("Anemometro");
        }
        System.out.println("Promedio de temperatura: " + sumaTemperatura / count);
        System.out.println("Promedio de viento: " + sumaViento / count);
    }
}

