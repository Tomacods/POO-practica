public class Pelicula extends Contenido {
    private Boolean visto;
    public Pelicula (String nombre, Integer anio, Integer calificacion, Boolean visto){
        super(nombre, anio, calificacion);
        this.visto = visto;
    }
    @Override
    public void reproducir(){
        System.out.println("Se esta reproduciendo "+ this.nombre);
        this.visto = true;
    }
    @Override
    public void imprimircontenido(){
        System.out.println(this.nombre+" ("+this.anio+") "+this.calificacion+" estrellas");
    }
}
