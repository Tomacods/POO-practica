import java.util.ArrayList;

public class Filtro {
    
    private Catalogo catalogo;

    public void setFiltro(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void imprimirCatalogo(ArrayList<Pelicula> peliculas) {
        catalogo.getCatalogo(peliculas);
    }
}
