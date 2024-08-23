public class Suplente extends Profesor{
    

    public Suplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
        super(nombre, apellido, edad, horasTrabajadas);
        
    }
    
    //heredar el metodo de la clase padre
    @Override
    public Double get_remuneracion_mensual() {
        return this.valorHora * getHorasTrabajadas();
    }
    
}
