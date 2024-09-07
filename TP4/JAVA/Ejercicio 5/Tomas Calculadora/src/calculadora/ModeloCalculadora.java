package calculadora;

public class ModeloCalculadora {
	private double resultado;

	public double getResultado() {
		return resultado;
	}

	public void sumar(double numero1, double numero2) {
		resultado = numero1 + numero2;
	}

	public void restar(double numero1, double numero2) {
		resultado = numero1 - numero2;
	}

	public void multiplicar(double numero1, double numero2) {
		resultado = numero1 * numero2;
	}

	public void dividir(double numero1, double numero2) {
		if (numero2 != 0) {
			resultado = numero1 / numero2;
		} else {
			throw new ArithmeticException("División por cero");
		}
	}
}
