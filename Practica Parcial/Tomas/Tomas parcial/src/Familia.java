import java.util.List;


public class Familia {
    
    private String apellido;
    private List<Persona> personas;

    public Familia(String apellido, List<Persona> personas) {
        this.apellido = apellido;
        this.personas = personas;
    }

    public void agregarIntegrante(Persona persona) {
        personas.add(persona);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //creo un stringbuilder para poder concatenar los datos de la familia
        sb.append("Familia [apellido=").append(apellido).append(", personas=").append(personas).append("]");
        for (Persona persona : personas) {
            sb.append(persona).append("\n");
        }
        return sb.toString();
    }
}
