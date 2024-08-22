import java.util.Random;

public class Juego {
    public static void main(String[] args) throws Exception {
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

        Random random = new Random();
        boolean turnoP1 = random.nextBoolean();

        while (cesar.getVida() > 0 && mora.getVida() > 0) {
            if (turnoP1) {
                mora.recibirDano(cesar.atacar());
            } else {
                cesar.recibirDano(mora.atacar());
            }
            turnoP1 = !turnoP1;
 
    }
    System.out.println("Vida de " + cesar.getNombre() + ": " + cesar.getVida());
    System.out.println("Vida de " + mora.getNombre() + ": " + mora.getVida());
    }

    
}