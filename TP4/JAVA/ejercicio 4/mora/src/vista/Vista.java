import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class Vista {
    private JRadioButton rb1, rb2, rb3;
    // private JButton traducir;
    private String mensajeSeleccionado;
    private JButton traducir;

    public Vista() {
        //ventanaPrincipal();
    }

    public void ventanaPrincipal() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(0, 1, 10, 10)); // Alineación centrada y espaciado entre componentes
        frame.setSize(300, 190);
        frame.setLocationRelativeTo(null);
        comboBox(frame);
        radioButton(frame);
        // label("hola");
        frame.setVisible(true);

    }

    private void comboBox(JFrame f) {
        String[] mensajes = { "Saludar", "Despedirse", "Pedir cafe", "Cuanto cuesta", "Donde queda" };
        JComboBox<String> comboBox = new JComboBox<>(mensajes);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada
                mensajeSeleccionado = (String) comboBox.getSelectedItem();

                // Guardar la opción (en este caso simplemente se imprime en consola)
                System.out.println("Opción seleccionada: " + mensajeSeleccionado);
            }
        });
        // comboBox.addActionListener(this);
        comboBox.setBounds(50, 100, 90, 20);
        f.add(comboBox);
    }

    public String getMensaje() {
        return mensajeSeleccionado;
    }

    public void addListener(ActionListener listener) {
        traducir.addActionListener(listener);
    }

    /* public String getSeleccion() {
        if (rb1.isSelected()) {
            return "Ingles";
        } else if (rb2.isSelected()) {
            return "Portugues";
        } else if (rb3.isSelected()) {
            return "Frances";
        } else {
            return null;
        }
    } */
    public Integer getSeleccion() {
        if (rb1.isSelected()) {
            return 1;
        } else if (rb2.isSelected()) {
            return 2;
        } else if (rb3.isSelected()) {
            return 3;
        } else {
            return null;
        }
    }

    private void radioButton(JFrame f) {
        rb1 = new JRadioButton("INGLES");
        rb1.setBounds(100, 50, 80, 30);
        rb2 = new JRadioButton("PORTUGUES");
        rb2.setBounds(100, 100, 95, 30);
        rb3 = new JRadioButton("FRANCES");
        rb3.setBounds(100, 100, 95, 30);

        traducir = new JButton("Traducir");
        traducir.setBounds(100, 150, 100, 30);
        traducir.addActionListener(e -> {
            f.dispose();
        });

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);

        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(traducir);
        f.setVisible(true);
    }

    public void label(String traduccion) {
        JFrame frameL = new JFrame();
        JLabel etiqueta;
        etiqueta = new JLabel(traduccion);
        etiqueta.setBounds(50, 50, 150, 30);

        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(e -> frameL.dispose());
        aceptar.setBounds(100, 200, 100, 30);

        frameL.add(etiqueta);
        frameL.add(aceptar);
        frameL.setSize(300, 300);
        frameL.setLayout(null);
        frameL.setLocationRelativeTo(null);
        frameL.setVisible(true);
    }

}
