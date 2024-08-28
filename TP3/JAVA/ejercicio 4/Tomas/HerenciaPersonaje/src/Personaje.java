/*Defina la clase abstracta Personaje con los atributos vida, nivelAtaque, nivelDefensa y los
métodos atacar() que retorne un integer, y defender(ataque). Implemente el método
atacar pero no el método defender(). Luego, cree dos clases hijas donde ambas
implementan el método defenderse y al menos una de ellas extiende el método atacar.
Cada clase debe establecer una cantidad de puntos de vida por defecto.
En un ataque se deben realizar cierta cantidad de puntos de daño y en la defensa se
debe reducir esa cantidad de puntos de daños. El resultado final de los puntos de ataque
debe descontar la misma cantidad de puntos de vida del personaje que defiende.*/
public abstract class Personaje {
    private String nombre;
    protected int vida;
    protected int nivelAtaque;
    protected int nivelDefensa;

    public Personaje(String nombre,int vida, int nivelAtaque, int nivelDefensa){
        this.nombre = nombre;
        this.vida = vida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public int atacar(){
        return nivelAtaque;
    }

    public abstract void defender(int ataque) throws VidaNegativaException;

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirDano(int dano)throws VidaNegativaException{
        if(this.vida - dano < 0){
            throw new VidaNegativaException("La vida no puede ser negativa");
        }
    this.vida -= dano;
    }
}

