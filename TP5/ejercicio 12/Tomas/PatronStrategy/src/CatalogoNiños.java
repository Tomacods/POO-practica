import java.util.List;
import java.util.stream.Collectors;

class CatalogoNiños implements CatalogoStrategy {

    @Override
    public List<String> getCatalogo(List<String> catalogo) {
        return catalogo.stream()
                    .filter(movie -> !movie.contains("18+")) //el .filter es para filtrar los elementos de la lista con una condición "+18"
                    .collect(Collectors.toList()); //el collect es para que se devuelva una lista de forma ordenada 
    }
}