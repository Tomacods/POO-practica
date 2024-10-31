public class SistemaArchivos {
    public static void main(String[] args) {
        Carpeta raiz = new Carpeta("Raiz");
        Carpeta carpeta1 = new Carpeta("Carpeta 1");
        Carpeta carpeta2 = new Carpeta("Carpeta 2");
        Carpeta carpeta3 = new Carpeta("Carpeta 3");

        Archivo archivo1 = new Archivo("Archivo 1");
        Archivo archivo2 = new Archivo("Archivo 2");
        Archivo archivo3 = new Archivo("Archivo 3");
        Archivo archivo4 = new Archivo("Archivo 4");

        carpeta2.agregarElemento(archivo1);
        carpeta2.agregarElemento(archivo2);
        carpeta1.agregarElemento(carpeta2);
        carpeta1.agregarElemento(archivo3);
        carpeta3.agregarElemento(archivo4);

        raiz.agregarElemento(carpeta1);
        raiz.agregarElemento(carpeta3);

        raiz.imprimirElementos();
    }
}