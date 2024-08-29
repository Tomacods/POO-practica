
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
                int horasTrabajadas = generarHorasTrabajadas(categoria, true, random); // Se generan las horas trabajadas
                personal[i] = new Docente("Docente" + i, 1, "Sector" + i, horasTrabajadas, categoria);
            } else {
                // Crear un no docente
                String[] jornadas = {"Completa", "Parcial"}; //declaro las jornadas en forma de array
                String jornada = jornadas[random.nextInt(jornadas.length)]; // Se elige aleatoriamente una jornada
                int horasTrabajadas = generarHorasTrabajadas(jornada, false, random); // Se generan las horas trabajadas
                personal[i] = new NoDocente("NoDocente" + i, 1, "Sector" + i, horasTrabajadas, jornada);
            }
        }
        Reloj reloj = new Reloj();
        reloj.generarInforme(personal);
    }
    private static int generarHorasTrabajadas(String tipo, boolean esDocente, Random random) {
        int horasRequeridas = 40; // Ejemplo de horas requeridas
        int horasTrabajadas = horasRequeridas; // Por defecto se trabajan las horas requeridas
        double probabilidadExceder = 0.0;

        if (esDocente) {
            switch (tipo) {
                case "Simple" -> probabilidadExceder = 0.95;
                case "Semiexclusiva" -> probabilidadExceder = 0.75;
                case "Exclusiva" -> probabilidadExceder = 0.60;
            }
        } else {
            switch (tipo) {
                case "Completa" -> probabilidadExceder = 0.95;
                case "Parcial" -> probabilidadExceder = 0.75;
            }
        }

        if (random.nextDouble() < probabilidadExceder) {
            horasTrabajadas += random.nextInt(21); // Exceder entre 0 y 20 horas
        }
        return horasTrabajadas;
    }
}
