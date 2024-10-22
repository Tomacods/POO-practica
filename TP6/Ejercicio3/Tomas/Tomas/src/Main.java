public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        CronometroVista vista = new CronometroVista();
        CronometroController controlador = new CronometroController(cronometro, vista);

        controlador.startCronometro();
        try {
            Thread.sleep(2000); // Esperar 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        controlador.createPartial();
        try {
            Thread.sleep(2000); // Esperar 2 segundos más
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        controlador.stopCronometro();
    }
}