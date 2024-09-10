public abstract class Carta {
    protected String nombre;
    protected String club;
    protected String pais;
    protected Integer vel;
    protected Integer tir;
    protected Integer reg;
    protected Integer def;
    protected Integer pas;
    protected Integer fis;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public Carta(String nombre, String club, String pais) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
    }

    public abstract Integer valor();

    public void Asignarvalores() {
        this.def = valor();
        this.vel = valor();
        this.tir = valor();
        this.fis = valor();
        this.reg = valor();
        this.pas = valor();
    }

    public String toString() {
        return "Nombre = " + nombre + " Club = " + club + " pais = " + pais + " Velocidad = " + vel + " Defensa = "
                + def + " Tiro = " + tir + " Fisico = " + fis + " Regate = " + reg + " Pase = " + pas;
    }
}
