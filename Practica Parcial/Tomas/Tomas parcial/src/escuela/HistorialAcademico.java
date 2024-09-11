package escuela;

import java.util.HashMap;
import java.util.Map;


public class HistorialAcademico {
    private final Map<String, Integer> materiasNotas;

    public HistorialAcademico() {
        this.materiasNotas = new HashMap<>();
    }
    public void imprimirHistorial() {
        for (Map.Entry<String, Integer> entry : materiasNotas.entrySet()) {
            System.out.println("Materia: " + entry.getKey() + " Nota: " + entry.getValue());
        }
    }

    public void agregarMateriaNota(String materia, int nota) {
        materiasNotas.put(materia, nota);
    }

    public Map<String, Integer> obtenerMateriasNotas() {
        return materiasNotas;
    }

    public double calcularPromedio() {
        double promedio = 0;
        for (Integer nota : materiasNotas.values()) {
            promedio += nota;
        }
        return promedio / materiasNotas.size();
    }
}

