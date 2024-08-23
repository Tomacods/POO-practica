public class Personal extends TarifaProveedor {
    public Personal(String nombre,int totalSMS, int totalMinutos, int totalGigas) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return "Personal";
    }
    // Personal: que tiene un 20% extra sobre los minutos de llamada y 50% sobre los GB de datos.
    @Override
    public double calcular(int totalSMS, int totalMinutos, int totalGigas) {
        return super.calcularSMS(totalSMS) + calcularMinutosDeLlamada(totalMinutos) * 1.20 + calcularConsumoGB(totalGigas) * 1.50; // 20% extra sobre los minutos de llamada y 50% sobre los GB de datos
    }

}