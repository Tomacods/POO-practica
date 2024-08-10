public class Curso {
    
    private String urlJpg;
    private String nombre;
    private String proveedor;
    private Double puntuacion;
    private String estrellas;
    private Integer resenas;
    private Double descuento;
    private Double precio;
    private String etiqueta;
    
    public Curso(String urlJpg, String nombre, String proveedor, Double puntuacion, String estrellas, Integer resenas, Double descuento, Double precio, String etiqueta){
        this.urlJpg = urlJpg;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.puntuacion = puntuacion;
        this.estrellas = estrellas;
        this.resenas = resenas;
        this.descuento = descuento;
        this.precio = precio;
        this.etiqueta = etiqueta;
    }

    public void imprimirCur(){
        System.out.println(this.urlJpg);
        System.out.println(this.nombre);
        System.out.println(this.proveedor);
        System.out.println(this.puntuacion + "     " + this.estrellas + "     " + this.resenas);
        System.out.println("$" + this.descuento + "     " + "$" + this.precio);
        System.out.println(etiqueta);
    }
}
