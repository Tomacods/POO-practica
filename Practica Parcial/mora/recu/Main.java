import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        List<Alumno> alumnos = new ArrayList();
        List<Profesor> profesores = new ArrayList();
        List<Materia> materias = new ArrayList();

        for (int i = 1; i <= 10; i++){
            Alumno alumnoNuevo = new Alumno("alumno"+i, "apellido" + i, "123" + i);
            //System.out.println(alumnoNuevo);
            alumnos.add(alumnoNuevo);

        }
        for (int i = 1; i <= 5; i++){
            Profesor profesorNuevo = new Profesor("profesor"+i, "apellido" + i, "123"+i, i);
            profesores.add(profesorNuevo);

        }

        for (int i = 1; i <= 5; i++){
            Materia materiaNueva = new Materia("Materia"+i, "000"+ i, 2000, profesores.get(random.nextInt(profesores.size())));
            System.out.println(materiaNueva);
            System.out.println(materiaNueva.getProfesor());
            
            int valorrandom = random.nextInt(6) + 5;

            for (int j= 1; j <= valorrandom; j++){
            materiaNueva.inscribirAlumno((alumnos.get(random.nextInt(alumnos.size()))));;
        }
        System.out.println(materiaNueva.imprimirAlumnos());

        }


        
    }
    
} 
