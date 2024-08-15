import java.util.ArrayList;

public class Familia {
    private String direccion;
    private ArrayList <PersonaCenso> personas = new ArrayList<>();

    public Familia(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }
    public void SetDireccion(String direccion){
        this.direccion = direccion;
    }
    public ArrayList<PersonaCenso> getPersonas(){
        return personas;
    }
    public void setPersonas (ArrayList <PersonaCenso> persona){
        this.personas = persona;
    }
    public void addPersona (PersonaCenso personaCenso){
        this.personas.add(personaCenso);
    }
    @Override
    public String toString(){
        return "//Domicilio: " + direccion;
}
}
