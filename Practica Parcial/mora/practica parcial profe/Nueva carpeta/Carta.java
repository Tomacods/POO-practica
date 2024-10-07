import java.util.Random;

public abstract class Carta {
    protected String nombre, club, pais;
    protected Integer velocidad, tiro, regate, defensa, pase, fisico;

    public Carta(String nombre, String club, String pais) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
    }

    public Integer calcular_quimica(String pais_fav, String equipo_fav) {
        if (this.pais.equals(pais_fav) && this.club.equals(equipo_fav)) {
            return 100;
        } else if (this.pais.equals(pais_fav) || this.club.equals(equipo_fav)) {
            return 80;
        } else
            return 0;
    }

    public abstract void imprimir();
    public void asignar_random(Integer min, Integer max, Double numero) {
        Random random = new Random();
        this.velocidad = (int) (random.nextInt(min, max) * numero);
        this.tiro = (int) (random.nextInt(min, max) * numero);
        this.regate = (int) (random.nextInt(min, max) * numero);
        this.defensa = (int) (random.nextInt(min, max) * numero);
        this.pase = (int) (random.nextInt(min, max) * numero);
        this.fisico = (int) (random.nextInt(min, max) * numero);

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

}
