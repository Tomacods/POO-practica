import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public App() {
        setTitle("lector CSV");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton button = new JButton("Seleccionar archivo CSV");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarArchivo();
            }
        });

        tableModel = new DefaultTableModel(new String[]{"Nombre", "Apellido", "DNI"}, 0);
        table = new JTable(tableModel);

        add(button, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void seleccionarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                leerArchivoCSV(file);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void leerArchivoCSV(File file) throws Exception {
        if (!file.getName().endsWith(".csv")) {
            throw new Exception("El archivo no está en formato CSV.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length != 6) {
                    throw new Exception("Formato de línea incorrecto: " + line);
                }
                String nombre = values[0];
                String apellido = values[1];
                String dni = values[4];
                tableModel.addRow(new Object[]{nombre, apellido, dni});
            }
        } catch (IOException e) {
            throw new Exception("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
