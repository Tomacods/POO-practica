public class Fede_Movistar extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extraSMS = 10.00;
    private Double extraMin = 20.00;
    private Double extraGB = 30.00;

    public Fede_Movistar(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(Integer totalSMS, Integer totalMinutos, Integer totalGigas){
        Double sms = (double) calcularSMS(totalSMS);
        sms = (extraSMS * sms / 100.00);
        Double min = (double) calcularMinutosDeLlamada(totalMinutos);
        min = (extraMin * min / 100.00);
        Double gb = (double) calcularConsumoGB(totalGigas);
        gb = (extraGB * min / 100.00);
        Double total = (double) calcular(totalSMS, totalMinutos, totalMinutos);
        return total + min + gb + sms;
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
