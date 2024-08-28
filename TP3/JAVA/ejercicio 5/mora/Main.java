import java.util.Random;
public class Main {
public static void main(String[] args) throws Exception {
    Ninja p1 = new Ninja("Ninja");
    Samurai p2 = new Samurai("Samurai");
    Random random = new Random();
    boolean randomBoolean = random.nextBoolean();
    if (randomBoolean) {
        p2.defensa(p1.ataque());
    }
    else{
        p1.defensa(p2.ataque());
        }

    

    p1.defensa(p2.ataque());
    System.out.println("Nivel de vida de " + p1.getNombre() + ": " + p1.getVida());
}
}
