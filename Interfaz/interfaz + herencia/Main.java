import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            Integer ran = random.nextInt(2); // Genera un valor 0 o 1 aleatoriamente
            if (ran == 0) {
                EmpleadoTiempoCompleto empleado_completo = new EmpleadoTiempoCompleto("Empleado (tiempo completo)" + (i+1), 11000000); // Sueldo anual
                empleados.add(empleado_completo);
            } else {
                EmpleadoTemporal empleado_temporal = new EmpleadoTemporal("Empleado(temporal)" + (i+1), 4600, 35); // Sueldo por hora y horas trabajadas
                empleados.add(empleado_temporal);
            }
        }

        for (Empleado empleado : empleados) {
            empleado.mostrar_informacion();
        }
    }
}