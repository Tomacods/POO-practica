package vista;

import java.awt.GridLayout;
import javax.swing.*;

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
        setTitle("formateador de monedas y fechas");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7,2));

        //texto ingresado

        txtCantidad = new JTextField();
        txtDia = new JTextField();
        txtMes = new JTextField();
        txtAnio = new JTextField();

        //Radio buttons

        // rdbtnArgentina = new JRadioButton("Argentina");
        // rdbtnEstadosUnidos = new JRadioButton("Estados Unidos");
        // ButtonGroup grupo = new ButtonGroup();
        // grupo.add(rdbtnArgentina);
        // grupo.add(rdbtnEstadosUnidos);


        //Botones 

        JButton btnFormatear = new JButton("Formatear");

        //etiqueta label

        lblTitulo = new JLabel("");

        //agregando al panel

        add(new JLabel(" Ingrese la cantidad"));
        add(txtCantidad);
        add(new JLabel(" Ingrese el dia"));
        add(txtDia);
        add(new JLabel(" Ingrese el mes"));
        add(txtMes);
        add(new JLabel(" Ingrese el año"));
        add(txtAnio);
        add(lblTitulo);
        add(btnFormatear);
        setVisible(true);

        

        


    }
    
}
