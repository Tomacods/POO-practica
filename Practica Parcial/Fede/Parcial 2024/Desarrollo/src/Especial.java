import java.util.ArrayList;
import java.util.Random;

public class Especial extends Carta{
    
    private ArrayList<String> habilidades = new ArrayList<>();

    public Especial(String nombre, String club, String pais, Integer velocidad, Integer tiro, Integer regate, Integer defensa, Integer pase, Integer fisico){
        super(nombre, club, pais, velocidad, tiro, regate, defensa, pase, fisico);
    }

    public void imprimirHabilidades(){
        System.out.println("Habilidades: ");
        for (String hab: habilidades){
            System.out.println(hab);
        }
    }

    @Override
    public Integer valor(){
        Random random = new Random();
        Integer num = random.nextInt(100);
        while (num < 89){
            num = random.nextInt(100);
        }
        num = (int) (num * 1.02);
        if (num > 99){
            num = 99;
        }
        return num;
    }
}
