public class Fede_Personal extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extraMin = 20.00;
    private Double extraGB = 50.00;

    public Fede_Personal(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(){
        Double min = (double) calcularMinutosDeLlamada(getTotalMinutos());
        min = (extraMin * min / 100.00);
        Double gb = (double) calcularConsumoGB(getTotalGigas());
        gb = (extraGB * min / 100.00);
        Double total = (double) calcular(getTotalSMS(), getTotalMinutos(), getTotalGigas());
        total = total + min + gb;
        return total;
    }
    

    @Override
    public String getNombre(){
        return this.nombre;
    }
}