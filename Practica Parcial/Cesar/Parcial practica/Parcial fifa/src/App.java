import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        ArrayList<Carta> cartas = new ArrayList<>();
        String[] Clubes = { "Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City" };
        String[] Paises = { "Argentina", "Inglaterra", "Holanda", "Japón" };
        String[] Habilidad = { "Ataque", "Defensa", "Pase" };
        for (int i = 1; i < 23; i++) {
            Integer val = random.nextInt(1, 3);
            switch (val) {
                case 1: {
                    Bronce jugador = new Bronce("Nombre" + i, Clubes[random.nextInt(Clubes.length)],
                            Paises[random.nextInt(Paises.length)], Habilidad[random.nextInt(Habilidad.length)]);
                    jugador.Asignarvalores();
                    cartas.add(jugador);
                }
                case 2: {
                    Oro jugador = new Oro("Nombre " + i, Clubes[random.nextInt(Clubes.length)],
                            Paises[random.nextInt(Paises.length)]);
                    jugador.Asignarvalores();
                    cartas.add(jugador);
                }
                case 3: {
                    Especial jugador = new Especial("Nombre " + i, Clubes[random.nextInt(Clubes.length)],
                            Paises[random.nextInt(Paises.length)]);
                    for (Integer l = 0; l < Habilidad.length; l++) {
                        jugador.cargarHabilidades(Habilidad[random.nextInt(Habilidad.length)]);
                    }
                    jugador.Asignarvalores();
                    cartas.add(jugador);
                }
            }

        }

    Plantilla plantilla1 = new Plantilla("César", Paises[random.nextInt(Paises.length)],
            Clubes[random.nextInt(Clubes.length)]);
    Plantilla plantilla2 = new Plantilla("Tomas", Paises[random.nextInt(Paises.length)],
            Clubes[random.nextInt(Clubes.length)]);
            Collections.shuffle(cartas);
            for(Integer k = 0;k<10;k++){
            plantilla1.AgregarCarta(cartas.get(k));
        }for(Integer j = 11;j<22;j++){
        plantilla2.AgregarCarta(cartas.get(j));
    }
        System.out.println(plantilla1);
        plantilla1.mostrarplantel();
    System.out.println("---------------------------------------");
    System.out.println(plantilla2);
    plantilla2.mostrarplantel();

}}
