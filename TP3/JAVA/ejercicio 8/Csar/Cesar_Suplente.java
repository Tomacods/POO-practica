public class Cesar_Suplente extends Cesar_Profesor{
    
    public Cesar_Suplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas){
        super(nombre, apellido, edad, horasTrabajadas);
    }

    @Override
    public Double getRemuneracionMensual(){
        return 0.0;
    }
}