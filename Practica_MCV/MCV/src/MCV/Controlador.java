// Controlador.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	private Modelo modelo;
	private VIsta vista;

	public Controlador(Modelo modelo, VIsta vista) {
		this.modelo = modelo;
		this.vista = vista;

		this.vista.addIncrementarListener(new IncrementarListener());
	}

	class IncrementarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modelo.incrementarContador();
			vista.setContador(modelo.getContador());
		}
	}
}
