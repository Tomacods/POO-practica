import java.util.Random;
//import java.util.ArrayList;

public class Fede_App10 {
    
    public static void main(String[] args) throws Exception{
        
        Fede_Personal_10[] personal = new Fede_Personal_10[10];
        Random random = new Random();

        for (Integer i = 0; i <10; i++){
            if (random.nextInt(2) == 1){
                // Se crea la lista de categorías aleatorias.
                String[] categorias = {"Simple", "Semiexclusiva", "Exclusiva"};
                // Se asigna una categoría aleatoria.
                String categoria = categorias[random.nextInt(categorias.length)];
                // Se generan las horas mensuales.
                Integer horasMensual = horasTrabajadas(categoria, true, random);
                // Se carga el personal docente
                personal[i] = new Fede_Docente10("Nombre " + i, "Apellido " + i, i, "Sector " + i, horasMensual, categoria);
            } else {
                // Se crea lista de jornadas.
                String[] jornadas = {"Completa", "Parcial"};
                String jornada = jornadas[random.nextInt(jornadas.length)];
                Integer horasMensual = horasTrabajadas(jornada, false, random);
                personal[i] = new Fede_NoDocente("Nombre " + i, "Apellido " + i, i, "Sector " + i, horasMensual, jornada);
            }
        }
        Fede_Reloj reloj = new Fede_Reloj();
        reloj.informe(personal);
    }

    private static Integer horasTrabajadas(String tipo, Boolean esDocente, Random random){
        Integer horasRequeridas = 40;
        Integer horasTrabaj = horasRequeridas;
        Double probabilidadExceder = 0.0;

        if (esDocente) {
            switch (tipo) {
                case "Simple": probabilidadExceder = 0.95;
                case "Semiexclusiva": probabilidadExceder = 0.75;
                case "Exclusiva": probabilidadExceder = 0.60;
            }
        } else {
            switch (tipo) {
                case "Completa": probabilidadExceder = 0.95;
                case "Parcial": probabilidadExceder = 0.75;
                    
                    break;
            
                default:
                    break;
            }
        }
        if (random.nextDouble() <probabilidadExceder){
            horasTrabaj += random.nextInt(21);
        }
        return horasTrabaj;
    }
}
