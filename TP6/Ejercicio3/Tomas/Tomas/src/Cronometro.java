
import java.util.ArrayList;
import java.util.List;

public class Cronometro extends Observable{
    private long tiempoInicio;
    private long tiempoParcial;
    private final List<Long> parciales = new ArrayList<>();
    
    public void iniciar() {
        tiempoInicio = System.currentTimeMillis();
        notificarObservadores();
    }
    public void parar() {
        tiempoInicio = 0;
        tiempoParcial = 0;
        parciales.clear();
        notificarObservadores();
    }
    public void crearParcial () {
        tiempoParcial = System.currentTimeMillis() - tiempoInicio;
        parciales.add(tiempoParcial);
        notificarObservadores();
    }
    public long getTiempoActual() {
        return System.currentTimeMillis() - tiempoInicio;
    }
    public List<Long> getParciales() {
        return parciales;
    }
    
}

