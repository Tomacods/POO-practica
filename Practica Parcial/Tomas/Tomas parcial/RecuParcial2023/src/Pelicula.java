public class Pelicula extends Contenido {
    private boolean vista;

    public Pelicula(String nombre, int anioEmision, int calificacion) {
        super(nombre, anioEmision, calificacion);
        this.vista = false;
    }

    public void marcarVista() {
        this.vista = true;
    }

    public boolean esVista() {
        return vista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + nombre);
    }
} 
