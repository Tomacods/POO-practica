
import java.util.ArrayList;
public class Alumno extends Persona {

    private ArrayList<String> materias;

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
        this.materias = new ArrayList<>();
    }

public ArrayList<String> getMaterias(){
    return this.materias;
}
public void setMaterias(ArrayList<String> materias){
    this.materias = materias;
}
public void agregarMateria(String materia){
    this.materias.add(materia);
}

@Override

public String materia(){
    String msg = "el alumno se encuentra cursando las materias: /n";
    for (String mat : this.materias){
        msg += mat + "/n";
    }
    return msg;
}
}

