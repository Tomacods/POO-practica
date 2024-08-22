import java.util.Random;

public class Juego {
    public static void main(String[] args) throws Exception {
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

        Random random = new Random(); //declara un objeto de la clase Random
        boolean turnoP1 = random.nextBoolean(); 

        while (cesar.getVida() > 0 && mora.getVida() > 0) { //mientras la vida de cesar y mora sea mayor a 0
            if (turnoP1) { 
                mora.recibirDano(cesar.atacar()); //si es el turno de cesar, mora recibe el daño de cesar

            } else {
                cesar.recibirDano(mora.atacar()); //si es el turno de mora, cesar recibe el daño de mora
            }
            turnoP1 = !turnoP1; //cambia el turnoD
    }
    System.out.println("Vida de " + cesar.getNombre() + ": " + cesar.getVida()); //imprime la vida de cesar al final del combate
    System.out.println("Vida de " + mora.getNombre() + ": " + mora.getVida()); //imprime la vida de mora al final del combate
    }
}