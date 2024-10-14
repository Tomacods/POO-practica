import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Vista {
    private JDialog dialogo;
    private JTextField campoTexto;
    private Integer diaIngresado, mesIngresado,añoIngresado;;
    private Double montoIngresado;
    private JRadioButton rb1, rb2;
    private JButton seleccionar;
    private JFrame frame;

    public Vista() {
        mostrarEjemploJDialogConEntradas();
    }


    void mostrarEjemploJDialogConEntradas() {
        frame = new JFrame("Ventana Principal");
        frame.setLayout(new GridLayout(0, 1, 10, 10)); // Alineación centrada y espaciado entre componentes
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // VENTANA EN EL CENTRO
        // Crear el botón para abrir el cuadro de diálogo
        JButton botonFecha = new JButton("Ingresar fecha");
        // botonFecha.setAlignmentX(JButton.CENTER_ALIGNMENT);
        botonFecha.addActionListener(e -> fecha());

        frame.add(botonFecha);
        JButton botonMonto = new JButton("Ingresar monto");
        botonMonto.addActionListener(e -> dialogoMonto(frame));

        frame.add(botonMonto);

        radioButton(frame);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void label(String a, String b) {
        JFrame frameL = new JFrame("JLabel");
        JLabel etiqueta1, etiqueta2;

        etiqueta1 = new JLabel("Fecha: " + a);
        etiqueta1.setBounds(50, 50, 150, 30);

        etiqueta2 = new JLabel("Monto: " + b);
        etiqueta2.setBounds(50, 100, 150, 30);

        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(e -> frameL.dispose());
        botonAceptar.setBounds(100, 200, 100, 30);

        frameL.add(etiqueta1);
        frameL.add(etiqueta2);
        frameL.add(botonAceptar);

        frameL.setSize(300, 300);
        frameL.setLayout(null);
        frameL.setLocationRelativeTo(null);
        frameL.setVisible(true);
    }

    public void addSeleccionListener(ActionListener listener) {
        seleccionar.addActionListener(listener);
    }

    public String getSeleccion() {
        if (rb1.isSelected()) {
            return "Eeuu";
        } else if (rb2.isSelected()) {
            return "Arg";
        }
        return null;
    }


    // boton.addActionListener(this);
    private void radioButton(JFrame frame) {
        rb1 = new JRadioButton("Eeuu");
        rb1.setBounds(100, 50, 95, 30);

        rb2 = new JRadioButton("Argentina");
        rb2.setBounds(100, 100, 95, 30);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);

        seleccionar = new JButton("Seleccionar");
        seleccionar.setBounds(100, 150, 100, 30);

        seleccionar.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(rb1);
        frame.add(rb2);
        frame.add(seleccionar);
        frame.setVisible(true);
    }

    private void fecha() {
        JFrame frame = new JFrame("Ventana Fecha");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setSize(250, 150);
        // Crear el botón para abrir el cuadro de diálogo
        JButton botonDia = new JButton("Ingresar dia");
        botonDia.addActionListener(e -> abrirDialogoDia(frame));
        JButton botonMes = new JButton("Ingresar Mes");
        botonMes.addActionListener(e -> abrirDialogoMes(frame));
        JButton botonAño = new JButton("Ingresar Año");
        botonAño.addActionListener(e -> abrirDialogoAño(frame));
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(e -> {
            
            if (diaIngresado != null && mesIngresado != null && añoIngresado != null) {
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese día, mes y año.");
            }
        });
        JButton botonCancelar = new JButton("Cancelar");
        botonCancelar.addActionListener(e -> frame.dispose());

        // Añadir los botones al marco principal
        frame.add(botonDia);
        frame.add(botonMes);
        frame.add(botonAño);
        frame.add(botonAceptar);
        frame.add(botonCancelar);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // VENTANA EN EL CENTRO
        frame.setVisible(true);
    }

    private void abrirDialogoDia(JFrame frame) {
        dialogo = new JDialog(frame, "Ingresar dia  ", true);
        dialogo.setLayout(new FlowLayout()); // Constructs a new FlowLayout with a centered alignment
        // Crear campo de texto y botones
        campoTexto = new JTextField(20);
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");
        // Acción del botón Aceptar
        botonAceptar.addActionListener(e -> {
            try{
            String dia = campoTexto.getText();
            Integer diaIngresado = Integer.valueOf(dia);
            if (diaIngresado < 1 || diaIngresado > 31) { 
                throw new FechaExc("El día ingresado no es válido.");
            }
            dialogo.dispose();
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (FechaExc ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}
       


        });
        // Acción del botón Cancelar
        botonCancelar.addActionListener(e -> dialogo.dispose());
        // Añadir componentes al cuadro de diálogo
        dialogo.add(new JLabel("Ingrese dia"));
        dialogo.add(campoTexto);
        dialogo.add(botonAceptar);
        dialogo.add(botonCancelar);
        // Configurar el cuadro de diálogo
        dialogo.setSize(300, 150);
        dialogo.setLocationRelativeTo(null);// VENTANA EN EL CENTRO
        dialogo.setVisible(true);
        
    }

    private void abrirDialogoMes(JFrame frame) {
        dialogo = new JDialog(frame, "Ingresar mes ", true);
        dialogo.setLayout(new FlowLayout()); // Constructs a new FlowLayout with a centered alignment
        // Crear campo de texto y botones
        campoTexto = new JTextField(20);
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");
        // Acción del botón Aceptar
        botonAceptar.addActionListener(e -> {
            try{
            String mes = campoTexto.getText();
            mesIngresado = Integer.valueOf(mes);
            if (mesIngresado < 1 || mesIngresado > 12) {
                throw new FechaExc("El mes ingresado no es válido.");
            }
            dialogo.dispose();
        }  catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FechaExc ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        
        });
        // Acción del botón Cancelar
        botonCancelar.addActionListener(e -> dialogo.dispose());
        // Añadir componentes al cuadro de diálogo
        dialogo.add(new JLabel("Ingrese mes "));
        dialogo.add(campoTexto);
        dialogo.add(botonAceptar);
        dialogo.add(botonCancelar);
        // Configurar el cuadro de diálogo
        dialogo.setSize(300, 150);
        dialogo.setLocationRelativeTo(null);// VENTANA EN EL CENTRO
        dialogo.setVisible(true);
        
    }

    private void abrirDialogoAño(JFrame frame) {
        dialogo = new JDialog(frame, "Ingresar año ", true);
        dialogo.setLayout(new FlowLayout()); // Constructs a new FlowLayout with a centered alignment
        // Crear campo de texto y botones
        campoTexto = new JTextField(20);
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");
        // Acción del botón Aceptar
        botonAceptar.addActionListener(e -> {
            String año = campoTexto.getText();
            añoIngresado = Integer.valueOf(año);
            dialogo.dispose();
        });
        // Acción del botón Cancelar
        botonCancelar.addActionListener(e -> dialogo.dispose());
        // Añadir componentes al cuadro de diálogo
        dialogo.add(new JLabel("Ingrese año"));
        dialogo.add(campoTexto);
        dialogo.add(botonAceptar);
        dialogo.add(botonCancelar);
        // Configurar el cuadro de diálogo
        dialogo.setSize(300, 150);
        dialogo.setLocationRelativeTo(null);// VENTANA EN EL CENTRO
        dialogo.setVisible(true);
    }

    private void dialogoMonto(JFrame frame) {
        dialogo = new JDialog(frame, "Ingrese el monto", true);
        dialogo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Constructs a new FlowLayout with a centered alignment
        // Crear campo de texto y botones
        campoTexto = new JTextField(20);
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");
        // Acción del botón Aceptar
        botonAceptar.addActionListener(e -> {
            String monto = campoTexto.getText();
            montoIngresado = Double.valueOf(monto);
            dialogo.dispose();
        });
        // Acción del botón Cancelar
        botonCancelar.addActionListener(e -> dialogo.dispose());
        // Añadir componentes al cuadro de diálogo
        dialogo.add(new JLabel("Ingrese el monto: "));
        dialogo.add(campoTexto);
        dialogo.add(botonAceptar);
        dialogo.add(botonCancelar);
        // Configurar el cuadro de diálogo
        dialogo.setSize(250, 150);
        dialogo.setLocationRelativeTo(null);// VENTANA EN EL CENTRO
        dialogo.setVisible(true);
    }
    public Integer getDiaIngresado() {
        return diaIngresado;
    }

    public Integer getMesIngresado() {
        return mesIngresado;
    }

    public Integer getAñoIngresado() {
        return añoIngresado;
    }

    public Double getMontoIngresado() {
        return montoIngresado;
    }
}
