public class Fede_Personaje1 extends Fede_Personaje {
    
    private static final Integer vida_inicial = 100;

    public Fede_Personaje1(String nombre, Integer vida){
        super(nombre, vida, 10, 100);
    }

    public Fede_Personaje1(String nombre){
        this(nombre, vida_inicial);
    }

    @Override /* definición de método en padre */
    public void defender(Integer ataque) throws VidaNegativaException{
        try{
            this.vida = vida - ataque;
            if (vida < 0){
                throw new VidaNegativaException("La vida no puede ser negativa.");
            }
        } catch (VidaNegativaException e){
            setVida(0);
        }
    }
}
