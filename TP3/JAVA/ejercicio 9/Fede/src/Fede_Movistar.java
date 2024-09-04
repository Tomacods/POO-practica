public class Fede_Movistar extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extraSMS = 1.10;
    private Double extraMin = 1.20;
    private Double extraGB = 1.30;

    public Fede_Movistar(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(){
        Double sms = calcularSMS(getTotalSMS()) * extraSMS; // es lo mismo que calcularSMS(getTotalSMS()) * 1.10
        Double min = calcularMinutosDeLlamada(getTotalMinutos()) * extraMin; // es lo mismo que calcularMinutosDeLlamada(getTotalMinutos()) * 1.20
        Double gb = calcularConsumoGB(getTotalGigas()) * extraGB;  // es lo mismo que calcularConsumoGB(getTotalGigas()) * 1.30
        return sms + min + gb;
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
