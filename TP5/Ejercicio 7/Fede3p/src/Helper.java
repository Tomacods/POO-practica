import java.util.HashMap;
import java.util.Map;

public class Helper {
    
    private Map<String, String> diccionario;
    
    public Helper(){
        diccionario = new HashMap<>();
        diccionario.put("Mesa", "Table");
        diccionario.put("Silla", "Chair");
        diccionario.put("Vaso", "Glass");
        diccionario.put("Cuchillo", "Knife");
        diccionario.put("Cuchara", "Spoon");
    }

    public String traducir(String palabra) {
        return diccionario.get(palabra);
    }
}