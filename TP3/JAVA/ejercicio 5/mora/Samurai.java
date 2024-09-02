
public class Samurai extends Personaje {

    private static final int VIDA_POR_DEFECTO = 100;

    public Samurai (String nombre,int vida){
        super(nombre,vida, 55, 25); //super es para heredar de la clase padre
    }
    public Samurai(String nombre){
        this(nombre, VIDA_POR_DEFECTO);
    }
    public int ataque(){
        return (super.ataque() + 5);
    }
    @Override
    protected Integer defensa(int ataque) {
        return vida = (vida - ataque) + nivelDefensa;
    }
    
}
