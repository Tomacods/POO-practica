public class App {
    public static void main(String[] args) throws Exception {

        Carpeta raiz = new Carpeta("Documentos");
        Carpeta c1 = new Carpeta("Carpeta 1");
        Carpeta c2 = new Carpeta("Carpeta 2");
        Carpeta c3 = new Carpeta("Carpeta 3");

        Archivo a1 = new Archivo("Archivo 1");
        Archivo a2 = new Archivo("Archivo 2");
        Archivo a3 = new Archivo("Archivo 3");
        Archivo a4 = new Archivo("Archivo 4");

        c2.addElemento(a1);
        c2.addElemento(a2);
        c1.addElemento(c2);
        c1.addElemento(a3);
        c3.addElemento(a4);
        raiz.addElemento(c1);
        raiz.addElemento(c3);

        raiz.imprimirElementos();
    }
}