import java.util.ArrayList;
public class Perfil {
    private String nombre;
    private Boolean niño;
    private ArrayList<Contenido> contenidos = new ArrayList<>();

    public Perfil(String nombre, Boolean niño) {
        this.nombre = nombre;
        this.niño = niño;
    }
    public void imprimirperfil (){
        System.out.println("Perfil "+this.nombre);
        for (Contenido c : contenidos){
            c.imprimircontenido();
        }
    }
}
