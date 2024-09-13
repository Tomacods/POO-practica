package escuela;

import java.util.HashMap;
import java.util.Map;

public class HistorialAcademico {
    private final Map<String, Integer> materiasNotas;

    public HistorialAcademico() {
        this.materiasNotas = new HashMap<>();
    }
    public void imprimirHistorial(String nombreAlumno) {
        System.out.println("Historial académico de " + nombreAlumno + ":"); 
        for (Map.Entry<String, Integer> entry : materiasNotas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 
    }

    public void agregarMateriaNota(String materia, int nota) {
        if (nota >= 1 && nota <= 10) {
            materiasNotas.put(materia, nota);
        } else {
            System.out.println("La nota debe ser un número entre 1 y 10");
        }
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

