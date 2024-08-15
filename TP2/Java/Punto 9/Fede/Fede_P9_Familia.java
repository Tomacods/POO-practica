import java.util.ArrayList;

public class Fede_P9_Familia {

    private String flia = "";
    private ArrayList<Fede_P9_Persona> personas = new ArrayList<>();

    public Fede_P9_Familia(String flia){
        this.flia = flia;
    }

    public Integer cantidad(){
        return personas.size();
    }

    public void addPersona(Fede_P9_Persona persona){
        this.personas.add(persona);
    }
    
    public String getFlia() {
        return flia;
    }

    public void setFlia(String flia) {
        this.flia = flia;
    }

    public ArrayList<Fede_P9_Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Fede_P9_Persona> personas) {
        this.personas = personas;
    }
}
