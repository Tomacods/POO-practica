package modelo;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

;
public class Vista extends JFrame{

    private JPanel panel;
    private JLabel lblTitulo;
    private JButton btnSalir;
    private JTextField txtCantidad;
    private JTextField txtDia;
    private JTextField txtMes;
    private JTextField txtAnio;
    private JRadioButton rdbtnArgentina;
    private JRadioButton rdbtnEstadosUnidos;

    public Vista () {
        setTitle("Formateador de Datos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 3));

        JTextField cantidadfield = new JTextField();
        JTextField diafield = new JTextField();
        JTextField mesfield = new JTextField();
        JTextField añofield = new JTextField();
        JLabel resultadoMoneda = new JLabel();
        JLabel resultadoFecha = new JLabel();
        JRadioButton formatoUS = new JRadioButton("Formato US");
        JRadioButton formatoAR = new JRadioButton("Formato AR");

        ButtonGroup group = new ButtonGroup();
        group.add(formatoUS);
        group.add(formatoAR);

        JButton formatearButton = new JButton("Formatear");
        formatearButton.addActionListener((ActionEvent e) -> {
            try {
                Double cantidad = Double.parseDouble(cantidadfield.getText());
                Integer dia = Integer.parseInt(diafield.getText());
                Integer mes = Integer.parseInt(mesfield.getText());
                Integer año = Integer.parseInt(añofield.getText());
                
                Igu formateador;
                if (formatoUS.isSelected()) {
                    formateador = new IguEstadosUnidos();
                } else {
                    formateador = new IguArgentina();
                }
                
                resultadoMoneda.setText(formateador.formatearMoneda(cantidad));
                resultadoFecha.setText(formateador.formatearFecha(dia, mes, año));
            } catch (FechaInvalida ex) {
                JOptionPane.showMessageDialog(Vista.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
        });

        add(new JLabel("Cantidad de dinero:"));
        add(cantidadfield);
        add(new JLabel("Día:"));
        add(diafield);
        add(new JLabel("Mes:"));
        add(mesfield);
        add(new JLabel("Año:"));
        add(añofield);
        add(formatoUS);
        add(formatoAR);
        add(formatearButton);
        add(new JLabel("Moneda formateada:"));
        add(resultadoMoneda);
        add(new JLabel("Fecha formateada:"));
        add(resultadoFecha);
    }
    
}
