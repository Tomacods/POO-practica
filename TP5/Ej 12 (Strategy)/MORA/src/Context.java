import java.util.ArrayList;

public class Context {
    private Strategy strategy;
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Context(Strategy strategy, ArrayList<Pelicula> peliculas){ //PREGUNTAR SI SE PUEDE HACER ESTO
        this.strategy=strategy;
        this.peliculas= peliculas;
    }
    public void procesarCatalogo(){
        System.out.println("Cargando catalogo.."); //NO SABE QUE CATALOGO, CONTEXT NO SABE Q STRATEGY USA
        strategy.mirarCatalogo(peliculas);
    }

}
