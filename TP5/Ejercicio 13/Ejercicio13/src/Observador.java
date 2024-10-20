public interface Observador {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
