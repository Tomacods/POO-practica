import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<HiloProductor> hilosProductores = new ArrayList<HiloProductor>();

        Compartido compartido = new Compartido();

        HiloConsumidor consumidor = new HiloConsumidor(compartido);
        Thread hiloConsumidor = new Thread(consumidor);
        hiloConsumidor.start();

        for (int i = 0; i < 5; i++) {
            HiloProductor h = new HiloProductor(compartido);
            hilosProductores.add(h);
            h.start();
        }

        for (HiloProductor hiloProductor : hilosProductores) {
            hiloProductor.join();
        }
        hiloConsumidor.join();

        System.out.println("fin del Main"); 
        //¿Cómo se ejecuta esta línea de código si no estuvieran los join?
    }
}
