public class PokemonFuego extends Pokemon {



    public PokemonFuego(String nombre) {
        super(nombre, "Fuego", 100, "Agua");

    }

/*efensa: Podrá defenderse de los ataques de cualquier tipo. recibirá el ataque completo. Para
realizar una defensa se deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el
ataque. */
//si la defensa es mas a
@Override
protected void defensa(double danio) {
        if (danio > this.ataque) {
            danio -= this.defensa;
        }
        if (danio < 0) {
            danio = -danio;
        }
        this.vida -= danio;
        }

}
