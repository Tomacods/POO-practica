import java.security.PublicKey;
import java.util.ArrayList; // importacion de la clase ArrayList


public class Catalogo {
    private String titulo; // titulo del catalogo
    private String descripcion; // descripcion del catalogo
    private ArrayList<Libro> libros; // lista de libros

public Catalogo(String titulo, String descripcion){
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.libros = new ArrayList<>();
}

public void agregarLibro(Libro lib){
    this.libros.add(lib);
}

public void imprimir(){
    System.out.println(this.titulo);
    System.out.println(this.descripcion);
    for(Libro lib:this.libros){
        lib.imprimir();
    }
}
}