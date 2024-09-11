import java.util.ArrayList;
import java.util.Random;

public class Especial extends Carta{
    
    private ArrayList<String> habilidades = new ArrayList<>();

    public Especial(String nombre, String club, String pais){
        super(nombre, club, pais);
    }

    public void agregarHabilidad(String habilidad){
        this.habilidades.add(habilidad);
    }

    public void asignarValores(){
        this.velocidad = valor();
        this.tiro = valor();
        this.regate = valor();
        this.defensa = valor();
        this.pase = valor();
        this.fisico = valor();
    }

    public Integer quimicaCarta(String paisFav, String equipoFav){
        return 100;
    }

    public String toString() {
        return super.toString() + "\n" + "Habilidades: "+ habilidades;
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
