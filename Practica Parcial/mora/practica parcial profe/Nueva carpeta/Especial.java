import java.util.ArrayList;
import java.util.Random;

public class Especial extends Carta {
    private ArrayList<String> habilidades = new ArrayList<>();

    public Especial(String nombre, String club, String pais) {
        super(nombre, club, pais);
        asignar_random(89, 100, 1.02);
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public void asignar_random() {
        Random random = new Random();
        this.velocidad = (int) (random.nextInt(89, 100) * 1.02);
        this.tiro = (int) (random.nextInt(89, 100) * 1.02);
        this.regate = (int) (random.nextInt(89, 100) * 1.02);
        this.defensa = (int) (random.nextInt(89, 100) * 1.02);
        this.pase = (int) (random.nextInt(89, 100) * 1.02);
        this.fisico = (int) (random.nextInt(89, 100) * 1.02);

        if (this.velocidad > 99) {
            this.velocidad = 99;
        }
        if (this.tiro > 99) {
            this.tiro = 99;
        }
        if (this.regate > 99) {
            this.regate = 99;
        }
        if (this.defensa > 99) {
            this.defensa = 99;
        }
        if (this.pase > 99) {
            this.pase = 99;
        }
        if (this.fisico > 99) {
            this.fisico = 99;
        }
    }

    public void imprimir() {
        System.out.println("Nombre:" + this.nombre + "\n" +
                "Equipo: " + this.club + "\n" +
                "País: " + this.pais + "\n" +
                "Velocidad: " + this.velocidad + "\n" +
                "Tiro: " + this.tiro + "\n" +
                "Regate: " + this.regate + "\n" +
                "Defensa" + this.defensa + "\n" +
                "Pase: " + this.pase + "\n" +
                "Físico: " + this.fisico + "\n");
        for (String habilidad : habilidades) {
            System.out.println("Habilidad especial" + habilidad + "\n");
        }
    }

    @Override
    public Integer calcular_quimica(String pais_fav, String equipo_fav) {
        return 100;
    }

}
