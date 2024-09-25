
import java.util.ArrayList;
import java.util.List;
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
        //lista vacia de pokemones salvajes
        List<Pokemon> pokemonSalvaje = new ArrayList<>();



        String[] tiposPokemon = {"Fuego", "Hierba", "Agua"};

        //GENERO 10 POKEMONES ALEATORIOS
        for (int i = 0; i < 10; i++) {

            String tipo = tiposPokemon[random.nextInt(3)];
            String nombre = "Pokemon" + (i + 1);

            if (tipo.equals("Fuego")) {
                PokemonFuego pokemon = new PokemonFuego(nombre);
                pokemonSalvaje.add(pokemon);
            } else if (tipo.equals("Hierba")) {
                PokemonHierba pokemon = new PokemonHierba(nombre);
                pokemonSalvaje.add(pokemon);
            } else {
                PokemonAgua pokemon = new PokemonAgua(nombre);
                pokemonSalvaje.add(pokemon);
            }
            
        }

        Entrenador entrenador = new Entrenador("Ash", pokemonSalvaje.get(0));

        for (Pokemon pokemon : pokemonSalvaje) {
            if (entrenador.getNivelEntrenador() > pokemon.getSalvajismo()) {
                entrenador.atraparPokemon(pokemon);

            }
        }

        entrenador.imprimir();
    }
}
