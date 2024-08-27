public class Fede_Personal extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extraMin = 1.20;
    private Double extraGB = 1.50;

    public Fede_Personal(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(){
        Double min = calcularMinutosDeLlamada(getTotalMinutos()) * extraMin;
        Double gb = calcularConsumoGB(getTotalGigas()) * extraGB;
        return calcularSMS(getTotalSMS()) + min + gb;
    }
    

    @Override
    public String getNombre(){
        return this.nombre;
    }
}