
public class Titular extends Profesor{
    
    private Integer antiguedad;
    private Double valorAntiguedad = 1000.0;

    public Titular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
        super(nombre, apellido, edad, horasTrabajadas);
        this.antiguedad = antiguedad;
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
    public void setValorAntiguedad(Double valorAntiguedad) {
        this.valorAntiguedad = valorAntiguedad;
    }
    
    public Double get_remuneracion_antiguedad() {
        return (double) (this.antiguedad * this.getAntiguedad());
    }
    
    //heredar el metodo de la clase padre
    @Override
    public Double get_remuneracion_mensual() {
        return this.valorHora * getHorasTrabajadas()* get_remuneracion_antiguedad();
    }
    
}