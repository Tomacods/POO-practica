import javax.swing.JFileChooser;
import javax.swing.JPanel;
public class SeleccionArchivo {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser); //selecciona un archivo
        
        JFileChooser fileChooser2 = new JFileChooser();

        fileChooser.setCurrentDirectory(fileChooser2.getSelectedFile());
    }
    

}
