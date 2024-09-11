import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        List<Alumno> alumnos = new ArrayList();
        List<Profesor> profesores = new ArrayList();
        List<Materia> materias = new ArrayList();

        for (int i = 1; i <= 30; i++){
            Alumno alumnoNuevo = new Alumno("alumno"+i, "apellido" + i, "123" + i);
            alumnos.add(alumnoNuevo);

        }
        for (int i = 1; i <= 5; i++){
            Profesor profesorNuevo = new Profesor("profesor"+i, "apellido" + i, "123"+i, i);
            profesores.add(profesorNuevo);
        }

        for (int i = 1; i <= 5; i++){
            Materia materiaNueva = new Materia("Materia"+i, "000"+ i, 2000, profesores.get(random.nextInt(profesores.size())));
            materias.add(materiaNueva);
            }

for (Materia materia : materias) {
    int numeroAlumnos = random.nextInt(6) + 5; // se añaden aleatoriamente entre 5 y 10 alumnos a una materia
    for (int j = 0; j < numeroAlumnos; j++) {
        Alumno alumno = alumnos.get(random.nextInt(alumnos.size())); 
        int nota = random.nextInt(11) + 1; 
        materia.inscribirAlumno(alumno); 
        alumno.ingresarNota(materia, nota);
    }
}

System.out.println("Información sobre las materias: ");
for (Materia materia : materias){
    System.out.println(materia);
    System.out.println(materia.getProfesor());
    System.out.println(materia.imprimirAlumnos());
}

for (Alumno alumno : alumnos) {
    alumno.imprimirHistorial();
    System.out.println();
}


} }
    

