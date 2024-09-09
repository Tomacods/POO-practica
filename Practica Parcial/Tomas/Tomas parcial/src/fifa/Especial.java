//sta carta tiene los atributos: nombre, club, país, una lista de habilidades especiales, velocidad, tiro, regate, defensa, pase y físico.

import java.util.List;

public class Especial extends Cartas {

    private List<String> habilidadesEspeciales;

    public Especial(String nombre, String club, String pais, int velocidad, int regate, int tiro, int defensa, int pase, int fisico, List<String> habilidadesEspeciales) {
        super(nombre, club, pais, velocidad, regate, tiro, defensa, pase, fisico);
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public List<String> getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    public void setHabilidadesEspeciales(List<String> habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }
    @Override
    public int calcularQuimica(String paisfavorito, String equipofavorito) {
        return 100;
    }
    
@Override
    public String toString() {
        return super.toString() + "Especial{" +
                "habilidadesEspeciales=" + habilidadesEspeciales +
                '}';
    }
}
