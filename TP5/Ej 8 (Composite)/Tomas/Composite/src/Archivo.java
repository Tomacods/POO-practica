class Archivo extends Elemento {

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean esCarpeta() {
        return false;
    }
}
