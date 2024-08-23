
import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        ArrayList<Persona> personas = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            if(random.nextInt(0,2)==1){
                personas.add(new Docente("Docente"+i, "Apellido"+i, "Materia"+i));
            }else{
                Alumno alumno = new Alumno("Alumno"+i, "Apellido"+i);

                int limite = random.nextInt(10);
                for (int j = 0; j < limite; j++){
                    alumno.agregarMateria("Materia"+j);
                    if(random.nextInt(0,2)==1){
                        break;
                    }
                }
                personas.add(alumno);
    }
    for (Persona per : personas){
        System.out.println(per.materia());
}
    
}
}
}
