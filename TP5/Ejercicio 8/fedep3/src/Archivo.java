public class Archivo extends Elemento {
    
    public Archivo (String nombre) {
        super(nombre);
    }

    @Override
    public Boolean esCarpeta() {
        return false;
    }
}
