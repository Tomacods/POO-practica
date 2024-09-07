//Cree una IGU que permita seleccionar el idioma y el mensaje para poder ver su traducción correspondiente.

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;



public class IguIdioma extends JFrame{

public IguIdioma () {
        setTitle("Traductor de Idiomas");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        
        JLabel resultado = new JLabel();
        JComboBox <String> idiomaComboBox = new JComboBox(new String[] {"Ingles", "Frances", "Portugues"});
        JComboBox <String> mensajeComboBox = new JComboBox(new String[] {"Saludar", "Despedirse", "Perdon", "Pedir Café", "Cuanto Cuesta", "Donde Queda"});


        JButton traducirButton = new JButton("Traducir");
        traducirButton.addActionListener((ActionEvent e) -> {

            String idioma = idiomaComboBox.getSelectedItem().toString();
            String mensaje = mensajeComboBox.getSelectedItem().toString();
            String traduccion = " ";
            Idioma idiomaObj = null;
            switch (idioma) {
                case "Ingles" -> idiomaObj = new Ingles();
                case "Frances" -> idiomaObj = new Frances();
                case "Portugues" -> idiomaObj = new Portugues();
            }
            if (idiomaObj != null) {
                switch (mensaje) {
                    case "Saludar" -> traduccion += idiomaObj.saludar();
                    case "Despedirse" -> traduccion += idiomaObj.despedirse();
                    case "Perdon" -> traduccion += idiomaObj.perdon();
                    case "Pedir Café" -> traduccion += idiomaObj.pedirCafe();
                    case "Cuanto Cuesta" -> traduccion += idiomaObj.cuantoCuesta();
                    case "Donde Queda" -> traduccion += idiomaObj.dondeQueda();
                }
            }
            resultado.setText(traduccion);

        });

        add(new JLabel(" Idioma:"));
        //usar el setbounds para cambiar el tamaño del comboBox
        add(idiomaComboBox);
        
        add(new JLabel(" Mensaje:"));
        add(mensajeComboBox);
        add(new JLabel(" Traducción:"));
        add(resultado);
        add(traducirButton);
    }
}
