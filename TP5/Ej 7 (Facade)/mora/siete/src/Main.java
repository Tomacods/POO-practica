import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
         List<String> palabras = new ArrayList<>(Arrays.asList("Hola", "Gracias", "Adios", "Buenas Noches"));
        
        Facade facade = new Facade();
        facade.mostrar(palabras.get(random.nextInt(1,5)));
        
    }

}
