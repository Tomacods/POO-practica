import java.util.ArrayList;

public class Alumno extends Persona {
    
    private ArrayList<Hashmap> historial = new ArrayList<>();

    public Alumno(String nombre, String apellido, Integer dni){
        super(nombre, apellido, dni);
    }

    public void agregarHistorial(Hashmap hashmap){
        this.historial.add(hashmap);
    }

    public void imprimirHistorial(ArrayList<Hashmap> historial){
        for (Hashmap map: historial){
            System.out.println(map.toString());
        }
    }

    public void imprimirAlumno(){
        System.out.println(toString());
        imprimirHistorial(historial);
    }
}
