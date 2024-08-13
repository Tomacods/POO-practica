
import java.util.ArrayList;

public class ProfesorFede {

    private String nombre = "";
    private String apellido = "";
    private ArrayList<MateriaFede> materias = new ArrayList<>();

    public ProfesorFede(String nombre, String apellido){
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

    public void setMateria(ArrayList<MateriaFede> materias){
        this.materias = materias;
    }

    public ArrayList<MateriaFede> getMateria(){
        return materias;
    }

    public void addMateria(MateriaFede materia){
        this.materias.add(materia);
    }
}
