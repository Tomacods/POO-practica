public class Cesar_Titular extends Cesar_Profesor{
    
    private Integer antiguedad;
    private Double valorAntiguedad = 1000.00;
    private Double valorHora = 300.00;

    public Cesar_Titular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad){
        super(nombre, apellido, edad, horasTrabajadas);
        this.antiguedad  = antiguedad;
    }

    public Double getRemuneracionAntiguedad() {
        return this.valorAntiguedad * this.getAntiguedad();
    }

    @Override
    public Double getRemuneracionMensual(){
        return this.valorHora * getHorastrabajadas() * getRemuneracionAntiguedad();
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double getValorAntiguedad() {
        return valorAntiguedad;
    }
}