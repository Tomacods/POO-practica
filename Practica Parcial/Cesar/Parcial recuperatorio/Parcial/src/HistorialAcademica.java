import java.util.HashMap;

public class HistorialAcademica {
    private HashMap<String,Integer> materias;

    public HistorialAcademica() {
        this.materias = new HashMap<>();
    }
    public String Imprimirhistorial(){
        return "Historial academico"+ materias;
    }
    public void AgregarMateria(String materia, Integer nota){
        materias.put(materia, nota);
    }
}
