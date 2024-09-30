public class Capitulo {
    private String nombre;
    private int orden;
    private boolean visto;

    public Capitulo(String nombre, int orden) {
        this.nombre = nombre;
        this.orden = orden;
        this.visto = false;
    }

    public void marcarVisto() {
        this.visto = true;
    }

    public boolean esVisto() {
        return visto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getOrden() {
        return orden;
    }
}