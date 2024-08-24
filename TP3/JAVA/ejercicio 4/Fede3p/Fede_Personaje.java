/*Clase padre*/

public abstract class Fede_Personaje {
    
    private String nombre;
    protected Integer vida;
    protected Integer ataque;
    protected Integer defensa;

    public Fede_Personaje(String nombre, Integer vida, Integer ataque, Integer defensa){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public Integer atacar(){
        return ataque;
    }

    /* Esto se redefine al aplicarse */
    public abstract void defender(Integer ataque);

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
