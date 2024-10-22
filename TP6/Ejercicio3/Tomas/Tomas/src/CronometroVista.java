public class CronometroVista implements Observer {
    @Override
    public void actualizar(Long elapsedTime) {
        System.out.println("Tiempo: " + elapsedTime + " ms");
    }
}