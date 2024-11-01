import java.util.ArrayList;

public class StrategyNinio implements Strategy {
  //  private Catalogo catalogo;
    
    @Override
    public void mirarCatalogo(ArrayList<Pelicula> peliculas){
        
        System.out.println("Mostrando el catalogo de niños");
        for  (int i=0; i < peliculas.size(); i++){
            if( (peliculas.get(i).getClasificacion())<14){
                peliculas.get(i).imprimir();
            } 
    }

    }
}
