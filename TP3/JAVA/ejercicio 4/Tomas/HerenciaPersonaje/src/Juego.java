import java.util.Random;

public class Juego {
    public static void main(String[] args) throws Exception {
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

        for (int i = 0; i < 3; i++) {
            try {
                realizarCombate(cesar, mora);
            } catch (VidaNegativaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void realizarCombate(Personaje p1, Personaje p2) throws VidaNegativaException {
        Random random = new Random();
        boolean turnoP1 = random.nextBoolean();

        while (p1.getVida() > 0 && p2.getVida() > 0) {
            if (turnoP1) {
                p2.recibirDano(p1.atacar());
            } else {
                p1.recibirDano(p2.atacar());
            }
            turnoP1 = !turnoP1;

            if (p1.getVida() < 0) {
                p1.setVida(0);
                throw new VidaNegativaException("La vida de " + p1.getNombre() + " ha llegado a un valor negativo. Se establece en 0.");
            }
            if (p2.getVida() < 0) {
                p2.setVida(0);
                throw new VidaNegativaException("La vida de " + p2.getNombre() + " ha llegado a un valor negativo. Se establece en 0.");
            }
        }

        System.out.println("Vida de " + p1.getNombre() + ": " + p1.getVida());
        System.out.println("Vida de " + p2.getNombre() + ": " + p2.getVida());
    }
}

class VidaNegativaException extends Exception {
    public VidaNegativaException(String message) {
        super(message);
    }
}
