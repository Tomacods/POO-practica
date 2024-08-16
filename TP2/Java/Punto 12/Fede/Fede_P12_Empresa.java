import java.util.ArrayList;

public class Fede_P12_Empresa {
            
    private String nombre = "";
    private String direccion = "";
    private ArrayList<Fede_P12_Persona> personas = new ArrayList<>();
    
    public Fede_P12_Empresa(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Integer cantidad(){
        return personas.size();
    } 

    public void imprimir(){
        System.out.println("Empresa: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        for (Fede_P12_Persona per:personas){
            per.imprimir();;
        }
    }

    public void addPersona(Fede_P12_Persona persona){
        this.personas.add(persona);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Fede_P12_Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Fede_P12_Persona> personas) {
        this.personas = personas;
    }
}
