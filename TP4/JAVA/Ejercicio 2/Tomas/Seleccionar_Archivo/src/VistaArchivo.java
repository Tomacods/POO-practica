

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VistaArchivo extends JFrame {
	private JTextField campoArchivo;
	private JTextField campoUbicacion;
	private JButton botonSeleccionarArchivo;
	private JButton botonSeleccionarUbicacion;
	private JButton botonCopiar;

	public VistaArchivo() {
		setTitle("Copiar Archivo");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 3));

		campoArchivo = new JTextField();
		campoUbicacion = new JTextField();
		botonSeleccionarArchivo = new JButton("Seleccionar Archivo");
		botonSeleccionarUbicacion = new JButton("Seleccionar Ubicación");
		botonCopiar = new JButton("Copiar Archivo");

		add(new JLabel("Archivo:"));
		add(campoArchivo);
		add(botonSeleccionarArchivo);
		add(new JLabel("Ubicación:"));
		add(campoUbicacion);
		add(botonSeleccionarUbicacion);
		add(new JLabel());
		add(botonCopiar);

		setVisible(true);
	}

	public void setControlador(ActionListener controlador) {
		botonSeleccionarArchivo.addActionListener(controlador);
		botonSeleccionarUbicacion.addActionListener(controlador);
		botonCopiar.addActionListener(controlador);
	}

	public String getRutaArchivo() {
		return campoArchivo.getText();
	}

	public void setRutaArchivo(String ruta) {
		campoArchivo.setText(ruta);
	}

	public String getRutaUbicacion() {
		return campoUbicacion.getText();
	}

	public void setRutaUbicacion(String ruta) {
		campoUbicacion.setText(ruta);
	}
}
