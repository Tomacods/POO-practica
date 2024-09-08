import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Integer numeroFamilias = random.nextInt(10) + 1;
        ArrayList<Cesar_FamiliaP> familys = new ArrayList<>();
        String[] NOMBRES = { "Tomás", "César", "Rodrigo", "Javier", "Agustin", "Federica", "Mora", "Sofia",
                "Marcela", "Romina" };
        String[] APELLIDOS = { "Da Silva", "Millavanque", "Levio", "Soto", "Romero", "Roldán", "Molina",
                "Jaramillo", "Paredes", "Messi" };
            
            for (int i = 0; i < numeroFamilias; i++) {
                String apellidoFamilia = APELLIDOS[random.nextInt(APELLIDOS.length)];
                Cesar_FamiliaP familia = new Cesar_FamiliaP(apellidoFamilia);
                int numeroIntegrantes = random.nextInt(3) + 1;
                for (int j = 0; j < numeroIntegrantes; j++) {
                    String nombre = NOMBRES[random.nextInt(NOMBRES.length)];
                    Integer edad = random.nextInt(100) + 1;
                    Cesar_PersonaP personita = new Cesar_PersonaP(nombre, edad);
                    familia.addPersona(personita);
                }
                familys.add(familia);
    }
    for (Cesar_FamiliaP familia : familys) {
        System.out.println("Familia: "+ familia.getApellido());
        System.out.println("Promedio de edad: "+ familia.Promedioedad());
        familia.imprimir();
    }
    }
}
