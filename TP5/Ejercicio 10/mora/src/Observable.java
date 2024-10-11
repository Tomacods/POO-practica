import java.util.ArrayList;
public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String clima;

    public void add (Observer observer){
        this.observers.add(observer);
    }
    public void remove (Observer observer){
        this.observers.remove(observer);
    }
    public void setClima(String clima){
        this.clima= clima;
        for (Observer observer: observers){
            observer.update_clima(clima);
        }

    }
    

}
