public class Farmacia {
    public static void main(String[] args) throws Exception{
        Productos p1 = new Productos("Adermicina", 300, "mg", 1000.0);
        Productos p2 = new Productos("Ibuprofeno", 600, "mg", 2500.0);
        Productos p3 = new Productos("Diclofenac", 75, "mg", 3000.0);

        Ticket ticket = new Ticket(637278);

        ticket.agregarProducto(p1);
        ticket.agregarProducto(p2);
        ticket.agregarProducto(p3);

        ticket.imprimir();
    }
}

