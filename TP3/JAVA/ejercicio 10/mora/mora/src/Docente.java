import java.util.Random;

public class Docente extends Personal {
    private String categoria;
    // private int horas_semanales;

    public Docente(String nombre_completo, int antiguedad, String sector, String categoria) {
        super(nombre_completo, antiguedad, sector);
        this.categoria=categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public int horas_semanales() {
        switch (categoria) {
            case "Simple":
                return 10;

            case "Semiexclusiva":
                return 20;

            case "Exclusiva":
                return 40;

                default: return 0;

        }

      //  La expresión random.nextDouble() < 0.95 permite simular una probabilidad de 95% de que una determinada acción ocurra.

    }
    /*public int calcularHorasTrabajadas(Random random) {
        int horasRequeridas = horas_mensuales_minimo();
        switch (categoria) {
            case "Simple":
                return random.nextDouble() < 0.95 
                    ? random.nextInt(100) + horasRequeridas 
                    : random.nextInt(100) + horasRequeridas - 20;
            case "Semiexclusiva":
                return random.nextDouble() < 0.75 
                    ? random.nextInt(100) + horasRequeridas 
                    : random.nextInt(100) + horasRequeridas - 20;
            case "Exclusiva":
                return random.nextDouble() < 0.60 
                    ? random.nextInt(100) + horasRequeridas 
                    : random.nextInt(100) + horasRequeridas - 20;
            default:
                return horasRequeridas;
        }
    }*/



}
