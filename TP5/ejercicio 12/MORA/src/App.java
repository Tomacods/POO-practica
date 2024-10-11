import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Pelicula> peliculas = new ArrayList<>();
        Pelicula pelicula1 = new Pelicula("Toy Story", 1995, 7);    
        Pelicula pelicula2 = new Pelicula("Nemo", 2003, 0); 
        Pelicula pelicula3 = new Pelicula("Matrix", 1999, 18);  
        Pelicula pelicula4 = new Pelicula("Seven", 1995, 19);
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        


    StrategyNinio ninio = new StrategyNinio();
    StrategyDieciocho adolescentes = new StrategyDieciocho();
    StrategyGeneral general = new StrategyGeneral();
    Context context1 = new Context(ninio, peliculas);
    context1.procesarCatalogo();
    Context context2 = new Context(adolescentes, peliculas);
    context2.procesarCatalogo();
    Context context3 = new Context(general, peliculas);
    context3.procesarCatalogo();





    }
}
