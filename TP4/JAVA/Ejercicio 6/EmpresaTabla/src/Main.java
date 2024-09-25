


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Main {
    public static void main(String[] args) {

        // Empresa empresaa = new Empresa("TABLADA", "CODIGO 6569");

        Puesto administrativo = new Puesto("Administrativo");
        Puesto gerente = new Puesto("Gerente");
        Puesto tesorero = new Puesto("Tesorero");

    
    List<Empresa> empresas = new ArrayList<>();
        
    Empresa empresa1 = new Empresa("TABLADA", "CODIGO 6569");
    empresa1.addPersona(new Persona("Mora", 21, "F", "Si", administrativo));
    empresa1.addPersona(new Persona("Maria", 26, "F", "Si", administrativo));
    empresa1.addPersona(new Persona("Leandro", 34, "M", "Si", administrativo));
    empresas.add(empresa1);
    
    Empresa empresa2 = new Empresa("TABLADA", "CODIGO 6569");
    empresa2.addPersona(new Persona("Victor", 43, "M", "Si", gerente));
    empresa2.addPersona(new Persona("Rocio", 24, "F", "Si", tesorero));
    empresas.add(empresa2);

    JFrame frame = new JFrame("listado de empresas y empleados");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 200);

    String [] columnas = {"Nombre", "Edad", "Sexo", "ocupacion(trabaja o no)", "Puesto"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    for (Empresa empresa : empresas){
        for (Persona persona : empresa.getPersonas()){
            String [] fila = {persona.getNombre(), String.valueOf(persona.getEdad()), persona.getSexo(), persona.getOcupacion(),persona.getPuesto().getNombre()
            };
            modelo.addRow(fila); // Agregar fila al modelo de datos
        }
    }
    // Crear JTable con el modelo de datos
    JTable tabla = new JTable(modelo);
    tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Permitir seleccionar solo una fila a la vez
    JScrollPane scrollPane = new JScrollPane(tabla);
    frame.add(scrollPane);
    
    JButton botonEliminar = new JButton("Eliminar");
    botonEliminar.setEnabled(false);

    // Añadir ActionListener al botón "Eliminar"
    tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() { // genera un evento al hacer click
        @Override
        public void valueChanged(ListSelectionEvent e) { // metodo que se ejecuta al hacer click
            if (!e.getValueIsAdjusting() && tabla.getSelectedRow() != -1) { // si hay una fila seleccionada
                botonEliminar.setEnabled(true); // habilita el botón
            } else {
                botonEliminar.setEnabled(false); // deshabilita el botón
            }
        }
    });

    // Añadir ActionListener al botón "Eliminar"
    botonEliminar.addActionListener(new ActionListener() { // genera un evento al hacer click
        @Override
        public void actionPerformed(ActionEvent e) { // metodo que se ejecuta al hacer click
            int selectedRow = tabla.getSelectedRow(); // obtiene la fila seleccionada
            if (selectedRow != -1) { // si hay una fila seleccionada
                modelo.removeRow(selectedRow); // elimina la fila del modelo
                empresas.remove(selectedRow); // Elimina la empresa correspondiente del listado
                botonEliminar.setEnabled(false); // deshabilita el botón
            }
        }
    });
   // Crear un panel para el botón y añadirlo al frame
    JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panelBoton.add(botonEliminar);

   // Añadir el panel del botón y el scrollPane al frame
    frame.getContentPane().add(panelBoton, BorderLayout.NORTH);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

    frame.setVisible(true);
}
}
