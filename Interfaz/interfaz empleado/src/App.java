import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
       //creo de 1 a 10  empleados random
        for (int i = 0; i < (int) (Math.random() * 10) + 1; i++) {
            if (Math.random() < 0.5) {
                empleados.add(new EmpleadoTemporal("Empleado Temporal " + i, Math.random() * 100, (int) (Math.random() * 100)));
            } else {
                empleados.add(new EmpleadoTiempoCompleto("Empleado Tiempo Completo " + i, Math.random() * 100000));
            }
        }


        for (Empleado empleado : empleados) {
            empleado.mostrar_informacion();
        }
    }
}
