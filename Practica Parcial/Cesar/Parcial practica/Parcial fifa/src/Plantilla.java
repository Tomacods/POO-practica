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

    @Override
    public String toString() {
        return "Usuario= " + usuario +"\n"+ "Pais favorito = " + paisfav +"\n"+ "Club favorito = " + clubfav+"\n"+ calcularquimica();
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
    public String calcularquimica(){
        Integer Quimica = 0;
        for(Carta c: cartas){
            Quimica = Quimica + c.calcularquimica(this.clubfav,this.paisfav);
        }
        return "La quimica del equipo es de :"+ Quimica/cartas.size();
    }
}
