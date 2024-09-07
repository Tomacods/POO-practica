
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;


public class VistaCalculadora extends JFrame implements ActionListener {
    private StringBuilder currentOperation;
    private JTextField display;


        public VistaCalculadora() {
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(5, 5));


            JTextField display = new JTextField();
            display.setBounds(12, 12, 380, 30);
            display.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(display);

            currentOperation = new StringBuilder();

            String[] buttonLabels = {
                "7", "8", "9", "/", 
                "4", "5", "6", "*", 
                "1", "2", "3", "-", 
                "0", ".", "=", "+"
            };
            int x = 10, y = 60;
            for (String label : buttonLabels) {
                JButton button = new JButton(label);
                button.setBounds(x, y, 90, 90);
                button.addActionListener(this);
                this.add(button);
                x += 100;
                if (x > 300) {
                    x = 10;
                    y += 100;
                }
            }
            JButton clearButton = new JButton("C");
            clearButton.setBounds(10, 160, 180, 90);
            clearButton.addActionListener(this);
            this.add(clearButton);

            JButton backspaceButton = new JButton("←");
            backspaceButton.setBounds(190, 160, 180, 90);
            backspaceButton.addActionListener(this);
            this.add(backspaceButton);
        }

        public static void main(String[] args) {
            VistaCalculadora vistaCalculadora = new VistaCalculadora();
            vistaCalculadora.setVisible(true);

}

        @Override
        public void actionPerformed(ActionEvent e) {
            
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }



}