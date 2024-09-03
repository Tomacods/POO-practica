public abstract class Personaje {

    private String nombre;
    protected Integer vida;
    protected Integer nivelAtaque;
    protected Integer nivelDefensa;

    public Personaje(String nombre, Integer vida, Integer nivelAtaque, Integer nivelDefensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public Integer atacar(){
        return nivelAtaque;
    }

    public abstract void  defender(Integer ataque) throws ExcepcionNeg;

    public void recibirDanio (Integer danio){
        this.vida = vida - danio;
    }

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
}
