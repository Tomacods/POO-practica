public interface ClimaObservable {
    
    void addClimaOvserver(ClimaObserver climaO);
    void removeClimaOvserver(ClimaObserver climaO);
    void notifyClimaOvserver();
}
