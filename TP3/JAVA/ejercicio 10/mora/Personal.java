import java.util.Random;

public abstract class Personal {
    //Atributos
    protected String nombre_completo;
    protected int antiguedad;
    protected String sector;
    protected int horas_trabajadas_mes;
    //Constructor
    public Personal (String nombre_completo, int antiguedad, String sector){
        this.nombre_completo= nombre_completo;
        this.antiguedad= antiguedad;
        this.sector= sector;
        //this.horas_trabajadas= horas_trabajadas;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
     public int getHoras_trabajadas_mes() {
        return horas_trabajadas_mes;
    }
    public void setHoras_trabajadas_mes(int horas_trabajadas_mes) {
        this.horas_trabajadas_mes = horas_trabajadas_mes;
    }
    public abstract int horas_semanales();

    public int horas_mensuales_minimo() {
        return horas_semanales() * 4; 
    }
   

    public abstract int calcularHorasTrabajadas(Random random);

   // public int horas_minimas() {
  //      return horas_semanales(); // Asumimos que el mínimo es igual a las horas semanales
  //  }
}