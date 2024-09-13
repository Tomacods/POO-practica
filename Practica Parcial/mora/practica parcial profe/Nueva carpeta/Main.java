import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> habilidades = new ArrayList<>(Arrays.asList("Ataque", "Pase", "Defensa"));
        ArrayList<String> clubes = new ArrayList<>(
                Arrays.asList("Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City"));
        ArrayList<String> paises = new ArrayList<>(Arrays.asList("Argentina", "Inglaterra", "Holanda", "Japón"));

        ArrayList<Carta> cartas = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 22; i++) {
            Integer tipo_carta = random.nextInt(3);
            switch (tipo_carta) {
                case 0:
                    Bronce bronce = new Bronce("Jugador" + i, clubes.get(random.nextInt(clubes.size())),
                            paises.get(random.nextInt(paises.size())),
                            habilidades.get(random.nextInt(habilidades.size())));
                    cartas.add(bronce);

                    break;

                case 1:
                    Oro oro = new Oro("Jugador" + i, clubes.get(random.nextInt(clubes.size())),
                            paises.get(random.nextInt(paises.size())));
                    cartas.add(oro);
                    break;

                case 2:
                    Especial especial = new Especial("Jugador" + i, clubes.get(random.nextInt(clubes.size())),
                            paises.get(random.nextInt(paises.size())));
                    especial.setHabilidades(habilidades);
                    cartas.add(especial);

                    break;
            }
        }

        Collections.shuffle(cartas);

        Plantilla p1 = new Plantilla("Propietario 1", paises.get(random.nextInt(paises.size())),
                clubes.get(random.nextInt(clubes.size())));
        for (int i = 1; i <= 11; i++) {
            p1.addCarta(cartas.get(i));

        }
        p1.imprimir();

        Plantilla p2 = new Plantilla("Propietario 2", paises.get(random.nextInt(paises.size())),
                clubes.get(random.nextInt(clubes.size())));
        for (int i = 11; i <= 21; i++) {
            p2.addCarta(cartas.get(i));

        }
        p2.imprimir();

    }
}
