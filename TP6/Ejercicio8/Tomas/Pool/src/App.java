import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class App {
    public static void main(String[] args) {
        int filas = 1000;
        int columnas = 1000;
        int[][] matrizA = generarMatrizAleatoria(filas, columnas);
        int[][] matrizB = generarMatrizAleatoria(filas, columnas);

        // Suma secuencial
        long tiempoInicio = System.currentTimeMillis();
        int[][] resultadoSecuencial = sumarMatricesSecuencial(matrizA, matrizB);
        long tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo de suma secuencial: " + (tiempoFin - tiempoInicio) + " ms");

        // Suma paralela
        ForkJoinPool pool = new ForkJoinPool();
        tiempoInicio = System.currentTimeMillis();
        int[][] resultadoParalelo = pool.invoke(new TareaSumaMatriz(matrizA, matrizB, 0, filas, 0, columnas));
        tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo de suma paralela: " + (tiempoFin - tiempoInicio) + " ms");
    }

    private static int[][] generarMatrizAleatoria(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }
        return matriz;
    }

    private static int[][] sumarMatricesSecuencial(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    static class TareaSumaMatriz extends RecursiveTask<int[][]> {
        private static final int UMBRAL = 100;
        private int[][] matrizA;
        private int[][] matrizB;
        private int filaInicio, filaFin, columnaInicio, columnaFin;

        TareaSumaMatriz(int[][] matrizA, int[][] matrizB, int filaInicio, int filaFin, int columnaInicio, int columnaFin) {
            this.matrizA = matrizA;
            this.matrizB = matrizB;
            this.filaInicio = filaInicio;
            this.filaFin = filaFin;
            this.columnaInicio = columnaInicio;
            this.columnaFin = columnaFin;
        }

        @Override
        protected int[][] compute() {
            int filas = filaFin - filaInicio;
            int columnas = columnaFin - columnaInicio;

            if (filas <= UMBRAL && columnas <= UMBRAL) {
                int[][] resultado = new int[filas][columnas];
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matrizA[filaInicio + i][columnaInicio + j] + matrizB[filaInicio + i][columnaInicio + j];
                    }
                }
                return resultado;
            } else {
                int filaMedia = (filaInicio + filaFin) / 2;
                int columnaMedia = (columnaInicio + columnaFin) / 2;

                TareaSumaMatriz superiorIzquierda = new TareaSumaMatriz(matrizA, matrizB, filaInicio, filaMedia, columnaInicio, columnaMedia);
                TareaSumaMatriz superiorDerecha = new TareaSumaMatriz(matrizA, matrizB, filaInicio, filaMedia, columnaMedia, columnaFin);
                TareaSumaMatriz inferiorIzquierda = new TareaSumaMatriz(matrizA, matrizB, filaMedia, filaFin, columnaInicio, columnaMedia);
                TareaSumaMatriz inferiorDerecha = new TareaSumaMatriz(matrizA, matrizB, filaMedia, filaFin, columnaMedia, columnaFin);

                invokeAll(superiorIzquierda, superiorDerecha, inferiorIzquierda, inferiorDerecha);

                int[][] resultadoSuperiorIzquierda = superiorIzquierda.join();
                int[][] resultadoSuperiorDerecha = superiorDerecha.join();
                int[][] resultadoInferiorIzquierda = inferiorIzquierda.join();
                int[][] resultadoInferiorDerecha = inferiorDerecha.join();

                int[][] resultado = new int[filas][columnas];
                for (int i = 0; i < filaMedia - filaInicio; i++) {
                    System.arraycopy(resultadoSuperiorIzquierda[i], 0, resultado[i], 0, columnaMedia - columnaInicio);
                    System.arraycopy(resultadoSuperiorDerecha[i], 0, resultado[i], columnaMedia - columnaInicio, columnaFin - columnaMedia);
                }
                for (int i = filaMedia - filaInicio; i < filas; i++) {
                    System.arraycopy(resultadoInferiorIzquierda[i - (filaMedia - filaInicio)], 0, resultado[i], 0, columnaMedia - columnaInicio);
                    System.arraycopy(resultadoInferiorDerecha[i - (filaMedia - filaInicio)], 0, resultado[i], columnaMedia - columnaInicio, columnaFin - columnaMedia);
                }

                return resultado;
            }
        }
    }
}