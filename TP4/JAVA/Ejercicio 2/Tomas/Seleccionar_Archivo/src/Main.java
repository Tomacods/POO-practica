


import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;




public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista(null);
        Controlador controlador = new Controlador(modelo, vista);
    }
}
