public class Ninja extends Personaje {

    private static final int VIDA_POR_DEFECTO = 100;

    public Ninja (String nombre, int vida){
        super(nombre,vida, 45, 40); //super es para heredar de la clase padre
    }
    public Ninja (String nombre){
        this(nombre, VIDA_POR_DEFECTO);

    }
    @Override
    protected Integer defensa(int ataque) {
        return vida = (vida - ataque) + nivelDefensa;
    }


}
