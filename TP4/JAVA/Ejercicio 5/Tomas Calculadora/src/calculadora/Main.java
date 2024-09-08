package calculadora;
public class Main {
    public static void main(String[] args) {
        ModeloCalculadora modelo = new ModeloCalculadora();
        VistaCalculadora vista = new VistaCalculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(modelo, vista);
        vista.setVisible(true);
    }
}

