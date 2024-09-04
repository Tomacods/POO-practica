import Ejercicio.ModeloArchivo;
import Ejercicio.VistaArchivo;

public class Main {

public static void main(String[] args) {
    ModeloArchivo modelo = new ModeloArchivo();
    VistaArchivo vista = new VistaArchivo();
    new ControladorArchivo(modelo, vista);
}

}