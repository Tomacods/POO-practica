package familia2022;
/**Desarrolle un sistema que genere un número aleatorio de familias(entre 1 y 10).
Cada una de ellas debe tener un apellido y un listado de personas que la componen, la
cantidad de integrantes es aleatoria. De estas personas se debe saber el nombre, el apellido y
la edad. El nombre y apellido se van a elegir de forma aleatoria de dos listas(una para cada
uno) precargadas de 20 elementos. No importa si los apellidos y nombres se repiten. Por otro
lado, la edad también se definirá de forma aleatoria./ */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        List<Familia> familias = new ArrayList<>();
        Random random = new Random();
        String[] nombres = {"Juan", "Pedro", "Maria", "Jose", "Lucia", "Ana", "Carlos", "Fernando", "Sofia", "Marta", "Luis", "Miguel", "Raul", "Julieta", "Cecilia", "Mariano", "Federico", "Agustin", "Gonzalo", "Tomas"};
        String[] apellidos = {"Perez", "Gomez", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Diaz", "Martinez", "Sanchez", "Romero", "Alvarez", "Torres", "Ruiz", "Ramirez", "Sosa", "Arias", "Morales", "Silva", "Rojas", "Vega"};
        for (int i = 0; i < random.nextInt(10) + 1; i++) {
            List<Persona> personas = new ArrayList<>();
            for (int j = 0; j < random.nextInt(10) + 1; j++) {
                personas.add(new Persona(nombres[random.nextInt(20)], apellidos[random.nextInt(20)], random.nextInt(100)));
            }
            familias.add(new Familia(apellidos[random.nextInt(20)], personas));
        }
        for (Familia familia : familias) {
            System.out.println(familia);
        }
    }
}
