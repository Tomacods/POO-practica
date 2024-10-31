import java.util.HashMap;
import java.util.Map;

public class Helper {
    private Map <String,String> diccionario;

    public Helper(){
        diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Mora","BLACKBERRY");
        diccionario.put("Escalera","Stair");
        diccionario.put("Perro","Dog");
        diccionario.put("Auto","Car");
    }
    public String traducir (String palabra){
        return diccionario.get(palabra);
    }
}
