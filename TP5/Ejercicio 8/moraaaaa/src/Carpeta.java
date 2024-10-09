import java.util.ArrayList;
public class Carpeta extends Component {
    //private String nombre;
    private ArrayList<Component> archivos = new ArrayList<>();

    public Carpeta(String nombre){//, ArrayList<Component> archivos
        super(nombre);
        //this.archivos=archivos;
    }

 private void mostrarArchivos (){
        for (Component component : archivos ){
            component.mostrar();
        } 
    }

    public void add (Component component){
        this.archivos.add(component);
    }
    @Override
    public void mostrar() {
        System.out.println(getNombre());
        mostrarArchivos();
    }
   

    @Override
    public boolean es_carpeta() {
        return true;
    }
    


}
