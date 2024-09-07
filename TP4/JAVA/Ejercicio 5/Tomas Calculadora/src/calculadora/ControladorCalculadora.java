package calculadora;

public class ControladorCalculadora {
	private ModeloCalculadora modelo;
	private VistaCalculadora vista;
	private String operacion;
	private double numero1;

	public ControladorCalculadora(ModeloCalculadora modelo, VistaCalculadora vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);
	}

	public void numeroPresionado(String numero) {
		vista.actualizarPantalla(vista.textField.getText() + numero);
	}

	public void operacionPresionada(String operacion) {
		this.operacion = operacion;
		numero1 = Double.parseDouble(vista.textField.getText());
		vista.actualizarPantalla("");
	}

	public void igualPresionado() {
		double numero2 = Double.parseDouble(vista.textField.getText());
		switch (operacion) {
			case "+" -> modelo.sumar(numero1, numero2);
			case "-" -> modelo.restar(numero1, numero2);
			case "*" -> modelo.multiplicar(numero1, numero2);
			case "/" -> modelo.dividir(numero1, numero2);
		}
		vista.actualizarPantalla(String.valueOf(modelo.getResultado()));
	}

	public void clearPresionado() {
		vista.actualizarPantalla("");
	}
}
