//sta carta tiene los atributos: nombre, club, país, una lista de habilidades especiales, velocidad, tiro, regate, defensa, pase y físico.
package fifa;
import java.util.List;

public final class Especial extends Cartas {

    private List<String> habilidadesEspeciales;

    public Especial(String nombre, String club, String pais, List<String> habilidadesEspeciales) {
        super(nombre, club, pais);
        this.habilidadesEspeciales = habilidadesEspeciales;
        this.generarEstadisticas(89, 90);
    }
    public void agregarHabilidad(String habilidad) {
        this.habilidadesEspeciales.add(habilidad);
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
    /*Debe poder asignar los valores numéricos de velocidad, tiro, regate, defensa,
pase y físico con un valor aleatorio en el rango de 89 a 99, y a cada valor
generado se le sumarán 2% sobre el base, no superando el máximo de 99.*/ 
    @Override
    public void generarEstadisticas (int rango1, int rango2) {
        this.velocidad = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02); //devuelve un valor entre 89 y 99 y no supera el 99
        this.regate = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02);
        this.tiro = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02);
        this.defensa = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02);
        this.pase = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02);
        this.fisico = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.02);
    }
    
@Override
    public String toString() {
        return super.toString() + "Especial{" +
                "habilidadesEspeciales=" + habilidadesEspeciales +
                '}';
    }
}
