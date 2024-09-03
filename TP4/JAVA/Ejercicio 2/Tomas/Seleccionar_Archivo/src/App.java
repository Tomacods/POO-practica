/*  2. Crear una interfaz gráfica de usuario (IGU) que permita seleccionar un archivo y una
ubicación de destino. Luego, al presionar un botón este archivo debe almacenarse en la
ubicación indicada.  */

import javax.swing.JFileChooser;

public class App {
    public static void main(String[] args) throws Exception {
    
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
    }
}
