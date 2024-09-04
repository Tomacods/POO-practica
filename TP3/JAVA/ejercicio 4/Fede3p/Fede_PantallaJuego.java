import java.util.Random;

public class Fede_PantallaJuego {
    
    public static void main(String[] args) throws Exception{

        // Personajes

        Fede_Personaje1 p1 = new Fede_Personaje1("Cersei");
        Fede_Personaje2 p2 = new Fede_Personaje2("Sansa");

        // Declaración de Random
        Random random = new Random();
        Integer turno = random.nextInt(2);
        Integer contador = 0;

        while (p1.getVida() > 0 && p2.getVida() > 0){
            contador = contador + 1;
            System.out.println("     -------------     Turno " + contador + ":");
            if (turno == 1){
                p2.recibirDanio(p1.atacar()); //si es el turno del personaje 1, el personaje 2 recibe el daño
                System.out.println(p1.getNombre() + " ha atacado a " + p2.getNombre() + "!");
            } else {
                p1.recibirDanio(p2.atacar()); //si es el turno del personaje 2, el personaje 1 recibe el daño
                System.out.println(p2.getNombre() + " ha atacado a " + p1.getNombre() + "!");
            }
            System.out.println("Nivel de vida de " + p1.getNombre() + ": " + p1.getVida()); // imprime contador de vida de personaje 1
            System.out.println("Nivel de vida de " + p2.getNombre() + ": " + p2.getVida()); // imprime contador de vida de personaje 2
            turno = random.nextInt(2); // se vuelve a pedir el turno
        }
        if (p1.getVida() > p2.getVida()){
            System.out.println("El ganador es: " + p1.getNombre());
        } else {
            System.out.println("El ganador es: " + p2.getNombre());
        }
    }
}