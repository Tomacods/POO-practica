import java.util.ArrayList;

public class Plantilla {
    // las cuales tendrán los siguientes atributos: usuario (propietario del
    // equipo), país favorito, equipo favorito, y un plantel de 11 cartas.
    private String usuario;
    private String pais_fav;
    private String equipo_fav;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Plantilla(String usuario, String pais_fav, String equipo_fav) {
        this.usuario = usuario;
        this.pais_fav = pais_fav;
        this.equipo_fav = equipo_fav;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void AddCarta(Carta carta) {
        this.cartas.add(carta);
    }

    public int quimica_total() {
        int suma = 0;
        for (Carta carta : cartas) {
            suma += carta.calcular_quimica(this.pais_fav, this.equipo_fav); // Pasar el país y equipo favoritos de la
                                                                            // plantilla
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Plantilla {\n" +
                "\tUsuario: " + usuario + "\n" +
                "\tPaís Favorito: " + pais_fav + "\n" +
                "\tEquipo Favorito: " + equipo_fav + "\n" +
                "}";
    }

}
