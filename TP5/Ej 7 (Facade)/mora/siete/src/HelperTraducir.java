import java.util.HashMap;
//import java.util.Map;
public class HelperTraducir {
    private HashMap <String, String> traduccion = new HashMap<>();
    
    public String traducir (String palabra){
        traduccion.put("Hola", "Hello");
        traduccion.put("Gracias", "Thank you");
        traduccion.put("Adios", "Bye");
        traduccion.put("Buenas noches", "Good Night");
        return traduccion.get(palabra);
    }


        
    
   // traduccion = new HashMap<>();
    

}
