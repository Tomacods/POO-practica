import java.util.ArrayList;

public class Profesor extends Persona {
    
    private Integer nroLegajo;

    public Profesor(String nombre, String apellido, Integer dni, Integer nroLegajo){
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
    }
}
