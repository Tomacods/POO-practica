public class PokemonFuego extends Pokemon {

    private static final int VIDA_POR_DEFECTO = 100;
    private static final String DEBILIDAD_POR_DEFECTO = "agua";
    private static final String TIPO_POR_DEFECTO = "fuego";

    public PokemonFuego(String nombre, String tipo, int vida, String debilidad) {
        super(nombre,tipo, vida, debilidad);
}
    public PokemonFuego(String nombre){
        this(nombre, TIPO_POR_DEFECTO, VIDA_POR_DEFECTO, DEBILIDAD_POR_DEFECTO);
}

/*efensa: Podrá defenderse de los ataques de cualquier tipo. recibirá el ataque completo. Para
realizar una defensa se deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el
ataque. */
//si la defensa es mas a
@Override
    protected int defensa(Pokemon pokemon) {
        this.vida -= pokemon.ataque - this.defensa; //ataque - defensa si la defensa es mayor a el ataque no se le resta nada
        return this.vida;
    }   

}
