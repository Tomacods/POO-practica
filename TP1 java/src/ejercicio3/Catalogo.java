import java.util.ArrayList;
import java.util.List;



public class Catalogo {
    private List<Serie> series;

    public Catalogo() {
        this.series = new ArrayList<>();
    }

    public void agregarSerie(Serie serie) {
        series.add(serie);
    }

    public void eliminarSerie(String titulo) {
        series.removeIf(serie -> serie.getTitulo().equalsIgnoreCase(titulo));
    }

    public void listarSeries() {
        for (Serie serie : series) {
            System.out.println(serie);
        }
    }

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Serie serie1 = new Serie("Breaking Bad", "Drama", 5, 9.5);
        Serie serie2 = new Serie("Stranger Things", "Ciencia Ficción", 4, 8.7);

        catalogo.agregarSerie(serie1);
        catalogo.agregarSerie(serie2);

        System.out.println("Listado de series en el catálogo:");
        catalogo.listarSeries();

        catalogo.eliminarSerie("Breaking Bad");

        System.out.println("Listado de series después de eliminar 'Breaking Bad':");
        catalogo.listarSeries();
    }
}
