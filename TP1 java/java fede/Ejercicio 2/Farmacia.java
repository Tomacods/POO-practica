public class Farmacia {

    public static void main(String[] args) throws Exception{
        Producto p1 = new Producto("Adermicina", 300, "mg", 1000.0);
        Producto p2 = new Producto("Ibuprofeno", 600, "mg", 2500.0);
        Producto p3 = new Producto("Diclofenac", 75, "mg", 3000.0);

        Ticket ticket = new Ticket(637278);

        ticket.agregarProducto(p1);
        ticket.agregarProducto(p2);
        ticket.agregarProducto(p3);

        ticket.imprimir();
    }
}