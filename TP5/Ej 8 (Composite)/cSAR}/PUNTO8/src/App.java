public class App {
    public static void main(String[] args) throws Exception {
        Carpeta principal = new Carpeta("Carpeta principal");
        Carpeta c1 = new Carpeta(" Carpeta1");
        Carpeta c2 = new Carpeta(" Carpeta2");
        Carpeta c3 = new Carpeta(" Carpeta3");
        Archivo a1 = new Archivo("Archivo1");
        Archivo a2 = new Archivo("Archivo2");
        Archivo a3 = new Archivo("Archivo3");
        Archivo a4 = new Archivo("Archivo4");
        c1.agregarListado(c2);
        c1.agregarListado(a3);

        c2.agregarListado(a1);
        c2.agregarListado(a2);
        
        c3.agregarListado(a4);

        principal.agregarListado(c1);
        principal.agregarListado(c3);
        principal.imprimir();

    }

}
