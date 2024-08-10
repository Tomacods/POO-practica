public class App {
    public static void main(String[] args) throws Exception { // metodo principal
        Serie serie = new Serie("imagen", "breaking bad", "Estrena todos los jueves");
        Serie serie1 = new Serie("imagen", "game of thrones", "Estrena todos los jueves");
        Serie serie2 = new Serie("imagen", "morty", "Estrena todos los jueves");
        Categoria categoria = new Categoria("Estreno semanal");
        categoria.agregarSerie(serie);
        categoria.agregarSerie(serie1);
        categoria.agregarSerie(serie2);
        categoria.imprimir();
    }
}
