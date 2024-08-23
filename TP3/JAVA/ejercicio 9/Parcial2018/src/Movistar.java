public class Movistar extends TarifaProveedor {
    public Movistar(String nombre,int totalSMS, int totalMinutos, int totalGigas) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return "Movistar";
    }
    // Movistar: tiene un 10% extra sobre los mensajes de texto, 20% sobre las llamadas y 30% sobre los GB de datos.
    @Override
    public double calcular(int totalSMS, int totalMinutos, int totalGigas) {
        return super.calcularSMS(totalSMS) * 1.10 + calcularMinutosDeLlamada(totalMinutos) * 1.20 + calcularConsumoGB(totalGigas) * 1.30; 
    }
    
}
