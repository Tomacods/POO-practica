import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Familias {
    public static void main(String[] args) {
        Random random = new Random();
        int nro_familas = random.nextInt(10) + 1;

        List<String> lista_nombres = new ArrayList<>(
                Arrays.asList("Juan", "Mora", "Lorenzo", "Alejandra", "Lucas", "Luciana", "Tomás","Cesar" , "Federica" , "Santiago"
                , "Francisco" , "Rocio" , "Macarena" , "Cecilia" , "Julian" , "Claudia" , "Marcia" , "Mariano" , "Dana" , "Lucia"));
        List<String> lista_apellidos = new ArrayList<>(
                Arrays.asList("Molina", "Gutierrez", "Jaime", "Gonzalez", "Millavanque", "Rios" , "Rodriguez" ,  "Fernandez" , "Regina" + "Mansilla" , 
                "Roldan" , "Da Silva" , "Rossi" , "Ruppel" , "Silvestre" , "Berro" , "Martel" , "Rosas" , "Jimenez" , "Romero"));

        for (int i = 1; i <= nro_familas; i++) {
            int indiceFamilia = random.nextInt(lista_apellidos.size());
            int nro_integrantes = random.nextInt(5) + 1;
            String apellido_random = lista_apellidos.get(indiceFamilia);
            System.out.println("Familia: " + apellido_random);
            int suma_edad = 0;

            for (int j = 1; j <= nro_integrantes; j++) {
                int edad_random = random.nextInt(90) + 1;
                suma_edad += edad_random;
                int indiceIntegrantes = random.nextInt(lista_nombres.size());
                String nombre_random = lista_nombres.get(indiceIntegrantes);
                System.out.println("Nombre: " + nombre_random + "\n" + "Edad: " + edad_random);
            }

            int promedioEdad = suma_edad / nro_integrantes;
            System.out.println("Promedio de edad:" + promedioEdad);
        }
    }

}
