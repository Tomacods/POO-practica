import java.io.File;

public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo= modelo;

    }
    public void moverArchivo(){
        String stringArchivo = vista.seleccionarArchivo();
        String stringCarpeta = vista.seleccionarCarpeta();
        File archivo = new File(stringArchivo);
        File carpeta = new File(stringCarpeta);

        if(modelo.moverArchivo(archivo, carpeta)){
            vista.mostrarTextoSuccess();

        } else {
            System.out.println("no");
        }

    }
    
}
