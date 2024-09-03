/*  2. Crear una interfaz gráfica de usuario (IGU) que permita seleccionar un archivo y una
ubicación de destino. Luego, al presionar un botón este archivo debe almacenarse en la
ubicación indicada.  */

import javax.swing.*; // importo la libreria para poder usar JFrame y JButton
import java.awt.event.ActionEvent;  // importo la libreria para poder usar ActionEvent que hace que un objeto pueda enviar eventos
import java.awt.event.ActionListener; // importo la libreria para poder usar ActionListener que hace que un objeto pueda escuchar eventos
import java.io.File; // importo la libreria para poder usar File
import java.io.FileInputStream; // importo la libreria para poder usar FileInputStream que hace que se pueda leer un archivo
import java.io.FileOutputStream; // importo la libreria para poder usar FileOutputStream que hace que se pueda escribir un archivo
import java.io.IOException; // importo la libreria para poder usar IOException que hace que se pueda manejar excepciones


public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Copiar Archivo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton selectFileButton = new JButton("Seleccionar Archivo");
        selectFileButton.setBounds(50, 50, 150, 30);
        frame.add(selectFileButton);

        JButton selectDestButton = new JButton("Seleccionar Destino");
        selectDestButton.setBounds(200, 50, 150, 30);
        frame.add(selectDestButton);

        JButton copyButton = new JButton("Copiar Archivo");
        copyButton.setBounds(125, 100, 150, 30);
        frame.add(copyButton);

        final File[] selectedFile = {null};
        final File[] destinationFile = {null};

        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedFile[0] = fileChooser.getSelectedFile();
                }
            }
        });

        selectDestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    destinationFile[0] = fileChooser.getSelectedFile();
                }
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedFile[0] != null && destinationFile[0] != null) {
                    File destFile = new File(destinationFile[0], selectedFile[0].getName());
                    try (FileInputStream fis = new FileInputStream(selectedFile[0]);
                        FileOutputStream fos = new FileOutputStream(destFile)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = fis.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                        JOptionPane.showMessageDialog(null, "Archivo copiado exitosamente.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un archivo y una ubicación de destino.");
                }
            }
        });

        frame.setVisible(true);
    }
}
