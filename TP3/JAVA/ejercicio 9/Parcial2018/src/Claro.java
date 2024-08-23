public class Claro extends TarifaProveedor {
    public Claro(String nombre,int totalSMS, int totalMinutos, int totalGigas) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return "Claro";
    }
    // Claro: que tiene un 20% extra sobre el básico total
    @Override
    public double calcular(int totalSMS, int totalMinutos, int totalGigas) {
        return super.calcular(totalSMS, totalMinutos, totalGigas) * 1.2; // 20% extra
    }
}
