import java.util.ArrayList;
public class Serie extends Contenido {
    private ArrayList<Capitulo> capitulos = new ArrayList<>();

    public Serie(String nombre, Integer anio, Integer calificacion) {
        super(nombre, anio, calificacion);
    }
    public void reproducir(){

    }
    public void imprimircontenido(){
        System.err.println("Usted se quedo en "+this.nombre+ " capitulo");
    }
    public void ultimocap (){
        while(Integer i = 0; i =< this.capitulos.size(); i++){
            
        }
    }
}
