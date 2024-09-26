import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("Copiar archivo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton selectFileButton = new JButton("Seleccionar archivo");
        selectFileButton.setBounds(50, 50, 150, 30);
        frame.add(selectFileButton);

        JButton selectDestinButton = new JButton("Seleccionar destino");
        selectDestinButton.setBounds(200, 50, 150, 30);
        frame.add(selectDestinButton);

        JButton copyButton = new JButton("Copiar Archivo");
        copyButton.setBounds(125, 100, 150, 30);
        frame.add(copyButton);

        final File[] selectedFile = {null};
        final File[] destinationFile = {null};

        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JFileChooser fileChooser = new JFileChooser();
                Integer result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION){
                    selectedFile[0] = fileChooser.getSelectedFile();
                }
            }
        });

        selectDestinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                Integer result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION){
                    destinationFile[0] = fileChooser.getSelectedFile();
                }
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (selectedFile[0]!= null && destinationFile[0] != null){
                    File destFile = new File(destinationFile[0], selectedFile[0].getName());
                    try (FileInputStream fis = new FileInputStream(selectedFile[0]);
                        FileOutputStream fos = new FileOutputStream(destFile)){
                        byte[] buffer = new byte[1024];
                        Integer length;
                        while ((length.fis.read(buffer) > 0){
                            
                        }
                    }
                }
            }
        });
    }
}
