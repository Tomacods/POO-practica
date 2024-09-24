public class PokemonHierba extends Pokemon {

    public PokemonHierba(String nombre) {
        super(nombre, "Hierba", 100, "Fuego");
    }

    /** Defensa: Si es atacado y su velocidad es mayor a 50, tiene un 50% de probabilidad de evadir el
    ataque. Si su velocidad es menor o igual a 50, recibirá el ataque completo. Para realizar una
    defensa se deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el ataque.*/

    @Override
    protected void defensa(double danio) {
        if (danio > this.defensa) {
            if (this.velocidad > 50) {
                if (Math.random() < 0.5) {
                    danio -= this.defensa;
                    if (danio < 0) {
                        danio = -danio;
                    }
                    this.vida -= danio;
                }
            } else {
                this.vida -= danio;
            }
        } else {
            this.vida -= danio;
        }
    }
}

