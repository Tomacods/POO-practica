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

    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.velocidad = asignarAtributos();
        this.ataque = asignarAtributos();
        this.defensa = asignarAtributos();
        this.salvajismo = asignarAtributos();
    }

    private Integer asignarAtributos(){
        Random random = new Random();
        Integer valor = random.nextInt(0, 100);
        return valor;
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
