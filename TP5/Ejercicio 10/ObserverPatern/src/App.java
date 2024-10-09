public class App {
    public static void main(String[] args) {
        SistemaMeteorologico sistema = new SistemaMeteorologico();
        Reportero reportero1 = new Reportero("Reportero 1");
        Reportero reportero2 = new Reportero("Reportero 2");

        sistema.addObserver(reportero1);
        sistema.addObserver(reportero2);

        sistema.setEstadoClima("Soleado");
        sistema.setEstadoClima("Lluvioso");
    }
}