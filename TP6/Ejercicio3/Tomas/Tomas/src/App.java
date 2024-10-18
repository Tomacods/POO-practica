public class App {
    public static void main(String[] args) {
        Cronometro modelo = new Cronometro();
        CronometroVista vista = new CronometroVista();
        new CronometroControlador(modelo, vista);
        }
    }