import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
  public static void main(String[] args) throws Exception {

    Random random = new Random();

    int matriz1[][] = new int[3][3];
    int matriz2[][] = new int[3][3];
    int[][] resultado = new int[3][3]; //se usa la matriz de resultados para q no se imprima al reves, 
                                      //sino se imprime la fila cuando el hilo terminó, no en orden

    
    
  
    

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[i].length; j++) {
        matriz1[i][j] = random.nextInt(1, 1001);
        matriz2[i][j] = random.nextInt(1, 1001);
      }
    }

    System.out.println("Matriz 1:");
    imprimirMatriz(matriz1);
    
    System.out.println("\nMatriz 2:");
    imprimirMatriz(matriz2);
   
    ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            WorkerThread worker = new WorkerThread(i, matriz1, matriz2, resultado);
            executor.execute(worker);
        }
        executor.shutdown();
        
        // espera a q todos los hilos terminen
        while (!executor.isTerminated()) {
            
        }
        
        
        System.out.println("\nresultado de la suma:");
        imprimirMatriz(resultado);
    }
  public static void imprimirMatriz(int[][] matriz) {

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + "\t"); 
        }
        System.out.println(); 
    }
  }
}
