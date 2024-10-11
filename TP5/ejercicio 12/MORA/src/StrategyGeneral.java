import java.util.ArrayList;

public class StrategyGeneral implements Strategy {
    @Override
    public void mirarCatalogo(ArrayList<Pelicula> peliculas) {
        System.out.println("Mostrando el catalogo general");
        for (int i = 0; i < peliculas.size(); i++) {
            peliculas.get(i).imprimir();

        }
    }

}
