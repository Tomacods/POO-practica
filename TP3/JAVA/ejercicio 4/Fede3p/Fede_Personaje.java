/*Clase padre*/

public abstract class Fede_Personaje {
    
    private String nombre;
    protected Integer vida;
    protected Integer nivelAtaque;
    protected Integer nivelDefensa;

    public Fede_Personaje(String nombre, Integer vida, Integer nivelAtaque, Integer nivelDefensa){
        this.nombre = nombre;
        this.vida = vida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public Integer atacar(){
        return nivelAtaque;
    }

    /* Esto se redefine al aplicarse */
    public abstract void defender(Integer ataque) throws VidaNegativaException;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void recibirDanio(Integer danio){
        this.vida = vida - danio;
    }
}
