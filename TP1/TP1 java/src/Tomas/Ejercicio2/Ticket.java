import java.time.LocalDate;



public class Ticket {
    private Integer numero;
    private Productos[] productos;
    private Integer cantidadProductos;
    private Double total;
    private LocalDate fecha;

    
    public Ticket(Integer numero){
        this.numero = numero;
        this.productos = new Productos[10];
        this.fecha = LocalDate.now();
        this.cantidadProductos = 0;
        this.total = 0.0;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public Integer getNumero(){
        return this.numero;
    }
    
    public void agregarProducto(Productos producto){
        this.productos[this.cantidadProductos] = producto;
        this.cantidadProductos++;
        this.total += producto.getPrecio();
    }
    
    public void imprimir(){
        System.out.println("Ticket N°: " + this.numero + " Fecha: " + this.fecha  );
        System.out.println("Articulo       Dosis       Precio");
        for (int i = 0; i < this.cantidadProductos; i++){
            this.productos[i].imprimir();
        }
        System.out.println("Total: " + this.total);
    }
    
}
