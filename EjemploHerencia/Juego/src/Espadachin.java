public class Espadachin extends Personaje {

    private int vida;
    private static final int DANO_BASE = 10;

    private static final int DANO = 10;
    private static final int CURACION = 5;
    private static final int VIDA = 100;
    
        public Espadachin(String nombre) {
        super(nombre);
        this.vida = VIDA;
    }
    public Espadachin(String nombre, int vida) {
        super(nombre);
        this.vida = vida;
    }
    
    @Override
    public void recibirdaño(int daño) {
        super.recibirdaño(daño);
        if (vida < 0) {
            vida = 0;
        }
    }
    @Override
    public void atacar (Personaje personaje){
        super.atacar(personaje) ;
        personaje.recibirdaño(DANO);
    }
    @Override
    public void curar (Personaje personaje){
        super.curar(personaje);
        personaje.recibirdaño(-CURACION);
    }
}
