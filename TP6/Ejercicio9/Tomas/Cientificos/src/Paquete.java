import java.util.Map;

public class Paquete {
    private String nombreBoya;
    private Map<String, Double> datos;

    public Paquete(String nombreBoya, Map<String, Double> datos) {
        this.nombreBoya = nombreBoya;
        this.datos = datos;
    }

    public String getNombreBoya() {
        return nombreBoya;
    }

    public Map<String, Double> getDatos() {
        return datos;
    }
}