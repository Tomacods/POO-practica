public abstract class Personaje {
    //atributos
    private String nombre;
    protected int vida;
    protected int nivelAtaque;
    protected int nivelDefensa;

//constructor
public Personaje(String nombre,int vida, int nivelAtaque, int nivelDefensa){
    this.nombre = nombre;
    this.vida=vida;
    this.nivelAtaque= nivelAtaque;
    this.nivelDefensa=nivelDefensa;
}
//getters
public int getVida() {
    return vida;
}
public int getNivelAtaque() {
    return nivelAtaque;
}
public int getNivelDefensa() {
    return nivelDefensa;
}
public String getNombre (){
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setVida(int vida) {
    this.vida = vida;
}
public void setNivelAtaque(int nivelAtaque) {
    this.nivelAtaque = nivelAtaque;
}
public void setNivelDefensa(int nivelDefensa) {
    this.nivelDefensa = nivelDefensa;
}
//metodos
public int ataque(){
    return nivelAtaque;
}
protected abstract Integer defensa(int ataque);


}

