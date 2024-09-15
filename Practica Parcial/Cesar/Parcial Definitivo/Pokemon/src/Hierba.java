import java.util.Random;

public class Hierba extends Pokemon {
    public Hierba (String nombre, String tipo, String debilidad) {
        super(nombre, tipo, debilidad);
    }
    @Override
    public Integer Ataque(Pokemon atacado){
        Random random = new Random();
        Integer Atacar = 0;
        Integer probabilidad = random.nextInt(0, 100);
        if (debilidad(atacado) && probabilidad <= 70){
            Atacar = this.ataque + (int)(this.ataque*0.5);
        }
        return Atacar;
    }
    public void Defensa(Integer daño){
        Random random = new Random();
        Integer probabilidad = random.nextInt(0, 100);
        if(this.velocidad > 50 && probabilidad <= 50){
            daño = 0;
        }
        daño = daño - this.defensa;
        if(daño>0){
            daño=0;
        }
        this.vida = this.getVida() - daño;
    }
}
