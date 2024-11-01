import java.util.ArrayList;
//import java.util.List;

public class Carpeta implements Manipular {

    private String nombre;
    private ArrayList<Manipular> contenidos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    @Override
    public Boolean esCarpeta() {
        return true;
    }

    public void addElemento(Manipular manipular) {
        this.contenidos.add(manipular);
    }

    @Override
    public void imprimirElementos() {
        imprimirElementos(0);
    }

    private void imprimirElementos(Integer nivel) {
        imprimirIndentacion(nivel);
        System.out.println("- " + nombre);
        for (Manipular elemento : contenidos) {
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
            System.out.print("    ");
        }
    }
}