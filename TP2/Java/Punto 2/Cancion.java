public class Cancion {
    
    private String nombre;
    private String autor;
    private Double duracion;

    public Cancion(String nombre, String autor, Double duracion){
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }

    public void imprimir(){
        System.out.println(this.nombre);
        System.out.println(this.autor);
        System.out.println(this.duracion);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}