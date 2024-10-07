import java.util.Random;

public class Bronce extends Carta {

  private String habilidad;

  public Bronce(String nombre, String club, String pais, String habilidad) {
    super(nombre, club, pais);
    this.habilidad = habilidad;
    asignar_random(49, 66, 2.0);
  }
@Override
  public void asignar_random(Integer min, Integer max, Double nro) {
    Random random = new Random();
    this.velocidad = (int) (random.nextInt(min, max) + nro);
    this.tiro =  (int) (random.nextInt(min, max) + nro);
    this.regate =  (int) (random.nextInt(min, max) + nro);
    this.defensa =  (int) (random.nextInt(min, max) + nro);
    this.pase =  (int) (random.nextInt(min, max) + nro);
    this.fisico =  (int) (random.nextInt(min, max) + nro);
  }

  public void imprimir() {
    System.out.println("Habilidad especial" + this.habilidad + "\n" +
        "Nombre:" + this.nombre + "\n" +
        "Equipo: " + this.club + "\n" +
        "País: " + this.pais + "\n" +
        "Velocidad: " + this.velocidad + "\n" +
        "Tiro: " + this.tiro + "\n" +
        "Regate: " + this.regate + "\n" +
        "Defensa" + this.defensa + "\n" +
        "Pase: " + this.pase + "\n" +
        "Físico: " + this.fisico + "\n");
  }

  public Integer calcular_quimica(String pais_fav, String equipo_fav) {
    return super.calcular_quimica(pais_fav, equipo_fav);
  }

}
