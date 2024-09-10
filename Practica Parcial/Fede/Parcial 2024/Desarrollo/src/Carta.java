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

    public Carta (String nombre, String club, String pais, Integer velocidad, Integer tiro, Integer regate, Integer defensa, Integer pase, Integer fisico){
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
        this.velocidad = velocidad;
        this.tiro = tiro;
        this.regate = regate;
        this.defensa = defensa;
        this.pase =pase;
        this.fisico = fisico;
    }

    public String toString() {
        return "Nombre: " + nombre + "    Club: " + club + "    País: " + pais + "    Velocidad: " + velocidad + "    Tiro: " + tiro + "    Regate: " + regate + "    Defensa: " + defensa + "    Pase: " + pase + "    Fisico: " + fisico; 
    }

    public Integer quimicaCarta(String paisFav, String equipoFav){
        if ((paisFav == pais) && (equipoFav == club)){
            return 100;
        } else {
            if ((paisFav == pais) || (equipoFav == club)){
                return 80;
            } else {
                return 0;
            }
        }
    }

    public abstract Integer valor();
}