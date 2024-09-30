public class EmpleadoTiempoCompleto implements Empleado {
	private String nombre;
	private double sueldo_anual;

	public EmpleadoTiempoCompleto(String nombre, double sueldo_anual) {
		this.nombre = nombre;
		this.sueldo_anual = sueldo_anual;
	}

	@Override
	public double calcular_salario() {
		return sueldo_anual;
	}

	@Override
	public void mostrar_informacion() {
		System.out.println("Nombre: " + nombre + ", Sueldo Anual: " + sueldo_anual);
	}
}
