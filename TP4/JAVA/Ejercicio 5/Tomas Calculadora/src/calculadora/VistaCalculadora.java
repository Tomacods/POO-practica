package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VistaCalculadora extends JFrame {
	private JPanel contentPane;
	public JTextField textField; // Campo de texto declarado para que pueda ser accedido desde el controlador
	private JButton[] botonesNumeros; // Botones de números declarados para que puedan ser accedidos desde el controlador
	private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnIgual, btnClear, btnDecimal; // Botones de operaciones declarados para que puedan ser accedidos desde el controlador
	private ControladorCalculadora controlador;

	public VistaCalculadora() {
		setForeground(new Color(102,0,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 0, 102));
		contentPane.setBackground(new Color(64, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 414, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		botonesNumeros = new JButton[10];
		for (int i = 0; i < 10; i++) { // Crear botones de números del 0 al 9
			botonesNumeros[i] = new JButton(String.valueOf(i));
			botonesNumeros[i].addActionListener(this::manejarEventoNumero);
			contentPane.add(botonesNumeros[i]);
		}

		// Posicionar botones de números 
		botonesNumeros[7].setBounds(20, 50, 89, 23);
		botonesNumeros[4].setBounds(20, 84, 89, 23);
		botonesNumeros[1].setBounds(20, 118, 89, 23);
		botonesNumeros[0].setBounds(119, 152, 89, 23);
		botonesNumeros[8].setBounds(119, 50, 89, 23);
		botonesNumeros[5].setBounds(119, 84, 89, 23);
		botonesNumeros[2].setBounds(119, 118, 89, 23);
		botonesNumeros[9].setBounds(218, 50, 89, 23);
		botonesNumeros[6].setBounds(218, 84, 89, 23);
		botonesNumeros[3].setBounds(218, 118, 89, 23);

		btnSumar = new JButton("+");
		btnSumar.setBounds(335, 50, 89, 23);
		btnSumar.addActionListener(this::manejarEventoOperacion); // Agregar un listener para manejar el evento de clic
		contentPane.add(btnSumar);

		btnRestar = new JButton("-");
		btnRestar.setBounds(335, 84, 89, 23);
		btnRestar.addActionListener(this::manejarEventoOperacion);
		contentPane.add(btnRestar);

		btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(335, 118, 89, 23);
		btnMultiplicar.addActionListener(this::manejarEventoOperacion);
		contentPane.add(btnMultiplicar);

		btnDividir = new JButton("/");
		btnDividir.setBounds(335, 152, 89, 23);
		btnDividir.addActionListener(this::manejarEventoOperacion);
		contentPane.add(btnDividir);

		btnIgual = new JButton("=");
		btnIgual.setBounds(335, 186, 89, 23);
		btnIgual.addActionListener(this::manejarEventoIgual);
		contentPane.add(btnIgual);

		btnClear = new JButton("C");
		btnClear.setBounds(20, 152, 89, 23);
		btnClear.addActionListener(this::manejarEventoClear);
		contentPane.add(btnClear);

		btnDecimal = new JButton(".");
		btnDecimal.setBounds(218, 152, 89, 23);
		btnDecimal.addActionListener(this::manejarEventoNumero);
		contentPane.add(btnDecimal);
	}

	public void setControlador(ControladorCalculadora controlador) {
		this.controlador = controlador;
	}

	private void manejarEventoNumero(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		controlador.numeroPresionado(boton.getText());
	}

	private void manejarEventoOperacion(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		controlador.operacionPresionada(boton.getText());
	}

	private void manejarEventoIgual(ActionEvent e) {
		controlador.igualPresionado();
	}

	private void manejarEventoClear(ActionEvent e) {
		controlador.clearPresionado();
	}

	public void actualizarPantalla(String texto) {
		textField.setText(texto);
	}
}

