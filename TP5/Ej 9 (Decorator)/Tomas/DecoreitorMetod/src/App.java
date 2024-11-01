public class App {
    public static void main(String[] args) {
        Producto producto = new Producto(90000.50);

        ProductoDecorator usdDecorator = new USDDecorator(producto);
        ProductoDecorator arsDecorator = new ARSDecorator(producto);

        System.out.println("Precio original: " + producto.getPrecio());
        System.out.println("Precio con USDDecorator: " + usdDecorator.getPrecio());
        System.out.println("Precio con ARSDecorator: " + arsDecorator.getPrecio());
    }
}