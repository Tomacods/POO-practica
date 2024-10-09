import java.util.ArrayList;
import java.util.List;

class Carpeta extends Elemento {
    private List<Elemento> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public boolean esCarpeta() {
        return true;
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        imprimirElementos(0);
    }

    private void imprimirElementos(int nivel) {
        imprimirIndentacion(nivel);
        System.out.println("-> " + getNombre());
        for (Elemento elemento : elementos) {
            if (elemento.esCarpeta()) {
                ((Carpeta) elemento).imprimirElementos(nivel + 1);
            } else {
                imprimirIndentacion(nivel + 1);
                System.out.println("* " + elemento.getNombre());
            }
        }
    }

    private void imprimirIndentacion(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
    }
}