package escuela;

public class Profesor extends Persona {

    private int legajo;

    public Profesor(String nombre, String apellido, int dni, int legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni +  ", legajo=" + legajo ;
    }



    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
}
