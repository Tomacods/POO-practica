import java.util.ArrayList;

public class SistMeteorologico implements ClimaObservable{
    
    private final ArrayList<ClimaObserver> observers;
    private String estadoClima;

    public SistMeteorologico() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addClimaOvserver(ClimaObserver climaO) {
        observers.add(climaO);
    }

    @Override
    public void removeClimaOvserver(ClimaObserver climaO) {
        observers.remove(climaO);
    }

    @Override
    public void notifyClimaOvserver() {
        for (ClimaObserver observer : observers) {
            observer.update(estadoClima);
        }
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public void setEstadoClima(String estadoClima) {
        this.estadoClima = estadoClima;
    }
}
