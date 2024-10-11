public class Reportero implements Observer {
private String clima;



@Override
public void update_clima(String clima) {
    System.out.println("Reportero notifica el clima: " + clima);
}






}
