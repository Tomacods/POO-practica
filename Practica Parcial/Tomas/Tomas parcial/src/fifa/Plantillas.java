/*Se deberán crear dos plantillas, las cuales tendrán los siguientes atributos: usuario (propietario
del equipo), país favorito, equipo favorito, y un plantel de 11 cartas.
● Al crear una plantilla, se ingresarán todos estos datos excepto el plantel, el cual se
construirá mediante un método que permita agregar cartas (jugadores) a la plantilla.
● El equipo debe ser capaz de calcular su química total y mostrar (imprimir) la
conformación del plantel.
*/
package fifa;
import java.util.ArrayList;
import java.util.List;

public class Plantillas {

    private String usuario;
    private String paisFavorito;
    private String equipoFavorito;
    private final List<Cartas> plantel;

    public Plantillas(String usuario, String paisFavorito, String equipoFavorito) {
        this.usuario = usuario;
        this.paisFavorito = paisFavorito;
        this.equipoFavorito = equipoFavorito;
        this.plantel = new ArrayList<>();
        }

    public void agregarCarta(Cartas carta){
        plantel.add(carta);
    }
    //getters
    public String getUsuario() {
        return usuario;
    }
    public String getPaisFavorito() {
        return paisFavorito;
    }
    public String getEquipoFavorito() {
        return equipoFavorito;
    }
    //setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setPaisFavorito(String paisFavorito) {
        this.paisFavorito = paisFavorito;
    }
    public void setEquipoFavorito(String equipoFavorito) {
        this.equipoFavorito = equipoFavorito;
    }

    public int calcularQuimicaTotal(){
        int quimicaTotal = 0;
        for (Cartas carta : plantel) { //polimorfismo dinamico porque se llama al metodo calcularQuimica de la clase Cartas
            quimicaTotal += carta.calcularQuimica(paisFavorito, equipoFavorito);
        }
        return quimicaTotal;
    }
    public void mostrarPlantel(){
        for (Cartas carta : plantel) {
            System.out.println(carta);
        }
    }
}
