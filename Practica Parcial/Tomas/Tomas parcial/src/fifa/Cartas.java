
public abstract class  Cartas {
    protected String nombre;
    protected String club;
    protected String pais;
    protected int velocidad;
    protected int regate;
    protected int tiro;
    protected int defensa;
    protected int pase;
    protected int fisico;



    public Cartas(String nombre, String club, String pais, int velocidad, int regate, int tiro, int defensa, int pase, int fisico) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
        this.velocidad = velocidad;
        this.regate = regate;
        this.tiro = tiro;
        this.defensa = defensa;
        this.pase = pase;
        this.fisico = fisico;
    }

    public String getNombre() {
        return nombre;
    }
    public String getClub() {
        return club;
    }
    public String getPais() {
        return pais;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getRegate() {
        return regate;
    }
    public int getTiro() {
        return tiro;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getPase() {
        return pase;
    }
    public int getFisico() {
        return fisico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setRegate(int regate) {
        this.regate = regate;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public void setPase(int pase) {
        this.pase = pase;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }
    



@Override
public String toString() {
    return 
            "nombre='" + nombre + '\'' +
            ", club='" + club + '\'' +
            ", pais='" + pais + '\'' +
            ", velocidad=" + velocidad +
            ", regate=" + regate +
            ", tiro=" + tiro +
            ", defensa=" + defensa +
            ", pase=" + pase +
            ", fisico=" + fisico +
            '}';
}
public  abstract int calcularQuimica(String paisfavorito, String equipofavorito);

}

