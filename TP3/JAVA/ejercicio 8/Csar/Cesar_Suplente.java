public class Cesar_Suplente extends Cesar_Profesor{
    
    private Double valorHora = 200.00;
    public Cesar_Suplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas){
        super(nombre, apellido, edad, horasTrabajadas);
    }

    @Override
    public Double getRemuneracionMensual(){
        return this.valorHora * this.getHorastrabajadas();
    }
}