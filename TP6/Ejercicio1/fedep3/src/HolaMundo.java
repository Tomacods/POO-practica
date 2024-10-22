public class HolaMundo extends Thread {

    private Integer id;

    public HolaMundo(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(id*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hola mundo! - Hilo " + id);
    }
}