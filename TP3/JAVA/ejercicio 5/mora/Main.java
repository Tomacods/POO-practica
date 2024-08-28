import java.util.Random;
public class Main {
public static void main(String[] args) throws Exception {
    Ninja p1 = new Ninja("Ninja");
    Samurai p2 = new Samurai("Samurai");
    Random random = new Random();
    boolean randomBoolean = random.nextBoolean();
    while (p1.getVida() > 0 && p2.getVida()> 0){
    if (randomBoolean) {
        p2.defensa(p1.ataque());
    }
        else{
            p1.defensa(p2.ataque());
            }
    randomBoolean = !randomBoolean;
    }
if (p1.getVida() > p2.getVida()){
    System.out.println("Ganador: " + p1.getNombre);
    }
    else{
    System.out.println("Ganador: " + p2.getNombre());
        }
    }
    
}

