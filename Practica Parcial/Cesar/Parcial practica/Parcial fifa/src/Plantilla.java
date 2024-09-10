import java.util.ArrayList;
public class Plantilla {
    private String usuario;
    private String paisfav;
    private String clubfav;
    private ArrayList<Carta> cartas = new ArrayList<>(11);
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPaisfav() {
        return paisfav;
    }
    public void setPaisfav(String paisfav) {
        this.paisfav = paisfav;
    }
    public String getClubfav() {
        return clubfav;
    }
    public void setClubfav(String clubfav) {
        this.clubfav = clubfav;
    }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    public Plantilla(String usuario, String paisfav, String clubfav) {
        this.usuario = usuario;
        this.paisfav = paisfav;
        this.clubfav = clubfav;
    } 
    public void AgregarCarta (Carta carta1){
        this.cartas.add(carta1);
    }
    public Integer calcularquimica(Carta carta1){
        Integer quimica= 0;
        if (carta1.getClub() == this.getClubfav() && carta1.getPais() == this.getPaisfav()){
            quimica = 100;
        }else{
            if(carta1.getClub() == this.getClubfav() || carta1.getPais() == this.getPaisfav()){
                quimica = 80;
            }else{
                quimica = 0;
            }
        }
        return quimica;
    }
    @Override
    public String toString() {
        return "Usuario= " + usuario + ", Pais favorito = " + paisfav + ", Club favorito = " + clubfav;
    }
    public void mostrarplantel(){
        this.toString();
        mostrarcartas();
    }
    public void mostrarcartas (){
        for (Carta c : cartas){
            System.out.println(c);
        }
    }
}
