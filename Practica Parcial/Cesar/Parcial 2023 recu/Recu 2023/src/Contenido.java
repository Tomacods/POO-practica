public abstract class Contenido {
    protected String nombre;
    protected Integer anio;
    protected Integer calificacion;

    public Contenido(String nombre, Integer anio, Integer calificacion) {
        this.nombre = nombre;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public abstract void reproducir();
    public abstract void imprimircontenido();
}
