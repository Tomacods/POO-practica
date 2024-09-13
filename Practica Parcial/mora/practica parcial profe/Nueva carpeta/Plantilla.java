import java.util.ArrayList;

public class Plantilla {
    private String usuario, pais_fav, equipo_fav;
    private ArrayList<Carta> jugadores = new ArrayList<>();

    public Plantilla(String usuario, String pais_fav, String equipo_fav) {
        this.usuario = usuario;
        this.pais_fav = pais_fav;
        this.equipo_fav = equipo_fav;

    }

    public void addCarta(Carta carta) {
        this.jugadores.add(carta);
    }

    public void quimica_total(String pais_fav, String equipo_fav) {
        Integer operacion = 0;
        for (Carta carta : jugadores) {
            operacion += carta.calcular_quimica(this.pais_fav, this.equipo_fav);
        }
        Integer quimica = (int) (operacion / jugadores.size());
        System.out.println("Quimica total: " + quimica + "\n");

    }

    public void imprimir() {
        System.out.println("Propietario: " + this.usuario + "\n");
        quimica_total(pais_fav, equipo_fav);
        for (Carta carta : jugadores) {
            carta.imprimir();
            System.out.println();

        }
    }
}
