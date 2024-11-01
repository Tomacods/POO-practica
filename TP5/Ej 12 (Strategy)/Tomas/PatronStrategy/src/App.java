
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<String> catalogo = new ArrayList<>();
        catalogo.add("Pelicula 1 (todas las edades)");
        catalogo.add("Pelicula 2 (todas las edades)");
        catalogo.add("Pelicula 3 (18+)");
        catalogo.add("Pelicula 4 (18+)");
        catalogo.add("Pelicula 5 (todas las edades)");

        Peliculas peliculas = new Peliculas();

        //estraegia de catalogo completo
        peliculas.setStrategy(new CatalogoCompleto());
        System.out.println("Catalogo Completo");
        peliculas.imprimirCatalogo(catalogo);

        //estrategia de catalogo adolescentes
        peliculas.setStrategy(new CatalogoAdolecentes());
        System.out.println("Catalogo Adolescentes");
        peliculas.imprimirCatalogo(catalogo);

        //estrategia de catalogo niños
        peliculas.setStrategy(new CatalogoNiños());
        System.out.println("Catalogo Niños");
        peliculas.imprimirCatalogo(catalogo);
}
}
