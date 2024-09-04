public class Fede extends OtroNombre {
    
    private static final Integer vida_inicial = 100;

    public Fede (String nombre, Integer vida){
        super(nombre,vida, 10,5);
    }

    public Fede (String nombre){
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
