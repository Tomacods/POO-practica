import java.util.ArrayList;

public class General implements Catalogo {

    @Override
    public void getCatalogo(ArrayList<Pelicula> catalogo) {
        for (Pelicula peli : catalogo) {
            peli.imprimirPelicula();
        }
    }
}