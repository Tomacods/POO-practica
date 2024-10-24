public class Archivo implements Componente {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void escarpeta (){
        System.out.println("No");
    }
    @Override
    public void imprimir(){
        System.out.println(this.nombre);
    }
}
