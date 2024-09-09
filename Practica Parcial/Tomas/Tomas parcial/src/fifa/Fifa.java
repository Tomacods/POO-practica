/*Para probar el funcionamiento, se contará con las siguientes listas:
● Lista de habilidades especiales: Ataque, Pase, Defensa.
● Lista de clubes: Arsenal, Montevideo City Torque, Inter Miami, Manchester City.
● Lista de países: Argentina, Inglaterra, Holanda, Japón.
Se crearán 22 cartas de forma aleatoria utilizando estas listas para asignar clubes, países y
habilidades especiales. Las cartas se almacenarán en una lista que se desordenará
aleatoriamente, y se distribuirán en dos planteles (uno para cada equipo). Finalmente, se
imprimirá la conformación de ambos equipos.
*/ 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Fifa {
    
    public static void main(String[] args) {
        String[] habilidadesEspeciales = {"Ataque", "Pase", "Defensa"};
        String[] clubes = {"Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City"};
        String[] paises = {"Argentina", "Inglaterra", "Holanda", "Japón"};
        List<Cartas> listaCartas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 22; i++) {
            switch (random.nextInt(3)) {
                case 0 -> listaCartas.add(new BronceEspecial("jugador_BronceEspecial"+i, clubes[random.nextInt(4)], paises[random.nextInt(4)], random.nextInt(49,65)+2, random.nextInt(49,65)+2, random.nextInt(99)+2, random.nextInt(49,65)+2, random.nextInt(49,65)+2, random.nextInt(49,65)+2, habilidadesEspeciales[random.nextInt(3)]));
                //genero un numero random entre 49 y 65 y le sumo 2 para las cartas bronce
                case 1 -> listaCartas.add(new Oro("jugador_Oro"+i, clubes[random.nextInt(4)], paises[random.nextInt(4)], (int)(random.nextInt(74,90)*1.05),(int)(random.nextInt(74,90)*1.05), (int)(random.nextInt(74,90)*1.05),(int)(random.nextInt(74,90)*1.05), (int)(random.nextInt(74,90)*1.05), (int)(random.nextInt(74,90)*1.05), (int)(random.nextInt(74,90)*1.05)));
                //genero un numero random entre 74 y 90 y le sumo el 5% de ese numero para las cartas oro
                case 2 -> listaCartas.add(new Especial("jugador_especial"+i, clubes[random.nextInt(4)], paises[random.nextInt(4)], (int)(random.nextInt(89,99)*1.02), (int)(random.nextInt(89,99)*1.02), (int)(random.nextInt(89,99)*1.02), (int)(random.nextInt(89,99)*1.02), (int)(random.nextInt(89,99)*1.02), (int)(random.nextInt(89,99)*1.02), List.of(habilidadesEspeciales[random.nextInt(3)])));
                //genero un numero random entre 89 y 99 y le sumo el 2% de ese numero para las cartas especiales
        }
    }

    Collections.shuffle(listaCartas);
    Plantillas plantilla1 = new Plantillas("Usuario1", paises[random.nextInt(4)], clubes[random.nextInt(4)]);
    Plantillas plantilla2 = new Plantillas("Usuario2", paises[random.nextInt(4)], clubes[random.nextInt(4)]);
    for (int i = 0; i < 11; i++) {
        plantilla1.agregarCarta(listaCartas.get(i));
    }
    for (int i = 11; i < 22; i++) {
        plantilla2.agregarCarta(listaCartas.get(i));
    }
    System.out.println("Plantilla 1:");
    plantilla1.mostrarPlantel();
    System.out.println("Plantilla 2:");
    plantilla2.mostrarPlantel();
}
}
