public class Archivo implements Manipular{
    
    private String nombre;

    public Archivo (String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Boolean esCarpeta() {
        return false;
    }

    @Override
    public void imprimirElementos() {
        System.out.println("+ " + nombre);
    }
}
