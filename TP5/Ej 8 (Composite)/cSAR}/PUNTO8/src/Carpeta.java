import java.util.ArrayList;

public class Carpeta implements Componente {
    private String nombre;
    private ArrayList<Componente> listado = new ArrayList<>();

    public Carpeta (String nombre){
        this.nombre = nombre;
    }

    public void agregarListado (Componente componente){
        this.listado.add(componente);
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public void escarpeta(){
        System.out.println("Si");
    }
    @Override
    public void imprimir(){
        System.out.println(this.nombre);
        for (Componente c : listado){
            c.imprimir();
        }
    }
}
