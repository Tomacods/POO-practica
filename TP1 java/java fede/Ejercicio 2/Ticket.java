import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    
    private Integer nroVenta;
    private LocalDate fecha;
    private ArrayList<Producto> productos;
    
    public Ticket(Integer nroVenta){
        this.nroVenta = nroVenta;
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void imprimir(){
        System.out.println("Nro de venta: " + this.nroVenta + "         Fecha: " + this.fecha);
        System.out.println("Articulo        Dosis       Precio");
        for(Producto produ:this.productos){
            produ.imprimir();
        }
        System.out.println(                                             "Total: " + this.calcularTotal());
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for(Producto produ:this.productos){
            total += produ.getPrecio();
            //total = total + produ.getPrecio();
        } 
        return total;
    }
}
