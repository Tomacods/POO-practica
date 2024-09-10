import java.util.Random;

public class Oro extends Carta{
    
    public Oro(String nombre, String club, String pais, Integer velocidad, Integer tiro, Integer regate, Integer defensa, Integer pase, Integer fisico){
        super(nombre, club, pais, velocidad, tiro, regate, defensa, pase, fisico);
    }

    @Override
    public Integer valor(){
        Random random = new Random();
        Integer num = random.nextInt(91);
        while (num < 74){
            num = random.nextInt(91);
        }
        num = (int) (num * 1.05);
        return num;
    }
}
