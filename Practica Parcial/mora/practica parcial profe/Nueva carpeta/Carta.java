public abstract class Carta {
    protected String nombre;
    protected String club;
    protected String pais;
    // protected String equipo;
    protected String habilidad;
    protected int velocidad;
    protected int tiro;
    protected int regate;
    protected int defensa;
    protected int pase;
    protected int fisico;

    public Carta(String nombre, String club, String pais, String habilidad, int velocidad, int tiro, int regate,
            int defensa, int pase, int fisico) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
        this.habilidad = habilidad;
        this.velocidad = velocidad;
        this.tiro = tiro;
        this.regate = regate;
        this.defensa = defensa;
        this.pase = pase;
        this.fisico = fisico;

    }


    public int calcular_quimica(String paisFav, String equipoFav) {
        if (this.pais.equals(paisFav) && this.club.equals(equipoFav)) {
            return 100;
        } else if (this.pais.equals(paisFav) || this.club.equals(equipoFav)) {
            return 80;
        } else {
            return 0;
        }
    }

   // public abstract int calcular_quimica(String paisFav, String equipoFav);
@Override
    public String toString() {
        return 
                nombre + " | " +
                club + " | " +
                pais + "\n" +
                "Habilidad Especial: " + habilidad + "\n" +
                "Velocidad: " + velocidad + "\n" +
                "Tiro: " + tiro + "\n" +
                "Regate: " + regate + "\n" +
                "Defensa: " + defensa + "\n" +
                "Pase: " + pase + "\n" +
                "Físico: " + fisico + "\n";
    }
}
