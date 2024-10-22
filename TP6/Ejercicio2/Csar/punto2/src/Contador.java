public class Contador implements Runnable {
    private static int contador = 0;

    @Override
    public void run(){
        for(int i = 0; i < 5000; i++){
            incrementarContador();
        }
    }
    private synchronized void incrementarContador() {
        contador++;
    }  
    public int getContador() {
        return contador;
    }
}
