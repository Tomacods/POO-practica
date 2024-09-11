import java.util.HashMap;

public class HistoriaAcademica {
    
    private HashMap<String, Integer> historial;

    public HistoriaAcademica(){
        HashMap<String, Integer> historial = new HashMap<>();
    }

    public String imprimirHistoria(){
        return "Historial del alumno: " + historial;
    }

    public void agregarMateria(String mati, Integer nota){
        historial.put(mati, nota);
    }
}
