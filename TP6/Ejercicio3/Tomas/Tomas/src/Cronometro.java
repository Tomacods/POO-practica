
public class Cronometro extends Observable implements Runnable {
    private long startTime;
    private long elapsedTime;
    private boolean running;
    private Thread thread;

    public Cronometro() {
        this.elapsedTime = 0;
        this.running = false;
    }

    public void start() {
        if (!running) {
            this.startTime = System.currentTimeMillis();
            this.running = true;
            this.thread = new Thread(this);
            this.thread.start();
        }
    }

    public void stop() {
        if (running) {
            this.running = false;
            this.elapsedTime = 0;
            notificarObservadores(elapsedTime);
        }
    }

    public void createPartial() {
        if (running) {
            long partialTime = System.currentTimeMillis() - startTime;
            notificarObservadores(partialTime);
        }
    }

    @Override
    public void run() {
        while (running) {
            elapsedTime = System.currentTimeMillis() - startTime;
            notificarObservadores(elapsedTime);
            try {
                Thread.sleep(100); // Actualizar cada 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public long getElapsedTime() {
        return elapsedTime;
    }
}