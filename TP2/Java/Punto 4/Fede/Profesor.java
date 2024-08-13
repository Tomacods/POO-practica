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
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setMateria(ArrayList<Materia> materias){
        this.materias = materias;
    }

    public ArrayList<Materia> getMateria(){
        return materias;
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }
}
