public class Fede_Claro extends Fede_TarifaProveedor{
    
    private String nombre;
    private Double extra = 20.00;

    public Fede_Claro(String nombre, Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
        super(totalSMS, totalMinutos, totalGigas);
        this.nombre = nombre;
    }

    public Double totalTarifa(){
        Double total = (double) calcular(getTotalSMS(), getTotalMinutos(), getTotalGigas());
        return (extra * total / 100.00);
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
