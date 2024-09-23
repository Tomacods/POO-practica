public class PokemonHierba extends Pokemon{

    private static final int VIDA_POR_DEFECTO = 100;
    private static final String DEBILIDAD_POR_DEFECTO = "fuego";
    private static final String TIPO_POR_DEFECTO = "hierba";


    public PokemonHierba(String nombre, String tipo, int vida, String debilidad) {
        super(nombre,tipo, vida, debilidad);

    }
    public PokemonHierba(String nombre){
        this(nombre, TIPO_POR_DEFECTO, VIDA_POR_DEFECTO, DEBILIDAD_POR_DEFECTO);
    }

    /** Defensa: Si es atacado y su velocidad es mayor a 50, tiene un 50% de probabilidad de evadir el
ataque. Si su velocidad es menor o igual a 50, recibirá el ataque completo. Para realizar una
defensa se deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el ataque.*/
    
    @Override
    protected int defensa (Pokemon pokemon) {
        if(this.velocidad > 50){
            if(Math.random() < 0.5){
                this.vida -= pokemon.ataque - this.defensa; //ataque - defensa si la defensa es mayor a el ataque no se le resta nada
                return this.vida;
            }
        }else{
            this.vida -= pokemon.ataque - this.defensa; //ataque - defensa si la defensa es mayor a el ataque no se le resta nada
            return this.vida;
        }
        return ataque;
    }
}
