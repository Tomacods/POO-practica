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
    public Integer calcularquimica(String club, String pais){
        Integer quimica= 0;
        if (club.equals(this.club) && pais.equals(this.pais)){
            quimica = 100;
        }else{
            if(club.equals(this.club) || pais.equals(this.pais)){
                quimica = 80;
            }else{
                quimica = 0;
            }
        }
        return quimica;
    }
    public String toString() {
        return "Nombre = " + nombre +"\n"+ " Club = " + club +"\n"+ " pais = " + pais +"\n"+ " Velocidad = " + vel + " Defensa = "
                + def + " Tiro = " + tir +"\n"+ " Fisico = " + fis + " Regate = " + reg + " Pase = " + pas+"\n";
    }
}
