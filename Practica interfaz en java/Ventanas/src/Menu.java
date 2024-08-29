import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;




public class Menu extends JFrame implements ActionListener {
    
    private JLabel labelSubtitulo;
    private JButton btnRegistro,btnSalir;

    public Menu() {
        setLayout(null);
        labelSubtitulo = new JLabel("Menu Principal");
        labelSubtitulo.setBounds(10,20,300,30);
        add(labelSubtitulo);

        btnRegistro = new JButton("Registro");
        btnRegistro.setBounds(10,60,100,30);
        add(btnRegistro);
        btnRegistro.addActionListener(this);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10,100,100,30);
        add(btnSalir);
        btnSalir.addActionListener(this);
    }
}
