

public class App {
    public static void main(String[] args) { // metodo main
        Libro libro0= new Libro("titulo", "autor", 10, 100, 5.0);
        Libro libro1 = new Libro("titulo1", "autor1", 10, 100, 5.0);
        Libro libro2 = new Libro("titulo2", "autor2", 10, 100, 5.0);
        Catalogo catalogo = new Catalogo("titulo", "descripcion");
        catalogo.agregarLibro(libro0);
        catalogo.agregarLibro(libro1);
        catalogo.agregarLibro(libro2);
        catalogo.imprimir();
        
        
    }
}
