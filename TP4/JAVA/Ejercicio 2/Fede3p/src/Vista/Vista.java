package Vista;

import Controlador.Controlador;
import javax.swing.*;

public class Vista extends JFrame{
    
    private JPanel panel;
    private Controlador controlador;
    private JButton boton;
    private JButton botonSeleccionarArchivo;
    private JButton botonSeleccionarDestino;
    private JButton botonCopiar;

    public Vista(Controlador controlador) {
        this.controlador = controlador;

        JFrame frame = new JFrame("Copiar Archivo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        botonSeleccionarArchivo = new JButton("Seleccionar Archivo");
        botonSeleccionarArchivo.setBounds(50, 50, 150, 30);
        frame.add(botonSeleccionarArchivo);

        botonSeleccionarDestino = new JButton("Seleccionar Destino");
        botonSeleccionarDestino.setBounds(200, 50, 150, 30);
        frame.add(botonSeleccionarDestino);

        botonCopiar = new JButton("Copiar Archivo");
        botonCopiar.setBounds(125, 100, 150, 30);
        frame.add(botonCopiar);

        frame.setVisible(true);
    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }

    public JButton getBotonSeleccionarArchivo(){
        return botonSeleccionarArchivo;
    }

    public JButton getBotonSeleccionarDestino(){
        return botonSeleccionarDestino;
    }

    public JButton getBotonCopiar(){
        return botonCopiar;
    }

    public JFileChooser crearSelectorDeArchivos(){
        return new JFileChooser();
    }

    public JFileChooser crearSelectorDeDirectorios(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        return fileChooser;
    }
}