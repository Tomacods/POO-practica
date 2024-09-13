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

}
