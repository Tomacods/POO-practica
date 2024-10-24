public class Archivo extends Elemento implements Manipular{
    
    public Archivo (String nombre) {
        super(nombre);
    }

    @Override
    public Boolean esCarpeta() {
        return false;
    }

    @Override
    public void imprimirElementos() {
        System.out.println("+ " + getNombre());
    }
}
