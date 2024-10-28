import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Boya> hilosBoyas = new ArrayList<>();
        Servidor servidor = new Servidor();

        // Hilo consumidor
        Cientifico cientifico = new Cientifico(servidor);
        Thread hiloCientifico = new Thread(cientifico);
        hiloCientifico.start();

        // Hilos productores
        for (int i = 0; i < 2; i++) { 
            Boya boya = new Boya("CIDMAR-" + (i + 1), servidor);
            hilosBoyas.add(boya);
            boya.start(); 
        }

        for (Boya boya : hilosBoyas) {
            boya.join();
        }

        // Espera a que el científico termine
        hiloCientifico.join();

        System.out.println("Fin del Main");
    }
}
