import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nombre = { "Pikachu", "Charmander", "Messi", "Oak", "Tevez", "Milito", "Gigliotti", "Meza",
                "Bochini", "Ronaldo" };
        ArrayList<Pokemon> salvajes = new ArrayList<>(10);
        Agua pokemon7 = new Agua("Colapinto", "Agua", "Hierba");
        Random random = new Random();
        Integer j = 0;
        for (Integer i = 0; i < 10; i++) {
            Integer opcion = random.nextInt(1, 3);
            switch (opcion) {
                case 1: {
                    Agua pokemon1 = new Agua(nombre[random.nextInt(nombre.length)], "Agua", "Hierba");
                    pokemon1.Asignaratributos();
                    salvajes.add(pokemon1);
                }
                case 2: {
                    Hierba pokemon2 = new Hierba(nombre[random.nextInt(nombre.length)], "Hierba", "Fuego");
                    pokemon2.Asignaratributos();
                    salvajes.add(pokemon2);
                }
                case 3: {
                    Fuego pokemon3 = new Fuego(nombre[random.nextInt(nombre.length)], "Fuego", "Agua");
                    pokemon3.Asignaratributos();
                    salvajes.add(pokemon3);
                }
            }
            j = j +1;
        }
        Entrenador entre1 = new Entrenador("Ash", random.nextInt(1, 100));
        pokemon7.Asignaratributos();
        entre1.setPrincipal(pokemon7);
        for (Integer i = 0; i<10; i++){
            entre1.atraparpokemon(salvajes.get(i));
        }
        entre1.Imprimir();
    }
}
