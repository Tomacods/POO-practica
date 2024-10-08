import java.util.Random;

public class Juego {
    public static void main(String[] args) throws VidaNegativaException {
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

        Random random = new Random(); //declara un objeto de la clase Random
        boolean turnoP1 = random.nextBoolean(); 
        while (cesar.getVida() > 0 && mora.getVida() > 0) { //mientras la vida de cesar y mora sea mayor a 0
                if (turnoP1) { 
                    mora.defender(cesar.atacar()); //si es el turno de cesar, mora recibe el daño de cesar
                } else {
                    cesar.defender(mora.atacar()); //si es el turno de mora, cesar recibe el daño de mora
                }
            turnoP1 = !turnoP1; //cambia el turnoD
        }
    System.out.println("Vida de " + cesar.getNombre() + ": " + cesar.getVida()); //imprime la vida de cesar al final del combate
    System.out.println("Vida de " + mora.getNombre() + ": " + mora.getVida()); //imprime la vida de mora al final del combate
    
    //mostrar al ganador
    if (cesar.getVida() > mora.getVida()) { //si la vida de cesar es mayor a la vida de mora
        System.out.println("El ganador es: " + cesar.getNombre()); //imprime que el ganador es cesar
    } else if (mora.getVida() > cesar.getVida()) { //si la vida de mora es mayor a la vida de cesar
        System.out.println("El ganador es: " + mora.getNombre()); //imprime que el ganador es mora
    } else { //si la vida de cesar es igual a la vida de mora
        System.out.println("Empate"); //imprime que hay un empate
    }
    }
}