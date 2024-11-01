public class App {
    public static void main(String[] args) throws Exception {
        Observable observable = new Observable();
        Reportero reportero = new Reportero();
        observable.add(reportero);
        observable.setClima("Caluroso");
        observable.setClima("Frio");
        observable.setClima("LLuvioso");
      
    }
}
