import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Integer ran = random.nextInt(2);
            if (ran == 0) {
                EmpleadoTiempoCompleto empleado_completo = new EmpleadoTiempoCompleto("Empleado" + i, 11000000);
                empleados.add(empleado_completo);
            } else {
                EmpleadoTemporal empleado_temporal = new EmpleadoTemporal("Empleado" + i, 4600, 35);
                empleados.add(empleado_temporal);
            }
        }
        for (Empleado empleado : empleados) {
            empleado.mostrar_informacion();

        }

    }

}
