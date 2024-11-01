public class Pelicula {
    private String nombre;
    private Integer clasificacion, año;
    public Pelicula(String nombre, Integer año, Integer clasificacion) {
        this.nombre = nombre;
        this.año = año;
        this.clasificacion=clasificacion;
    }
    public Integer getClasificacion(){
        return clasificacion;

    }
    public void imprimir (){
        System.out.println(nombre + ", " + "(" + año + ")");
    }
    
    
}
