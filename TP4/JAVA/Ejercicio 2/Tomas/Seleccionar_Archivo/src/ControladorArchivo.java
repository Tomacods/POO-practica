
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ControladorArchivo implements ActionListener {
	private ModeloArchivo modelo;
	private VistaArchivo vista;

	public ControladorArchivo(ModeloArchivo modelo, VistaArchivo vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.vista.setControlador(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.botonSeleccionarArchivo) {
			JFileChooser fileChooser = new JFileChooser();
			int result = fileChooser.showOpenDialog(vista);
			if (result == JFileChooser.APPROVE_OPTION) {
				File archivo = fileChooser.getSelectedFile();
				vista.setRutaArchivo(archivo.getAbsolutePath());
				modelo.seleccionarArchivo(archivo);
			}
		} else if (e.getSource() == vista.botonSeleccionarUbicacion) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int result = fileChooser.showOpenDialog(vista);
			if (result == JFileChooser.APPROVE_OPTION) {
				File ubicacion = fileChooser.getSelectedFile();
				vista.setRutaUbicacion(ubicacion.getAbsolutePath());
				modelo.seleccionarUbicacionDestino(ubicacion);
			}
		} else if (e.getSource() == vista.botonCopiar) {
			try {
				modelo.copiarArchivo();
				JOptionPane.showMessageDialog(vista, "Archivo copiado con éxito");
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(vista, "Error al copiar el archivo: " + ex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		ModeloArchivo modelo = new ModeloArchivo();
		VistaArchivo vista = new VistaArchivo();
		new ControladorArchivo(modelo, vista);
	}
}
