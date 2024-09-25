public class EmpleadoTiempoCompleto extends Persona implements Empleado {
    

    public EmpleadoTiempoCompleto(String nombre, Integer sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public Integer calcular_salario() {
        return (int) (this.sueldo / 12);
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("Nombre: " + nombre + ", Salario (por mes): " + calcular_salario());
    }

}
