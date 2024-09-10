package fifa;

public abstract class  Cartas {
    protected String nombre;
    protected String club;
    protected String pais;
    protected int velocidad, regate, tiro, defensa, pase, fisico;




    public Cartas(String nombre, String club, String pais) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public abstract void generarEstadisticas(int rango1,int rango2);
    
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

