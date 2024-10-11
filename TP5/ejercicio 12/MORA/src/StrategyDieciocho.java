import java.util.ArrayList;

public class StrategyDieciocho implements Strategy {
    @Override
    public void mirarCatalogo(ArrayList<Pelicula> peliculas){
        System.out.println("Mirando el catalogo de adolescentes");
        for  (int i=0; i < peliculas.size(); i++){
            if( (peliculas.get(i).getClasificacion())<19){
                peliculas.get(i).imprimir();
            } 
    }
}


}

