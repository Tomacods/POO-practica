import java.util.ArrayList;

public class Fede_Alumno extends Fede_Persona {
    
    private ArrayList<String> materias;

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
        this.materias = new ArrayList<>();
    }
}
