public class PokemonAgua extends Pokemon {



    public PokemonAgua(String nombre) {
        super(nombre, "Agua", 100, "Fuego");
    }
    /* Ataque: Si el oponente es débil a este tipo (por ejemplo, un Pokémon de tipo Fuego), siempre se
ejecutará un ataque crítico que aumenta el ataque en un 70%. Para realizar este ataque se
deberá recibir el pokémon al cual se atacará y enviarle el daño y el tipo del pokémon atacante */
    @Override
    public void atacar(Pokemon pokemon) {
        if(pokemon.tipo.equals(this.debilidad)){
            pokemon.vida -= this.ataque * 1.7;
        } else {
            pokemon.vida -= this.ataque;
        }
    }
    

/*Defensa: Tiene un 30% de posibilidad de reducir el daño al 50%. Para realizar una defensa se
deberá recibir el daño. Tener en cuenta el nivel de defensa al recibir el ataque. */
@Override
protected void defensa(double danio) {
    double d = danio;
    if (d > this.ataque) {
        d -= this.defensa;
        if (d < 0) {
            d = -d;
        }
        if (Math.random() < 0.3) {
            d -= d * 0.50;
            this.vida -= d;
        } else {
            this.vida -= d;
        }
    }
}
    
    
}
