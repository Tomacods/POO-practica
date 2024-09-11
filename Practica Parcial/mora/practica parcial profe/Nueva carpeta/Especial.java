import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Especial extends Carta {
    private static final Random random = new Random();
private ArrayList<String> habilidades = new ArrayList<>();

    public Especial(String nombre, String club, String pais, List<String> habilidades) {
        super(nombre, club, pais, habilidades,
                valor_random(), 
                valor_random(), 
                valor_random(), 
                valor_random(), 
                valor_random(), 
                valor_random() 
        );
        
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void AddHabilidad(String string) {
        this.habilidades.add(string);
    }

    public static int valor_random() {
        int ran = random.nextInt(11) + 89; // Genera un valor entre 89 y 99
        int ran2 = (int) (ran * 1.02); // Incrementa en un 2%

        // Asegúrate de que el valor no supere 99
        if (ran2 > 99) {
            ran2 = 99;
        }

        return ran2;
    }
    @Override
    public int calcular_quimica(String a, String b) {
        return 100;
    }
}
