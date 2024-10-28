public class WorkerThread implements Runnable {
    // static private int count=0;
   // private Integer tarea_nro;
    private int[][] m1, m2, resultado;
   // private static final Object lock = new Object();
    private int fila;

    public WorkerThread(int fila, int[][] m1, int[][] m2,int[][] resultado ) {
        this.fila = fila;
        this.m1 = m1;
        this.m2 = m2;
        this.resultado=resultado;
    }

    

    // https://www.javatpoint.com/multitasking-in-java#:~:text=Creating%20a%20new%20thread%20for%20each%20task%20can,reducing%20the%20overhead%20of%20creating%20and%20destroying%20threads.
    // https://unpocodejava.com/2010/03/03/implementacion-basica-de-pool-de-hilos/
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Fila = " + fila);
      //  int[] sumaFila = procesarFila();
       // synchronized(lock) {
          //  imprimirFila(sumaFila);
      //  }
      for (int j = 0; j < m1[fila].length; j++) {
        resultado[fila][j] = m1[fila][j] + m2[fila][j];
    }
        System.out.println(Thread.currentThread().getName() + " End.");
    }

/* private int[] procesarFila() {
    int[] sumaFila = new int[m1[fila].length];
    for (int j = 0; j < m1[fila].length; j++) {
        sumaFila[j] = m1[fila][j] + m2[fila][j];
    }
    return sumaFila;
} */


/* private void imprimirFila(int[] fila) {
    for (int val : fila) {
        System.out.print(val + " ");
    }
    System.out.println();
} */

}