public class App {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        String[] palabras = {"Mesa", "Silla", "Vaso", "Cuchillo", "Cuchara"};
        for (String palabra : palabras) {
            System.out.println("Traducción de " + palabra + ": " + facade.traducir(palabra));
            System.out.println(palabra + " en mayúscula: " + facade.toUpperCase(palabra));
            System.out.println(palabra + " en minúscula: " + facade.toLowerCase(palabra));
        }
    }
}
