import java.util.Random;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
    Random random = new Random();
    String[] Nombres = {"César","Federica","Tomas","Mora","Julian","Thalia","Javier","Daniela","Lionel","Antonella"};
    String[] Apellidos = {"Millavanque","Roldán","Romero","Da silva","Molina","Silvestre","Sato","Levio","Ortega"};
    String[] Materias = {"Programacion Orientada a Objetos","Base de datos","Analisis Matematico","Algebra","EPyA"};
    ArrayList<Alumno> lalum = new ArrayList<>();
    for (Integer i= 0; i<30;i++){
        Integer dni = random.nextInt(40000000, 50000000);
        Alumno alumno1 = new Alumno(Nombres[random.nextInt(Nombres.length)], Apellidos[random.nextInt(Apellidos.length)],dni );
        lalum.add(alumno1);
    }
    ArrayList<Profesor> lprofe = new ArrayList<>();
    for (Integer i= 0; i<5;i++){
        Integer dni = random.nextInt(20000000, 40000000);
        Integer legajo = random.nextInt(100, 300);
        Profesor profe1 = new Profesor(Nombres[random.nextInt(Nombres.length)], Apellidos[random.nextInt(Apellidos.length)],dni,legajo );
        lprofe.add(profe1);
    }
    ArrayList<Materia> lmateria = new ArrayList<>();
    for (Integer i= 0; i<5;i++){
        Integer codigo = random.nextInt(100, 200);
        Integer anio = random.nextInt(2010, 2024);
        Materia mate1 = new Materia(Materias[random.nextInt(Materias.length)],codigo, anio, lprofe.get(i));
        lmateria.add(mate1);
    }
    
    for(Integer i=0; i<5;i++){
        Integer canti = random.nextInt(5, 10);
        Integer alumnado = random.nextInt(1, 20);
        for(Integer j=0; j<canti;j++){
            lmateria.get(i).InscribirAlumno(lalum.get(alumnado));
            alumnado = alumnado+1;
        }
    }
    for(Integer i=0; i<5;i++){
        Materia mat = lmateria.get(i);
    }
}
}
