public class WorkerThread implements Runnable {
    // static private int count=0;
    private Integer tarea_nro;
    private int[][] m1, m2;
    private static final Object lock = new Object();

    public WorkerThread(Integer tarea_nro, int[][] m1, int[][] m2) {
        this.tarea_nro = tarea_nro;
        this.m1 = m1;
        this.m2 = m2;

    }

    // https://www.javatpoint.com/multitasking-in-java#:~:text=Creating%20a%20new%20thread%20for%20each%20task%20can,reducing%20the%20overhead%20of%20creating%20and%20destroying%20threads.
    // https://unpocodejava.com/2010/03/03/implementacion-basica-de-pool-de-hilos/
    @Override
public void run() {
    System.out.println(Thread.currentThread().getName() + " Start. Tarea = " + tarea_nro);
    int[][] nuevaMatriz = procesarTarea(m1, m2);
    synchronized(lock) {
        imprimirM(nuevaMatriz);
    }
    System.out.println(Thread.currentThread().getName() + " End.");
}

    private int[][] procesarTarea(int[][] m1, int[][] m2) {
        int[][] suma =  {{0,0,0},{0,0,0},{0,0,0}};
        // int[][] suma = new int[m1.length][m1[0].length];
        // suma de la matriz
        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                suma[x][y] = m1[x][y] + m2[x][y];
            }
        }
        return suma;

    }

    private void imprimirM(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}