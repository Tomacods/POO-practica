package modelo;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new Vista().setVisible(true);
    });
}
}
//mejorar la interfaz grafica usando el jComboBox para seleccionar el dia, mes y año en lugar de los JTextField para no tener que ingresar los datos manualmente por teclado

//implementar Mcv en el proyecto
