public class Pelicula {
    
    private String nombre;
    private String rango;

    public Pelicula(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
    }

    public void imprimirPelicula() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rango: " + rango);
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }
}
