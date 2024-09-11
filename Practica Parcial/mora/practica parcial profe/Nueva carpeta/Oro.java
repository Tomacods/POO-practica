import java.util.Random;

public class Oro extends Carta {
    private static final Random random = new Random();

    public Oro(String nombre, String club, String pais, String habilidad) {
        super(nombre, club, pais, habilidad,
                valor_random(),
                valor_random(),
                valor_random(),
                valor_random(),
                valor_random(),
                valor_random());
    }

    public static int valor_random() {
        int ran = random.nextInt(17) + 74;

        return (int) (ran * 1.05);
    }

    public int calcular_quimica(String paisFav, String equipoFav){
        return super.calcular_quimica(paisFav, equipoFav);
    }

/*  @Override
    public int calcular_quimica(String paisFav, String equipoFav) {
        if (this.pais.equals(paisFav) && this.club.equals(equipoFav)) {
            return 100;
        } else if (this.pais.equals(paisFav) || this.club.equals(equipoFav)) {
            return 80;
        } else {
            return 0;
        }
    } */

}
