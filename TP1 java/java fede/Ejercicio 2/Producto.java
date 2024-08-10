public class Producto {
    
    private String  articulo;
    private Integer dosis;
    private String unidadDosis;
    private Double precio;

    public Producto(String articulo, Integer dosis, String unidadDosis, Double precio){
        this.articulo = articulo;
        this.dosis = dosis;
        this.unidadDosis = unidadDosis;
        this.precio = precio;
    }

    public void imprimir(){
        System.out.println(this.articulo + "       " + this.dosis + this.unidadDosis+ "        " + this.precio);
    }

    public Double getPrecio(){
        return this.precio;
    }
}
