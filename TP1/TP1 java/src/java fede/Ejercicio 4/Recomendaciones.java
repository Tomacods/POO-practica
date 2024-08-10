import java.util.ArrayList;

public class Recomendaciones {
    
    private ArrayList<Curso> cursos;

    public Recomendaciones(){
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso cur){
        this.cursos.add(cur);
    }

    public void imprimir(){
        for(Curso cur:this.cursos){
            cur.imprimirCur();
        }
    }
}
