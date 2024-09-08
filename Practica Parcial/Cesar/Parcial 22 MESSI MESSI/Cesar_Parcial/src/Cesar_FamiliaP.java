import java.util.ArrayList;

public class Cesar_FamiliaP {

    private String apellido;
    private ArrayList<Cesar_PersonaP> personas = new ArrayList<>();

    public Cesar_FamiliaP(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Cesar_PersonaP> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Cesar_PersonaP> personas) {
        this.personas = personas;
    }

    public void addPersona(Cesar_PersonaP persona) {
        this.personas.add(persona);

    }

    public Integer Promedioedad() {
        Integer promedio = 0;
        Integer Cantidad = 0;
        for (Cesar_PersonaP pepe : personas) {
            promedio += promedio + pepe.getEdad();
            Cantidad += Cantidad + 1;
        }
        return (promedio / Cantidad);
    }

    public void imprimir() {
        for (Cesar_PersonaP persona : personas) {
            System.out.println(persona.getNombre());
        }
    }
}
