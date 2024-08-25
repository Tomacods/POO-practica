import java.util.ArrayList;

public class Fede_Alumno extends Fede_Persona {
    
    private ArrayList<String> materias;

    public Fede_Alumno(String nombre, String apellido){
        super(nombre, apellido);
        this.materias = new ArrayList<>();
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    @Override
    public String materia(){
        String msg = "El alumno se encuentra cursando la siguiente materias \n";
        for (String mat : this.materias){
            msg += mat + "\n";
        }
        return msg;
    }
}
