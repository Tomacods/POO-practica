import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Integer tiempoTotal = 0;

        ArrayList<Corredor> corredores = new ArrayList<Corredor>();

        Entrega entrega = new Entrega();

      //  Recibe recibe = new Recibe(entrega);
     //   Thread hiloRecibe = new Thread(recibe);
      //  hiloRecibe.start();
    
            System.out.println("Comenzando carrera...");
        for (int i = 1; i < 5; i++) {
            Corredor corredor = new Corredor(entrega, i);
            corredores.add(corredor);
            corredor.start();
           // corredor.join();
          //  tiempoTotal += corredor.getTiempo();
        }

        for (Corredor corredor : corredores) {
            corredor.join();  // Esperar que cada corredor termine
            tiempoTotal += corredor.getTiempo();  // Sumar el tiempo de cada corredor
        }

     //    hiloRecibe.join();

        System.out.println("Los corredores tardaron "+tiempoTotal/1000 + " segundos en finalizar"); 
        
    }
}
