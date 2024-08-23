
/*Para poner a prueba el sistema debe realizarse un simulación con los siguientes criterios:
● Al menos diez personas entre docentes y no docentes
● Para los docentes debe definirse aleatoriamente la categoría
● Para los no docentes debe definirse aleatoriamente la jornada
● La cantidad de horas trabajadas en el mes debe ser generada aleatoriamente
bajo las siguientes pautas:
○ Para docentes con categoría simple hay un 95% de posibilidad de que
exceda la cantidad de horas requeridas.
○ Para docentes con categoría semiexclusiva hay un 75% de posibilidad de
que exceda la cantidad de horas requeridas.
○ Para docentes con categoría exclusiva hay un 60% de posibilidad de que
exceda la cantidad de horas requeridas.
○ Para no docentes hay un 80% de posibilidad de que exceda la cantidad de
horas requeridas.
● Debe solicitarse a una instancia de la clase Reloj que imprima el informe. */
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Personal[] personal = new Personal[10]; // Al menos 10 personas
        
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) { //se elige aleatoriamente si es docente o no docente
                // Crear un docente
                String[] categorias = {"Simple", "Semiexclusiva", "Exclusiva"}; // Categorias de docentes
                String categoria = categorias[random.nextInt(categorias.length)]; // Se elige aleatoriamente una categoria
                int horasTrabajadas = generarHorasTrabajadasDocente(categoria, random); // Se generan las horas trabajadas
                personal[i] = new Docente("Docente" + i, 1, "Sector" + i, horasTrabajadas, categoria);
            } else {
                // Crear un no docente
                String[] jornadas = {"Completa", "Parcial"};
                String jornada = jornadas[random.nextInt(jornadas.length)];
                int horasTrabajadas = generarHorasTrabajadasNoDocente(random);
                personal[i] = new NoDocente("NoDocente" + i, 1, "Sector" + i, horasTrabajadas, jornada);
            }
        }
        
        Reloj reloj = new Reloj();
        reloj.generarInforme(personal);

    }
    private static int generarHorasTrabajadasDocente(String categoria, Random random) {
        int horasRequeridas = 40; // Ejemplo de horas requeridas
        int horasTrabajadas = horasRequeridas;
        double probabilidadExceder = 0.0;

        switch (categoria) {
            case "Simple":
                probabilidadExceder = 0.95;
                break;
            case "Semiexclusiva":
                probabilidadExceder = 0.75;
                break;
            case "Exclusiva":
                probabilidadExceder = 0.60;
                break;
        }

        if (random.nextDouble() < probabilidadExceder) {
            horasTrabajadas += random.nextInt(21); // Exceder entre 0 y 20 horas
        }

        return horasTrabajadas;
    }
    private static int generarHorasTrabajadasNoDocente(Random random) {
        int horasRequeridas = 40; // Ejemplo de horas requeridas
        int horasTrabajadas = horasRequeridas;
        double probabilidadExceder = 0.80;

        if (random.nextDouble() < probabilidadExceder) {
            horasTrabajadas += random.nextInt(21); // Exceder entre 0 y 20 horas
        }

        return horasTrabajadas;
    }
}
