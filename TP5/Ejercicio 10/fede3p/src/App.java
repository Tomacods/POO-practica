public class App {
    public static void main(String[] args) throws Exception {
        
        SistMeteorologico sistema = new SistMeteorologico();
        Reportero rep1 = new Reportero("Canal 9");
        Reportero rep2 = new Reportero("Canal 13");
        Reportero rep3 = new Reportero("Cronica");

        sistema.addClimaOvserver(rep1);
        sistema.addClimaOvserver(rep2);
        sistema.addClimaOvserver(rep3);

        sistema.setEstadoClima("Soleado");
        sistema.notifyClimaOvserver();

        sistema.removeClimaOvserver(rep3);

        sistema.setEstadoClima("Lluvioso");
        sistema.notifyClimaOvserver();
    }
}
