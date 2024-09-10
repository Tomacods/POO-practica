import java.util.ArrayList;
import java.util.Random;

public class Especial extends Carta {
    private static final Random random = new Random();
//private ArrayList<String> habilidades = new ArrayList<>();

    public Especial(String nombre, String club, String pais,String habilidad) {
        super(nombre, club, pais, habilidad,
                random.nextInt(30) + 80, // Velocidad
                random.nextInt(30) + 80, // Tiro
                random.nextInt(30) + 80, // Regate
                random.nextInt(30) + 80, // Defensa
                random.nextInt(30) + 80, // Pase
                random.nextInt(30) + 80 // Físico
        );
        
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void AddHabilidad(String string) {
        this.habilidades.add(string);
    }

    public int valor_random() {
        int ran = random.nextInt(11) + 89; // Genera un valor entre 89 y 99
        int ran2 = (int) (ran * 1.02); // Incrementa en un 2%

        // Asegúrate de que el valor no supere 99
        if (ran2 > 99) {
            ran2 = 99;
        }

        return ran2;
    }

    public int calcular_quimica(String a, String b) {
        return 100;
    }
}
