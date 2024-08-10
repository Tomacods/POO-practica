import java.util.ArrayList;

public class Estrenos {

    private String titulo;
    private ArrayList<Serie> series;

    public Estrenos(String titulo){
        this.titulo = titulo;
        this.series = new ArrayList<>();
    }

    public void agregarSerie(Serie ser){
        this.series.add(ser);
    }

    public void imprimir(){
        System.out.println(this.titulo);
        for(Serie ser:this.series){
            ser.imprimirSer();
        }
    }
}
