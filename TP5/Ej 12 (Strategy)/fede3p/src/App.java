import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pelicula> catalogo = new ArrayList<>();

        Pelicula p1 = new Pelicula("El secreto de sus ojos", "+13");
        Pelicula p2 = new Pelicula("Terrifier", "+18");
        Pelicula p3 = new Pelicula("E.T", "ATP");
        Pelicula p4 = new Pelicula("Los increibles", "ATP");

        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p4);

        Filtro filtro = new Filtro();

        // Completo
        filtro.setFiltro(new General());
        System.out.println("Catalogo completo: ");
        filtro.imprimirCatalogo(catalogo);
        System.out.println("-------");

        // Niños
        filtro.setFiltro(new Ninios());
        System.out.println("Catalogo infantil: ");
        filtro.imprimirCatalogo(catalogo);
        System.out.println("-------");

        // Adolecentes
        filtro.setFiltro(new Adolecentes());
        System.out.println("Catalogo juvenil: ");
        filtro.imprimirCatalogo(catalogo);
    }
}
