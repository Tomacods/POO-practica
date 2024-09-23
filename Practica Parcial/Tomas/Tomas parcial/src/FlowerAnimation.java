
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FlowerAnimation extends JPanel implements ActionListener {

    private int petalGrowth = 0;  // Tamaño inicial del crecimiento de los pétalos
    private Timer timer;

    public FlowerAnimation() {
        timer = new Timer(100, this);  // Actualiza cada 100 milisegundos
        timer.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
        
            // Dibujar el tallo
            g2d.setColor(new Color(34, 139, 34));  // Verde
            g2d.fillRect(240, 300, 20, 100);  // Tallo de la flor
        
            // Dibujar el centro de la flor
            g2d.setColor(Color.ORANGE);
            g2d.fillOval(225, 275, 50, 50);  // Centro de la flor
        
            // Dibujar los pétalos alargados
            g2d.setColor(Color.YELLOW);
            int numPetals = 9;  // Número de pétalos
            int petalWidth = 70;  // Ancho del pétalo
        
            for (int i = 0; i < numPetals; i++) {
                double angle = 2 * Math.PI / numPetals * i;  // Ángulo para cada pétalo
                int x = 250;  // Centro en X
                int y = 300;  // Centro en Y
                int petalHeight = petalGrowth;  // Altura del pétalo, controlada por el crecimiento
        
                // Calcular las coordenadas del óvalo para que se estire desde el centro
                int petalX = (int) (x + Math.cos(angle) * petalGrowth - petalWidth / 2);
                int petalY = (int) (y + Math.sin(angle) * petalGrowth - petalHeight / 2);
        
                // Dibujar el pétalo como un óvalo estirado desde el centro
                g2d.fillOval(petalX, petalY, petalWidth, petalHeight);
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            petalGrowth += 1;  // Incrementar el crecimiento de los pétalos
            if (petalGrowth > 60) {
                petalGrowth = 3;  // Reiniciar el crecimiento
            }
            repaint();  // Volver a pintar el componente
        }
        public static void main(String[] args) {
            JFrame frame = new JFrame("Flower Animation");
            FlowerAnimation flowerAnimation = new FlowerAnimation();
            frame.add(flowerAnimation);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
}
