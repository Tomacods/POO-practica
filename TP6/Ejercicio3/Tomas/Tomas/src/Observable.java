import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void agregarObservador(Observer observer) {
        observers.add(observer);
    }

    public void notificarObservadores(Long elapsedTime) {
        for (Observer observer : observers) {
            observer.actualizar(elapsedTime);
        }
    }
}