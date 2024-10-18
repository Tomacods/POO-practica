public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        CronometroVista view = new CronometroVista();
        CronometroController controller = new CronometroController(cronometro, view);

        controller.startCronometro();
        try {
            Thread.sleep(2000); // Esperar 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        controller.createPartial();
        try {
            Thread.sleep(2000); // Esperar 2 segundos más
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        controller.stopCronometro();
    }
}