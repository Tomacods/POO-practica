package escuela;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        
        //genero 30 alumnos
        Alumno[] alumnos = new Alumno[30];
        for (int i = 0; i < 30; i++) {
            alumnos[i] = new Alumno("Alumno" + i, "Apellido" + i, 12345678 + i, i);
        }

        //genero 5 profesores
        Profesor[] profesores = new Profesor[5];
        for (int i = 0; i < 5; i++) {
            profesores[i] = new Profesor("Profesor" + i, "Apellido" + i, 12345678 + i, i);
        }
        //genero 5 materias
        //cada materia tiene un profesor y tiene que tener entre 5 y 10 alumnos de forma aleatoria
        Materia[] materias = new Materia[5];
        for (int i = 0; i < 5; i++) {
            materias[i] = new Materia("Materia" + i, "Codigo" + i, i, profesores[i]);
        }

        Random random = new Random();
        
        // Asignar entre 5 y 10 alumnos aleatorios a cada materia
        for (Materia materia : materias) {
            Set<Alumno> alumnosMateria = new HashSet<>();
            int numAlumnos = 5 + random.nextInt(6); // Entre 5 y 10 alumnos
            while (alumnosMateria.size() < numAlumnos) {
                Alumno alumno = alumnos[random.nextInt(30)];
                materia.inscribirAlumno(alumno);
                alumnosMateria.add(alumno);
            }
        }  
        for (Materia materia : materias) {
            for (Alumno alumno : materia.getAlumnos()) {
                int nota = 1 + random.nextInt(10);
                alumno.agregarMateriaNota(materia.getNombre(), nota);
            }
        }

        // Imprimir los datos de cada materia, el profesor asignado y el listado de alumnos inscriptos
        for (Materia materia : materias) {
            System.out.println(materia);
            System.out.println("Profesor: " + materia.getProfesor());
            materia.imprimirAlumnos();
            System.out.println();
        }

        // Imprimir los datos de 10 alumnos aleatorios y su historial académico
        Set<Alumno> alumnosAleatorios = new HashSet<>();
        while (alumnosAleatorios.size() < 10) {
            alumnosAleatorios.add(alumnos[random.nextInt(30)]);
        }
        for (Alumno alumno : alumnosAleatorios) {
            alumno.ImprimirHistorial();
            System.out.println();
        }
    }
}
