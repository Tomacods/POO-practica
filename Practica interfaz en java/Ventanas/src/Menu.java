import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

    private JLabel labelSubtitulo;
    private JButton btnRegistro, btnSalir;
    private JMenuBar menuBar;
    private JMenu menuArchivo, menuAyuda;
    private JMenuItem menuItemAbrir, menuItemGuardar, menuItemSalir, menuItemAcercaDe;

    public Menu() {
        setLayout(null);
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del subtítulo
        labelSubtitulo = new JLabel("Menu Principal");
        labelSubtitulo.setBounds(10, 20, 300, 30);
        add(labelSubtitulo);

        // Configuración de los botones
        btnRegistro = new JButton("Registro");
        btnRegistro.setBounds(10, 60, 100, 30);
        add(btnRegistro);
        btnRegistro.addActionListener(this);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10, 100, 100, 30);
        add(btnSalir);
        btnSalir.addActionListener(this);

        // Configuración de la barra de menú
        menuBar = new JMenuBar();

        // Menú Archivo
        menuArchivo = new JMenu("Archivo");
        menuItemAbrir = new JMenuItem("Abrir");
        menuItemGuardar = new JMenuItem("Guardar");
        menuItemSalir = new JMenuItem("Salir");
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemSalir);
        menuBar.add(menuArchivo);

        // Menú Ayuda
        menuAyuda = new JMenu("Ayuda");
        menuItemAcercaDe = new JMenuItem("Acerca de");
        menuAyuda.add(menuItemAcercaDe);
        menuBar.add(menuAyuda);

        // Agregar ActionListener a los elementos del menú
        menuItemAbrir.addActionListener(this);
        menuItemGuardar.addActionListener(this);
        menuItemSalir.addActionListener(this);
        menuItemAcercaDe.addActionListener(this);

        // Agregar la barra de menú al JFrame
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistro) {
            // Acción para el botón Registro
            JOptionPane.showMessageDialog(this, "Registro seleccionado");
        } else if (e.getSource() == btnSalir || e.getSource() == menuItemSalir) {
            // Acción para el botón Salir o el menú Salir
            System.exit(0);
        } else if (e.getSource() == menuItemAbrir) {
            // Acción para el menú Abrir
            JOptionPane.showMessageDialog(this, "Abrir seleccionado");
        } else if (e.getSource() == menuItemGuardar) {
            // Acción para el menú Guardar
            JOptionPane.showMessageDialog(this, "Guardar seleccionado");
        } else if (e.getSource() == menuItemAcercaDe) {
            // Acción para el menú Acerca de
            JOptionPane.showMessageDialog(this, "Acerca de seleccionado");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
