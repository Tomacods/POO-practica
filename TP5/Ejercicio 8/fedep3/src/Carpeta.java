import java.util.ArrayList;
//import java.util.List;

public class Carpeta extends Elemento implements Manipular {

    private ArrayList<Elemento> contenidos;

    public Carpeta(String nombre) {
        super(nombre);
        this.contenidos = new ArrayList<>();
    }

    @Override
    public Boolean esCarpeta() {
        return true;
    }

    public void addElemento(Elemento elemento) {
        contenidos.add(elemento);
    }

    @Override
    public void imprimirElementos() {
        imprimirElementos(0);
    }

    private void imprimirElementos(Integer nivel) {
        imprimirIndentacion(nivel);
        System.out.println("- " + getNombre());
        for (Elemento elemento : contenidos) {
            if (elemento.esCarpeta()) {
                ((Carpeta) elemento).imprimirElementos(nivel + 1);
            } else {
                imprimirIndentacion(nivel + 1);
                ((Archivo) elemento).imprimirElementos();
            }
        }
    }
    
    private void imprimirIndentacion(Integer nivel) {
        for (Integer i = 0; i < nivel; i++) {
            System.out.println("    ");
        }
    }
}