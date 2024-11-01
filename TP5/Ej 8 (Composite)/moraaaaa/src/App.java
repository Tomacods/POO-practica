public class App {
    public static void main(String[] args) throws Exception {

        Carpeta principal = new Carpeta("Carpeta principal");
        Carpeta c1 = new Carpeta(" Carpeta1");
        Carpeta c2 = new Carpeta(" Carpeta2");

        c1.add(new Archivo("   file1"));
        c1.add(new Archivo("   file2"));

        Carpeta c3 = new Carpeta("   Subcarpeta1");
        c3.add(new Archivo("      file1"));
        c2.add(c3);

        principal.add(c1);
        principal.add(c2);
        principal.mostrar();

    }
}
