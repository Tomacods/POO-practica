public abstract class Personaje {
    //atributos
    private int vida;
    private int nivelAtaque;
    private int nivelDefensa;

//constructor
public Personaje(int vida, int nivelAtaque, int nivelDefensa){
    this.vida=vida;
    this.nivelAtaque=nivelAtaque;
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
//metodos
public int ataque(){
    return 20;
}
public void defensa(int ataque){
vida += ataque();
}
}

