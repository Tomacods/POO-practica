import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        String[] nombres = { "Tomas", "Federica", "Mora", "Cesar", "Javier", "Carlos", "Franco", "Maximiliano", "Mauro",
                "Ara" };
        String[] apellidos = { "Da Silva", "Molina", "Millavanque", "Lopes", "Lopez", "Roldan", "Berro", "Mansilla",
                "Aguilar", "Orzanco" };
        Integer cantFam = random.nextInt(11);
        while (cantFam == 0) {
            cantFam = random.nextInt(11);
        }
        ArrayList<Familia> familias = new ArrayList<>(cantFam);
        for (Integer i = 0; i < cantFam; i++) {
            Integer cantInteg = random.nextInt(5);
            while (cantInteg == 0){
                cantInteg = random.nextInt(5);
            }
            String familia = apellidos[random.nextInt(apellidos.length)];
            Familia fam = new Familia(familia);
            for (Integer j = 0; j < cantInteg; i++) {
                String nom = nombres[random.nextInt(nombres.length)];
                Integer edad = random.nextInt(100);
                Persona persona = new Persona(nom, familia, edad);
                fam.addFamilia(persona);
            }
            familias.add(fam);
        }
        for(Familia fam:familias){
            System.out.println("Familia " + fam.getFamilia() + ":");
            System.out.println("Promedio de edad: " + fam.promedioEdad());
            System.out.println("Integrantes:");
            for (Persona per: fam.getPersonas()){
                System.out.println();
            }
        }
    }
}