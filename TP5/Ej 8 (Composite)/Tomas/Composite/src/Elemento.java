abstract class Elemento {
    protected String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean esCarpeta();
}