
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import modelo.Modelo;
import vista.Vista;

public class Controlador   {

    private Vista vista;
    private Modelo modelo;
    private File archivoSeleccionado;
    private File destinoSeleccionado;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
        this.vista.getBotonSeleccionarArchivo().addActionListener(new SeleccionarArchivoListener());
        this.vista.getBotonSeleccionarDestino().addActionListener(new SeleccionarDestinoListener());
        this.vista.getBotonCopiar().addActionListener(new CopiarArchivoListener());
    }

    class SeleccionarArchivoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = vista.crearSelectorDeArchivos();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                archivoSeleccionado = fileChooser.getSelectedFile();
            }
        }
    }

    class SeleccionarDestinoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = vista.crearSelectorDeDirectorios();
            int result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                destinoSeleccionado = fileChooser.getSelectedFile();
            }
        }
    }

    class CopiarArchivoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (archivoSeleccionado != null && destinoSeleccionado != null) {
                try {
                    modelo.copiarArchivo(archivoSeleccionado, new File(destinoSeleccionado, archivoSeleccionado.getName()));
                    JOptionPane.showMessageDialog(null, "Archivo copiado con éxito");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un archivo y un destino primero");
            }
        }
    }
}
