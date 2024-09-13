import java.util.Random;

public class BronceEspecial extends Carta{
    
    private String habilidad;

    public BronceEspecial(String nombre, String club, String pais, String habilidad){
        super(nombre, club, pais);
        this.habilidad = habilidad;
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
        if ((paisFav == pais) && (equipoFav == club)){
            return 100;
        } else {
            if ((paisFav == pais) || (equipoFav == club)){
                return 80;
            } else {
                return 0;
            }
        }
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