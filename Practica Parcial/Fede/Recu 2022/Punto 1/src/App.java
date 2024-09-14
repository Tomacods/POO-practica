import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
        Random random = new Random();

        // generadores y listas.

        String[] nombres = {"Tomas", "Mora", "Cesar", "Federica", "Javier", "Carlos", "Rodrigo", "Anabela", "Agustin", "Mauro", "Juan", "Jose", "Lionel", "Andres"};
        String[] apellidos = {"Da Silva", "Molina", "Millavanque", "Roldan", "Alanis", "Soto", "Romero", "Bravo", "Aguilar", "Orzanco", "Saavedra", "Martinez", "Alvarez"};
        String[] mat = {"Programacion Orientada a Objetos", "Base de Datos", "Algoritmica y Programacion II", "Estadistica", "Algebra"};

        ArrayList<Profesor> profesores = new ArrayList<>(5);
        ArrayList<Alumno> alumnos = new ArrayList<>(30);
        ArrayList<Materia> materias = new ArrayList<>(5);

        // creo profesores.

        for (Integer i = 1; i <= 5; i++){
            Integer dni = random.nextInt(45000001);
            while (dni < 40000000){
                dni = random.nextInt(45000001);
            }
            Profesor profe = new Profesor(nombres[random.nextInt(nombres.length)], apellidos[random.nextInt(apellidos.length)], dni, i);
            profesores.add(profe);
        }
        
        // creo alumnos.
        for (Integer i = 1; i <= 30; i++){
            Integer dni = random.nextInt(48000000) + 1;
            while (dni < 45000000){
                dni = random.nextInt(48000000) + 1;
            }
            Alumno alum = new Alumno(nombres[random.nextInt(nombres.length)], apellidos[random.nextInt(apellidos.length)], dni);
            alumnos.add(alum);
        }

        // creo materias.

        for (Integer i = 1; i<=5; i++){
            Materia materia = new Materia(mat[i], i, 2024, profesores.get(i));
            Integer cantAlum = random.nextInt(10) + 1;
            while (cantAlum < 5){
                cantAlum = random.nextInt(10) + 1;
            }
            for (Integer j = 1; j<=cantAlum; i++){
                Integer indice2 = random.nextInt(20) + 1;
                materia.addAlumnos(alumnos.get(indice2));
                Integer nota = random.nextInt(10) + 1;
                alumnos.get(indice2).ingresarNota(materia.getNombre(), nota);
            }
            materias.add(materia);
        }

        // imprimo

        for (Integer i = 1; i <= 5; i++){
            System.out.print(materias.get(i));
        }

    }
}
