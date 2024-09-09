public class BronceEspecial extends Cartas {

    private String habilidadEspecial;
    

    public BronceEspecial(String nombre,String club, String pais, int velocidad, int regate, int tiro, int defensa, int pase, int fisico, String habilidadEspecial) {
        super(nombre,club,pais,velocidad,regate,tiro,defensa,pase,fisico);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    /*  La carta podrá calcular su química, que se determinará de la siguiente forma:
    Si el país favorito y el equipo favorito de la clase plantilla coinciden con
    los de la carta, la química será 100.
    Si solo uno de ellos coincide, la química será 80.
    Si ninguno coincide, la química será 0.
    */
    @Override
    public int calcularQuimica(String paisfavorito, String equipofavorito){
        if (paisfavorito.equals(this.getPais()) && equipofavorito.equals(this.getClub())) {
            return 100;
        } else if (paisfavorito.equals(this.getPais()) || equipofavorito.equals(this.getClub())) {
            return 80;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "BronceEspecial{" +
                "habilidadEspecial='" + habilidadEspecial + '\'' +
                '}';
    }
}
