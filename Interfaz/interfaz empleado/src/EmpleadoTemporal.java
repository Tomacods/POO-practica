public class EmpleadoTemporal implements Empleado {
	private String nombre;
	private double sueldo_por_hora;
	private int horas_trabajadas;

	public EmpleadoTemporal(String nombre, double sueldo_por_hora, int horas_trabajadas) {
		this.nombre = nombre;
		this.sueldo_por_hora = sueldo_por_hora;
		this.horas_trabajadas = horas_trabajadas;
	}

	@Override
	public double calcular_salario() {
		return sueldo_por_hora * horas_trabajadas;
	}

	@Override
	public void mostrar_informacion() {
		System.out.println("Nombre: " + nombre + ", Sueldo por Hora: " + sueldo_por_hora + ", Horas Trabajadas: " + horas_trabajadas + ", Salario: " + calcular_salario());
	}
}
