public class Profesor extends Persona {

    private Integer legajo;

    public Profesor (String nombre, String apellido, String dni, Integer legajo){
        super(nombre, apellido, dni);
        this.legajo=legajo;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", legajo=" + legajo + ", apellido=" + apellido + ", dni=" + dni + "]";
    }

    
    
    
}
