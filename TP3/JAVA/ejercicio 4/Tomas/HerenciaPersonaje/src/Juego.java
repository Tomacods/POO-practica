import java.util.Random;

public class Juego {
    public static void main(String[] args) throws VidaNegativaException {
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

                for (int i = 0; i < 3; i++) {
                    try {
                    throw new VidaNegativaException("Vida negativa exception occurred.");
                    } catch (VidaNegativaException e) { //catch es para capturar la excepcion y e es el objeto de la excepcion
                        System.out.println(e.getMessage());
                    }
                }
                Random random = new Random();
                boolean turnoP1 = random.nextBoolean();
        
                while (cesar.getVida() > 0 && mora.getVida() > 0) {
                    if (turnoP1) {
                        mora.recibirDano(cesar.atacar());
                    } else {
                        cesar.recibirDano(mora.atacar());
                    }
                    turnoP1 = !turnoP1;
        
                    if (cesar.getVida() < 0) {
                        cesar.setVida(0);
                        throw new VidaNegativaException("La vida de " + cesar.getNombre() + " ha llegado a un valor negativo. Se establece en 0.");
                    }
                    if (mora.getVida() < 0) {
                        mora.setVida(0);
                        throw new VidaNegativaException("La vida de " + mora.getNombre() + " ha llegado a un valor negativo. Se establece en 0.");
                    }
                }
        
                System.out.println("Vida de " + cesar.getNombre() + ": " + cesar.getVida());
                System.out.println("Vida de " + mora.getNombre() + ": " + mora.getVida());
            }
    
static class VidaNegativaException extends Exception {
    public VidaNegativaException(String message) {
        super(message);
    }
}
}