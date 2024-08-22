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

    public abstract void defender(int ataque);

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

    public void recibirDano(int dano) {
    this.vida -= dano;
    }
//     public void realizarCombate(Personaje p1, Personaje p2)  {
//         Random random = new Random();
//         boolean turnoP1 = random.nextBoolean();

//         while (p1.getVida() > 0 && p2.getVida() > 0) {
//             if (turnoP1) {
//                 p2.recibirDano(p1.atacar());
//             } else {
//                 p1.recibirDano(p2.atacar());
//             }
//             turnoP1 = !turnoP1;


//         System.out.println("Vida de " + p1.getNombre() + ": " + p1.getVida());
//         System.out.println("Vida de " + p2.getNombre() + ": " + p2.getVida());
//     }
// }
}

