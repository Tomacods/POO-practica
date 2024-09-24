import java.util.ArrayList;

/*Se deberá crear un entrenador al que, al momento de crearse, se le asignará un nombre, un nivel de
entrenador (valor aleatorio de entre 1 y 100) y un pokemon principal. */

public class Entrenador {
    private String nombre;
    private Pokemon pokemon;
    private int nivelEntrenador;
    private ArrayList<Pokemon> pokedex;

    public Entrenador(String nombre, Pokemon pokemon) {
        this.nombre = nombre;
        this.pokemon = pokemon;
        this.nivelEntrenador = (int) (Math.random() * 100) + 1;
        this.pokedex = new ArrayList<Pokemon>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public int getNivelEntrenador() {
        return this.nivelEntrenador;
    }

    public void setNivelEntrenador(int nivelEntrenador) {
        this.nivelEntrenador = nivelEntrenador;
    }

    public ArrayList<Pokemon> getPokemones() {
        return this.pokedex;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokedex = pokemones;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nivel de entrenador: " + this.nivelEntrenador);
        System.out.println("Pokemon principal: " + this.pokemon.getNombre());
        System.out.println("Pokemones atrapados: ");
        for (Pokemon p : this.pokedex) {
            System.out.println(p.getNombre());
            p.impirmir();
        }
    }

    public void atraparPokemon(Pokemon pokemonSalvaje) {
        int contador = 0;
        while (contador < 3 && pokemonSalvaje.getVida() > 0) {
            this.pokemon.atacar(pokemonSalvaje);
            int nuevoSalvajismo = (int) (pokemonSalvaje.getSalvajismo() - pokemonSalvaje.getSalvajismo() * 0.10);
            pokemonSalvaje.SetSalvajismo(nuevoSalvajismo);  
            contador++;
        }
        if (pokemonSalvaje.getVida() > 0 && this.nivelEntrenador > pokemonSalvaje.getSalvajismo()) {
            this.pokedex.add(pokemonSalvaje);
            System.out.println("Se atrapó al pokemon");
        } else if (pokemonSalvaje.getVida() <= 0) {
            System.out.println("El pokemon no pudo ser atrapado porque su vida bajó a 0");
        }
    }
}

