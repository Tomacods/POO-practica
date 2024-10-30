public abstract class Juego {
    protected String id;
    protected float importe;

    public Juego (String id, float importe) {
        this.id = id;
        this.importe = importe;
    }
    public abstract float getPrecio();
    
}
//un ejemplo de factory method es el siguiente, donde se tiene una clase abstracta que tiene un metodo abstracto que se implementa en las clases hijas
//en este caso la clase abstracta es Juego y el metodo abstracto es getPrecio
//las clases hijas de Juego son JuegoA y JuegoB que implementan el metodo getPrecio
