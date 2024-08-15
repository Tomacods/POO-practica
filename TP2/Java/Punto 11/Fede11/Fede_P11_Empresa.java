import java.util.ArrayList;

public class Fede_P11_Empresa {
    
    private String nombre = "";
    private String direccion = "";
    private ArrayList<Fede_P11_Persona> personas = new ArrayList<>();
    
    public Fede_P11_Empresa(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
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
    public ArrayList<Fede_P11_Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Fede_P11_Persona> personas) {
        this.personas = personas;
    }
}
