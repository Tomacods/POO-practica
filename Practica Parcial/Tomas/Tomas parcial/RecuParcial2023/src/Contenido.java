
public abstract class Contenido {
    protected String nombre;
    protected  int anioemision;
    protected int calificacion;

    public Contenido(String nombre, int anioemision, int calificacion) {
        this.nombre = nombre;
        this.anioemision = anioemision;
        this.calificacion = calificacion;
    }
    public abstract void reproducir();
    
}
