import java.util.ArrayList;

public class FedeFamilia {

    private String flia = "";
    private ArrayList<Fede8_Persona> personas = new ArrayList<>();

    public FedeFamilia(String flia){
        this.flia = flia;
    }

    public void addFamilia(Fede8_Persona persona){
        this.personas.add(persona);
    }

    public String getFlia() {
        return flia;
    }

    public void setFlia(String flia) {
        this.flia = flia;
    }

    public ArrayList<Fede8_Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Fede8_Persona> personas) {
        this.personas = personas;
    }
}
