


import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    for (Empresa empresa : empresas){
        System.out.println(empresa);
        for (Persona persona : empresa.getPersonas()){
            System.out.println(persona);
        }
    }

    JFrame frame = new JFrame("listado de empresas y empleados");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 200);

    String [] columnas = {"Nombre", "Edad", "Sexo", "ocupacion(trabaja o no)", "Puesto"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    for (Empresa empresa : empresas){
        for (Persona persona : empresa.getPersonas()){
            String [] fila = {persona.getNombre(), String.valueOf(persona.getEdad()), persona.getSexo(), persona.getOcupacion(),persona.getPuesto().getNombre()
            };
            modelo.addRow(fila);
        }
    }

    JTable tabla = new JTable(modelo);
    JScrollPane scrollPane = new JScrollPane(tabla);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.add(scrollPane);
    frame.setVisible(true);
    
}
}
