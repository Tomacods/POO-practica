import java.util.HashMap;
import java.util.Map;

public class HistoriaAcademica {
    
    private final Map<String, Integer> historial;

    public HistoriaAcademica(){
        this.historial = new HashMap<>();
    }

    public void imprimirHistorial(String alumno){
        System.out.println("Historial del alumno: ");
        for (Map.Entry<String, Integer> entry: historial.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void agregarMateria(String mati, Integer nota){
        historial.put(mati, nota);
    }

    public Map<String, Integer> obtenerNota(){
        return historial;
    }
}
