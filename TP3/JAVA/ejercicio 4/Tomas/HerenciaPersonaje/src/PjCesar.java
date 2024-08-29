

public class PjCesar extends Personaje{
    
    private static final int VIDA_POR_DEFECTO = 100;

    public PjCesar(String nombre, int vida) {
        super(nombre, vida, 5, 100);
    }

    public PjCesar(String nombre) {
        this(nombre, VIDA_POR_DEFECTO);
    }

    @Override
    public void defender(int ataque) throws VidaNegativaException {
        try {
            this.vida -= ataque;   
            if (vida < 0) 
                throw new VidaNegativaException("La vida no puede ser negativa");
        } catch (VidaNegativaException e) {
            setVida(0);
        }
    }
    
}   