import java.util.ArrayList;
public class Catalogo {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Catalogo(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
   /* public ArrayList<Pelicula> catalogoNiños(){
        ArrayList<Pelicula> niños = new ArrayList<>();
        for  (i=0; i < peliculas.size(); i++){
            if( peliculas.get(i).getClasificacion()>7){
                niños.add(peliculas.get(i));
            }
        }*/ 
        public void catalogoNiños2(){
            ArrayList<Pelicula> niños = new ArrayList<>();
            for  (i=0; i < peliculas.size(); i++){
                if( peliculas.get(i).getClasificacion()>7){
                    peliculas.get(i).imprimir();
                }
            }
        

    }
    
    
    
}
