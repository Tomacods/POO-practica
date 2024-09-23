import java.util.Random;

public class Fuego extends Pokemon {
    public Fuego (String nombre, String tipo, String debilidad) {
        super(nombre, tipo, debilidad);
    }
    @Override
    public Integer Ataque(Pokemon atacado){
        Random random = new Random();
        Integer Atacar = this.ataque;
        Integer probabilidad = random.nextInt(0, 100);
        if (debilidad(atacado) && probabilidad <= 70){
            Atacar = Atacar + (int)(this.ataque*0.5);
        }
        return Atacar;
    }
    public void Defensa(Integer daño){
        daño = daño - this.defensa;
        if(daño<0){
            daño=0;
        }
        this.vida = this.getVida() - daño;
        if(this.vida < 0){
            this.vida = 0;
            }
    }
}
