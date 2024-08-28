
public class PjMora extends Personaje{
    
    private static final int VIDA_POR_DEFECTO = 100;

    public PjMora(String nombre, int vida) {
        super(nombre, vida, 15, 100);
    }

    public PjMora(String nombre) {
        this(nombre, VIDA_POR_DEFECTO);
    }

    @Override
    public void defender(int ataque) throws VidaNegativaException {
        this.vida -= ataque;   
        if (vida < 0)
            throw new VidaNegativaException("La vida no puede ser negativa");
    }
    @Override
    public int atacar(){
        return nivelAtaque + 15;
    }
    
}