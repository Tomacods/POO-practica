
import java.time.LocalDate;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Producto prod1 = new Producto("Ibuprofeno", 50, random.nextInt(1000, 5000));
        Producto prod2 = new Producto("Tafirol", 50, random.nextInt(1000, 5000));
        Producto prod3 = new Producto("FAFA", 50, random.nextInt(1000, 5000));
        Ticket ticketazo = new Ticket(random.nextInt(423, 777),LocalDate.now());
        ticketazo.agregarProducto(prod3);
        ticketazo.agregarProducto(prod1);
        ticketazo.agregarProducto(prod2);
        System.out.println(ticketazo);
        ticketazo.ImprimirProductos();
        ticketazo.Total();
    }
}
