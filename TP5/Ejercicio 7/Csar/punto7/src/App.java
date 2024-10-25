public class App {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();
    
        String [] palabras = {"Hola", "Mora", "Escalera", "Perro", "Auto"};
        for (String palabra : palabras) {
            System.out.println("Traducción de " + palabra + ": " + facade.traducir(palabra));
            System.out.println("Mayúsculas de " + palabra + ": " + facade.toUpperCase(palabra));
            System.out.println("Minúsculas de " + palabra + ": " + facade.toLowerCase(palabra));
        }
    }
}
