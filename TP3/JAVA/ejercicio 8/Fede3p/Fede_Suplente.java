public class Fede_Suplente extends Fede_Profesor{
    
    private Double valorHora = 200.00;

    public Fede_Suplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas){
        super(nombre, apellido, edad, horasTrabajadas);
    }

    @Override
    public Double getRemuneracionMensual(){
        return this.valorHora * this.getHorasTrabajadas();
    }
}
