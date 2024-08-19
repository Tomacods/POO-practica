public class App {
    public static void main(String[] args) throws Exception {
        Telefono telefono1 = new Telefono();

        System.out.println(telefono1.toString());

        Telefono telefono2 = new Telefono("Samsung", "123456789", "Galaxy S10", "Nuevo", 1000.0);
        System.out.println(telefono2.toString());

}
}
