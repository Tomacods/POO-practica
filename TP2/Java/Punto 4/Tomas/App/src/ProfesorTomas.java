import java.util.ArrayList;

public class ProfesorTomas {
    private String nombre = "";
    private String apellido = "";
    private ArrayList<MateriaTomas> materias = new ArrayList<>();

    public ProfesorTomas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMaterias(ArrayList<MateriaTomas> materias) {
        this.materias = materias;
    }
    public ArrayList<MateriaTomas> getMaterias() {
        return materias;
    }
    public String getNombre() {
        return nombre; 
    }
    public String getApellido() {
        return apellido;
    }
    public void addMateria(MateriaTomas materia) {
        materias.add(materia);
    }
}
