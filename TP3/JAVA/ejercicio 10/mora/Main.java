import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    List<Personal> personales = new ArrayList<>();
        Random random = new Random();
        int totalPersonal = 10;
        int cantidadDocentes = random.nextInt(totalPersonal+ 1);
        int cantidadNoDocentes = totalPersonal - cantidadDocentes;

        String[] categorias = {"simple", "semiexclusiva", "exclusiva"};
        for (int i = 0; i < cantidadDocentes; i++) {
            String categoria = categorias[random.nextInt(categorias.length)];
            //categorias.add(categoria); // Guardar la categoría
            personales.add(new Docente("Docente" + i, 1, "Sector" + i, categoria));
        }

        // Generar no docentes con jornadas aleatorias
        String[] jornadas = {"completa", "parcial"};
        for (int j = 0; i < cantidadNoDocentes; i++) {
            String jornada = jornadas[random.nextInt(jornadas.length)];
            personales.add(new NoDocente("No Docente" + i, 1, "Sector" + i, jornada));
            //jornadas.add(""); // Para no docentes, no se usa categoría
        }



        
}
