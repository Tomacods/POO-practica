import java.util.ArrayList;

public class Profesor {
    private String nombre = "";
    private String apellido = "";
    private ArrayList<Materia> materias = new ArrayList<>();

public Profesor(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public void setMaterias(ArrayList<Materia> materias) {
    this.materias = materias;
}
public ArrayList<Materia> getMaterias() {
    return materias;
}
public String getNombre() {
    return nombre; 
}
public String getApellido() {
    return apellido;
}
public void addMateria(Materia materia) {
    materias.add(materia);
}

}
