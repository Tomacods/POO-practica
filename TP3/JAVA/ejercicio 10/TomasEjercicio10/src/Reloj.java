/*Defina la clase Reloj que sepa generar un informe. Este debe indicar para cada persona
la cantidad de horas trabajadas en el mes indicando además si cumplió o no con el
mínimo esperado. */
public class Reloj {
    
    public void generarInforme(Personal[] personal) {
        for (Personal p : personal) {
            Integer horasTrabajadas = p.HorasTrabajadas();
            System.out.println(p.getNombre() + " trabajó " + horasTrabajadas + " horas en el mes.");
            if (horasTrabajadas >= 20) {
                System.out.println("Cumplió con el mínimo esperado.");
            } else {
                System.out.println("No cumplió con el mínimo esperado.");
            }
        }
    }
    
}
