package fifa;
public class Oro extends Cartas{

    public Oro(String nombre, String club, String pais) {
        super(nombre, club, pais);
        this.generarEstadisticas(74, 90);
    }

    // @Override
    // public int calcularQuimica(String paisfavorito, String equipofavorito){
    //     if (paisfavorito.equals(this.getPais()) && equipofavorito.equals(this.getClub())) { //Si el país favorito y el equipo favorito de la clase plantilla coinciden con los de la carta, la química será 100.
    //         return 100;
    //     } else if (paisfavorito.equals(this.getPais()) || equipofavorito.equals(this.getClub())) {
    //         return 80;
    //     } else {
    //         return 0;
    //     }
    // }
    @Override
    public String toString() {
        return super.toString() + "Oro{" +
                '}';
    }
    /*Debe poder asignar los valores numéricos de velocidad, tiro, regate, defensa,
pase y físico con un valor aleatorio en el rango de 74 a 90, y a cada valor
generado se le sumarán 5% sobre el base.
 */
    @Override
    public void generarEstadisticas(int rango1, int rango2) {
        this.velocidad = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
        this.regate = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
        this.tiro = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
        this.defensa = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
        this.pase = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
        this.fisico = (int) (Math.random() * (rango2 - rango1 + 1) + rango1) + (int)(rango1*0.05);
    }

}
        
    

    
