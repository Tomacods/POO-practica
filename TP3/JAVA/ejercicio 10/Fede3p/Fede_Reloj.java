public class Fede_Reloj {
    
    public void informe(Fede_Personal_10[] personal) {
        for(Fede_Personal_10 p: personal){
            Integer horasMensual = p.horas_trabajadas();
            System.out.println(p.getNombre() + " " + p.getApellido() + " trabajó " + horasMensual + " horas este mes.");
            if (horasMensual >= 20){
                System.out.println("Cumplió con el mínimo esperado.");
            } else {
                System.out.println("No cumplío con el mínimo esperado.");
            }
        }
    }
}
