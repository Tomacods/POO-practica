import java.util.List;

public class Peliculas {
    private CatalogoStrategy catalogoStrategy;


    public void setStrategy (CatalogoStrategy catalogoStrategy){ //el metodo setStrategy es para asignar la estrategia de catalogo
        this.catalogoStrategy = catalogoStrategy;
        }
        
        public void imprimirCatalogo(List<String> catalogo){ //el metodo imprimirCatalogo es para imprimir la lista de peliculas
        List<String> peliculas = catalogoStrategy.getCatalogo(catalogo); //se crea una lista de peliculas que se obtiene de la lista de catalogo
        peliculas.forEach(System.out::println); //se imprime la lista de peliculas
        }

    }

