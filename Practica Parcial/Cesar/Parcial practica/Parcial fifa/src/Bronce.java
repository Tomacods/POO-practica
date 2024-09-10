import java.util.Random;
public class Bronce extends Carta {
    private String hespecial;

    public Bronce(String nombre, String club, String pais, String hespecial) {
        super(nombre, club, pais);
        this.hespecial = hespecial;
    }
@Override
public Integer valor(){
    Integer val = 0;
    Integer max = 65;
    Integer min = 49;
    Random random = new Random();
    val = random.nextInt(49,65);
    if ((val > max) || (val < min) ){
        val = random.nextInt();
    }
    return val+2;
}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + " Habilidad especial "+ hespecial;
}
}
