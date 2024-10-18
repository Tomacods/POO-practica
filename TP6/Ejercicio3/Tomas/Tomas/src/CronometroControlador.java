import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CronometroControlador implements Observer {
    private Cronometro modelo;
    private CronometroVista vista;

    public CronometroControlador (Cronometro modelo, CronometroVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.modelo.agregarObservador(this);

        this.vista.getIniciarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.iniciar();
            }
        });
    
        this.vista.getPararButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.parar();
            }
        });

        this.vista.getParcialButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.crearParcial();
            }
        });
    }
    @Override
    public void actualizar() {
        vista.actualizarTiempo(modelo.getTiempoActual());
        vista.actualizarParciales(modelo.getParciales());
    }
}
    
