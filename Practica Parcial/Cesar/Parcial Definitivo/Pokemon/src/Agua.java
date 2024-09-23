import java.util.Random;

public class Agua extends Pokemon {
    public Agua (String nombre, String tipo, String debilidad) {
        super(nombre, tipo, debilidad);
    }
    @Override
    public Integer Ataque(Pokemon atacado){
        Integer Atacar = this.ataque;
        if (debilidad(atacado)){
            Atacar = this.ataque + (int)(this.ataque*0.7);
        }
        return Atacar;
    }
    public void Defensa(Integer daño){
        Random random = new Random();
        Integer probabilidad = random.nextInt(0, 100);
        if(probabilidad <= 30){
            daño = daño-(int)(daño*0.5);
        }
        daño = daño - this.defensa;
        if(daño<0){
            daño=0;
        }
        this.setVida(this.getVida() - daño); 
        if(this.vida < 0){
            this.vida = 0;
            }
    }
}
