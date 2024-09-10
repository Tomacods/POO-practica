import java.util.ArrayList;

public class Plantilla {
    
    private String usuario;
    private String paisFav;
    private String equipoFav;
    //private Integer quimica;
    private ArrayList<Carta> plantel = new ArrayList<>(11);

    public Plantilla(String usuario, String paisFav, String equipoFav){
        this.usuario = usuario;
        this.paisFav = paisFav;
        this.equipoFav = equipoFav;
    }

    public void agregarPlantel(Carta carta){
        this.plantel.add(carta);
    }

    public String toString() {
        return "Usuario: " + usuario + "    País favorito: " + paisFav + "    Equipo favorito: " + equipoFav;
    }

    public void impirmirPlantel(){
        for (Carta car: plantel){
            System.out.println(car.toString());
            System.out.println("      ");
        }
    }


}
