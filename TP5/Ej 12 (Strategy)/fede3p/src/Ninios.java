import java.util.ArrayList;

public class Ninios implements Catalogo {
    
    @Override
    public void getCatalogo(ArrayList<Pelicula> catalogo) {
        for (Pelicula peli : catalogo) {
            if (peli.getRango() == "ATP") {
                peli.imprimirPelicula();
            }
        }
    }
}
