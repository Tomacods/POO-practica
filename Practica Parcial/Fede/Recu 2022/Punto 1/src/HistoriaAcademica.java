import java.util.HashMap;

public class HistoriaAcademica {
    
    private HashMap<String, Integer> historial;

    public HistoriaAcademica(){
        this.historial = new HashMap<>();
    }

    public String imprimirHistoria(){
        return "Historial del alumno: " + historial;
    }

    public String imprimirNota(String nombre){
        return "La nota de la materia " + nombre + " es " + historial.get(nombre);
    }

    public void agregarMateria(String mat, Integer nota){
        historial.put(mat, nota);
    }
}
