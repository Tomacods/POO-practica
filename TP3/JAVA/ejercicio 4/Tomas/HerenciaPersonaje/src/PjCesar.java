

public class PjCesar extends Personaje{
    
    private static final int VIDA_POR_DEFECTO = 100;

    public PjCesar(String nombre, int vida) {
        super(nombre, vida, 10, 100);
    }

    public PjCesar(String nombre) {
        this(nombre, VIDA_POR_DEFECTO);
    }

    @Override
    public void defender(int ataque) {
        this.vida -= ataque;   
        if (vida < 0)
            vida = 0;
    }
    
}   