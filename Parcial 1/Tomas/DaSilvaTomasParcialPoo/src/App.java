
import java.util.Random;

/*Simulación:
● Se crearán 10 Pokémon diferentes de manera aleatoria, para que el entrenador intente
atraparlos.
● Al finalizar los intentos de captura, se deberá mostrar:
○ Los datos del entrenador (nombre y nivel).
○ La lista de Pokémon atrapados en su Pokédex.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
    
        Pokemon pokemon1 = new PokemonHierba("Bulbasaur"); // pokemon del entrenador
        Pokemon pokemon2 = new PokemonHierba("Oddish");
        Pokemon pokemon3 = new PokemonHierba("Bellsprout");
        Pokemon pokemon4 = new PokemonHierba("Chikorita");
        Pokemon pokemon5 = new PokemonHierba("Treecko");
        Pokemon pokemon6 = new PokemonFuego("Charmander");
        Pokemon pokemon7 = new PokemonFuego("Vulpix");
        Pokemon pokemon8 = new PokemonFuego("Growlithe");
        Pokemon pokemon9 = new PokemonFuego("Cyndaquil");
        Pokemon pokemon10 = new PokemonFuego("Torchic");

        Entrenador entrenador = new Entrenador("Ash", pokemon1, random.nextInt(100) + 1 );

        entrenador.atraparPokemon(pokemon1);
        entrenador.atraparPokemon(pokemon2);
        entrenador.atraparPokemon(pokemon3);
        entrenador.atraparPokemon(pokemon4);
        entrenador.atraparPokemon(pokemon5);
        entrenador.atraparPokemon(pokemon6);
        entrenador.atraparPokemon(pokemon7);
        entrenador.atraparPokemon(pokemon8);
        entrenador.atraparPokemon(pokemon9);
        entrenador.atraparPokemon(pokemon10);

        System.out.println("Nombre del entrenador: " + entrenador.getNombre());
        System.out.println("Nivel del entrenador: " + entrenador.getNivelEntrenador());
        System.out.println("Pokemones atrapados: ");
        for (Pokemon pokemon : entrenador.getPokemones()) {
            System.out.println(pokemon.getNombre());
        }
    }
}
