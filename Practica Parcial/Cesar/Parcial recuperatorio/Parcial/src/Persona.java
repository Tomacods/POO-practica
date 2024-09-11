public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer dni;

    

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Nombre=" + nombre +"\n"+ ", apellido=" + apellido +"\n"+ ", dni=" + dni+"\n";
    }

}
