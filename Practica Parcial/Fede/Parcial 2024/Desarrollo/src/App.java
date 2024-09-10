import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        // listas con datos de cartas
        String[] habilidades = {"Ataque", "Pase", "Defensa"};
        String[] clubes = {"Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City"};
        String[] paises = {"Argentina", "Inglaterra", "Holanda", "Japón"};

        // lista de 22 cartas.
        ArrayList<Carta> cartas = new ArrayList<>();

        // armo lista de cartas
        for (Integer i = 0; i < 22 ; i++){
            Integer val = random.nextInt(3);
            switch (val){
                case 0: {
                    BronceEspecial bronce = new BronceEspecial("Jugador " + i, clubes[random.nextInt(clubes.length)], paises[random.nextInt(paises.length)], habilidades[random.nextInt(habilidades.length)]);
                    bronce.asignarValores();
                    cartas.add(bronce);
                }
                case 1: {
                    Oro oro = new Oro("Jugador " + i, clubes[random.nextInt(clubes.length)], paises[random.nextInt(paises.length)]);
                    oro.asignarValores();
                    cartas.add(oro);
                }
                case 2: {
                    Especial especial = new Especial("Jugador " + i, clubes[random.nextInt(clubes.length)], paises[random.nextInt(paises.length)]);
                    especial.asignarValores();
                    for (String hab: habilidades){
                        especial.agregarHabilidad(hab);
                    }
                    cartas.add(especial);
                }
            }
        }

        Collections.shuffle(cartas);

        // Plantillas
        Plantilla plantilla1 = new Plantilla("Usuario 1", paises[random.nextInt(paises.length)], clubes[random.nextInt(clubes.length)]);
        Plantilla plantilla2 = new Plantilla("Usuario 2", paises[random.nextInt(paises.length)], clubes[random.nextInt(clubes.length)]);

        // cargar plantel plantillas
        for (Integer i = 0; i < 22; i++){
            if (i<11){
                plantilla1.agregarPlantel(cartas.get(i));
            }else {
                plantilla2.agregarPlantel(cartas.get(i));
            }
        }

        System.out.println(plantilla1.toString());
        plantilla1.impirmirPlantel();
        System.out.println("La quimica del plantel es de: " + plantilla1.quimicaTotal());

        System.out.println("      ");
        System.out.println("---------------");
        System.out.println("      ");

        System.out.println(plantilla2.toString());
        plantilla2.impirmirPlantel();
        System.out.println("La quimica del plantel es de: " + plantilla2.quimicaTotal());
    }
}
