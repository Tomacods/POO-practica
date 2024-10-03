import java.util.ArrayList;
import java.util.List;

class Perfil {
    private String nombre;
    private boolean esParaNinios;
    private List<Contenido> favoritos;

    public Perfil(String nombre, boolean esParaNinios) {
        this.nombre = nombre;
        this.esParaNinios = esParaNinios;
        this.favoritos = new ArrayList<>();
    }

    public void agregarFavorito(Contenido contenido) {
        favoritos.add(contenido);
    }

    public List<Contenido> getFavoritos() {
        return favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esParaNinios() {
        return esParaNinios;
    }
    public void mostrarInformacion() {
        System.out.println("Perfil: " + nombre);
        System.out.println("Es para niños: " + (esParaNinios ? "Sí" : "No"));
        System.out.println("Favoritos:");
        for (Contenido contenido : favoritos) {
            System.out.println(" - " + contenido.nombre + " (" + contenido.anioemision + ") " + contenido.calificacion + " estrellas");
            if (contenido instanceof Serie) { // instanceoff  hace 
                Serie serie = (Serie) contenido;
                for (Capitulo capitulo : serie.getCapitulos()) { //imprimir el ultimo capitulo visto
                    System.out.println("   * " + capitulo.getNombre() + " (Capítulo " + capitulo.getOrden() + ") " + (capitulo.esVisto() ? "Visto" : "No visto"));
                }
            } else if (contenido instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) contenido;
                System.out.println("   * " + (pelicula.esVista() ? "Vista" : "No vista"));
            }
        }
    }
}