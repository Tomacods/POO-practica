import java.util.ArrayList;
import java.util.List;

public class CentroControl implements Observador{
        private List<Observer> observers = new ArrayList<>();
    
        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }
    
        @Override
        public void removeObserver(Observer o) {
            observers.remove(o);
        }
    
        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
