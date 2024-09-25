public class EmpleadoTiempoCompleto implements Empleado {
    private String nombre;
    private Integer sueldo_anual;

    public EmpleadoTiempoCompleto(String nombre, Integer sueldo_anual) {
        this.nombre = nombre;
        this.sueldo_anual = sueldo_anual;
    }

    @Override
    public Integer calcular_salario() {
        return (int) (sueldo_anual / 12);
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("Nombre: " + nombre + ", Salario (por mes): " + calcular_salario());
    }

}
