import java.util.HashMap;

public class HistoriaAcademica {
    
    private HashMap<String, Integer> historial;

    public HistoriaAcademica(){
        this.historial = new HashMap<>();
    }

    public String imprimirHistoria(){
        return "Historial del alumno: " + historial;
    }

    public void agregarMateria(String mat, Integer nota){
        historial.put(mat, nota);
    }
}
