
public class Messi extends Personaje {
    
    private static final Integer vida_inicial = 100;

    public Messi (String nombre, Integer vida){
        super(nombre,vida, 8, 25);
    }

    public Messi (String nombre){
        this(nombre, vida_inicial);
    }

    @Override
    public void defender(Integer ataque) throws ExcepcionNeg{
        try{
            this.vida = vida - ataque;
            if (vida < 0) {
                throw new ExcepcionNeg ("Fede dijo que la vida no puede ser negativa.");
            }
        } catch (ExcepcionNeg e){
                setVida(0);
        }
    }

}
