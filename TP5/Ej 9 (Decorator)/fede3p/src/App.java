public class App {
    public static void main(String[] args) throws Exception {

        // Decorator de producto
        Producto producto = new Producto(90000.50);

        // Decortor de los precios señalando monedas
        PesoDecorator peso = new PesoDecorator(producto);
        DolarDecorator dolar = new DolarDecorator(producto);

        // Imprimir

        System.out.println("Precio original: " + producto.getPrecio());
        System.out.println("Precio en pesos argentinos: " + peso.getPrecio());
        System.out.println("Precio en dolares: " + dolar.getPrecio());
    }
}
