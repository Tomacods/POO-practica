public class Fede_Personaje2 extends Fede_Personaje {
    
    private static final Integer vida_inicial = 100;

    public Fede_Personaje2(String nombre, Integer vida){
        super(nombre, vida, 10, 100);
    }

    public Fede_Personaje2(String nombre){
        this(nombre, vida_inicial);
    }

    @Override /* definición de método en padre */
    public void defender(Integer ataque){
        this.vida = vida - ataque;
        if (vida < 0){
            vida = 0;
        }
    }
}
