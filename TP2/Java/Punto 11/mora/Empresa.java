import java.util.ArrayList;

public class Empresa  {
    private String nombre;
    private String direccion;
    private ArrayList <Persona> personas = new ArrayList<>();

    //constructor
    public Empresa (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //getters
    public String getNombre (){
        return nombre;
    }
    public String getDireccion (){
        return direccion;
    }
    public ArrayList <Persona> getPersonas (){
        return personas;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void SetDireccion(String direccion){
        this.direccion= direccion;
    }
    public void setPersonas(ArrayList <Persona> persona){
        this.personas= persona;
    }
    public void addPersona (Persona persona){
        this.personas.add(persona);
    }

    public int cuentoPersonas(){
    return personas.size();
    }

    @Override
    public String toString(){
        return "Nombre: " +nombre+ "\n" + "Dirección: " +direccion + "\n";
    }















}
