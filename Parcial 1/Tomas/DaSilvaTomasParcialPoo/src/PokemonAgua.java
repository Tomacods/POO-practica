public class PokemonAgua extends Pokemon {

    private static final int VIDA_POR_DEFECTO = 100;
    private static final String DEBILIDAD_POR_DEFECTO = "hierba";
    private static final String TIPO_POR_DEFECTO = "Agua";


    public PokemonAgua(String nombre, String tipo, int vida, String debilidad) {
        super(nombre,tipo, vida, debilidad);

    }
    public PokemonAgua(String nombre){
        this(nombre, TIPO_POR_DEFECTO, VIDA_POR_DEFECTO, DEBILIDAD_POR_DEFECTO);
    }
    /* Ataque: Si el oponente es débil a este tipo (por ejemplo, un Pokémon de tipo Fuego), siempre se
ejecutará un ataque crítico que aumenta el ataque en un 70%. Para realizar este ataque se
deberá recibir el pokémon al cual se atacará y enviarle el daño y el tipo del pokémon atacante */
    @Override
    public int atacar(Pokemon pokemon) {
        if(pokemon.tipo.equals(this.debilidad)){
            pokemon.vida -= this.ataque * 1.7;
            return pokemon.vida;
        }else{
            pokemon.vida -= this.ataque;
            return pokemon.vida;
        }
    }
    

/*Defensa: Tiene un 30% de posibilidad de reducir el daño al 50%. Para realizar una defensa se
deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el ataque. */
    @Override
    protected int defensa(Pokemon pokemon) { 
        if(Math.random() < 0.3){
            this.vida -= (pokemon.ataque - this.defensa) / 2;
            return this.vida;
        }else{
            this.vida -= pokemon.ataque - this.defensa; //ataque - defensa si la defensa es mayor a el ataque no se le resta nada
            return this.vida;
        }
    }
    
    
}
