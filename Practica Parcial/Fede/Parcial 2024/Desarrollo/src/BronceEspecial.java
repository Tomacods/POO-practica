import java.util.Random;

public class BronceEspecial extends Carta{
    
    private String habilidad;

    public BronceEspecial(String nombre, String club, String pais, Integer velocidad, Integer tiro, Integer regate, Integer defensa, Integer pase, Integer fisico, String habilidad){
        super(nombre, club, pais, velocidad, tiro, regate, defensa, pase, fisico);
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "Habilidad especial: " + habilidad + "    " + super.toString();
    }

    @Override
    public Integer valor(){
        Random random = new Random();
        Integer num = random.nextInt(66);
        while (num < 49){
            num = random.nextInt(66);
        }
        return num + 2;
    }
}
