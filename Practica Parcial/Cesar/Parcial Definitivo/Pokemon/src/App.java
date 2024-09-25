import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nombre = { "Pikachu", "Charmander", "Messi", "Oak", "Tevez", "Milito", "Gigliotti", "Meza",
                "Bochini", "Ronaldo" };
        String[] tipos = {"Hierba", "Fuego", "Agua"};
        ArrayList<Pokemon> salvajes = new ArrayList<>(10);
        Agua pokemon7 = new Agua("Colapinto");
        Random random = new Random();
        //Integer j = 0;
        for (Integer i = 0; i < 10; i++) {
            //Integer opcion = random.nextInt(1, 3);
            String tipo = tipos[random.nextInt(tipos.length)];
            switch (tipo) {
                case "Agua": {
                    Agua pokemon1 = new Agua(nombre[random.nextInt(nombre.length)]);
                    salvajes.add(pokemon1);
                }
                case "Hierba": {
                    Hierba pokemon2 = new Hierba(nombre[random.nextInt(nombre.length)]);
                    salvajes.add(pokemon2);
                }
                default: {
                    Fuego pokemon3 = new Fuego(nombre[random.nextInt(nombre.length)]);
                    salvajes.add(pokemon3);
                    break;
                }
            }
            //j = j +1;
        }
        Entrenador entre1 = new Entrenador("Ash", random.nextInt(1, 100), pokemon7);
        //entre1.setPrincipal(pokemon7);
        for (Integer i = 0; i<10; i++){
            entre1.atraparpokemon(salvajes.get(i));
        }
        entre1.Imprimir();
    }
}
