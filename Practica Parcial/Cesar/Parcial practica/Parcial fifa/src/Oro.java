import java.util.Random;

public class Oro extends Carta {
    
    public Oro(String nombre, String club, String pais) {
        super(nombre, club, pais);
    }

    @Override
    public Integer valor() {
        Integer val = 0;
        Integer max = 90;
        Integer min = 74;
        Random random = new Random();
        val = random.nextInt(74,90);
        if ((val > max) || (val < min)) {
            val = random.nextInt();
        }
        val = (int)(val + (val * 0.05));
        return val;
    }
}
