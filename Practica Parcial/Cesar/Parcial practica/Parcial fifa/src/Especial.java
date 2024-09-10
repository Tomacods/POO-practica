import java.util.Random;
import java.util.ArrayList;

public class Especial extends Carta {

    private ArrayList<String> hespecial = new ArrayList<>();

    public Especial(String nombre, String club, String pais) {
        super(nombre, club, pais);
    }

    public void cargarHabilidades(String habilidad){
        this.hespecial.add(habilidad);
    }

    @Override
    public Integer valor() {
        Integer val = 0;
        Integer max = 99;
        Integer min = 89;
        Random random = new Random();
        val = random.nextInt(89,99);
        if ((val > max) || (val < min)) {
            val = random.nextInt();
        }
        val =(int)(val + (val * 0.02));
        if (val > 99){
            val = 99;
        }
        return val;
    }
    public String toString() {
        return super.toString() + " Habilidades : " + hespecial;
    }
}
