import java.util.ArrayList;
import java.util.List;

public class SistemaMeteorologico implements Observable {
    private final List<Observer> observers;
    private String estadoClima;

    public SistemaMeteorologico() {
        this.observers = new ArrayList<>();
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public void setEstadoClima(String estadoClima) {
        this.estadoClima = estadoClima;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(estadoClima);
        }
    }    
}