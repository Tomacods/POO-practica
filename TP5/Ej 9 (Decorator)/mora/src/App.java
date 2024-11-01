public class App {
    public static void main(String[] args) throws Exception {
       Producto producto = new Producto(14390.0345);
       Eeuu dec1 = new Eeuu(producto);
       Eeuu dec2 = new Eeuu(producto);
       System.out.println(producto.getPrecio());
       System.out.println(dec1.getPrecio());
       System.out.println(dec2.getPrecio());


    }
}
