
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        ArrayList<Suplente> suplentes = new ArrayList<Suplente>();

        profesores.add(new Titular("Aldana", "gutierrez", 40, 40, 15));
        profesores.add(new Titular("predro", "Perez", 35, 40, 10));
        profesores.add(new Titular("maria","gomez", 29,40,1));
        suplentes.add(new Suplente("Tomás", "Sosa", 25, 40));
        suplentes.add(new Suplente("Luciana", "Torres", 27, 40));

        for(Profesor profesor : profesores){
            System.out.println("nombre y apellido: " + profesor.getNombre()+ " " + profesor.getApellido());
            System.out.println("es titular? Si");
            System.out.println("remuneracion mensual: " + profesor.get_remuneracion_mensual());
        }
        for(Suplente suplente : suplentes){
            System.out.println("nombre y apellido: " + suplente.getNombre()+ " " + suplente.getApellido());
            System.out.println("es titular? No");
            System.out.println("remuneracion mensual: " + suplente.get_remuneracion_mensual());
        }
}
}

