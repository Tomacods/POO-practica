
import java.util.ArrayList; // importacion de la clase ArrayList

public class Categoria { // clase Categoria
    
    private String titulo; // titulo de la categoria
    private ArrayList<Serie> series; // lista de series


    public Categoria(String titulo){
        this.titulo = titulo;
        this.series = new ArrayList<>();
    }

    public void agregarSerie(Serie ser){
        this.series.add(ser);
    }

    public void imprimir(){
        System.out.println(this.titulo);
        for(Serie ser:this.series){
            ser.imprimir();
        }
    }

}
