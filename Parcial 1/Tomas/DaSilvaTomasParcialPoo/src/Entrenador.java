import java.util.ArrayList;

/*Se deberá crear un entrenador al que, al momento de crearse, se le asignará un nombre, un nivel de
entrenador (valor aleatorio de entre 1 y 100) y un pokemon principal. */

public class Entrenador {
    private String nombre;
    private Pokemon pokemon;
    private int nivelEntrenador;
    private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

    public Entrenador(String nombre, Pokemon pokemon, int nivelEntrenador) {
        this.nombre = nombre;
        this.pokemon = pokemon;
        this.nivelEntrenador = nivelEntrenador;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Pokemon getPokemon(){
        return this.pokemon;
    }
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    public int getNivelEntrenador(){
        return this.nivelEntrenador;
    }
    public void setNivelEntrenador(int nivelEntrenador) {
        this.nivelEntrenador = nivelEntrenador;
    }
    public ArrayList<Pokemon> getPokemones(){
        return this.pokemones;
    }
    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
    /*El entrenador debe ser capaz de atrapar Pokémon. Para ello, su nivel de entrenador debe ser mayor al
    de salvajismo del Pokémon que quiere atrapar. Podrá realizar hasta 3 ataques para disminuir su
    nivel de salvajismo, por cada ataque se disminuirá un 10%. Sin embargo, si el Pokémon pierde toda su
    vida durante estos ataques, no podrá ser atrapado. Después de cada ataque, se deberá comprobar si es posible capturarlo.
    Si logra capturar al Pokémon, este se agrega automáticamente a su Pokédex */ 
    /*se  realizar tres combates entre instancias de ellas.


En un combate cada pokemon realiza un ataque por turno y es perdedor aquel que queda primero sin vida.siempre ataca el entrenador primero*/
    public void atraparPokemon(Pokemon pokemon){  //es la simulacion de un combate entre el entrenador y el pokemon salvaje
        if(this.nivelEntrenador > pokemon.salvajismo){
            for (int i = 0; i < 3; i++) {
                //el entrenador ataca primero y el pokemon salvaje se defiende
                pokemon.defensa(this.pokemon); // el pokemon se defiende del ataque del entrenador
                this.pokemon.atacar(pokemon); // el entrenador ataca al pokemon
                if(pokemon.getVida() <= 0){
                    System.out.println("No se pudo atrapar al pokemon");
                    return;
                }
            }
            this.pokemones.add(pokemon);
            System.out.println("Pokemon atrapado");
        }else{
            System.out.println("No se pudo atrapar al pokemon");
        }
    }
}
