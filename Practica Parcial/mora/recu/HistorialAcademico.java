//Para el historial académico se contará con una clase que contendrá un hashmap de materias como clave y una nota de tipo integer.
import java.util.HashMap;
public class HistorialAcademico {
    private HashMap<Materia, Integer> materias = new HashMap<>();
    /*Un historial académico de un alumno debe poder recibir una materia y una nota para asignarla
a su hashmap. Además, debe poseer un método para imprimir todo el historial académico del
 alumno. */


    public void ingresarNota(Materia materiaIngresada, Integer nota) {
    if (materias.containsKey(materiaIngresada)) {
        System.out.println("La materia ya está en el historial con su nota.");
    }   else {
        System.out.println("Añadiendo materia y nota al historial.");
        materias.put(materiaIngresada, nota);
            }
    }

    public void imprimirHistorial() {
        System.out.println("Historial Academico:");
        for (Materia materia : materias.keySet()) /*keySet obtiene todas las materias que están guardadas como claves en el HashMap materias*/ {
            System.out.println("Materia: " + materia.getNombre_materia() + ", Nota: " + materias.get(materia)); //materias.get(materia) devuelve el valor asociado a la clave materia en el HashMap
        }
    }

}

