import java.util.ArrayList;
import java.util.Random;

public class Fede_App {
    
    public static void main(String[] args) throws Exception{

        Random rnd = new Random();
        ArrayList<Persona> personas = new ArrayList<>();

        for (Integer i = 0; i<10; i++){
            if(rnd.nextInt(2) == 1){
                personas.add(new Docente("NomDoc"+i, "ApeDoc"+i, "Mat"+i));
            } else {
                Alumno alumno = new Alumno("AluNom"+i, "ApeNom"+i);
                Integer limite = rnd.nextInt(10);
                for(Integer j = 0; j<limite; i++){
                    alumno.agregarMateria("Mat " + j);
                    if(rnd.nextInt(2) == 1){
                        break;
                    }
                }
                personas.add(alumno);
            }
        }
        for(Persona per: personas){
            System.out.println(per.materia());
        }
    }
}
