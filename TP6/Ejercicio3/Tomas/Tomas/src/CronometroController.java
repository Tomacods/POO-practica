public class CronometroController {
    private final Cronometro cronometro;
    private CronometroVista vista;

    public CronometroController(Cronometro cronometro, CronometroVista vista) {
        this.cronometro = cronometro;
        this.vista = vista;
        this.cronometro.agregarObservador(vista);
    }

    public void startCronometro() {
        cronometro.start();
    }

    public void stopCronometro() {
        cronometro.stop();
    }

    public void createPartial() {
        cronometro.createPartial();
    }
}