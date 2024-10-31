import java.util.List;

public class CatalogoCompleto  implements  CatalogoStrategy{
    @Override
    public List<String> getCatalogo(List<String> catalogo) {
        return catalogo;
    }
    
}
