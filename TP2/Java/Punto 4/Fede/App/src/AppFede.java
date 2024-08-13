import java.util.ArrayList;

public class AppFede {
    
    public static void main(String[] args) throws Exception{
        MateriaFede poo = new MateriaFede("POO", "IF153");
        MateriaFede algebra = new MateriaFede("Algebra", "183");
        MateriaFede introduccion = new MateriaFede("Introduccion a la computacion", "IF300");
        MateriaFede algoritmica = new MateriaFede("Algortimica", "500");

        ArrayList<ProfesorFede> profesores = new ArrayList<>();
        ProfesorFede profesor1 = new ProfesorFede("Pedro", "Hernandez");
        profesor1.addMateria(poo);
        profesor1.addMateria(algebra);
        profesores.add(profesor1);

        ProfesorFede profesor2 = new ProfesorFede("Romina", "Alvarez");
        profesor1.addMateria(introduccion);
        profesor1.addMateria(algoritmica);
        profesores.add(profesor2);

        ProfesorFede profesor3 = new ProfesorFede("Laura", "Perez");
        profesores.add(profesor3);

        for(ProfesorFede pro:profesores){
            System.out.println(pro.getApellido()+", "+pro.getNombre());
            System.out.println("Materias: ");
            //for(Materia mat:pro.getMateria()){
             //   System.out.println((mat.getNombre()));
           // }
        }
    }
}
/*me tenes cansada java
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/