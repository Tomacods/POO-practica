
public class App {
    
    public static void main(String[] args) throws Exception {
        Telefono untelefono = new Telefono();
        System.out.println(untelefono.toString());

        Telefono untelefonoDos = new Telefono("Samsung", "coso", "A23", "AAAAAAAAAAAA", 2.0);
        System.out.println(untelefonoDos);
    }
}
