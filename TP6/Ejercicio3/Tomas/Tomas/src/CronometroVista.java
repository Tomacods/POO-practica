import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class CronometroVista extends JFrame implements Observer{
    private final Cronometro cronometro = new Cronometro();
    private final JLabel tiempoLabel = new JLabel("tiempo");
    private final JLabel parcialesLabel = new JLabel("Parciales: ");
    private JButton iniciarButton;
    private final JButton pararButton = new JButton("Parar");
    private final JButton parcialButton = new JButton("Parcial");
    
    public CronometroVista () {
        this.iniciarButton = new JButton("Iniciar");
        setLayout(new FlowLayout());
        add(tiempoLabel);
        add(parcialesLabel);
        add(iniciarButton);
        add(pararButton);
        add(parcialButton);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actualizarTiempo(long tiempo) {
        tiempoLabel.setText("Tiempo: " + tiempo);
    }

    
@Override
public void actualizar() {
    long tiempoActual = cronometro.getTiempoActual();
    String tiempoFormateado = formatearTiempo(tiempoActual);
    tiempoLabel.setText(tiempoFormateado);
}

// Método auxiliar para formatear el tiempo
private String formatearTiempo(long tiempo) {
    long horas = TimeUnit.MILLISECONDS.toHours(tiempo);
    long minutos = TimeUnit.MILLISECONDS.toMinutes(tiempo) % 60;
    long segundos = TimeUnit.MILLISECONDS.toSeconds(tiempo) % 60;
    long milisegundos = tiempo % 1000;
    
    return String.format("%02d:%02d:%02d.%03d", horas, minutos, segundos, milisegundos);
}


    public JButton getIniciarButton() {
        return iniciarButton;
    }
    public JButton getPararButton() {
        return pararButton;
    }
    public JButton getParcialButton() {
        return parcialButton;
    }

    public void setIniciarButton(JButton iniciarButton) {
        this.iniciarButton = iniciarButton;
    }
    public void actualizarParciales(List<Long> parciales) {
        StringBuilder sb = new StringBuilder("Parciales: ");
        for (Long parcial : parciales) {
            sb.append(parcial).append(" ");
        }
        parcialesLabel.setText(sb.toString());
    }

}

