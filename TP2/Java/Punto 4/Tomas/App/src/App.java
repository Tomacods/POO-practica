import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Materia poo = new Materia("POO", "1234");
        Materia algebra = new Materia("BD", "5678");
        Materia introduccion = new Materia("Introduccion a la programacion", "91011");
        Materia algoritmica = new Materia("Algoritmica", "1314");

        java.util.ArrayList<Profesor> profesores = new ArrayList<>();

        Profesor profesor1 = new Profesor("Pedro", "Hernandez");
        Profesor profesor2 = new Profesor("Romina", "Alvarez");
        Profesor profesor3 = new Profesor("Laura", "Perez");

        profesor1.addMateria(poo);
        profesor1.addMateria(algebra);
        profesores.add(profesor1);

        
        profesor2.addMateria(introduccion);
        profesor2.addMateria(algoritmica);
        profesores.add(profesor2);

        
        profesores.add(profesor3);

        for (Profesor pro : profesores){
            System.out.println("Profesor: " + pro.getNombre() + " " + pro.getApellido());
            System.out.println("Materias:");

            for (Materia materia : pro.getMaterias()){
                System.out.println(materia.getNombre() ); }
    }       
    }     
}
/*La salida esperada en la ejecución es:
 Profesor: Hernandez Pedro
 Materias:
 POO
 Algebra
 Profesor: Alvarez Romina
 Materias:
 Introducción a la computación
 Algoritmica
 Profesor: Perez Laura
 Materias:
 */