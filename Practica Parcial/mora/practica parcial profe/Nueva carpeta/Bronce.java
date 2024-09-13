import java.util.Random;

public class Bronce extends Carta {

  private String habilidad;

  public Bronce(String nombre, String club, String pais, String habilidad) {
    super(nombre, club, pais);
    this.habilidad = habilidad;
    asignar_random();
  }

  public void asignar_random() {
    Random random = new Random();
    this.velocidad = random.nextInt(49, 66) + 2;
    this.tiro = random.nextInt(49, 66) + 2;
    this.regate = random.nextInt(49, 66) + 2;
    this.defensa = random.nextInt(49, 66) + 2;
    this.pase = random.nextInt(49, 66) + 2;
    this.fisico = random.nextInt(49, 66) + 2;
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
