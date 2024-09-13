import java.util.Random;

public class Oro extends Carta {

    public Oro(String nombre, String club, String pais) {
        super(nombre, club, pais);
        asignar_random();
    }

    public void asignar_random() {
        Random random = new Random();
        this.velocidad = (int) (random.nextInt(74, 91) * 1.05);
        this.tiro = (int) (random.nextInt(74, 91) * 1.05);
        this.regate = (int) (random.nextInt(74, 91) * 1.05);
        this.defensa = (int) (random.nextInt(74, 91) * 1.05);
        this.pase = (int) (random.nextInt(74, 91) * 1.05);
        this.fisico = (int) (random.nextInt(74, 91) * 1.05);
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
    }

    public Integer calcular_quimica(String pais_fav, String equipo_fav) {
        return super.calcular_quimica(pais_fav, equipo_fav);
    }

}
