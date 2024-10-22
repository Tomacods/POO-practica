

public class HolaMundoHilo extends Thread {
    private int id;

    public HolaMundoHilo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(id*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hola Mundo desde el hilo " + id);
    }
    
}
