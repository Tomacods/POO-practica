public abstract class Carta {

    protected String nombre;
    protected String club;
    protected String pais;
    protected Integer velocidad;
    protected Integer tiro;
    protected Integer regate;
    protected Integer defensa;
    protected Integer pase;
    protected Integer fisico;

    public Carta (String nombre, String club, String pais){
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
    }

    public String toString() {
        return "Nombre: " + nombre + "    Club: " + club + "    País: " + pais + "\n" + "Velocidad: " + velocidad + "    Tiro: " + tiro + "    Regate: " + regate + "\n" + "Defensa: " + defensa + "    Pase: " + pase + "    Fisico: " + fisico; 
    }

    public abstract Integer quimicaCarta(String paisFav, String equipoFav);

    public abstract Integer valor();
}