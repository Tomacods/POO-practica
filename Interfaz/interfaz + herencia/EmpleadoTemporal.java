public class EmpleadoTemporal extends Persona implements Empleado{
    private Integer horas_trabajadas;

    public EmpleadoTemporal(String nombre, Integer sueldo, Integer horas_trabajadas) {
      super(nombre, sueldo);
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public Integer calcular_salario() {
        return (this.sueldo * this.horas_trabajadas) * 4;
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("Nombre: " + this.nombre + ", Salario (por mes): " + calcular_salario());
    }

}
