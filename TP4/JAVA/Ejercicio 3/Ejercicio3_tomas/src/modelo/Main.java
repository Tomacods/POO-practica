package modelo;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Vista().setVisible(true);
        }
    });
}
}
//mejorar la interfaz grafica usando el jComboBox para seleccionar el dia, mes y año en lugar de los JTextField para no tener que ingresar los datos manualmente por teclado

