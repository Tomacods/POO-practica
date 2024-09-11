import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<String> habilidades = new ArrayList<>(Arrays.asList("Ataque", "Pase", "Defensa"));
        List<String> clubes = new ArrayList<>(
                Arrays.asList("Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City"));
        List<String> paises = new ArrayList<>(Arrays.asList("Argentina", "Inglaterra", "Holanda", "Japon"));
        List<Carta> cartas = new ArrayList();

        for (int i = 1; i <= 22; i++) {
            int tipoCarta = random.nextInt(3); //  0 = Bronce, 1 = Oro, 2 = Especial
            String nombre = "Jugador" + i;
            String club = clubes.get(random.nextInt(clubes.size()));
            String pais = paises.get(random.nextInt(paises.size()));
            String habilidad = habilidades.get(random.nextInt(habilidades.size()));

            
            switch (tipoCarta) {
                case 0: // Carta Bronce
                    Bronce cartaBronce = new Bronce(nombre, club, pais, habilidad);
                    cartas.add(cartaBronce);
                    
                    break;

                case 1: // Carta Oro
                    Oro cartaOro = new Oro(nombre, club, pais, habilidad);

                    cartas.add(cartaOro);
                    break;

                case 2: // Carta Especial
                    
                
                    Especial cartaEspecial = new Especial(nombre, club, pais, habilidad);
                    cartas.add(cartaEspecial);
                    
                    break;
            }
        }

        List<Carta> cartas_mezcladas = new ArrayList<>();
        cartas_mezcladas.addAll(cartas);
        Collections.shuffle(cartas_mezcladas);

        Plantilla uno = new Plantilla("usuario 1", paises.get(random.nextInt(paises.size())),
                clubes.get(random.nextInt(clubes.size())));
        Plantilla dos = new Plantilla("usuario 2", paises.get(random.nextInt(paises.size())),
                clubes.get(random.nextInt(clubes.size())));

        
        for (int i = 0; i < 11; i++) {
            uno.AddCarta(cartas_mezcladas.get(i));
        }

        
        for (int i = 11; i < 22; i++) {
            dos.AddCarta(cartas_mezcladas.get(i));
        }

        
        System.out.println(uno);
        int quimica = (uno.quimica_total() / 11);
        System.out.println("Quimica: " + quimica);
        for (Carta carta : uno.getCartas()) {
            System.out.println(carta);
        }

        
        System.out.println(dos);
        int quimica2 = (dos.quimica_total() / 11);
        System.out.println("Quimica: " + quimica2);
        for (Carta carta : dos.getCartas()) {
            System.out.println(carta);
        }
    }

}
