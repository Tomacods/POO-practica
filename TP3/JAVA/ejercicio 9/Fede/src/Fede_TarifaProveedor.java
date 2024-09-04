public abstract class Fede_TarifaProveedor {
    
    private Integer totalSMS;
    private Integer totalMinutos;
    private Integer totalGigas;

    public Fede_TarifaProveedor(Integer totalSMS, Integer totalMinutos, Integer totalGigas){
        this.totalSMS = totalSMS;
        this.totalMinutos = totalMinutos;
        this.totalGigas = totalGigas;
    }

    // Metodos

    public Integer calcularSMS(Integer totalSMS){
        return totalSMS * 1;
    }

    public Integer calcularMinutosDeLlamada(Integer totalMinutos){
        return totalMinutos * 15;
    }

    public Integer calcularConsumoGB(Integer totalGigas){
        return totalGigas * 20;
    }

    public Integer calcular(Integer totalSMS, Integer totalMinutos, Integer totalGigas){
        return calcularSMS(totalSMS) + calcularMinutosDeLlamada(totalMinutos) + calcularConsumoGB(totalGigas);
    }

    public abstract String getNombre();

    // Getters y setters

    public Integer getTotalSMS() {
        return totalSMS;
    }

    public void setTotalSMS(Integer totalSMS) {
        this.totalSMS = totalSMS;
    }

    public Integer getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(Integer totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public Integer getTotalGigas() {
        return totalGigas;
    }

    public void setTotalGigas(Integer totalGigas) {
        this.totalGigas = totalGigas;
    }
}