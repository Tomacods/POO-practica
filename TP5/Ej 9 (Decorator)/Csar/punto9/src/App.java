public class App {
    public static void main(String[] args) throws Exception {
        Producto producto = new Producto("Pelota de Messi", 99.99);
        ArgentinaDecorator arg = new ArgentinaDecorator(producto);
        YankeeDecorator usd = new YankeeDecorator(producto);
        System.out.println("Precio sin denominacion "+ producto.getPrecio());
        System.out.println("Precio en Dolares "+ usd.getPrecio());
        System.out.println("Precio en Pesos "+ arg.getPrecio());
    }
}
