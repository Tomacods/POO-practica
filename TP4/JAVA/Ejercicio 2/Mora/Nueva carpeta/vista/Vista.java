import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;

public class Vista { // VISTA --> interacción con el mundo exterior INTERFAZ GRAFICA
    //https://oregoom.com/java/archivos/
    //https://docs.oracle.com/javase/8/docs/api/java/io/File.html
    public String seleccionarArchivo(){
        JFileChooser fileChooser = new JFileChooser();
        int rta = fileChooser.showOpenDialog(fileChooser);
        if (rta == fileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            return archivo.getAbsolutePath(); // java.io.File
        }
            return null;

        }

        public String seleccionarCarpeta(){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(fileChooser.DIRECTORIES_ONLY);
            int rta = fileChooser.showOpenDialog(fileChooser);
            if (rta == fileChooser.APPROVE_OPTION){
                File carpeta = fileChooser.getSelectedFile();
                return carpeta.getAbsolutePath(); // java.io.File
            }
                return null;
    
            }
            public void mostrarTextoSuccess(){
                String texto = "Se ha movido el archivo con exito!";
                JOptionPane.showMessageDialog(null, texto, "Aviso.",JOptionPane.PLAIN_MESSAGE);
            }
            public void mostrarTextoWrong(){
                String texto = "No se pudo mover el archivo.";
                JOptionPane.showMessageDialog(null, texto, "Aviso.",JOptionPane.WARNING_MESSAGE);
            }

    }
    

