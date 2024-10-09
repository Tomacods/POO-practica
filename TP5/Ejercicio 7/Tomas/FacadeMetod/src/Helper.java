import java.util.HashMap;
import java.util.Map;

public class Helper {
    private Map <String, String> diccionario;

    public Helper() {
        diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("mundo", "world");
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
    }
    public String traducir(String palabra) {
        return diccionario.get(palabra);
    }
    
}
