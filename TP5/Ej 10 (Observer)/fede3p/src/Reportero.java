public class Reportero implements ClimaObserver {
    
    private String canal;

    public Reportero(String canal) {
        this.canal = canal;
    }
    
    @Override
    public void update(String clima) {
        System.out.println(canal + " . El pronostico de hoy es: " + clima);
    }
}
