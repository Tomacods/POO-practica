import java.util.ArrayList;

public class Adolecentes implements Catalogo {

    @Override
    public void getCatalogo(ArrayList<Pelicula> catalogo) {
        for (Pelicula peli : catalogo) {
            if (peli.getRango() == "+13" || peli.getRango() == "ATP") {
                peli.imprimirPelicula();
            }
        }
    }
}