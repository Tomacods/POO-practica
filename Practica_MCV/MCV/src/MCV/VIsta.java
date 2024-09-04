// Vista.java
import java.awt.event.ActionListener;
import javax.swing.*;

public class VIsta extends JFrame {
	private JLabel etiquetaContador;
	private JButton botonIncrementar;

	public VIsta() {
		etiquetaContador = new JLabel("Contador: 0");
		botonIncrementar = new JButton("Incrementar");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 100);
		this.setLayout(new java.awt.FlowLayout());
		this.add(etiquetaContador);
		this.add(botonIncrementar);
	}

	public void setContador(int contador) {
		etiquetaContador.setText("Contador: " + contador);
	}

	public void addIncrementarListener(ActionListener listener) {
		botonIncrementar.addActionListener(listener);
	}
}
