import java.util.ArrayList;

public class Profesor {

    private String nombre = "";
    private String apellido = "";
    private ArrayList<Materia> materias = new ArrayList<>();

    private Profesor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.apellido;
    }

    public void setMateria(Materia materia){
        return this.materias;
    }

    public ArrayList<Materia> getMateria(){
        return this.materias;
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }
}
