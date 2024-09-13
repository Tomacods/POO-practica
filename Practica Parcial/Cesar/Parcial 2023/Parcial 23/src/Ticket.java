
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    private Integer nroventa;
    private LocalDate fecha; 
    
    private ArrayList<Producto> listaprod = new ArrayList<>();
    
    public Ticket(Integer nroventa, LocalDate fecha) {
        this.nroventa = nroventa;
    }
    public void agregarProducto(Producto produ){
        listaprod.add(produ);
    }
    public void ImprimirProductos(){
        System.out.println("Articulo " +"            "+ " Dosis"+"            " + "Precio"+"\n");
        for(Producto p : listaprod){
            System.out.println(p);
        }
    }
    public String Total(){
        Integer Ptotal = 0;
        for (Producto p : listaprod){
            Ptotal = Ptotal + p.getPrecio();
        }
        return "Total = "+ Ptotal;
    }
    public String tostring(){
        return "Numero de venta : "+nroventa+"                        "+"Fecha: "+fecha+"\n"; 
    }
}
