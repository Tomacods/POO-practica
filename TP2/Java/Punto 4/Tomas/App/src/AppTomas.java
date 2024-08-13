import java.util.ArrayList;

public class AppTomas {
    public static void main(String[] args) throws Exception {
        MateriaTomas poo = new MateriaTomas("POO", "1234");
        MateriaTomas algebra = new MateriaTomas("BD", "5678");
        MateriaTomas introduccion = new MateriaTomas("Introduccion a la programacion", "91011");
        MateriaTomas algoritmica = new MateriaTomas("Algoritmica", "1314");

        java.util.ArrayList<ProfesorTomas> profesores = new ArrayList<>();

        ProfesorTomas profesor1 = new ProfesorTomas("Pedro", "Hernandez");
        ProfesorTomas profesor2 = new ProfesorTomas("Romina", "Alvarez");
        ProfesorTomas profesor3 = new ProfesorTomas("Laura", "Perez");

        profesor1.addMateria(poo);
        profesor1.addMateria(algebra);
        profesores.add(profesor1);

        
        profesor2.addMateria(introduccion);
        profesor2.addMateria(algoritmica);
        profesores.add(profesor2);

        
        profesores.add(profesor3);

        for (ProfesorTomas pro : profesores){
            System.out.println("Profesor: " + pro.getNombre() + " " + pro.getApellido());
            System.out.println("Materias:");

            for (MateriaTomas materia : pro.getMaterias()){
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