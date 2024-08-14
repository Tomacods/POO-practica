import java.util.ArrayList;

public class Fede_P9_Familia {

    private String flia = "";
    private Integer cantidad;
    private ArrayList<Fede_P9_Familia> personas = new ArrayList<>();

    public Fede_P9_Familia(String flia){
        this.flia = flia;
    }

    public void addFamilia(Fede_P9_Familia persona){
        this.personas.add(persona);
        cantidad = cantidad + 1;
    }

    public String getFlia() {
        return flia;
    }

    public void setFlia(String flia) {
        this.flia = flia;
    }

    public ArrayList<Fede_P9_Familia> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Fede_P9_Familia> personas) {
        this.personas = personas;
    }
}
