import java.util.Random;
public abstract class Pokemon {
    protected String nombre;
    protected String tipo;
    protected String debilidad;
    protected Integer vida;
    protected Integer ataque;
    protected Integer defensa;
    protected Integer velocidad;
    protected Integer salvajismo;

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getSalvajismo() {
        return salvajismo;
    }

    public void setSalvajismo(Integer salvajismo) {
        this.salvajismo = salvajismo;
    }

    public Pokemon(String nombre, String tipo, String debilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.debilidad = debilidad;
    }

    public void Asignaratributos(){
        Random random = new Random();
        this.vida = 100;
        this.ataque = random.nextInt(0, 100);
        this.defensa = random.nextInt(0, 100);
        this.velocidad = random.nextInt(0, 100);
        this.salvajismo = random.nextInt(0, 100);
    }

    public  Boolean debilidad(Pokemon poke){
        if(this.tipo == poke.debilidad){
            return true;
        }else{
            return false;
        }
    }
    public void Imprimirpokemon(){
        System.out.println(this);
    }

    public String toString() {
        return "Pokemon "+"\n"+"Nombre: " + nombre +" Tipo: "+tipo+"\n"+ "Ataque= " + ataque + " Defensa= " + defensa +"\n"+ "Velocidad= " + velocidad+ " Salvajismo= " + salvajismo+"\n"+"Vida: "+vida;
    }
    public abstract Integer Ataque(Pokemon atacado);//Devuelve un Integer que seria el numero de daño que enviaria al metodo de Defensa del Pokemon Atacado
    public abstract void Defensa(Integer daño); //Devuelve un Integer que se le descontaria a la Vida del pokemon si tuviera que usar el metodo.

}
