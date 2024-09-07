package modelo;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

;
public class Vista extends JFrame{


    public Vista () {
        setTitle("Formateador de Datos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));
        JTextField cantidadfield = new JTextField();
        JTextField diafield = new JTextField();
        JTextField mesfield = new JTextField();
        JTextField añofield = new JTextField();
        JLabel resultadoMoneda = new JLabel();
        JLabel resultadoFecha = new JLabel();
        JRadioButton formatoUS = new JRadioButton("Formato US");
        JRadioButton formatoAR = new JRadioButton("Formato AR");
        formatoUS.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(formatoUS);
        group.add(formatoAR);

        JButton formatearButton = new JButton("Formatear");
        formatearButton.addActionListener((ActionEvent e) -> {
            try {
                Double cantidad = Double.valueOf(cantidadfield.getText()); // se cambia el tipo de dato de String a Double
                Integer dia = Integer.valueOf(diafield.getText()); // se cambia el tipo de dato de String a Integer
                Integer mes = Integer.valueOf(mesfield.getText());
                Integer año = Integer.valueOf(añofield.getText());
                
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

        add(new JLabel(" Cantidad de dinero:"));
        add(cantidadfield);
        
        add(new JLabel(" Día:"));
        add(diafield);
        add(new JLabel(" Mes:"));
        add(mesfield);
        add(new JLabel(" Año:"));
        add(añofield);
        add(formatearButton);
        add(Box.createRigidArea(new Dimension(0, 1)));
        add(new JLabel(" Formato de moneda:"));
        
        add(Box.createRigidArea(new Dimension(0, 1)));
        
        
        add(formatoUS);
        add(formatoAR);

        add(new JLabel(" Moneda formateada:"));
        add(resultadoMoneda);
        add(new JLabel(" Fecha formateada:"));
        add(resultadoFecha);
    }
    
}
