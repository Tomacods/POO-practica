public class Profesor extends Persona{
    private Integer legajo;

   

    public Profesor(String nombre, String apellido, Integer dni, Integer legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }
    @Override
    public String toString() {
        return "Legajo=" + legajo +"\n";
    }
}
