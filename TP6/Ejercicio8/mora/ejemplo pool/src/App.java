import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
  public static void main(String[] args) throws Exception {
    Random random = new Random();

    int matriz1[][] = new int[3][3];
    int matriz2[][] = new int[3][3];

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[i].length; j++) {
        matriz1[i][j] = random.nextInt(1, 1001);
      }
    }
    for (int i = 0; i < matriz2.length; i++) {
      for (int j = 0; j < matriz2[i].length; j++) {
        matriz2[i][j] = random.nextInt(1, 1001);
      }
    }
    // for (int i = 0; i < matriz1.length; i++) {
    /*
     * for (int j = 0; j < matriz1[i].length; j++) {
     * System.out.println(matriz1[i][j] + " ");
     * }
     * System.out.println();
     */
    // }

    // System.out.println("Hello, World!");
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 5; i++) {
      WorkerThread worker = new WorkerThread(i, matriz1, matriz2);
      executor.execute(worker);
    }
    executor.shutdown();

  }
}
