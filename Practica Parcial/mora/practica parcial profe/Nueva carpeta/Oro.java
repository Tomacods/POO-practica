import java.util.Random;

public class Oro extends Carta {
    private static final Random random = new Random();

    public Oro(String nombre, String club, String pais, String habilidad) {
        super(nombre, club, pais, habilidad,
                valor_random(), // Velocidad
                valor_random(), // Tiro
                valor_random(), // Regate
                valor_random(), // Defensa
                valor_random(), // Pase
                valor_random()); // Físico
    }

    public static int valor_random() {
        // Random random = new Random();
        // Generar un valor aleatorio en el rango de 74 a 90
        int ran = random.nextInt(17) + 74;
        // Calcular el valor incrementado en un 5% y truncar a entero
        return (int) (ran * 1.05);
    }

    @Override
    public int calcular_quimica(String paisFav, String equipoFav) {
        if (this.pais.equals(paisFav) && this.club.equals(equipoFav)) {
            return 100; // Coinciden tanto el país como el equipo
        } else if (this.pais.equals(paisFav) || this.club.equals(equipoFav)) {
            return 80; // Coincide solo uno (país o equipo)
        } else {
            return 0; // Ninguno coincide
        }
    }

}
