import java.util.Random;

public class Oro extends Carta{
    
    public Oro(String nombre, String club, String pais){
        super(nombre, club, pais);
    }

    public void asignarValores(){
        this.velocidad = valor();
        this.tiro = valor();
        this.regate = valor();
        this.defensa = valor();
        this.pase = valor();
        this.fisico = valor();
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
