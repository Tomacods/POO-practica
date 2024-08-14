
import java.util.ArrayList;


public class CargarFamilias {
    private ArrayList<PersonaCenso> personas = new ArrayList<>();
    private String direccion;

    public CargarFamilias(String direccion, int cantidadPersonas) {
        this.direccion = direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public void addPersona(PersonaCenso persona) {
        personas.add(persona);
    }
    public ArrayList<PersonaCenso> getPersonas() {
        return personas;
    }
    public void contarPersonas() {
        System.out.println("Cantidad de personas de la familia: " + personas.size());
    }
}
