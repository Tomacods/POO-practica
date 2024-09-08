package familia2022;
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

    public double calcularPromedioEdad() {
        int sumaEdades = 0;
        for (Persona p : personas) {
            sumaEdades += p.getEdad();
        }
        return (double) sumaEdades / personas.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Familia ").append(apellido).append("\n");
        sb.append("Promedio de edad: ").append(String.format("%.2f", calcularPromedioEdad())).append("\n");
        sb.append("Integrantes:\n");
        for (Persona p : personas) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
