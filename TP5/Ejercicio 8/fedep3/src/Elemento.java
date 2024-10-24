abstract class Elemento /*implements Manipular*/ {
    
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Boolean esCarpeta();
    //public abstract void imprimirElementos();
}
