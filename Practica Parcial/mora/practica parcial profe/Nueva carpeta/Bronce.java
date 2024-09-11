import java.util.Random;

public class Bronce extends Carta {
    private final static Random random = new Random();

    public Bronce(String nombre, String club, String pais, String habilidad) {
        super(nombre, club, pais, habilidad,
                generarValorAleatorio(),
                generarValorAleatorio(),
                generarValorAleatorio(),
                generarValorAleatorio(),
                generarValorAleatorio(),
                generarValorAleatorio());
    }

    private static int generarValorAleatorio() {
        return random.nextInt(17) + 49 + 2;
    }

    public int calcular_quimica(String paisFav, String equipoFav){
        return super.calcular_quimica(paisFav, equipoFav);
    }

/*   @Override
    public int calcular_quimica(String paisFav, String equipoFav) {
        if (this.pais.equals(paisFav) && this.club.equals(equipoFav)) {
            return 100; // Coinciden tanto el país como el equipo
        } else if (this.pais.equals(paisFav) || this.club.equals(equipoFav)) {
            return 80; // Coincide solo uno (país o equipo)
        } else {
            return 0; // Ninguno coincide
        }
    }*/

}
