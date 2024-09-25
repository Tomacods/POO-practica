public class EmpleadoTemporal implements Empleado {
    private String nombre;
    private Integer sueldo_por_hora;
    private Integer horas_trabajadas;

    public EmpleadoTemporal(String nombre, Integer sueldo_por_hora, Integer horas_trabajadas) {
        this.nombre = nombre;
        this.sueldo_por_hora = sueldo_por_hora;
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public Integer calcular_salario() {
        return (sueldo_por_hora * horas_trabajadas) * 4;
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("Nombre: " + nombre + ", Salario (por mes): " + calcular_salario());
    }

}
