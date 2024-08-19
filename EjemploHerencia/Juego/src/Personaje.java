public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje (String nombre){
        this.nombre = nombre;
        this.vida = 100;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void recibirdaño(int daño) {
        this.vida -= daño;
        if (vida < 0) {
            vida = 0;
        }
    }
    public void atacar (Personaje personaje){
        System.out.println("Atacando a "+personaje.nombre);
        personaje.recibirdaño(10);
    }
    public void curar (Personaje personaje){
        System.out.println("Curando a "+personaje.nombre);
        personaje.recibirdaño(-5);
    }




}