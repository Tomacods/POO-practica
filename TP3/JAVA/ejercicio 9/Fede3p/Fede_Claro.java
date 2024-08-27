public class Fede_Claro extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extra = 1.20;

    public Fede_Claro(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(){
        return calcular(getTotalSMS(), getTotalMinutos(), getTotalGigas()) * extra;
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
