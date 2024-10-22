public class Incrementar implements Runnable {

    private static Integer cont = 0;

    private synchronized void incrementarCont(){
        cont++;
    }

    public Integer getContador() {
        return cont;
    }

    @Override
    public void run() {
        for (Integer i = 0; i < 5000; i++) {
            incrementarCont();
        }
    }
}